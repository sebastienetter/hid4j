package net.sebter.hid4j;


import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.WString;

public interface LibHID extends Library {

	LibHID libHID = (LibHID) Native.loadLibrary("hid-0.5.2", LibHID.class);

	hid_device_info hid_enumerate(short vendor_id, short product_id);

	void hid_free_enumeration(hid_device_info dev);

	hid_device hid_open(short vendor_id, short product_id, WString serialNumber);

	int hid_get_manufacturer_string(hid_device device, WString string,
			NativeLong maxlen);

	int hid_get_product_string(hid_device device, WString string,
			NativeLong maxlen);

	int hid_get_serial_number_string(hid_device device, WString string,
			NativeLong maxlen);

	int hid_send_feature_report(hid_device device, char[] data,
			NativeLong length);
	int hid_get_feature_report(hid_device device, char[] data,
			NativeLong length);
}
