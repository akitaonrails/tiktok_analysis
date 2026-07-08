package com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.logic;

import X.C01GW;
import X.C054G;
import X.C09TA;
import X.C09TV;
import X.C09TX;
import X.C0CNO;
import X.C0E48;
import X.C1390380mHk;
import X.C19EG;
import X.C2279808wW;
import X.C2296808zG;
import X.C23250099c;
import X.C356901a3;
import X.C452501pT;
import X.C576210Mip;
import X.C785410UrT;
import X.C786410Ut5;
import X.EnumC1399820mWy;
import X.InterfaceC1399800mWw;
import X.ProgressDialogC1399790mWv;
import android.text.TextUtils;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneReadTextEffectBean;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.EditRepeatMusicPlayer;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.logic.EditorProTTSHelper;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS122S1200000_5;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class EditorProTTSHelper implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final C19EG LL;
    public final Lifecycle LLILLJJLI;
    public final VideoPublishEditModel LLILLL;
    public final C0E48 LLILZ;
    public final C01GW LLILZIL;
    public ProgressDialogC1399790mWv LLILZLL;
    public final C054G LLIZ;
    public boolean LLIZLLLIL;
    public EditRepeatMusicPlayer LLJ;
    public final C01GW LLJI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final ProgressDialogC1399790mWv LIZ(final Function1<? super Boolean, Unit> function1) {
        ProgressDialogC1399790mWv progressDialogC1399790mWv = this.LLILZLL;
        if (progressDialogC1399790mWv != null) {
            progressDialogC1399790mWv.cancel();
        }
        this.LLILZLL = C576210Mip.LIZ(this.LL, EnumC1399820mWy.VISIBLE, new InterfaceC1399800mWw() { // from class: X.0FCq
            @Override // X.InterfaceC1399800mWw
            public final void LIZ() {
                function1.invoke(Boolean.FALSE);
                EditorProTTSHelper editorProTTSHelper = this;
                editorProTTSHelper.LLIZLLLIL = true;
                C2296808zG.LIZJ(editorProTTSHelper.LLIZ, null);
            }
        });
        this.LLILZLL.setMessage(this.LL.getString(R.string.txr));
        return this.LLILZLL;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.LLIZLLLIL = true;
        C2296808zG.LIZJ(this.LLIZ, null);
        EditRepeatMusicPlayer editRepeatMusicPlayer = this.LLJ;
        if (editRepeatMusicPlayer != null) {
            editRepeatMusicPlayer.LIZIZ();
        }
        this.LLJ = null;
        this.LLILLJJLI.removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        this.LLIZLLLIL = true;
        C2296808zG.LIZJ(this.LLIZ, null);
        EditRepeatMusicPlayer editRepeatMusicPlayer = this.LLJ;
        if (editRepeatMusicPlayer != null) {
            editRepeatMusicPlayer.LIZIZ();
        }
        this.LLJ = null;
    }

    public static void LIZJ(EditorProTTSHelper editorProTTSHelper, Function1 function1) {
        editorProTTSHelper.getClass();
        C0CNO.LIZLLL(0L, new AwS122S1200000_5(editorProTTSHelper, (EditorProTTSHelper) function1, (Function1<? super Boolean, Unit>) "", (String) 3));
    }

    public EditorProTTSHelper(C19EG c19eg, Lifecycle lifecycle, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        this.LL = c19eg;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = c0e48;
        lifecycle.addObserver(this);
        this.LLILZIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(187));
        this.LLIZ = C2296808zG.LIZIZ();
        this.LLJI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(188));
    }

    public static void LIZLLL(EditorProTTSHelper editorProTTSHelper, boolean z, String str, NLETrackSlot nLETrackSlot, String str2, Function1 function1, int i) {
        boolean z2;
        boolean z3;
        boolean zOptBoolean;
        Function1 function12 = function1;
        String str3 = str;
        boolean z4 = z;
        if ((i & 1) != 0) {
            z4 = true;
        }
        if ((i & 16) != 0) {
            function12 = AFwS231S0000000_3.get$arr$(180);
        }
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 64) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        editorProTTSHelper.getClass();
        if (TextUtils.isEmpty(str3)) {
            function12.invoke(Boolean.FALSE);
            return;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (nLETrackSlot.hasExtra("tts_effect_extra")) {
            try {
                zOptBoolean = new JSONObject(nLETrackSlot.getExtra("tts_effect_extra")).optBoolean("is_voice_clone");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                zOptBoolean = false;
            }
        } else {
            zOptBoolean = false;
        }
        LIZIZ(editorProTTSHelper, z4, str3, nLETrackSlot, str2, C09TA.LIZ(str2), zOptBoolean, function12, null, z3, z2, 128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(EditorProTTSHelper editorProTTSHelper, boolean z, String str, NLETrackSlot nLETrackSlot, String str2, String str3, boolean z2, Function1 function1, VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean, boolean z3, boolean z4, int i) {
        VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean2 = voiceCloneReadTextEffectBean;
        boolean z5 = z3;
        Function1 function12 = function1;
        if ((i & 64) != 0) {
            function12 = AFwS231S0000000_3.get$arr$(179);
        }
        if ((i & 128) != 0) {
            voiceCloneReadTextEffectBean2 = null;
        }
        if ((i & 256) != 0) {
            z5 = true;
        }
        if ((i & 512) == 0 && !z4) {
            editorProTTSHelper.getClass();
        } else {
            C786410Ut5.O4(editorProTTSHelper.LIZ(function12));
        }
        if (!C2279808wW.LIZIZ(str)) {
            C19EG c19eg = editorProTTSHelper.LL;
            if (c19eg != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131829881);
                C1390380mHk.LIZ(c19eg, 1019, creativeToastBuilder);
            }
            ProgressDialogC1399790mWv progressDialogC1399790mWv = editorProTTSHelper.LLILZLL;
            if (progressDialogC1399790mWv != null) {
                progressDialogC1399790mWv.dismiss();
                C785410UrT.LIZ(progressDialogC1399790mWv);
                return;
            }
            return;
        }
        if (C09TA.LIZIZ(str3) == 1) {
            ITTSService iTTSService = (ITTSService) editorProTTSHelper.LLJI.getValue();
            if (iTTSService != null) {
                iTTSService.initAudioSDKHandler(editorProTTSHelper.LLILLL.getCreativeInfo());
            }
            ITTSService iTTSService2 = (ITTSService) editorProTTSHelper.LLJI.getValue();
            if (iTTSService2 != null) {
                iTTSService2.stopStreamReading();
            }
        }
        C23250099c.LIZLLL(editorProTTSHelper.LLIZ, new C09TX(CoroutineExceptionHandler.LJJLIL, editorProTTSHelper, function12), null, new C09TV(editorProTTSHelper, str2, str3, str, z2, function12, nLETrackSlot, voiceCloneReadTextEffectBean2, z5, z, null), 2);
    }
}
