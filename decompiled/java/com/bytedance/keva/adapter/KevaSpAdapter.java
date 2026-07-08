package com.bytedance.keva.adapter;

import X.C1C7U;
import X.C2179971ATj;
import X.C786410Ut5;
import X.C807400Vlq;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArrayMap;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class KevaSpAdapter implements SharedPreferences {
    public static final Executor sApplyExecutor = C807400Vlq.LIZ();
    public static final Executor sWriterExecutor = C786410Ut5.h4();
    public final Map<SharedPreferences.OnSharedPreferenceChangeListener, Keva.OnChangeListener> mChangeListenerMap = obtainMap();
    public Keva mKeva;
    public SharedPreferences mSp;

    @Override // android.content.SharedPreferences
    public synchronized Map<String, ?> getAll() {
        HashMap map;
        map = new HashMap();
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

    public static Map obtainMap() {
        return new ArrayMap();
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new Editor();
    }

    public class Editor implements SharedPreferences.Editor {
        public boolean mClear;
        public Map<String, Object> mTempMap = KevaSpAdapter.obtainMap();

        @Override // android.content.SharedPreferences.Editor
        public synchronized void apply() {
            commit();
        }

        @Override // android.content.SharedPreferences.Editor
        public synchronized SharedPreferences.Editor clear() {
            this.mClear = true;
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public synchronized boolean commit() {
            final Map<String, Object> map = this.mTempMap;
            final boolean z = this.mClear;
            if (KevaSpAdapter.this.mSp != null) {
                KevaSpAdapter.sWriterExecutor.execute(new Runnable() { // from class: com.bytedance.keva.adapter.KevaSpAdapter.Editor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C1C7U.LIZ("KevaSpAdapter$Editor@987e.commit$1");
                        com_bytedance_keva_adapter_KevaSpAdapter$Editor$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        C1C7U.LIZIZ("KevaSpAdapter$Editor@987e.commit$1");
                    }

                    public void com_bytedance_keva_adapter_KevaSpAdapter$Editor$1__run$___twin___() {
                        Editor.this.doWriteSp(map, z);
                    }

                    public static void com_bytedance_keva_adapter_KevaSpAdapter$Editor$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        try {
                            anonymousClass1.com_bytedance_keva_adapter_KevaSpAdapter$Editor$1__run$___twin___();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }
                });
            }
            doWriteKeva(map, z);
            this.mTempMap = KevaSpAdapter.obtainMap();
            if (this.mClear) {
                this.mClear = false;
            }
            return true;
        }

        public Editor() {
        }

        @Override // android.content.SharedPreferences.Editor
        public synchronized SharedPreferences.Editor remove(String str) {
            this.mTempMap.put(str, this);
            return this;
        }

        private void doWriteKeva(Map<String, Object> map, boolean z) {
            if (z) {
                KevaSpAdapter.this.mKeva.clear();
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    KevaSpAdapter.this.mKeva.erase(key);
                } else if (value instanceof Integer) {
                    KevaSpAdapter.this.mKeva.storeInt(key, ((Integer) value).intValue());
                } else if (value instanceof Boolean) {
                    KevaSpAdapter.this.mKeva.storeBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof String) {
                    KevaSpAdapter.this.mKeva.storeString(key, (String) value);
                } else if (value instanceof Long) {
                    KevaSpAdapter.this.mKeva.storeLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    KevaSpAdapter.this.mKeva.storeFloat(key, ((Float) value).floatValue());
                } else if (value instanceof Set) {
                    KevaSpAdapter.this.mKeva.storeStringSet(key, (Set) value);
                } else {
                    KevaSpAdapter.this.mKeva.erase(key);
                }
            }
        }

        public void doWriteSp(Map<String, Object> map, boolean z) {
            SharedPreferences.Editor editorEdit = KevaSpAdapter.this.mSp.edit();
            if (z) {
                editorEdit.clear();
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    editorEdit.remove(key);
                } else if (value instanceof Integer) {
                    editorEdit.putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Boolean) {
                    editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof String) {
                    editorEdit.putString(key, (String) value);
                } else if (value instanceof Long) {
                    editorEdit.putLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    editorEdit.putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof Set) {
                    editorEdit.putStringSet(key, (Set) value);
                } else {
                    editorEdit.remove(key);
                }
            }
            editorEdit.commit();
        }

        @Override // android.content.SharedPreferences.Editor
        public synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.mTempMap.put(str, Boolean.valueOf(z));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public synchronized SharedPreferences.Editor putFloat(String str, float f) {
            this.mTempMap.put(str, Float.valueOf(f));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public synchronized SharedPreferences.Editor putInt(String str, int i) {
            this.mTempMap.put(str, Integer.valueOf(i));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public synchronized SharedPreferences.Editor putLong(String str, long j) {
            this.mTempMap.put(str, Long.valueOf(j));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public synchronized SharedPreferences.Editor putString(String str, String str2) {
            this.mTempMap.put(str, str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public synchronized SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            this.mTempMap.put(str, set);
            return this;
        }
    }

    public KevaSpAdapter(Keva keva) {
        this.mKeva = keva;
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean contains(String str) {
        return this.mKeva.contains(str);
    }

    @Override // android.content.SharedPreferences
    public synchronized void registerOnSharedPreferenceChangeListener(final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Keva.OnChangeListener onChangeListener = new Keva.OnChangeListener() { // from class: com.bytedance.keva.adapter.KevaSpAdapter.1
            @Override // com.bytedance.keva.Keva.OnChangeListener
            public void onChanged(Keva keva, String str) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(KevaSpAdapter.this, str);
            }
        };
        this.mKeva.registerChangeListener(onChangeListener);
        this.mChangeListenerMap.put(onSharedPreferenceChangeListener, onChangeListener);
    }

    @Override // android.content.SharedPreferences
    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mKeva.unRegisterChangeListener(this.mChangeListenerMap.remove(onSharedPreferenceChangeListener));
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean getBoolean(String str, boolean z) {
        return this.mKeva.getBoolean(str, z);
    }

    @Override // android.content.SharedPreferences
    public synchronized float getFloat(String str, float f) {
        return this.mKeva.getFloat(str, f);
    }

    @Override // android.content.SharedPreferences
    public synchronized int getInt(String str, int i) {
        return this.mKeva.getInt(str, i);
    }

    @Override // android.content.SharedPreferences
    public synchronized long getLong(String str, long j) {
        return this.mKeva.getLong(str, j);
    }

    @Override // android.content.SharedPreferences
    public synchronized String getString(String str, String str2) {
        String string = this.mKeva.getString(str, str2);
        if (string != null) {
            str2 = string;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public synchronized Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = this.mKeva.getStringSet(str, set);
        if (stringSet != null) {
            set = stringSet;
        }
        return set;
    }

    public static KevaSpAdapter getSharedPreferences(Context context, String str, int i, boolean z) {
        int i2;
        if (i == 4) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        KevaSpAdapter kevaSpAdapter = new KevaSpAdapter(KevaImpl.getRepoFromSp(context, str, i2));
        if (z) {
            kevaSpAdapter.mSp = context.getSharedPreferences(str, i);
        }
        return kevaSpAdapter;
    }
}
