package com.bytedance.speech.speechaudio;

import X.C08FF;
import X.C2188811AlT;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.speech.speechaudio.bridge.SpeechBridge;
import com.bytedance.speech.speechaudio.bridge.SpeechEngineBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.mammon.audiosdk.bridge.SAMICoreBridge;
import com.mammon.audiosdk.bridge.SAMICoreHostBridge;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes35.dex */
public class SpeechAudioLoader {
    public static final String[] COMMON_LIB_ARRAY = new String[0];
    public static final String[] SDK_LIB_ARRAY = {"audioeffect"};
    public static final String[] PLUGIN_LIB_ARRAY = {"audioeffectpg"};
    public State state = State.UNKNOWN;
    public CommonPluginAdapter adapter = new DefaultAdapter(this);

    public interface PluginAdapter extends CommonPluginAdapter {
        @Override // com.bytedance.speech.speechaudio.CommonPluginAdapter
        boolean loadFromHost(String str);

        @Override // com.bytedance.speech.speechaudio.CommonPluginAdapter
        boolean loadFromPlugin(String str);
    }

    public static class SpeechAudioLoaderHolder {
        public static SpeechAudioLoader INSTANCE = new SpeechAudioLoader();
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

    public synchronized SAMICoreBridge createSAMICoreBridge() {
        load();
        if (this.state == State.PLUGIN_LOADED) {
            try {
                Class<?> clsLoadClass = getClass().getClassLoader().loadClass("com.mammon.audiosdk.bridge.SAMICorePluginBridge");
                if (clsLoadClass != null) {
                    return (SAMICoreBridge) clsLoadClass.newInstance();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return new SAMICoreHostBridge();
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

    public static SpeechAudioLoader getInstance() {
        return SpeechAudioLoaderHolder.INSTANCE;
    }

    public static class DefaultAdapter implements PluginAdapter {
        public SpeechAudioLoader loader;

        @Override // com.bytedance.speech.speechaudio.SpeechAudioLoader.PluginAdapter, com.bytedance.speech.speechaudio.CommonPluginAdapter
        public boolean loadFromPlugin(String str) {
            return false;
        }

        public DefaultAdapter(SpeechAudioLoader speechAudioLoader) {
            this.loader = speechAudioLoader;
        }

        public static void INVOKESTATIC_com_bytedance_speech_speechaudio_SpeechAudioLoader$DefaultAdapter_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
            LoadSoLancet.LIZJ(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF(str);
            LoadSoLancet.LJ(jUptimeMillis, str);
            LoadSoLancet.LIZLLL(jUptimeMillis, str);
            LoadSoLancet.LIZIZ(str);
        }

        @Override // com.bytedance.speech.speechaudio.SpeechAudioLoader.PluginAdapter, com.bytedance.speech.speechaudio.CommonPluginAdapter
        public boolean loadFromHost(String str) {
            if (this.loader.state != State.UNKNOWN) {
                return true;
            }
            try {
                INVOKESTATIC_com_bytedance_speech_speechaudio_SpeechAudioLoader$DefaultAdapter_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
    }

    public enum State {
        UNKNOWN,
        PLUGIN_NOT_EXIST,
        PLUGIN_LOADED;

        public static State valueOf(String str) {
            return (State) C08FF.LIZ(State.class, str);
        }
    }

    public synchronized void setAdapter(CommonPluginAdapter commonPluginAdapter) {
        if (commonPluginAdapter != null) {
            this.adapter = commonPluginAdapter;
        } else {
            throw new NullPointerException("SpeechEngineLoader plugin adapter can't be null");
        }
    }
}
