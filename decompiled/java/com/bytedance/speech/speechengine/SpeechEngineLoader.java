package com.bytedance.speech.speechengine;

import X.C08FF;
import X.C2188811AlT;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.speech.speechengine.bridge.SpeechBridge;
import com.bytedance.speech.speechengine.bridge.SpeechEngineBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes35.dex */
public class SpeechEngineLoader {
    public PluginAdapter adapter;
    public State state;
    public static final String[] COMMON_LIB_ARRAY = {"audio_fingerprint_sdk"};
    public static final String[] SDK_LIB_ARRAY = {"speechengine"};
    public static final String[] PLUGIN_LIB_ARRAY = {"speechepg"};

    public interface PluginAdapter {
        boolean loadFromHost(String str);

        boolean loadFromPlugin(String str);
    }

    public static class c {
        public static final SpeechEngineLoader LIZ = new SpeechEngineLoader();
    }

    public synchronized SpeechBridge createBridge() {
        load();
        if (this.state == State.PLUGIN_LOADED) {
            try {
                Class<?> clsLoadClass = getClass().getClassLoader().loadClass("com.bytedance.speech.speechengine.bridge.SpeechPluginBridge");
                if (clsLoadClass != null) {
                    return (SpeechBridge) clsLoadClass.newInstance();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return new SpeechEngineBridge();
    }

    public synchronized State getState() {
        return this.state;
    }

    public synchronized State load() {
        if (this.state == State.UNKNOWN) {
            for (String str : COMMON_LIB_ARRAY) {
                if (!this.adapter.loadFromHost(str)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SpeechEngine load host library: ");
                    sbLIZ.append(str);
                    sbLIZ.append(" failed!");
                    throw new UnsatisfiedLinkError(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        if (this.state != State.PLUGIN_LOADED) {
            String[] strArr = PLUGIN_LIB_ARRAY;
            if (strArr.length != 0) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        this.state = State.PLUGIN_LOADED;
                        break;
                    }
                    if (!this.adapter.loadFromPlugin(strArr[i])) {
                        break;
                    }
                    i++;
                }
            }
        }
        if (this.state == State.UNKNOWN) {
            for (String str2 : SDK_LIB_ARRAY) {
                if (!this.adapter.loadFromHost(str2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SpeechEngine load host library: ");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(" failed!");
                    throw new UnsatisfiedLinkError(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            this.state = State.PLUGIN_NOT_EXIST;
        }
        return this.state;
    }

    public SpeechEngineLoader() {
        this.state = State.UNKNOWN;
        this.adapter = new b(this);
    }

    public static SpeechEngineLoader getInstance() {
        return c.LIZ;
    }

    public enum State {
        UNKNOWN,
        PLUGIN_NOT_EXIST,
        PLUGIN_LOADED;

        public static State valueOf(String str) {
            return (State) C08FF.LIZ(State.class, str);
        }
    }

    public static class b implements PluginAdapter {
        public final SpeechEngineLoader LIZ;

        public b(SpeechEngineLoader speechEngineLoader) {
            this.LIZ = speechEngineLoader;
        }

        @Override // com.bytedance.speech.speechengine.SpeechEngineLoader.PluginAdapter
        public final boolean loadFromHost(String str) {
            if (this.LIZ.state != State.UNKNOWN) {
                return true;
            }
            try {
                LoadSoLancet.LIZJ(str);
                long jUptimeMillis = SystemClock.uptimeMillis();
                Librarian.LJFF(str);
                LoadSoLancet.LJ(jUptimeMillis, str);
                LoadSoLancet.LIZLLL(jUptimeMillis, str);
                LoadSoLancet.LIZIZ(str);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                th.printStackTrace();
                return false;
            }
        }

        @Override // com.bytedance.speech.speechengine.SpeechEngineLoader.PluginAdapter
        public final boolean loadFromPlugin(String str) {
            State state = this.LIZ.state;
            if (state != State.UNKNOWN) {
                if (state != State.PLUGIN_LOADED) {
                    return false;
                }
                return true;
            }
            try {
                LoadSoLancet.LIZJ(str);
                long jUptimeMillis = SystemClock.uptimeMillis();
                Librarian.LJFF(str);
                LoadSoLancet.LJ(jUptimeMillis, str);
                LoadSoLancet.LIZLLL(jUptimeMillis, str);
                LoadSoLancet.LIZIZ(str);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                th.printStackTrace();
                return false;
            }
        }
    }

    public synchronized void setAdapter(PluginAdapter pluginAdapter) {
        if (pluginAdapter != null) {
            this.adapter = pluginAdapter;
        } else {
            throw new NullPointerException("SpeechEngineLoader plugin adapter can't be null");
        }
    }
}
