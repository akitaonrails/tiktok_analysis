package com.bytedance.speech.speechaudio;

import X.C08FF;
import com.bytedance.speech.speechaudio.SpeechAudioLoader;
import com.bytedance.speech.speechaudio.bridge.SpeechBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.mammon.audiosdk.bridge.SAMICoreBridge;

/* JADX INFO: loaded from: classes35.dex */
public class SpeechEngineLoader {

    public interface PluginAdapter extends CommonPluginAdapter {
        @Override // com.bytedance.speech.speechaudio.CommonPluginAdapter
        boolean loadFromHost(String str);

        @Override // com.bytedance.speech.speechaudio.CommonPluginAdapter
        boolean loadFromPlugin(String str);
    }

    public static class SpeechEngineLoaderHolder {
        public static SpeechEngineLoader INSTANCE = new SpeechEngineLoader();
    }

    public synchronized SpeechBridge createBridge() {
        return SpeechAudioLoader.getInstance().createBridge();
    }

    public synchronized SAMICoreBridge createSAMICoreBridge() {
        return SpeechAudioLoader.getInstance().createSAMICoreBridge();
    }

    public synchronized State getState() {
        return ConvertState(SpeechAudioLoader.getInstance().getState());
    }

    public synchronized State load() {
        return ConvertState(SpeechAudioLoader.getInstance().load());
    }

    /* JADX INFO: renamed from: com.bytedance.speech.speechaudio.SpeechEngineLoader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$speech$speechaudio$SpeechAudioLoader$State;

        static {
            int[] iArr = new int[SpeechAudioLoader.State.values().length];
            $SwitchMap$com$bytedance$speech$speechaudio$SpeechAudioLoader$State = iArr;
            try {
                iArr[SpeechAudioLoader.State.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$speech$speechaudio$SpeechAudioLoader$State[SpeechAudioLoader.State.PLUGIN_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$speech$speechaudio$SpeechAudioLoader$State[SpeechAudioLoader.State.PLUGIN_NOT_EXIST.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    public SpeechEngineLoader() {
        SpeechAudioLoader.getInstance().getState();
    }

    public static SpeechEngineLoader getInstance() {
        return SpeechEngineLoaderHolder.INSTANCE;
    }

    public enum State {
        UNKNOWN,
        PLUGIN_NOT_EXIST,
        PLUGIN_LOADED;

        public static State valueOf(String str) {
            return (State) C08FF.LIZ(State.class, str);
        }
    }

    private State ConvertState(SpeechAudioLoader.State state) {
        int i = AnonymousClass1.$SwitchMap$com$bytedance$speech$speechaudio$SpeechAudioLoader$State[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return State.UNKNOWN;
                }
                return State.PLUGIN_NOT_EXIST;
            }
            return State.PLUGIN_LOADED;
        }
        return State.UNKNOWN;
    }

    public synchronized void setAdapter(PluginAdapter pluginAdapter) {
        SpeechAudioLoader.getInstance().setAdapter(pluginAdapter);
    }
}
