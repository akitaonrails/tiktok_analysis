package com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui;

import X.AbstractC848400XPy;
import X.C013C;
import X.C01GW;
import X.C051R;
import X.C054G;
import X.C098200Yq;
import X.C09SZ;
import X.C09TA;
import X.C09TF;
import X.C09TG;
import X.C09TL;
import X.C0C64;
import X.C0CNO;
import X.C0E1V;
import X.C0E1X;
import X.C0E2B;
import X.C0E48;
import X.C0E55;
import X.C0EI7;
import X.C0EIM;
import X.C0EJ3;
import X.C0EU5;
import X.C0EVZ;
import X.C0FWY;
import X.C0LAB;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XF1;
import X.C0XQ7;
import X.C1179004jM;
import X.C11VK;
import X.C123100dR;
import X.C1259004wG;
import X.C1390380mHk;
import X.C13LP;
import X.C1428470nHB;
import X.C1446130njf;
import X.C1664460tPo;
import X.C1697810uHb;
import X.C1749280vcc;
import X.C189200o6;
import X.C19416910xr;
import X.C194341111n;
import X.C19EG;
import X.C201955140j;
import X.C20533215Wg;
import X.C20684815ws;
import X.C21378018lO;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C2279808wW;
import X.C2296808zG;
import X.C23250099c;
import X.C2374909Sh;
import X.C2375209Sk;
import X.C2375309Sl;
import X.C2375409Sm;
import X.C2375709Sp;
import X.C2375809Sq;
import X.C2377909Tl;
import X.C2502609rM;
import X.C301750BsD;
import X.C345410DgR;
import X.C349550Dn7;
import X.C350410DoV;
import X.C350870DpF;
import X.C361680EFy;
import X.C363430EMr;
import X.C364210EPr;
import X.C376950EqD;
import X.C386290FCp;
import X.C386310FCr;
import X.C386350FCv;
import X.C452501pT;
import X.C785410UrT;
import X.C786410Ut5;
import X.C816490W1f;
import X.EnumC357140DzM;
import X.EnumC361800EGk;
import X.InterfaceC1519705xD;
import X.InterfaceC19417310xv;
import X.InterfaceC362470EIz;
import X.InterfaceC364230EPt;
import X.ProgressDialogC1397790mTh;
import Y.ACListenerS140S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneReadTextEffectBean;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.EditRepeatMusicPlayer;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS145S0101000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes6.dex */
public final class TTSFragment extends TTResourcePanelFragment<CutViewModel> implements InterfaceC19417310xv {
    public static final String LLLLLLLZIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9HELIOSKyQ8KC06JCw4ICogZjEpMTt9PDE/Zzo6ZhEYGgkhKSIhLCEn";
    public RelativeLayout LLLFFI;
    public String LLLII;
    public NLETrackSlot LLLIIII;
    public C2377909Tl LLLIIIIL;
    public InterfaceC362470EIz LLLIIIL;
    public C21378018lO LLLIIL;
    public ProgressDialogC1397790mTh LLLILZ;
    public C09TF LLLILZLLLI;
    public C0EJ3 LLLIZZ;
    public C1749280vcc LLLL;
    public VoiceCloneReadTextEffectBean LLLLIIIILLL;
    public SafeHandler LLLLIILL;
    public RecyclerView LLLLIL;
    public C19416910xr LLLLILI;
    public boolean LLLLLIL;
    public boolean LLLLLILLIL;
    public boolean LLLLLJIL;
    public String LLLLLJLJLL;
    public String LLLLLL;
    public int LLLLLLL;
    public boolean LLLLLLLLL;
    public EditRepeatMusicPlayer LLLLLLLLLL;
    public final C01GW LLLFZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(189));
    public final C01GW LLLI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(596));
    public final HashMap<C386310FCr, Pair<File, Integer>> LLLIILIL = new HashMap<>(20);
    public String LLLIL = "";
    public long LLLILZJ = System.currentTimeMillis();
    public final C01GW LLLJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(190));
    public final C01GW LLLJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(191));
    public final C01GW LLLJL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(192));
    public final ArrayList<ReadTextEffectBean> LLLLII = new ArrayList<>();
    public int LLLLIIL = -1;
    public final float LLLLIILLL = 5.0f;
    public final C194341111n LLLLJ = new C194341111n();
    public String LLLLJI = "autoCheckSpeakID";
    public final AFwS231S0000000_3 LLLLL = AFwS231S0000000_3.get$arr$(110);
    public final C054G LLLLLLIL = C2296808zG.LIZIZ();
    public C054G LLLLLLJ = C2296808zG.LIZIZ();

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final String qS() {
        return "tts_panel";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final boolean yS() {
        return false;
    }

    public final void AT() {
        C0FWY c0fwy = C0FWY.LIZ;
        VideoPublishEditModel videoPublishEditModelZS = ZS();
        String str = videoPublishEditModelZS != null ? videoPublishEditModelZS.mShootWay : null;
        String strLJIILIIL = C1428470nHB.LJIILIIL(ZS());
        String strLJIILL = C1428470nHB.LJIILL(ZS());
        VideoPublishEditModel videoPublishEditModelZS2 = ZS();
        ShortVideoCommonParams shortVideoCommonParams = new ShortVideoCommonParams(str, strLJIILIIL, strLJIILL, videoPublishEditModelZS2 != null ? videoPublishEditModelZS2.getCreationId() : null, 0, 0, 0, 0, null, null, null, null, null, 8176, null);
        c0fwy.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
        c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
        c0lab.LJ("content_type", shortVideoCommonParams.contentType);
        c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
        c0lab.LJ("enter_from", "video_edit_page");
        C20684815ws.LJIILLIIL("click_apply_to_all", c0lab.LIZ);
    }

    public final void ET() {
        ReadTextEffectBean next;
        C19416910xr c19416910xr;
        C19416910xr c19416910xr2;
        Effect effect;
        Iterator<ReadTextEffectBean> it2 = this.LLLLII.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                if (!z && !C301750BsD.LIZ() && C123100dR.LIZ(this.LLLLJI)) {
                    NLETrackSlot nLETrackSlot = this.LLLIIII;
                    if (nLETrackSlot == null) {
                        nLETrackSlot = null;
                    }
                    if (C0EI7.LIZ(nLETrackSlot)) {
                        C19416910xr c19416910xr3 = this.LLLLILI;
                        if (c19416910xr3 != null) {
                            c19416910xr3.LLLII();
                        }
                        this.LLLLIIL = -1;
                    }
                }
                Iterator<ReadTextEffectBean> it3 = this.LLLLII.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it3.next();
                        if (Intrinsics.LJFF(next.mSpeaker.speakreID, this.LLLLJI)) {
                            break;
                        }
                    }
                }
                ReadTextEffectBean readTextEffectBean = next;
                String effectId = (readTextEffectBean == null || (effect = readTextEffectBean.effect) == null) ? null : effect.getEffectId();
                Iterator<ReadTextEffectBean> it4 = this.LLLLII.iterator();
                int i2 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (!Intrinsics.LJFF(it4.next().mSpeaker.speakreID, this.LLLLJI)) {
                        i2++;
                    } else if (i2 == -1) {
                        break;
                    }
                }
                if (u.LJJIIJZLJL(this.LLLLJI.toUpperCase(Locale.ROOT), "ICL", false)) {
                    if (C301750BsD.LIZ() && (c19416910xr2 = this.LLLLILI) != null) {
                        c19416910xr2.LLLII();
                    }
                    this.LLLLIIL = -1;
                    RecyclerView recyclerView = this.LLLLIL;
                    (recyclerView != null ? recyclerView : null).scrollToPosition(0);
                    return;
                }
                if (effectId != null && effectId.length() != 0 && i2 != -1) {
                    int i3 = i2 + 1;
                    this.LLLLIIL = i3;
                    RecyclerView recyclerView2 = this.LLLLIL;
                    (recyclerView2 != null ? recyclerView2 : null).scrollToPosition(i3);
                    return;
                }
                if (a0.LJJJIL(this.LLLLJI) && C376950EqD.LIZ(ZS()) && (c19416910xr = this.LLLLILI) != null) {
                    c19416910xr.LLLII();
                }
                this.LLLLIIL = 0;
                RecyclerView recyclerView3 = this.LLLLIL;
                (recyclerView3 != null ? recyclerView3 : null).scrollToPosition(0);
                return;
            }
            ReadTextEffectBean next2 = it2.next();
            int i4 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (Intrinsics.LJFF(next2.mSpeaker.speakreID, this.LLLLJI)) {
                C19416910xr c19416910xr4 = this.LLLLILI;
                if (c19416910xr4 != null) {
                    c19416910xr4.LLLI(i4);
                }
                C19416910xr c19416910xr5 = this.LLLLILI;
                if (c19416910xr5 != null) {
                    c19416910xr5.LLLFZ(i4, 1, true);
                }
                this.LLLLIIL = i4;
                z = true;
            }
            i = i4;
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final boolean FS() {
        ReadTextEffectBean next;
        Effect effect;
        if (this.LLLLIIL == 0) {
            Iterator<NLETrackSlot> it2 = qT().iterator();
            while (it2.hasNext()) {
                C0EVZ.LIZJ(it2.next(), this.LL);
            }
            this.LLLLLIL = true;
            lT(true);
            C19EG activity = getActivity();
            if (activity != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131833416);
                C1390380mHk.LIZ(activity, 1022, creativeToastBuilder);
            }
            return false;
        }
        if (this.LLLLLJLJLL == null) {
            return false;
        }
        this.LLLLLIL = true;
        if (getActivity() != null && !getActivity().isFinishing()) {
            ProgressDialogC1397790mTh progressDialogC1397790mThLIZIZ = ProgressDialogC1397790mTh.LIZIZ(getActivity(), getActivity().getString(2131850355));
            ACListenerS140S0100000_5 aCListenerS140S0100000_5 = new ACListenerS140S0100000_5(this, 134);
            TuxIconView tuxIconView = (TuxIconView) progressDialogC1397790mThLIZIZ.findViewById(R.id.jz7);
            if (tuxIconView != null) {
                C786410Ut5.a9(tuxIconView, aCListenerS140S0100000_5);
            }
            progressDialogC1397790mThLIZIZ.LIZJ(Boolean.TRUE);
            C0CNO.LIZLLL(0L, new AwS145S0101000_5(this, 0, 8));
            this.LLLILZ = progressDialogC1397790mThLIZIZ;
            VideoPublishEditModel videoPublishEditModelZS = ZS();
            C0E48 c0e48 = this.LL;
            String str = this.LLLLLJLJLL;
            if (str == null) {
                str = "";
            }
            if (c0e48 != null) {
                C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelZS, c0e48, new Pair(-1, -1));
                c0labLJFF.LJ("tone_list", str);
                C20684815ws.LJIILLIIL("text_reading_voice_loading_show", c0labLJFF.LIZ);
            }
            ProgressDialogC1397790mTh progressDialogC1397790mTh = this.LLLILZ;
            if (progressDialogC1397790mTh != null) {
                progressDialogC1397790mTh.show();
                C785410UrT.LIZIZ(progressDialogC1397790mTh);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(progressDialogC1397790mTh);
                C816490W1f.LIZ(progressDialogC1397790mTh);
            }
        }
        Iterator<ReadTextEffectBean> it3 = this.LLLLII.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (Intrinsics.LJFF(this.LLLLLJLJLL, C1664460tPo.LJII(next.effect))) {
                break;
            }
        }
        ReadTextEffectBean readTextEffectBean = next;
        String strLIZIZ = C09SZ.LIZIZ((readTextEffectBean == null || (effect = readTextEffectBean.effect) == null) ? false : C1664460tPo.LJ(effect));
        ArrayList<NLETrackSlot> arrayListQT = qT();
        String str2 = this.LLLLLJLJLL;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.LLLLLL;
        String str4 = str3 != null ? str3 : "";
        C2502609rM c2502609rM = new C2502609rM(CoroutineExceptionHandler.LJJLIL, this, 1);
        ArrayList arrayList = new ArrayList();
        C054G c054gLIZIZ = C2296808zG.LIZIZ();
        this.LLLLLLJ = c054gLIZIZ;
        C23250099c.LIZLLL(c054gLIZIZ, c2502609rM, null, new C2375809Sq(this, arrayListQT, arrayList, c2502609rM, str2, str4, strLIZIZ, null), 2);
        return false;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final ViewModel QS() {
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        return C364210EPr.LIZIZ(CutViewModel.class);
    }

    @Override // X.InterfaceC19417310xv
    public final void di() {
        ITTSService iTTSServiceVT;
        EditRepeatMusicPlayer editRepeatMusicPlayer = this.LLLLLLLLLL;
        if (editRepeatMusicPlayer != null) {
            editRepeatMusicPlayer.LIZIZ();
        }
        this.LLLLIIL = 0;
        C19416910xr c19416910xr = this.LLLLILI;
        if (c19416910xr != null) {
            c19416910xr.LLLI(0);
        }
        zT(this.LLLLLJLJLL);
        this.LLLLLJLJLL = null;
        this.LLLLLL = null;
        C0E48 c0e48 = this.LL;
        NLETrackSlot nLETrackSlot = this.LLLIIII;
        if (nLETrackSlot == null) {
            nLETrackSlot = null;
        }
        C0EVZ.LIZJ(nLETrackSlot, c0e48);
        lT(false);
        C0FWY.LIZ(C0FWY.LIZ, new ShortVideoCommonParams(ZS().mShootWay, C1428470nHB.LJIILIIL(ZS()), C1428470nHB.LJIILL(ZS()), ZS().getCreationId(), 0, 0, 0, 0, null, null, null, null, null, 8176, null), "1", null, 4);
        C09TF c09tf = this.LLLILZLLLI;
        if (c09tf == null || c09tf.LIZJ == null || (iTTSServiceVT = vT()) == null) {
            return;
        }
        iTTSServiceVT.stopStreamReading();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final String hS() {
        return C051R.LIZIZ(this.LLLLLIL ? new C0E1X(C0E1V.APPLY_TO_ALL.getNameId(), "", "", null, null, 24) : new C0E1X(C0E1V.TEXT_TO_SPEECH.getNameId(), "", "", null, null, 24));
    }

    public final void jT() {
        VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean = this.LLLLIIIILLL;
        if (voiceCloneReadTextEffectBean == null || this.LLLLII.contains(voiceCloneReadTextEffectBean)) {
            return;
        }
        ListProtector.add(this.LLLLII, 0, voiceCloneReadTextEffectBean);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void oT() {
        long j = 0;
        int i = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        this.LLLLII.add(new ReadTextEffectBean(new Effect(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, 0, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, 0 == true ? 1 : 0, objArr27, 0 == true ? 1 : 0, objArr28, objArr29, j, objArr30, objArr31, j, objArr32, objArr33, objArr34, objArr35, objArr36, 0 == true ? 1 : 0, objArr37, objArr38, objArr39, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, j, objArr46, objArr47, objArr48, j, j, objArr49, objArr50, objArr51, objArr52, objArr53, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 15, objArr54), new ReadTextEffectSpeakerExtra(true, "", "", "", 0, 0, null, null, null, null, false, 0L, 0L, null, 16352, null)));
        DT(false);
    }

    public final ArrayList<NLETrackSlot> qT() {
        VecNLETrackSPtr tracks;
        ArrayList<NLETrackSlot> arrayList = new ArrayList<>();
        C0E48 c0e48 = this.LL;
        if (c0e48 != null && (tracks = C350870DpF.LJI(c0e48).getTracks()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getTrackType() == NLETrackType.STICKER) {
                    arrayList2.add(nLETrack);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                for (NLETrackSlot nLETrackSlot : ((NLETrack) it2.next()).getSlots()) {
                    if (nLETrackSlot.hasExtra("text") && !TextUtils.isEmpty(nLETrackSlot.getExtra("text")) && (C349550Dn7.LJI(nLETrackSlot) || Intrinsics.LJFF(nLETrackSlot.getExtra("text_slot_type"), "AI_CAPTION"))) {
                        arrayList.add(nLETrackSlot);
                    }
                }
            }
        }
        return arrayList;
    }

    public final C09TG uT() {
        return (C09TG) this.LLLJIL.getValue();
    }

    public final ITTSService vT() {
        return (ITTSService) this.LLLJL.getValue();
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTS_IN_TT_");
        sbLIZ.append("TTSFragment ");
        LLLLLLLZIL = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC19417310xv
    public final boolean IJ() {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        VideoPublishEditModel videoPublishEditModelZS = ZS();
        return (videoPublishEditModelZS == null || (creativeModel = videoPublishEditModelZS.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.isFromCreateTemplate) ? false : true;
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int RR() {
        return fT() ? R.layout.c2r : R.layout.c2q;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLFFI = null;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C194341111n c194341111n = this.LLLLJ;
        if (c194341111n.LIZ != 0) {
            c194341111n.LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLLLLJIL = true;
        C2296808zG.LIZJ(this.LLLLLLJ, null);
        C2296808zG.LIZJ(this.LLLLLLIL, null);
        this.LLLILZLLLI = null;
        C09TG c09tgUT = uT();
        c09tgUT.LIZ = null;
        c09tgUT.LIZIZ.clear();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLLLLLLLL = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        ITTSService iTTSServiceVT;
        super.onStop();
        this.LLLLLLLLL = false;
        EditRepeatMusicPlayer editRepeatMusicPlayer = this.LLLLLLLLLL;
        if (editRepeatMusicPlayer != null) {
            editRepeatMusicPlayer.LIZIZ();
        }
        C09TF c09tf = this.LLLILZLLLI;
        if (c09tf != null && C123100dR.LIZ(c09tf.LIZJ) && (iTTSServiceVT = vT()) != null) {
            iTTSServiceVT.stopStreamReading();
        }
        ITTSService iTTSServiceVT2 = vT();
        if (iTTSServiceVT2 != null) {
            iTTSServiceVT2.destroyAudioSDKHandler();
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void HS() {
        super.HS();
    }

    public final void DT(boolean z) {
        String str;
        C0E55 player;
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra;
        if (this.LLLLILI == null) {
            C19416910xr c19416910xr = new C19416910xr();
            this.LLLLILI = c19416910xr;
            c19416910xr.LLLIIIIL(this.LLLLII);
            C19416910xr c19416910xr2 = this.LLLLILI;
            if (c19416910xr2 != null) {
                c19416910xr2.LLILLJJLI = this;
            }
        }
        if (z) {
            rS().LIZIZ(System.currentTimeMillis() - this.LLILLL);
        }
        RecyclerView recyclerView = this.LLLLIL;
        NLETrackSlot nLETrackSlot = null;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView2 = this.LLLLIL;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(this.LLLLILI);
        RecyclerView recyclerView3 = this.LLLLIL;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setItemAnimator(null);
        RecyclerView recyclerView4 = this.LLLLIL;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        HandlerHook.viewPost(recyclerView4, new ARunnableS105S0100000_5(this, 59));
        C19416910xr c19416910xr3 = this.LLLLILI;
        if (c19416910xr3 != null) {
            c19416910xr3.LLLI(0);
        }
        this.LLLLIIL = 0;
        ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) C13LP.LJJJLL(this.LLLLII);
        if (readTextEffectBean == null || (readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker) == null || (str = readTextEffectSpeakerExtra.speakreID) == null) {
            str = "";
        }
        this.LLLIL = str;
        C1749280vcc c1749280vcc = this.LLLL;
        if (c1749280vcc != null) {
            C786410Ut5.LJLLLLLL(8, c1749280vcc);
        }
        C0E48 c0e48 = this.LL;
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.pause(false);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            NLETrackSlot nLETrackSlot2 = this.LLLIIII;
            if (nLETrackSlot2 != null) {
                nLETrackSlot = nLETrackSlot2;
            }
            String extra = nLETrackSlot.getExtra("tts_audio_path");
            if (extra != null && extra.length() != 0) {
                try {
                    EditRepeatMusicPlayer editRepeatMusicPlayer = new EditRepeatMusicPlayer(activity, extra);
                    this.LLLLLLLLLL = editRepeatMusicPlayer;
                    editRepeatMusicPlayer.LIZ(0);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
        ET();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void JS(boolean r26) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment.JS(boolean):void");
    }

    @Override // X.InterfaceC19417310xv
    public final boolean LLJLILLLLZIIL(String str) {
        String str2 = this.LLLII;
        if (str2 == null) {
            str2 = null;
        }
        if (rT(str2) != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void PS(EnumC357140DzM enumC357140DzM) {
        C0E48 c0e48;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        String voiceEffectId;
        ReadTextEffectBean next;
        ITTSService iTTSServiceVT;
        if (C0E2B.LIZ() && (c0e48 = this.LL) != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
            if (nLETrackSlotLLLLLLIL.hasExtra("tts_effect_id")) {
                voiceEffectId = nLETrackSlotLLLLLLIL.getExtra("tts_effect_id");
            } else {
                voiceEffectId = C363430EMr.LIZIZ(nLETrackSlotLLLLLLIL.getExtra("text_sticker_data")).getVoiceEffectId();
                if (voiceEffectId == null) {
                    voiceEffectId = "";
                }
            }
            Iterator<ReadTextEffectBean> it2 = this.LLLLII.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().effect.getEffect_id(), voiceEffectId)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            Iterator<ReadTextEffectBean> it3 = this.LLLLII.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Intrinsics.LJFF(next.effect.getEffect_id(), voiceEffectId)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ReadTextEffectBean readTextEffectBean = next;
            if (i != -1) {
                C19416910xr c19416910xr = this.LLLLILI;
                if (c19416910xr != null) {
                    c19416910xr.LLLI(i + 1);
                }
                this.LLLLIIL = i;
                if (readTextEffectBean != null) {
                    if (readTextEffectBean.LIZJ()) {
                        Keva keva = SpeakerCenter.LIZ;
                        if (SpeakerCenter.LJI(readTextEffectBean.mSpeaker.speakreID)) {
                            SpeakerCenter.LJIIIZ(readTextEffectBean.mSpeaker.speakreID);
                        }
                    }
                    CT(readTextEffectBean, (IInternalAVService) ServiceManager.get().getService(IInternalAVService.class));
                    zT(this.LLLLLJLJLL);
                    ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker;
                    this.LLLLLJLJLL = readTextEffectSpeakerExtra.speakreID;
                    this.LLLLLL = readTextEffectSpeakerExtra.streamTTSSpkID;
                    return;
                }
                return;
            }
            C19416910xr c19416910xr2 = this.LLLLILI;
            if (c19416910xr2 != null) {
                c19416910xr2.LLLI(0);
            }
            EditRepeatMusicPlayer editRepeatMusicPlayer = this.LLLLLLLLLL;
            if (editRepeatMusicPlayer != null) {
                editRepeatMusicPlayer.LIZIZ();
            }
            this.LLLLIIL = 0;
            zT(this.LLLLLJLJLL);
            this.LLLLLJLJLL = null;
            this.LLLLLL = null;
            C09TF c09tf = this.LLLILZLLLI;
            if (c09tf != null && c09tf.LIZJ != null && (iTTSServiceVT = vT()) != null) {
                iTTSServiceVT.stopStreamReading();
            }
        }
    }

    public final void lT(boolean z) {
        NLEEditor nLEEditorLJI;
        NLEEditor nLEEditorLJI2;
        if (C0E2B.LIZ()) {
            this.LLLLLIL = z;
        }
        C0E48 c0e48 = this.LL;
        if (c0e48 != null && (nLEEditorLJI2 = c0e48.LLFII().LJI()) != null) {
            nLEEditorLJI2.commit();
        }
        if (C0E2B.LIZ()) {
            C0E48 c0e482 = this.LL;
            if (c0e482 != null) {
                nLEEditorLJI = c0e482.LLFII().LJI();
            } else {
                nLEEditorLJI = null;
            }
            C350410DoV.LIZLLL(nLEEditorLJI, true, hS(), true, true);
        }
        C0EJ3 c0ej3 = this.LLLIZZ;
        if (c0ej3 != null) {
            c0ej3.Rc();
        }
    }

    @Override // X.InterfaceC19417310xv
    public final void p7(int i) {
        String str;
        if (i <= 0) {
            return;
        }
        Context context = getContext();
        boolean z = false;
        if (context != null) {
            InterfaceC1519705xD.LIZ.getClass();
            if (!C0XF1.LIZLLL(context)) {
                C19EG activity = getActivity();
                if (activity != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131837962);
                    C1390380mHk.LIZ(activity, 1074, creativeToastBuilder);
                }
                C19416910xr c19416910xr = this.LLLLILI;
                if (c19416910xr != null) {
                    c19416910xr.LLLFZ(i, 0, false);
                    return;
                }
                return;
            }
        }
        C19416910xr c19416910xr2 = this.LLLLILI;
        if (c19416910xr2 != null) {
            c19416910xr2.LLLII();
        }
        C19416910xr c19416910xr3 = this.LLLLILI;
        if (c19416910xr3 != null) {
            c19416910xr3.LLLFZ(i, 2, false);
        }
        this.LLLLIIL = i;
        if (i >= this.LLLLII.size() + 1) {
            return;
        }
        String str2 = this.LLLII;
        if (str2 == null) {
            str2 = null;
        }
        if (!C2279808wW.LIZIZ(str2)) {
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.messageRes(2131829881);
                C1390380mHk.LIZ(activity2, 1018, creativeToastBuilder2);
            }
            C19416910xr c19416910xr4 = this.LLLLILI;
            if (c19416910xr4 != null) {
                c19416910xr4.LLLFZ(i, 0, false);
                return;
            }
            return;
        }
        int i2 = i - 1;
        ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) ListProtector.get(this.LLLLII, i2);
        if (readTextEffectBean.LIZJ()) {
            Keva keva = SpeakerCenter.LIZ;
            if (SpeakerCenter.LJI(readTextEffectBean.mSpeaker.speakreID)) {
                C19EG c19egRequireActivity = requireActivity();
                CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                creativeToastBuilder3.message(getResources().getString(2131858346));
                creativeToastBuilder3.duration(3000L);
                C1390380mHk.LIZ(c19egRequireActivity, 1017, creativeToastBuilder3);
                SpeakerCenter.LJIIIZ(readTextEffectBean.mSpeaker.speakreID);
            }
        }
        CT(readTextEffectBean, (IInternalAVService) ServiceManager.get().getService(IInternalAVService.class));
        ReadTextEffectBean readTextEffectBean2 = (ReadTextEffectBean) ListProtector.get(this.LLLLII, i2);
        String str3 = this.LLLII;
        if (str3 == null) {
            str3 = null;
        }
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBean2.mSpeaker;
        String str4 = readTextEffectSpeakerExtra.speakreID;
        String str5 = readTextEffectSpeakerExtra.streamTTSSpkID;
        int i3 = this.LLLLLLL;
        String strLIZIZ = C09SZ.LIZIZ(C1664460tPo.LJ(readTextEffectBean2.effect));
        if (Intrinsics.LJFF(strLIZIZ, "TTS")) {
            boolean zLJFF = Intrinsics.LJFF(strLIZIZ, "Vop");
            C09TF c09tf = new C09TF(str4, str3, str5, 120);
            this.LLLILZLLLI = c09tf;
            String str6 = C09TA.LIZ;
            C09TA.LIZJ(c09tf, uT());
            Pair<File, Integer> pairRT = rT(str4);
            C0E48 c0e48 = this.LL;
            if (pairRT != null) {
                z = true;
            }
            C0EU5.LIZIZ(c0e48, "tts_panel", null, z);
            if (pairRT != null) {
                ITTSService iTTSServiceVT = vT();
                if (iTTSServiceVT != null) {
                    iTTSServiceVT.stopStreamReading();
                }
                nT(C09TA.LIZIZ(str5), str4, str5, str3, i, pairRT.getFirst(), pairRT.getSecond().intValue(), true);
            } else {
                C23250099c.LIZLLL(this.LLLLLLIL, new C2375309Sl(CoroutineExceptionHandler.LJJLIL, this, i, i3), null, new C2375409Sm(this, str5, str4, str3, zLJFF, i, i3, new C013C(), null), 2);
            }
        } else {
            Pair<File, Integer> pairRT2 = rT(str4);
            if (pairRT2 != null) {
                nT(0, str4, str5, str3, i, pairRT2.getFirst(), pairRT2.getSecond().intValue(), true);
            } else {
                C23250099c.LIZLLL(this.LLLLLLIL, new C2375209Sk(CoroutineExceptionHandler.LJJLIL, this, i, i3), null, new C2374909Sh(this, i, i3, str4, str5, str3, strLIZIZ, null), 2);
            }
        }
        Effect effect = readTextEffectBean2.effect;
        C1446130njf.LIZ.getClass();
        String strLJFF = C1446130njf.LJFF(effect, "from_tag");
        if (strLJFF == null) {
            strLJFF = "";
        }
        boolean zLJFF2 = Intrinsics.LJFF(C1664460tPo.LIZ(readTextEffectBean2.effect), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        if (readTextEffectBean2 instanceof VoiceCloneReadTextEffectBean) {
            str = "ai_voice";
        } else {
            str = readTextEffectBean2.mSpeaker.speakreID;
        }
        C0FWY.LJII(C0FWY.LIZ, ZS(), str, 0, "1", strLJFF, zLJFF2 ? 1 : 0, readTextEffectBean2.effect.getEffectId(), "default", "", 1040);
        C0FWY.LJ(ZS(), readTextEffectBean2.effect);
    }

    public final Pair<File, Integer> rT(String str) {
        if (Intrinsics.LJFF(str, this.LLLIL)) {
            str = "";
        }
        HashMap<C386310FCr, Pair<File, Integer>> map = this.LLLIILIL;
        String str2 = this.LLLII;
        String str3 = null;
        if (str2 == null) {
            str2 = null;
        }
        Pair<File, Integer> pair = map.get(new C386310FCr(str2, str));
        if (pair != null) {
            return pair;
        }
        if (!Intrinsics.LJFF(str, "")) {
            return null;
        }
        HashMap<C386310FCr, Pair<File, Integer>> map2 = this.LLLIILIL;
        String str4 = this.LLLII;
        if (str4 != null) {
            str3 = str4;
        }
        return map2.get(new C386310FCr(str3, this.LLLIL));
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/gamora/editorpro/capabilities/text/tts/ui/TTSFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yCqDphSc3PUugRuGpmbQG3oPBE6j4JNyZpKp8lml+7nJJAL0yE+dVTC", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        C194341111n c194341111n = this.LLLLJ;
        T t = c194341111n.LIZ;
        if (t != 0) {
            c194341111n.LJFF(t, z);
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(TTSFragment.class);
        }
    }

    @Override // X.InterfaceC19417310xv
    public final void wg(boolean z) {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        Context context = getContext();
        if (!z && context != null) {
            InterfaceC1519705xD.LIZ.getClass();
            if (!C0XF1.LIZLLL(context)) {
                C19EG activity = getActivity();
                if (activity != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131837962);
                    C1390380mHk.LIZ(activity, 1074, creativeToastBuilder);
                    return;
                }
                return;
            }
        }
        NR();
        InterfaceC362470EIz interfaceC362470EIz = this.LLLIIIL;
        boolean z2 = true;
        if (interfaceC362470EIz != null) {
            interfaceC362470EIz.aI2(true, EnumC361800EGk.TTS_PANEL);
        }
        if (!z) {
            C11VK c11vk = C11VK.LIZ;
            VideoPublishEditModel videoPublishEditModelZS = ZS();
            if (videoPublishEditModelZS == null || (creativeModel = videoPublishEditModelZS.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.isFromCreateTemplate) {
                z2 = false;
            }
            c11vk.getClass();
            C11VK.LJ("editor_pro_tts", "click", z2);
        }
    }

    @Override // X.InterfaceC19417310xv
    public final void zI(int i) {
        this.LLLLIIL = i;
    }

    public final void zT(String str) {
        ReadTextEffectBean next;
        VideoPublishEditModel videoPublishEditModelZS;
        if (str != null) {
            Iterator<ReadTextEffectBean> it2 = this.LLLLII.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.mSpeaker.speakreID, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ReadTextEffectBean readTextEffectBean = next;
            if (readTextEffectBean != null && (videoPublishEditModelZS = ZS()) != null) {
                C386350FCv.LIZLLL(videoPublishEditModelZS, readTextEffectBean.effect);
            }
        }
    }

    public static void CT(ReadTextEffectBean readTextEffectBean, IInternalAVService iInternalAVService) {
        iInternalAVService.setLastInfo(new C1179004jM(readTextEffectBean.effect.getEffectId()));
        iInternalAVService.setLastInfo(new C1259004wG(readTextEffectBean.effect.getResourceId()));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[PHI: r1
      0x0040: PHI (r1v28 android.view.View) = (r1v27 android.view.View), (r1v31 android.view.View) binds: [B:11:0x002a, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, com.ss.ugc.android.editor.bottom.panel.EditorContextFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final Pair<File, Integer> sT(String str, String str2) {
        if (Intrinsics.LJFF(str, this.LLLIL)) {
            str = "";
        }
        Pair<File, Integer> pair = this.LLLIILIL.get(new C386310FCr(str2, str));
        if (pair != null) {
            return pair;
        }
        if (Intrinsics.LJFF(str, "")) {
            return this.LLLIILIL.get(new C386310FCr(str2, this.LLLIL));
        }
        return null;
    }

    public final void mT(final int i, final int i2, final String str) {
        SafeHandler safeHandler = this.LLLLIILL;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.post(new Runnable() { // from class: X.09qE
            public final void LIZ() {
                int i3 = i2;
                TTSFragment tTSFragment = this;
                if (i3 != tTSFragment.LLLLLLL) {
                    return;
                }
                C19416910xr c19416910xr = tTSFragment.LLLLILI;
                if (c19416910xr != null) {
                    c19416910xr.LLLFZ(i, 0, false);
                }
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                if (C790050Uyx.LIZ(C0CHQ.LIZ)) {
                    String str2 = str;
                    if (str2 == null || TextUtils.isEmpty(str2)) {
                        creativeToastBuilder.messageRes(2131850137);
                    } else {
                        creativeToastBuilder.message(str);
                    }
                } else {
                    creativeToastBuilder.messageRes(2131829876);
                }
                C19EG activity = this.getActivity();
                if (activity != null) {
                    C1390380mHk.LIZ(activity, 1020, creativeToastBuilder);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TTSFragment@b180.downloadFailed$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TTSFragment@b180.downloadFailed$1");
            }
        });
    }

    public final void kT(String str, String str2, File file, int i) {
        this.LLLIILIL.put(new C386310FCr(str, str2), new Pair<>(file, Integer.valueOf(i)));
    }

    public final void xT(ArrayList<NLETrackSlot> arrayList, C386290FCp c386290FCp, NLETrackSlot nLETrackSlot, int i, ArrayList<C386290FCp> arrayList2) {
        arrayList2.add(c386290FCp);
        C0CNO.LIZLLL(0L, new AwS145S0101000_5(this, (int) ((((i - arrayList.size()) + 1) / i) * 100), 8));
        if (arrayList.contains(nLETrackSlot)) {
            arrayList.remove(nLETrackSlot);
        }
    }

    public final void pT(ArrayList<NLETrackSlot> arrayList, int i, ArrayList<C386290FCp> arrayList2, CoroutineExceptionHandler coroutineExceptionHandler, String str, String str2, String str3) {
        ITTSService iTTSServiceVT;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(arrayList, 0);
        if (!nLETrackSlot.hasExtra("text")) {
            return;
        }
        String extra = nLETrackSlot.getExtra("text");
        String str4 = this.LLLII;
        if (str4 == null) {
            str4 = null;
        }
        if (!C2279808wW.LIZIZ(str4)) {
            this.LLLLLILLIL = true;
        }
        if (this.LLLLLJIL) {
            return;
        }
        C09TF c09tf = this.LLLILZLLLI;
        if (c09tf != null && c09tf.LIZJ != null && (iTTSServiceVT = vT()) != null) {
            iTTSServiceVT.stopStreamReading();
        }
        String str5 = LLLLLLLZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTSApplyToAllCacheAB isCacheOn:");
        sbLIZ.append(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_hit_cache_apply_all_in_pro", true, false));
        C201955140j.LIZIZ(str5, C2188811AlT.LIZIZ(sbLIZ));
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_hit_cache_apply_all_in_pro", true, false)) {
            Pair<File, Integer> pairST = sT(str, extra);
            if (C09TA.LIZIZ(str2) == 1) {
                pairST = sT(str2, extra);
            }
            if (pairST != null) {
                xT(arrayList, new C386290FCp(nLETrackSlot, extra, str, pairST.getFirst().getAbsolutePath(), pairST.getSecond().intValue()), nLETrackSlot, i, arrayList2);
                if (arrayList.size() > 0) {
                    pT(arrayList, i, arrayList2, coroutineExceptionHandler, str, str2, str3);
                    return;
                }
                this.LLLILZLLLI = new C09TF(str, extra, str2, 120);
                AT();
                SpeakerCenter.LJIIIIZZ(str, str2);
                C0CNO.LIZLLL(0L, new AwS406S0200000_5(this, (TTSFragment) arrayList2, (ArrayList<C386290FCp>) 65));
                return;
            }
        }
        C23250099c.LIZLLL(this.LLLLLLIL, coroutineExceptionHandler, null, new C2375709Sp(this, str2, str, extra, str3, arrayList, nLETrackSlot, i, arrayList2, coroutineExceptionHandler, null), 2);
    }

    public final void nT(int i, String str, String str2, String str3, int i2, File file, int i3, boolean z) {
        ReadTextEffectBean readTextEffectBean;
        ITTSService iTTSServiceVT;
        C0E55 player;
        boolean z2;
        Effect effect;
        VideoPublishEditModel videoPublishEditModelZS;
        VideoPublishEditModel videoPublishEditModelZS2;
        if (this.LLLLIIL == 0) {
            ITTSService iTTSServiceVT2 = vT();
            if (iTTSServiceVT2 != null) {
                iTTSServiceVT2.stopStreamReading();
            }
            C19416910xr c19416910xr = this.LLLLILI;
            if (c19416910xr != null) {
                c19416910xr.LLLI(this.LLLLIIL);
                return;
            }
            return;
        }
        C19416910xr c19416910xr2 = this.LLLLILI;
        if (c19416910xr2 != null) {
            c19416910xr2.LLLI(i2);
        }
        C19416910xr c19416910xr3 = this.LLLLILI;
        if (c19416910xr3 != null) {
            c19416910xr3.LLLFZ(i2, 1, true);
        }
        zT(this.LLLLLJLJLL);
        this.LLLLLJLJLL = str;
        this.LLLLLL = str2;
        C09TF c09tfLIZ = uT().LIZ(str, str3);
        int i4 = i2 - 1;
        if (this.LLLLII.size() > i4 && i4 >= 0) {
            readTextEffectBean = (ReadTextEffectBean) ListProtector.get(this.LLLLII, i4);
        } else {
            readTextEffectBean = null;
        }
        if ((readTextEffectBean instanceof VoiceCloneReadTextEffectBean) && (videoPublishEditModelZS2 = ZS()) != null) {
            C0EIM c0eim = C0EIM.LIZ;
            C0E48 c0e48 = this.LL;
            EnumC361800EGk enumC361800EGk = EnumC361800EGk.TTS_PANEL;
            c0eim.getClass();
            C20684815ws.LJIILLIIL("use_ai_voice", C0EIM.LIZ(c0e48, videoPublishEditModelZS2, enumC361800EGk).LIZ);
        }
        if (i == 0 && c09tfLIZ != null && Intrinsics.LJFF(c09tfLIZ.LJ, Boolean.FALSE)) {
            String str4 = LLLLLLLZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hit non-streaming switching streaming scene speakId:");
            sbLIZ.append(str);
            C201955140j.LIZIZ(str4, C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C0EVZ c0evz = C0EVZ.LIZ;
            C0E48 c0e482 = this.LL;
            NLETrackSlot nLETrackSlot = this.LLLIIII;
            if (nLETrackSlot == null) {
                nLETrackSlot = null;
            }
            C0EVZ.LIZJ(nLETrackSlot, c0e482);
            C0E48 c0e483 = this.LL;
            NLETrackSlot nLETrackSlot2 = this.LLLIIII;
            if (nLETrackSlot2 == null) {
                nLETrackSlot2 = null;
            }
            String str5 = this.LLLII;
            if (str5 == null) {
                str5 = null;
            }
            NLETrackSlot nLETrackSlotLIZLLL = C0EVZ.LIZLLL(c0evz, c0e483, nLETrackSlot2, str5, str, file.getAbsolutePath(), i3, readTextEffectBean, null, 128);
            InterfaceC362470EIz interfaceC362470EIz = this.LLLIIIL;
            if (interfaceC362470EIz != null) {
                if (nLETrackSlotLIZLLL != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                interfaceC362470EIz.BQ(z2);
            }
            C19EG activity = getActivity();
            if (activity != null) {
                C0E48 c0e484 = this.LL;
                if (c0e484 != null && (player = c0e484.getPlayer()) != null) {
                    player.pause(false);
                }
                try {
                    EditRepeatMusicPlayer editRepeatMusicPlayer = this.LLLLLLLLLL;
                    if (editRepeatMusicPlayer != null) {
                        editRepeatMusicPlayer.LIZIZ();
                    }
                    EditRepeatMusicPlayer editRepeatMusicPlayer2 = new EditRepeatMusicPlayer(activity, file.getAbsolutePath());
                    this.LLLLLLLLLL = editRepeatMusicPlayer2;
                    if (this.LLLLLLLLL && (z || i != 1)) {
                        editRepeatMusicPlayer2.LIZ(0);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                if (i == 0 && (iTTSServiceVT = vT()) != null) {
                    iTTSServiceVT.stopStreamReading();
                }
                lT(false);
            }
        }
        if (readTextEffectBean != null && (effect = readTextEffectBean.effect) != null && (videoPublishEditModelZS = ZS()) != null) {
            C386350FCv.LIZ(this, videoPublishEditModelZS, effect);
        }
        C09TF c09tf = this.LLLILZLLLI;
        if (c09tf != null && Intrinsics.LJFF(c09tf.LJFF, Boolean.TRUE)) {
            C345410DgR.LIZ((C345410DgR) this.LLLJ.getValue());
            JS(true);
        }
        C09TF c09tf2 = this.LLLILZLLLI;
        if (c09tf2 != null) {
            c09tf2.LJI = C09TL.SUC;
        }
        C09TL c09tl = C09TL.SUC;
        C09TF c09tfLIZ2 = uT().LIZ(str, str3);
        if (c09tfLIZ2 != null) {
            c09tfLIZ2.LJI = c09tl;
        }
        uT().LIZIZ(str, str3);
    }
}
