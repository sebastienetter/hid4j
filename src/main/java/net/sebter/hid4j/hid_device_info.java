package net.sebter.hid4j;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.WString;

public class hid_device_info extends Structure {

	public static class ByReference extends hid_device_info implements
			Structure.ByReference {
	}

	public short vendor_id;

	public short product_id;
	public WString serial_number;
	public WString manufacturer_string;

	public WString product_string;
	public Pointer dev;
}
