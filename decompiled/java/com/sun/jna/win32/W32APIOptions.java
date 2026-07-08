package com.sun.jna.win32;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public interface W32APIOptions extends StdCallLibrary {
    public static final Map<String, Object> ASCII_OPTIONS;
    public static final Map<String, Object> DEFAULT_OPTIONS;
    public static final Map<String, Object> UNICODE_OPTIONS;

    static {
        Map<String, Object> mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap<String, Object>() { // from class: com.sun.jna.win32.W32APIOptions.1
            public static final long serialVersionUID = 1;

            {
                put("type-mapper", W32APITypeMapper.UNICODE);
                put("function-mapper", W32APIFunctionMapper.UNICODE);
            }
        });
        UNICODE_OPTIONS = mapUnmodifiableMap;
        Map<String, Object> mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap<String, Object>() { // from class: com.sun.jna.win32.W32APIOptions.2
            public static final long serialVersionUID = 1;

            {
                put("type-mapper", W32APITypeMapper.ASCII);
                put("function-mapper", W32APIFunctionMapper.ASCII);
            }
        });
        ASCII_OPTIONS = mapUnmodifiableMap2;
        if (Boolean.getBoolean("w32.ascii")) {
            mapUnmodifiableMap = mapUnmodifiableMap2;
        }
        DEFAULT_OPTIONS = mapUnmodifiableMap;
    }
}
