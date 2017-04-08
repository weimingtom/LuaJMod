

import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.JsePlatform;

public class SampleSwingMain {
	
	
	public static void main(String[] args) throws Exception {
		String script = "examples/lua/swingapp.lua";
		
		// create an environment to run in
		LuaValue _G = JsePlatform.standardGlobals();
		_G.get("dofile").call( LuaValue.valueOf(script) );
	}


}
