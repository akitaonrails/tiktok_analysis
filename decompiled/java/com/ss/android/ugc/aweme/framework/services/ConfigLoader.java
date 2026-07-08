package com.ss.android.ugc.aweme.framework.services;

import X.C2188811AlT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ConfigLoader {
    public static final String[] DIRS = {"services/", "services/AwemeLive/", "services/AwemeIM/", "services/AwemeReactNative/", "services/AwemePush/", "services/AwemeShare/", "services/AwemeMain/", "services/AwemePlugin/", "services/SdkDebugger/", "services/AwemeMusic/", "services/AwemeVideo/", "services/AwemeFramework/", "services/AwemeCommerce/"};
    public static final Map<String, List<CacheItem>> CLASSES = Collections.synchronizedMap(new LinkedHashMap());

    public static class ConfigIterator<T> implements Iterator<T> {
        public Class mClass;
        public ClassLoader mClassLoader;
        public List<CacheItem> mClasses;
        public int mIndex;

        @Override // java.util.Iterator
        public boolean hasNext() {
            List<CacheItem> list = this.mClasses;
            return list != null && this.mIndex < list.size();
        }

        @Override // java.util.Iterator
        public T next() {
            T t;
            CacheItem cacheItem = (CacheItem) ListProtector.get(this.mClasses, this.mIndex);
            this.mIndex++;
            synchronized (cacheItem) {
                try {
                    boolean z = cacheItem.persistence;
                    if (z && (t = (T) cacheItem.cacheService) != null) {
                        return t;
                    }
                    if (!z) {
                        return newService(cacheItem);
                    }
                    T tNewService = newService(cacheItem);
                    cacheItem.cacheService = tNewService;
                    return tNewService;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        private T newService(CacheItem cacheItem) {
            try {
                Class<?> cls = Class.forName(cacheItem.className, false, this.mClassLoader);
                if (this.mClass.isAssignableFrom(cls)) {
                    try {
                        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        return (T) declaredConstructor.newInstance(new Object[0]);
                    } catch (IllegalAccessException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new RuntimeException(e);
                    } catch (InstantiationException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw new RuntimeException(e2);
                    } catch (NoSuchMethodException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        throw new RuntimeException(e3);
                    } catch (InvocationTargetException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        throw new RuntimeException(e4);
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("source: ");
                sbLIZ.append(cls.getName());
                sbLIZ.append(", dest: ");
                sbLIZ.append(this.mClass.getName());
                throw new RuntimeException(new ClassCastException(C2188811AlT.LIZIZ(sbLIZ)));
            } catch (ClassNotFoundException e5) {
                TryCatchGuardChecker.doCheck(e5);
                throw new RuntimeException(e5);
            }
        }

        public ConfigIterator(List<CacheItem> list, Class<T> cls, ClassLoader classLoader) {
            this.mClassLoader = classLoader;
            this.mClass = cls;
            this.mClasses = list;
        }
    }

    public static class CacheItem {
        public Object cacheService;
        public final String className;
        public final boolean persistence;

        public static CacheItem fromConfig(String str) {
            if (str != null && !"".equals(str)) {
                String[] strArrSplit = str.split(":");
                boolean z = false;
                String str2 = strArrSplit[0];
                if (strArrSplit.length > 1) {
                    z = Boolean.parseBoolean(strArrSplit[1]);
                }
                return new CacheItem(str2, z);
            }
            return null;
        }

        public CacheItem(String str, boolean z) {
            this.className = str;
            this.persistence = z;
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static <T> Iterator<T> iterator(Class<T> cls) {
        ClassLoader classLoader = cls.getClassLoader();
        return new ConfigIterator(loadClasses(cls, classLoader), cls, classLoader);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x004f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.util.List<com.ss.android.ugc.aweme.framework.services.ConfigLoader.CacheItem> parse(java.net.URL r6) {
        /*
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r4 = 0
            java.io.InputStream r3 = r6.openStream()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L38
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.io.IOException -> L2a java.lang.Throwable -> L4f
            r1.<init>(r2)     // Catch: java.io.IOException -> L2a java.lang.Throwable -> L4f
            java.lang.String r0 = r1.readLine()     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L49
        L18:
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.framework.services.ConfigLoader$CacheItem r0 = com.ss.android.ugc.aweme.framework.services.ConfigLoader.CacheItem.fromConfig(r0)     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L49
            if (r0 == 0) goto L23
            r5.add(r0)     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L49
        L23:
            java.lang.String r0 = r1.readLine()     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L49
            goto L18
        L28:
            r0 = move-exception
            goto L3c
        L2a:
            r0 = move-exception
            r1 = r4
            goto L3c
        L2d:
            r0 = move-exception
            r2 = r4
            goto L4b
        L30:
            r0 = move-exception
            r1 = r4
            r2 = r1
            goto L3c
        L34:
            r0 = move-exception
            r3 = r4
            r2 = r4
            goto L4b
        L38:
            r0 = move-exception
            r2 = r4
            r1 = r4
            r3 = r2
        L3c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L49
        L3f:
            closeQuietly(r1)
            closeQuietly(r2)
            closeQuietly(r3)
            return r5
        L49:
            r0 = move-exception
            r4 = r1
        L4b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r0 = move-exception
            goto L4b
        L51:
            closeQuietly(r4)
            closeQuietly(r2)
            closeQuietly(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.framework.services.ConfigLoader.parse(java.net.URL):java.util.List");
    }

    public static List<CacheItem> parseSafely(URL url) {
        for (int i = 0; i < 3; i++) {
            try {
                return parse(url);
            } catch (ConcurrentModificationException e) {
                TryCatchGuardChecker.doCheck(e);
                if (i < 2) {
                    try {
                        Thread.sleep(2L);
                    } catch (InterruptedException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                } else {
                    throw e;
                }
            }
        }
        return new LinkedList();
    }

    public static void addCache(String str, String str2) {
        String[] strArrSplit = str2.split("\n");
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArrSplit) {
            arrayList.add(CacheItem.fromConfig(str3));
        }
        CLASSES.put(str, arrayList);
    }

    public static <T> List<CacheItem> loadClasses(Class<T> cls, ClassLoader classLoader) {
        List<CacheItem> list;
        Map<String, List<CacheItem>> map = CLASSES;
        synchronized (map) {
            try {
                List<CacheItem> list2 = map.get(cls.getName());
                if (list2 != null) {
                    return list2;
                }
                LinkedList linkedList = new LinkedList();
                for (String str : DIRS) {
                    Enumeration<URL> urls = getUrls(cls, classLoader, str);
                    while (urls != null && urls.hasMoreElements()) {
                        linkedList.addAll(parseSafely(urls.nextElement()));
                    }
                }
                Map<String, List<CacheItem>> map2 = CLASSES;
                synchronized (map2) {
                    try {
                        if (!map2.containsKey(cls.getName())) {
                            map2.put(cls.getName(), linkedList);
                            list = linkedList;
                        } else {
                            list = map2.get(cls.getName());
                        }
                    } finally {
                    }
                }
                return list;
            } finally {
            }
        }
    }

    public static Enumeration<URL> getUrls(Class cls, ClassLoader classLoader, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(cls.getName());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (classLoader == null) {
            try {
                return ClassLoader.getSystemResources(strLIZIZ);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        try {
            return classLoader.getResources(strLIZIZ);
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }
}
