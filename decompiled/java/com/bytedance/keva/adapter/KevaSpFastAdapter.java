package com.bytedance.keva.adapter;

import X.C08RN;
import X.C0VSJ;
import X.C0VSV;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C807400Vlq;
import X.C830490Whz;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.keva.adapter.xml.XmlUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class KevaSpFastAdapter implements SharedPreferences {
    public static final Executor sApplyExecutor = C807400Vlq.LIZ();
    public static final Executor sWriterExecutor = C786410Ut5.h4();
    public File mBackupFile;
    public final Map<SharedPreferences.OnSharedPreferenceChangeListener, Keva.OnChangeListener> mChangeListenerMap = new ConcurrentHashMap();
    public File mFile;
    public Keva mKeva;

    public class Editor implements SharedPreferences.Editor {
        public boolean mClear;
        public volatile Map<String, Object> mTempMap = new C830490Whz();

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.mClear = true;
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            doWriteKeva(this.mTempMap, this.mClear);
            if (KevaSpFastAdapter.this.mFile != null) {
                KevaSpFastAdapter.sWriterExecutor.execute(new Runnable() { // from class: com.bytedance.keva.adapter.KevaSpFastAdapter.Editor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C1C7U.LIZ("KevaSpFastAdapter$Editor@bba0.commit$1");
                        com_bytedance_keva_adapter_KevaSpFastAdapter$Editor$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        C1C7U.LIZIZ("KevaSpFastAdapter$Editor@bba0.commit$1");
                    }

                    public void com_bytedance_keva_adapter_KevaSpFastAdapter$Editor$1__run$___twin___() {
                        KevaSpFastAdapter kevaSpFastAdapter = KevaSpFastAdapter.this;
                        kevaSpFastAdapter.doWriteSp(kevaSpFastAdapter.getAll());
                    }

                    public static void com_bytedance_keva_adapter_KevaSpFastAdapter$Editor$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        try {
                            anonymousClass1.com_bytedance_keva_adapter_KevaSpFastAdapter$Editor$1__run$___twin___();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }
                });
            }
            this.mTempMap = new C830490Whz();
            if (!this.mClear) {
                return true;
            }
            this.mClear = false;
            return true;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            commit();
        }

        public Editor() {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, this);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return this;
        }

        private void doWriteKeva(Map<String, Object> map, boolean z) {
            if (z) {
                KevaSpFastAdapter.this.mKeva.clear();
            }
            synchronized (map) {
                try {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value == null) {
                            KevaSpFastAdapter.this.mKeva.erase(key);
                        }
                        if (value instanceof Integer) {
                            KevaSpFastAdapter.this.mKeva.storeInt(key, ((Integer) value).intValue());
                        } else if (value instanceof Boolean) {
                            KevaSpFastAdapter.this.mKeva.storeBoolean(key, ((Boolean) value).booleanValue());
                        } else if (value instanceof String) {
                            KevaSpFastAdapter.this.mKeva.storeString(key, (String) value);
                        } else if (value instanceof Long) {
                            KevaSpFastAdapter.this.mKeva.storeLong(key, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            KevaSpFastAdapter.this.mKeva.storeFloat(key, ((Float) value).floatValue());
                        } else if (value instanceof Set) {
                            KevaSpFastAdapter.this.mKeva.storeStringSet(key, (Set) value);
                        } else {
                            KevaSpFastAdapter.this.mKeva.erase(key);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, Boolean.valueOf(z));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, Float.valueOf(f));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, Integer.valueOf(i));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, Long.valueOf(j));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, str2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, set);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return this;
        }
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new Editor();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.mKeva.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof String[]) {
                    HashSet hashSet = new HashSet(16, 0.75f);
                    for (String str : (String[]) value) {
                        hashSet.add(str);
                    }
                    value = hashSet;
                }
                map.put(key, value);
            }
        }
        return map;
    }

    public KevaSpFastAdapter(Keva keva) {
        this.mKeva = keva;
    }

    public static File INVOKEVIRTUAL_com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static FileOutputStream createFileOutputStream(File file) {
        try {
            return new C0VSV(file);
        } catch (FileNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            if (!file.getParentFile().mkdir()) {
                return null;
            }
            try {
                return new C0VSV(file);
            } catch (FileNotFoundException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return this.mKeva.contains(str);
    }

    public void doWriteSp(Map<String, ?> map) {
        boolean zExists = this.mBackupFile.exists();
        if (this.mFile.exists()) {
            if (!zExists) {
                this.mFile.renameTo(this.mBackupFile);
            } else {
                this.mFile.delete();
            }
        }
        FileOutputStream fileOutputStreamCreateFileOutputStream = createFileOutputStream(this.mFile);
        try {
            try {
                if (fileOutputStreamCreateFileOutputStream == null) {
                    return;
                }
                try {
                    try {
                        try {
                            XmlUtils.writeMapXml(map, fileOutputStreamCreateFileOutputStream);
                            fileOutputStreamCreateFileOutputStream.getFD().sync();
                            this.mBackupFile.delete();
                            fileOutputStreamCreateFileOutputStream.close();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("fail to write ");
                            sbLIZ.append(this.mFile.getName());
                            sbLIZ.append(", dump: ");
                            sbLIZ.append(map.keySet());
                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
                        }
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        this.mFile.delete();
                        fileOutputStreamCreateFileOutputStream.close();
                    }
                } catch (XmlPullParserException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    this.mFile.delete();
                    fileOutputStreamCreateFileOutputStream.close();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    fileOutputStreamCreateFileOutputStream.close();
                    throw th;
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    throw th;
                }
            }
        } catch (IOException e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Keva.OnChangeListener onChangeListener = new Keva.OnChangeListener() { // from class: com.bytedance.keva.adapter.KevaSpFastAdapter.1
            @Override // com.bytedance.keva.Keva.OnChangeListener
            public void onChanged(Keva keva, String str) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(KevaSpFastAdapter.this, str);
            }
        };
        this.mKeva.registerChangeListener(onChangeListener);
        this.mChangeListenerMap.put(onSharedPreferenceChangeListener, onChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mKeva.unRegisterChangeListener(this.mChangeListenerMap.remove(onSharedPreferenceChangeListener));
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        return this.mKeva.getBoolean(str, z);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        return this.mKeva.getFloat(str, f);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        return this.mKeva.getInt(str, i);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        return this.mKeva.getLong(str, j);
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        String string = this.mKeva.getString(str, str2);
        if (string != null) {
            return string;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = this.mKeva.getStringSet(str, set);
        if (stringSet != null) {
            return stringSet;
        }
        return set;
    }

    public static KevaSpFastAdapter getSharedPreferences(Context context, String str, int i, boolean z) throws Throwable {
        int i2;
        if (i == 4) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        KevaSpFastAdapter kevaSpFastAdapter = new KevaSpFastAdapter(KevaImpl.getRepoFromSp(context, str, i2));
        if (z) {
            File fileINVOKEVIRTUAL_com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = INVOKEVIRTUAL_com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context);
            if (!fileINVOKEVIRTUAL_com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.exists()) {
                fileINVOKEVIRTUAL_com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.mkdirs();
            }
            String parent = fileINVOKEVIRTUAL_com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.getParent();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shared_prefs/");
            sbLIZ.append(str);
            sbLIZ.append(".xml");
            kevaSpFastAdapter.mFile = new C0VSJ(parent, C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(kevaSpFastAdapter.mFile.getPath());
            sbLIZ2.append(".bak");
            kevaSpFastAdapter.mBackupFile = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return kevaSpFastAdapter;
    }
}
