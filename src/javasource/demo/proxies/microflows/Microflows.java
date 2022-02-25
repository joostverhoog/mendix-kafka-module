// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package demo.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Demo module
	public static java.lang.String celsiusToFahrenheit(IContext context, java.lang.String _value)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("value", _value);
		return (java.lang.String) Core.microflowCall("Demo.CelsiusToFahrenheit").withParams(params).execute(context);
	}
	public static void commitTemperature(IContext context, demo.proxies.Temperature _temperature)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Temperature", _temperature == null ? null : _temperature.getMendixObject());
		Core.microflowCall("Demo.CommitTemperature").withParams(params).execute(context);
	}
	public static demo.proxies.Chart createChart(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Demo.CreateChart").withParams(params).execute(context);
		return result == null ? null : demo.proxies.Chart.initialize(context, result);
	}
	public static demo.proxies.Temperature createTemperature(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Demo.CreateTemperature").withParams(params).execute(context);
		return result == null ? null : demo.proxies.Temperature.initialize(context, result);
	}
	public static java.lang.Long dateTimeToInt(IContext context, demo.proxies.ReportedTemperature _reportedTemperature)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ReportedTemperature", _reportedTemperature == null ? null : _reportedTemperature.getMendixObject());
		return (java.lang.Long) Core.microflowCall("Demo.DateTimeToInt").withParams(params).execute(context);
	}
	public static demo.proxies.Chart fillChart(IContext context, demo.proxies.Chart _chart)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("chart", _chart == null ? null : _chart.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Demo.FillChart").withParams(params).execute(context);
		return result == null ? null : demo.proxies.Chart.initialize(context, result);
	}
	public static void recordTemperature(IContext context, java.lang.String _key, java.lang.String _value)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("key", _key);
		params.put("value", _value);
		Core.microflowCall("Demo.RecordTemperature").withParams(params).execute(context);
	}
	public static java.lang.String showTime(IContext context, demo.proxies.ReportedTemperature _reportedTemperature)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ReportedTemperature", _reportedTemperature == null ? null : _reportedTemperature.getMendixObject());
		return (java.lang.String) Core.microflowCall("Demo.ShowTime").withParams(params).execute(context);
	}
	public static void startProcessor(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("Demo.StartProcessor").withParams(params).execute(context);
	}
	public static boolean startProducer(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("Demo.StartProducer").withParams(params).execute(context);
	}
	public static void startRecording(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("Demo.StartRecording").withParams(params).execute(context);
	}
	public static boolean startup(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("Demo.Startup").withParams(params).execute(context);
	}
	public static void stopProcessor(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("Demo.StopProcessor").withParams(params).execute(context);
	}
}