package com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui;

import X.AbstractC2217051Bpv;
import X.C01GW;
import X.C051R;
import X.C0E1V;
import X.C0E1X;
import X.C0E2B;
import X.C0E47;
import X.C0E48;
import X.C0E55;
import X.C0E5S;
import X.C0EB4;
import X.C0EGK;
import X.C0EGY;
import X.C0EJ1;
import X.C0EJ3;
import X.C0ELW;
import X.C0ES3;
import X.C0EVI;
import X.C0F51;
import X.C0F52;
import X.C0F54;
import X.C0F57;
import X.C0F58;
import X.C0F5B;
import X.C0F5D;
import X.C0F5E;
import X.C0F5I;
import X.C0F5J;
import X.C0F5K;
import X.C0F5L;
import X.C0F5P;
import X.C0F5R;
import X.C0F5S;
import X.C0F5X;
import X.C0F6L;
import X.C0F76;
import X.C0F77;
import X.C0F90;
import X.C0FCA;
import X.C0FHM;
import X.C0HZQ;
import X.C0LAB;
import X.C0TVI;
import X.C123100dR;
import X.C1263904x3;
import X.C1397510mTF;
import X.C13LP;
import X.C1402610mbT;
import X.C1416310mxZ;
import X.C14K9;
import X.C1697810uHb;
import X.C19510311Uv;
import X.C19719612Di;
import X.C19737512Kf;
import X.C19EG;
import X.C1DRG;
import X.C201955140j;
import X.C20684815ws;
import X.C21673919s1;
import X.C2188811AlT;
import X.C294870Bh7;
import X.C305200Bxm;
import X.C349550Dn7;
import X.C349560Dn8;
import X.C350410DoV;
import X.C350870DpF;
import X.C351110Dpd;
import X.C352310DrZ;
import X.C358740E4q;
import X.C361460EFc;
import X.C361680EFy;
import X.C362450EIx;
import X.C362580EJk;
import X.C363710ENt;
import X.C363730ENv;
import X.C363740ENw;
import X.C364210EPr;
import X.C364440EQo;
import X.C371890Ei3;
import X.C384340F5c;
import X.C384370F5f;
import X.C384410F5j;
import X.C384420F5k;
import X.C384570F5z;
import X.C385670FAf;
import X.C387590FHp;
import X.C425240Glu;
import X.C452501pT;
import X.C563650M8t;
import X.C786410Ut5;
import X.C790060Uyy;
import X.EnumC362260EIe;
import X.EnumC373450EkZ;
import X.EnumC452301pR;
import X.InterfaceC359850E8x;
import X.InterfaceC360800ECo;
import X.InterfaceC361710EGb;
import X.InterfaceC362230EIb;
import X.InterfaceC364230EPt;
import X.InterfaceC376450EpP;
import X.InterfaceC377490Er5;
import X.InterfaceC384330F5b;
import X.InterfaceC384400F5i;
import X.InterfaceC384430F5l;
import Y.ACListenerS140S0100000_5;
import android.animation.ObjectAnimator;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.model.InlineCaptionViewModel;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public class InlineCaptionFragment extends TTResourcePanelFragment<InlineCaptionViewModel> implements C0EVI, C0F77, C0F6L {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KyQ8KC06JCw4ICogHELIOSZjEpMTt9KyQ8PSY8JjZiICE/ISspZzo6ZgwiJSY9LQYtOTs6JysKOy40JSAiPQ==";
    public final C364440EQo LLLFFI;
    public final String LLLFZ;
    public final boolean LLLI;
    public NLETrackSlot LLLII;
    public final C0EJ3 LLLIIII;
    public final Effect LLLIIIIL;
    public final Effect LLLIIIL;
    public boolean LLLIIL;
    public ConstraintLayout LLLIILIL;
    public FrameLayout LLLIL;
    public ConstraintLayout LLLILZ;
    public ConstraintLayout LLLILZJ;
    public FrameLayout LLLILZLLLI;
    public ConstraintLayout LLLIZZ;
    public final C0F5P LLLJ;
    public final C01GW LLLJIL;
    public C363710ENt LLLJL;
    public final TextPaint LLLL;
    public String LLLLII;
    public final ArrayList<NLETrackSlot> LLLLIIIILLL;
    public SafeHandler LLLLIIL;
    public SafeHandler LLLLIILL;
    public C362580EJk LLLLIILLL;
    public boolean LLLLIL;
    public boolean LLLLILI;
    public C1397510mTF LLLLJ;
    public C0FCA LLLLJI;
    public C387590FHp LLLLL;
    public Effect LLLLLIL;
    public HashMap<String, Effect> LLLLLILLIL;
    public Effect LLLLLJIL;
    public InputMethodManager LLLLLJLJLL;
    public Integer LLLLLL;
    public final List<String> LLLLLLIL;
    public boolean LLLLLLJ;
    public EnumC362260EIe LLLLLLL;
    public String LLLLLLLLL;
    public final boolean LLLLLLLLLL;
    public final C0F76 LLLLLLLZIL;
    public View LLLLLLZ;
    public C384370F5f LLLLLLZZ;
    public boolean LLLLLZ;
    public final C01GW LLLLLZIL;
    public final C01GW LLLLLZL;
    public C0F5E LLLLZ;
    public C384420F5k LLLLZI;
    public final C01GW LLLLZIL;
    public final C01GW LLLLZLL;
    public final C01GW LLLLZLLIL;
    public final C01GW LLLLZLLLI;
    public final C01GW LLLZ;
    public final C01GW LLLZI;
    public final C01GW LLLZIIL;
    public final C01GW LLLZIL;
    public final C01GW LLLZL;
    public final C01GW LLLZLL;
    public final C01GW LLLZLZ;
    public final C01GW LLLZZ;
    public final C0F5R LLLZZIL;
    public final C01GW LLZ;
    public final C0F5S LLZIL;
    public final C362450EIx LLZILL;
    public final C0F5I LLZL;
    public C0F5K LLZLI;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public InlineCaptionFragment() {
        boolean z = false;
        this(null, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 255);
    }

    public final void nT() {
        C364440EQo c364440EQoLLLZIL;
        this.LLLLIL = true;
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            c0e48.S7().LIZIZ(Unit.LIZ, "clear_caption", false);
        }
        lT(true);
        C0EJ3 c0ej3 = this.LLLIIII;
        if (c0ej3 == null || (c364440EQoLLLZIL = c0ej3.LLLZIL()) == null) {
            return;
        }
        c364440EQoLLLZIL.LIZ();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final String qS() {
        return "inline_caption";
    }

    public final SafeHandler AT() {
        SafeHandler safeHandler = this.LLLLIIL;
        if (safeHandler != null) {
            return safeHandler;
        }
        return null;
    }

    public final C0F5J CT() {
        return (C0F5J) this.LLLZLZ.getValue();
    }

    public final SafeHandler DT() {
        SafeHandler safeHandler = this.LLLLIILL;
        if (safeHandler != null) {
            return safeHandler;
        }
        return null;
    }

    public final C0F52 ET() {
        return (C0F52) this.LLLZLL.getValue();
    }

    public final void FT() {
        C0E55 player;
        C384410F5j c384410F5j = (C384410F5j) this.LLLZIL.getValue();
        C0F5P c0f5p = this.LLLJ;
        String str = c0f5p.LIZ;
        long j = c0f5p.LJIL;
        C362450EIx c362450EIx = this.LLZILL;
        if (c384410F5j.LIZ.LIZIZ == null || !(!C349550Dn7.LIZJ(C350870DpF.LJI(r0)).isEmpty())) {
            C0E48 c0e48 = c384410F5j.LIZ.LIZIZ;
            if (c0e48 != null) {
                C350870DpF.LJI(c0e48);
                C361680EFy.LIZ(C361680EFy.LJIJI("caption_edit_all_duration") + (System.currentTimeMillis() - j), "caption_edit_all_duration");
            }
            new C384340F5c().LIZ.storeString("last_selected_language", str);
            C0E48 c0e482 = c384410F5j.LIZ.LIZIZ;
            if (c0e482 != null && (player = c0e482.getPlayer()) != null) {
                player.LJIJJLI();
                player.pause(false);
            }
            C0E48 c0e483 = c384410F5j.LIZ.LIZIZ;
            if (c0e483 != null) {
                c0e483.S7().LIZIZ(new C1263904x3(true, false), "quit_edit_caption", false);
            }
            c362450EIx.LIZ();
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public void HS() {
        C0F5P c0f5p = this.LLLJ;
        if (c0f5p.LJIILLIIL || c0f5p.LJIIZILJ) {
            return;
        }
        LT();
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            c0e48.S7().LIZIZ(new C1263904x3(true, vT().LJ), "quit_edit_caption", false);
        }
        C0E48 c0e482 = this.LL;
        long jLIZLLL = c0e482 != null ? C352310DrZ.LIZLLL(c0e482.getPlayer().Jh()) : 0L;
        super.HS();
        CT().LIZIZ(jLIZLLL);
    }

    public final void PT() {
        C0EJ3 c0ej3;
        InterfaceC384430F5l interfaceC384430F5l;
        NLETrackSlot next;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot next2;
        final C0F54 c0f54 = (C0F54) this.LLLZZ.getValue();
        C0F5K c0f5k = c0f54.LIZ;
        VideoPublishEditModel videoPublishEditModel = c0f5k.LIZJ;
        if (videoPublishEditModel != null) {
            C0LAB c0labLJJ = u4.LJJ(1, videoPublishEditModel, c0f5k.LIZLLL.vQ2(c0f5k.LJI.LIZ));
            c0labLJJ.LJ("enter_way", "edit_page_subtitle_sidebar");
            C20684815ws.LJIILLIIL("click_change_text_style", c0labLJJ.LIZ);
        }
        final VideoPublishEditModel videoPublishEditModel2 = c0f54.LIZ.LIZJ;
        NLETrackSlot nLETrackSlot = null;
        if (C305200Bxm.LIZIZ(videoPublishEditModel2) || c0f54.LIZ.LIZIZ()) {
            if ((videoPublishEditModel2 == null || !C305200Bxm.LIZ(videoPublishEditModel2)) && (c0ej3 = c0f54.LIZ.LJ) != null) {
                c0ej3.Rc();
            }
            interfaceC384430F5l = new InterfaceC384430F5l() { // from class: X.0F55
                @Override // X.InterfaceC384430F5l
                public final void LIZ(NLETrackSlot nLETrackSlot2, String str) {
                    C19A3 c19a3;
                    C1DRG c1drg;
                    if (nLETrackSlot2 == null) {
                        return;
                    }
                    VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel2;
                    boolean z = true;
                    if (videoPublishEditModel3 != null && C305200Bxm.LIZ(videoPublishEditModel3)) {
                        C0E48 c0e48 = c0f54.LIZ.LIZIZ;
                        if (c0e48 != null) {
                            c0e48.S7().LIZIZ(new C358740E4q(nLETrackSlot2, 0, null, false, 0, 174), "select_slot_event", false);
                        }
                        Scene sceneLIZ = C0EBE.LIZ(c0f54.LIZ.LIZ.getView());
                        if (!(sceneLIZ instanceof C19A3) || (c19a3 = (C19A3) sceneLIZ) == null || (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3)).LLJJI) == null || C363470EMv.LJFF(c19a3)) {
                            return;
                        }
                        c0f54.LIZ.LIZ.LLLZZIL.LIZIZ(C0F58.CAPTION_TEMPLATE);
                        C0E48 c0e482 = c0f54.LIZ.LIZIZ;
                        if (c0e482 == null) {
                            return;
                        }
                        C375820EoO.LIZ(c19a3, c0e482, C364890ESh.class, new C362760EKc(c19a3, c0e482, c1drg, new C361860EGq(false, ((C0ES4) c0f54.LIZ.LIZ.LLLLLZIL.getValue()).LIZ() - C0ES3.LIZ), new AwS406S0200000_5(videoPublishEditModel2, c0f54, 0), new AwS549S0100000_5(c0f54, 28)), 16);
                        VideoPublishEditModel videoPublishEditModel4 = videoPublishEditModel2;
                        if (videoPublishEditModel4 != null) {
                            C0LAB c0labLJJI = u4.LJJI(videoPublishEditModel4, 1, 4);
                            c0labLJJI.LJ("enter_method", "click_caption_bulk_editing_panel");
                            C20684815ws.LJIILLIIL("click_caption_template_entrance", c0labLJJI.LIZ);
                        }
                        VideoPublishEditModel videoPublishEditModel5 = videoPublishEditModel2;
                        if (videoPublishEditModel5 != null) {
                            C0F5K c0f5k2 = c0f54.LIZ;
                            C1402610mbT.LJJIIZI(videoPublishEditModel5, "click", "style", c0f5k2.LIZLLL.vQ2(c0f5k2.LJI.LIZ));
                            return;
                        }
                        return;
                    }
                    VideoPublishEditModel videoPublishEditModel6 = videoPublishEditModel2;
                    Boolean bool = Boolean.TRUE;
                    NLETrackSlot nLETrackSlot3 = c0f54.LIZ.LIZ.LLLII;
                    if (nLETrackSlot3 == null || !C351220Dpo.LLLLIILLL(nLETrackSlot3)) {
                        z = false;
                    }
                    u4.LJJLIIIIJ(videoPublishEditModel6, "click_caption_bulk_editing_panel", 1, null, null, null, null, null, bool, Boolean.valueOf(z), 248);
                    C0EJ3 c0ej32 = c0f54.LIZ.LJ;
                    if (c0ej32 != null) {
                        c0ej32.Y61(nLETrackSlot2);
                    }
                }
            };
        } else {
            interfaceC384430F5l = null;
        }
        C0F5X c0f5xInvoke = c0f54.LIZIZ.invoke();
        Math.max(0, c0f5xInvoke.LIZ);
        C0F5K c0f5k2 = c0f54.LIZ;
        C0E48 c0e48 = c0f5k2.LIZIZ;
        if (c0e48 != null) {
            InlineCaptionViewModel inlineCaptionViewModel = c0f5k2.LIZLLL;
            Long l = c0f5xInvoke.LIZIZ;
            long startTime = 0;
            long jLongValue = (l != null ? l.longValue() : 0L) + 1;
            inlineCaptionViewModel.getClass();
            C201955140j.LIZ("InlineCaptionFragment -> click mIvFont, showEditCaptionFont");
            C0E55 player = c0e48.getPlayer();
            if (player != null) {
                player.pause(false);
            }
            if (interfaceC384430F5l == null) {
                interfaceC384430F5l = inlineCaptionViewModel.LLILZIL;
            }
            String uuid = "";
            if (jLongValue >= 0) {
                Iterator<NLETrackSlot> it2 = C349550Dn7.LIZJ(C350870DpF.LJI(c0e48)).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    NLETrackSlot nLETrackSlot2 = next2;
                    long startTime2 = nLETrackSlot2.getStartTime();
                    long j = ((long) LSPassThroughRecordSizeConfig.DEFAULT) * jLongValue;
                    if (startTime2 <= j && nLETrackSlot2.getEndTime() > j) {
                        break;
                    }
                }
                NLETrackSlot nLETrackSlot3 = next2;
                if (nLETrackSlot3 != null) {
                    uuid = nLETrackSlot3.getUUID();
                    nLETrackSlot = nLETrackSlot3;
                }
                C0E55 player2 = c0e48.getPlayer();
                if (player2 != null) {
                    player2.LJIJI(jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT), C351110Dpd.LIZ);
                }
                interfaceC384430F5l.LIZ(nLETrackSlot, uuid);
                return;
            }
            C0E55 player3 = c0e48.getPlayer();
            long jJh = player3 != null ? player3.Jh() : 0L;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("InlineCaptionFragment -> current time = ");
            sbLIZ.append(jJh);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            NLETrack nLETrackLIZ = C349560Dn8.LIZ(C350870DpF.LJI(c0e48));
            if (nLETrackLIZ != null && (slots = nLETrackLIZ.getSlots()) != null) {
                Iterator<NLETrackSlot> it3 = slots.iterator();
                long endTime = Long.MAX_VALUE;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    next = it3.next();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("InlineCaptionFragment -> startTime = ");
                    sbLIZ2.append(next.getStartTime());
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    if (next.getStartTime() <= jJh && next.getEndTime() >= jJh) {
                        startTime = next.getStartTime();
                        uuid = next.getUUID();
                        break;
                    } else if (next.getStartTime() > jJh) {
                        if (next.getStartTime() - jJh < endTime) {
                            startTime = next.getStartTime();
                            uuid = next.getUUID();
                            nLETrackSlot = next;
                        }
                    } else if (jJh - next.getEndTime() < endTime) {
                        endTime = jJh - next.getEndTime();
                        startTime = next.getStartTime();
                        uuid = next.getUUID();
                        nLETrackSlot = next;
                    }
                }
            } else {
                next = nLETrackSlot;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("InlineCaptionFragment -> showEditCaptionFont -> seekPosition = ");
            sbLIZ3.append(startTime);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            C0E55 player4 = c0e48.getPlayer();
            if (player4 != null) {
                player4.LJIJI(startTime, C351110Dpd.LIZ);
            }
            interfaceC384430F5l.LIZ(next, uuid);
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final ViewModel QS() {
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        return C364210EPr.LIZIZ(InlineCaptionViewModel.class);
    }

    public final void ST() {
        InterfaceC362230EIb interfaceC362230EIb;
        C384420F5k c384420F5k = this.LLLLZI;
        if (c384420F5k == null) {
            c384420F5k = null;
        }
        if (c384420F5k.LIZ.LIZIZ() && (interfaceC362230EIb = c384420F5k.LIZ.LJIIIIZZ) != null && interfaceC362230EIb.pg0() == EnumC362260EIe.MIN) {
            interfaceC362230EIb.td1(EnumC362260EIe.MAX);
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final String hS() {
        return C051R.LIZIZ(new C0E1X(C0E1V.EDIT_CAPTION.getNameId(), null, null, null, null, 30));
    }

    public final void oT() {
        C1397510mTF c1397510mTF = this.LLLLJ;
        if (c1397510mTF == null || !c1397510mTF.LJIIIZ()) {
            return;
        }
        C1397510mTF c1397510mTF2 = this.LLLLJ;
        if (c1397510mTF2 != null) {
            c1397510mTF2.LIZIZ(null);
        }
        this.LLLLJ = null;
    }

    public final ConstraintLayout qT() {
        View viewFindViewById = this.LLLILZJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dcf) : null;
            this.LLLILZJ = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final ConstraintLayout rT() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dde) : null;
            this.LLLILZ = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C0F5E uT() {
        C0F5E c0f5e = this.LLLLZ;
        if (c0f5e != null) {
            return c0f5e;
        }
        return null;
    }

    public final C0F5B vT() {
        return (C0F5B) this.LLLLZLLIL.getValue();
    }

    public final C0F5K xT() {
        C0F5K c0f5k = this.LLZLI;
        if (c0f5k != null) {
            return c0f5k;
        }
        "panelContext accessed before attachPanelContext(...); CaptionPanelInitPresenter.bindPanelContextFromView must run first".toString();
        throw new IllegalArgumentException("panelContext accessed before attachPanelContext(...); CaptionPanelInitPresenter.bindPanelContextFromView must run first");
    }

    public final C0F5L zT() {
        return (C0F5L) this.LLLJIL.getValue();
    }

    @Override // X.C0EVI
    public final void AD() {
        FrameLayout frameLayout;
        LinearLayout linearLayout;
        C0F5B c0f5bVT = vT();
        c0f5bVT.getClass();
        C201955140j.LIZJ(C563650M8t.LIZIZ, "InlineCaptionFragment -> showRetryView");
        c0f5bVT.LIZ.LIZ.oT();
        c0f5bVT.LIZ();
        C786410Ut5.LJZL(8, c0f5bVT.LIZIZ.LJFF);
        C0F5L c0f5l = c0f5bVT.LIZIZ;
        View view = c0f5l.LJJJIL;
        if (view == null || (frameLayout = c0f5l.LJJIJL) == null || (linearLayout = c0f5l.LJJIJLIJ) == null) {
            return;
        }
        if (c0f5bVT.LIZJ == null) {
            c0f5bVT.LIZJ = new C19737512Kf(linearLayout, view, frameLayout);
        }
        TextView textView = (TextView) view.findViewById(R.id.wm9);
        if (C0E2B.LIZ()) {
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
            }
        } else if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
            C786410Ut5.T7(textView, new ACListenerS140S0100000_5(c0f5bVT, 115));
        }
        C786410Ut5.I7(new ACListenerS140S0100000_5(c0f5bVT, 116), view.findViewById(R.id.cuf));
        C19737512Kf c19737512Kf = c0f5bVT.LIZJ;
        if (c19737512Kf != null) {
            c19737512Kf.LIZJ(new C19510311Uv());
        }
        C0E48 c0e48 = c0f5bVT.LIZ.LIZIZ;
        if (c0e48 != null) {
            c0e48.S7().LIZIZ(new ArrayList(), "add_recognized_caption", false);
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void GS() {
        if (xT().LIZIZ()) {
            return;
        }
        kT();
    }

    public void LT() {
        C0F5J c0f5jCT = CT();
        if (c0f5jCT.LIZ.LIZIZ()) {
            C0F5K c0f5k = c0f5jCT.LIZ;
            EnumC362260EIe enumC362260EIe = c0f5k.LIZ.LLLLLLL;
            InterfaceC362230EIb interfaceC362230EIb = c0f5k.LJIIIIZZ;
            if (enumC362260EIe != (interfaceC362230EIb != null ? interfaceC362230EIb.pg0() : null) || c0f5jCT.LIZ.LJI.LJIIL) {
                c0f5jCT.LIZ.LIZ.NT();
            }
            c0f5jCT.LIZIZ.LIZ();
            c0f5jCT.LIZ();
            View view = c0f5jCT.LIZ.LIZ.LLLLLLZ;
            if (view != null) {
                C14K9.LJIJJ(view, new C0TVI() { // from class: X.0F5t
                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                        return c20246014Ju;
                    }
                });
            }
            c0f5jCT.LIZJ.LIZJ();
            InterfaceC360800ECo interfaceC360800ECo = c0f5jCT.LIZ.LJII;
            if (interfaceC360800ECo != null) {
                C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.FULL_SCREEN}, null, Boolean.TRUE, null, null, 26);
            }
            Integer num = c0f5jCT.LIZ.LIZ.LLLLLL;
            if (num != null) {
                c0f5jCT.LIZ.LIZ.requireActivity().getWindow().setSoftInputMode(num.intValue());
            }
        }
        AbstractC2217051Bpv abstractC2217051Bpv = c0f5jCT.LIZ.LIZ.sT().LLIZ;
        if (abstractC2217051Bpv != null) {
            abstractC2217051Bpv.LIZ();
        }
        c0f5jCT.LIZ.LIZ.AT().removeCallbacksAndMessages(null);
        c0f5jCT.LIZJ.LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final void NR() {
        VideoPublishEditModel videoPublishEditModelZS = ZS();
        if (videoPublishEditModelZS != null) {
            C1402610mbT.LJJIIZI(videoPublishEditModelZS, "close", null, ((InlineCaptionViewModel) wS()).vQ2(this.LLLJ.LIZ));
        }
        super.NR();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void NS() {
        if (xT().LIZIZ()) {
            return;
        }
        super.NS();
    }

    public void NT() {
        InterfaceC362230EIb interfaceC362230EIb;
        C0F5K c0f5k = CT().LIZ;
        EnumC362260EIe enumC362260EIe = c0f5k.LIZ.LLLLLLL;
        if (enumC362260EIe == null || (interfaceC362230EIb = c0f5k.LJIIIIZZ) == null) {
            return;
        }
        interfaceC362230EIb.td1(enumC362260EIe);
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int RR() {
        return C1416310mxZ.LJIILIIL(ZS()) ? R.layout.c01 : R.layout.bzz;
    }

    public final void RT() {
        C0E48 c0e48;
        if (xT().LIZIZ()) {
            C0F5D c0f5d = (C0F5D) this.LLLZI.getValue();
            c0f5d.LIZIZ(false);
            ConstraintLayout constraintLayoutQT = c0f5d.LIZ.LIZ.qT();
            if (constraintLayoutQT != null) {
                C786410Ut5.LL(0, constraintLayoutQT);
            }
            ConstraintLayout constraintLayoutRT = c0f5d.LIZ.LIZ.rT();
            if (constraintLayoutRT != null) {
                C786410Ut5.LL(8, constraintLayoutRT);
            }
            c0f5d.LIZ.LIZ.LLLZZIL.LIZ(C0F58.MULTI_SELECT_PAGE);
        } else {
            TuxIconView tuxIconView = zT().LJIIJJI;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            TuxIconView tuxIconView2 = zT().LJIIL;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            }
            TuxIconView tuxIconView3 = zT().LJIILIIL;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
            }
            C786410Ut5.LJZL(0, zT().LJFF);
        }
        LinearLayout linearLayout = vT().LIZIZ.LJJIJLIJ;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        YT(true, true);
        VideoPublishEditModel videoPublishEditModelZS = ZS();
        if (videoPublishEditModelZS == null || (c0e48 = this.LL) == null) {
            return;
        }
        C361680EFy.LJJIIJZLJL(videoPublishEditModelZS, c0e48, "bulk_editing_panel");
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final boolean SR() {
        return (C1416310mxZ.LJIILIIL(ZS()) && C1416310mxZ.LJIIZILJ(ZS())) ? false : true;
    }

    public final void VT() {
        C0F5J c0f5jCT = CT();
        C0F5K c0f5k = c0f5jCT.LIZ;
        String strLIZLLL = c0f5k.LJI.LIZIZ;
        if (strLIZLLL == null) {
            strLIZLLL = C0EJ1.LIZLLL(c0f5jCT.LIZ.LIZJ, c0f5k.LIZJ());
            if (strLIZLLL == null) {
                strLIZLLL = c0f5jCT.LIZ.LJI.LIZ;
            }
        }
        c0f5jCT.LIZJ.LIZ(C0EJ1.LJI(strLIZLLL));
    }

    @Override // X.C0EVI
    public final void cH() {
        vT().LIZJ();
        pT(null);
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            c0e48.S7().LIZIZ(new ArrayList(), "add_recognized_caption", false);
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
        this.LLLILZJ = null;
        this.LLLILZLLLI = null;
        this.LLLIZZ = null;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final boolean iS() {
        return SR();
    }

    public final void jT() {
        NLEModel nLEModelMS;
        if (C1416310mxZ.LJIILL(ZS())) {
            NLEModel nLEModelMS2 = mS();
            if (nLEModelMS2 != null) {
                nLEModelMS2.setExtra("ep_caption_language", this.LLLJ.LIZ);
            }
        } else {
            C0E48 c0e48 = this.LL;
            NLETrack nLETrackLIZ = C349560Dn8.LIZ(c0e48 != null ? C350870DpF.LJI(c0e48) : null);
            if (nLETrackLIZ != null) {
                nLETrackLIZ.setExtra("ep_caption_language", this.LLLJ.LIZ);
            }
        }
        if (!C294870Bh7.LIZ(ZS()) || (nLEModelMS = mS()) == null) {
            return;
        }
        nLEModelMS.setExtra("recognized_caption_language", this.LLLJ.LIZIZ);
    }

    public final void kT() {
        LinearLayout linearLayout = vT().LIZIZ.LJJIJLIJ;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            vT().LIZIZ(null);
            return;
        }
        if (this.LLLJ.LJIILJJIL) {
            ((C0F5D) this.LLLZI.getValue()).LIZJ();
            return;
        }
        if (!vT().LJ) {
            JS(false);
            return;
        }
        C19737512Kf c19737512Kf = vT().LIZLLL;
        if (c19737512Kf != null) {
            c19737512Kf.LJFF(new C19510311Uv());
        }
        HS();
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            c0e48.S7().LIZIZ(new C358740E4q(null, 0, null, false, 0, 254), "select_slot_event", false);
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C201955140j.LIZJ(C563650M8t.LIZIZ, "InlineCaptionFragment -> onDestroy");
        if (C0E47.LIZ()) {
            LT();
            InterfaceC384330F5b interfaceC384330F5b = xT().LJIIIZ;
            if (interfaceC384330F5b != null) {
                interfaceC384330F5b.hQ0(((C0F57) this.LLLZ.getValue()).LIZJ);
            }
            C790060Uyy.LIZLLL(this.LLLLLLZZ);
            this.LLLLLLZZ = null;
            InterfaceC377490Er5 interfaceC377490Er5 = xT().LJIIZILJ;
            if (interfaceC377490Er5 != null) {
                interfaceC377490Er5.Sl(this.LLLLLZ);
            }
            InterfaceC361710EGb interfaceC361710EGb = xT().LJIIJ;
            if (interfaceC361710EGb != null) {
                interfaceC361710EGb.o10(new C0ELW[]{C0ELW.VIDEO, C0ELW.INFO_STICKER, C0ELW.LYRIC_STICKER}, true);
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C201955140j.LIZJ(C563650M8t.LIZIZ, "InlineCaptionFragment -> onStop");
        if (this.LLLLLLZZ != null) {
            C790060Uyy.LJ(getActivity());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InlineCaptionViewModel sT() {
        return (InlineCaptionViewModel) wS();
    }

    public boolean IT() {
        return this.LLLLLLLLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void JS(boolean z) {
        VideoPublishEditModel videoPublishEditModelZS = ZS();
        if (videoPublishEditModelZS != null) {
            C0LAB c0labLJJ = u4.LJJ(1, videoPublishEditModelZS, ((InlineCaptionViewModel) wS()).vQ2(this.LLLJ.LIZ));
            c0labLJJ.LJ("enter_way", "edit_page_subtitle_sidebar");
            C20684815ws.LJIILLIIL("save_subtitle", c0labLJJ.LIZ);
        }
        lT(z);
    }

    public final void KT(List<TextStickerData> list) {
        long jJh;
        String placeholderSlotId;
        C0E55 player;
        C0E48 c0e48;
        C0E55 player2;
        C0E55 player3;
        C0F52 c0f52ET = ET();
        C0E48 c0e482 = c0f52ET.LIZ.LIZIZ;
        if (c0e482 != null && (player3 = c0e482.getPlayer()) != null) {
            jJh = player3.Jh();
        } else {
            jJh = 0;
        }
        Iterator<TextStickerData> it2 = list.iterator();
        int i = -1;
        int i2 = 0;
        while (true) {
            NLETrackSlot nLETrackSlot = null;
            if (it2.hasNext()) {
                TextStickerData next = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    TextStickerData textStickerData = next;
                    int startTime = textStickerData.getStartTime();
                    if (jJh <= textStickerData.getEndTime() && startTime <= jJh && C123100dR.LIZ(textStickerData.getTextStr())) {
                        i = i2;
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                C0E48 c0e483 = c0f52ET.LIZ.LIZIZ;
                if (c0e483 != null && (player = c0e483.getPlayer()) != null && player.isPlaying() && (c0e48 = c0f52ET.LIZ.LIZIZ) != null && (player2 = c0e48.getPlayer()) != null) {
                    player2.pause(false);
                }
                if (i < 0) {
                    c0f52ET.LIZIZ();
                    return;
                }
                TextStickerData textStickerData2 = (TextStickerData) C13LP.LJJJLZIJ(i, list);
                if (textStickerData2 == null || (placeholderSlotId = textStickerData2.getPlaceholderSlotId()) == null) {
                    placeholderSlotId = "";
                }
                NLEModel nLEModelLIZJ = c0f52ET.LIZ.LIZJ();
                if (nLEModelLIZJ != null) {
                    Iterator<NLETrackSlot> it3 = C349550Dn7.LIZJ(nLEModelLIZJ).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        NLETrackSlot next2 = it3.next();
                        if (Intrinsics.LJFF(next2.getUUID(), placeholderSlotId)) {
                            nLETrackSlot = next2;
                            break;
                        }
                    }
                    nLETrackSlot = nLETrackSlot;
                }
                C0E48 c0e484 = c0f52ET.LIZ.LIZIZ;
                if (c0e484 == null) {
                    return;
                }
                c0e484.S7().LIZIZ(new C358740E4q(nLETrackSlot, 0, null, false, 0, 254), "select_slot_event", false);
                return;
            }
        }
    }

    @Override // X.C0F6L
    public final void M2(int i) {
        uT().LIZJ(i, true);
    }

    public final void OT(boolean z) {
        EditCaptionScene.HighLightLayoutManager highLightLayoutManager;
        String strLJ;
        C0E55 player;
        C0F5E c0f5eUT = uT();
        c0f5eUT.getClass();
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InlineCaptionFragment -> VIDEO_POSITION_EVENT -> ");
        sbLIZ.append(c0f5eUT.LIZ.LJI.LJI);
        C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
        C0F5L c0f5l = c0f5eUT.LIZIZ;
        C384570F5z c384570F5z = c0f5l.LJJIJIIJIL;
        if (c384570F5z != null && !c0f5eUT.LIZ.LJI.LJIILLIIL && !c384570F5z.LLJJI && c0f5l.LJII.getAdapter() != null && (!c384570F5z.LL.isEmpty())) {
            if (c0f5eUT.LIZ.LIZIZ()) {
                int iLIZ = c0f5eUT.LIZ();
                if (z) {
                    c0f5eUT.LIZJ(iLIZ, true);
                    return;
                }
                if (c384570F5z.LLLFZ() == iLIZ || iLIZ == -1) {
                    return;
                }
                c384570F5z.LLLI(iLIZ);
                C0E48 c0e48 = c0f5eUT.LIZ.LIZIZ;
                if (c0e48 != null && (player = c0e48.getPlayer()) != null && player.isPlaying()) {
                    c0f5eUT.LIZJ(iLIZ, false);
                    return;
                }
                EditCaptionScene.HighLightLayoutManager highLightLayoutManager2 = c0f5eUT.LIZIZ.LJJIJIL;
                if (highLightLayoutManager2 == null) {
                    return;
                }
                highLightLayoutManager2.scrollToPositionWithOffset(iLIZ, 0);
                return;
            }
            C0F5L c0f5l2 = c0f5eUT.LIZIZ;
            C384570F5z c384570F5z2 = c0f5l2.LJJIJIIJIL;
            if (c384570F5z2 == null || (highLightLayoutManager = c0f5l2.LJJIJIL) == null) {
                return;
            }
            C425240Glu c425240Glu = c0f5l2.LJII;
            if (c384570F5z2.LL.size() > 1 && c0f5eUT.LIZ.LJI.LJI < ((CaptionUtterance) ListProtector.get(c384570F5z2.LL, 1)).LIZJ() && c384570F5z2.LLLFZ() != 0) {
                c0f5eUT.LIZ.LJI.getClass();
                highLightLayoutManager.LLILLL = 0.004f;
                highLightLayoutManager.smoothScrollToPosition(c425240Glu, new C21673919s1(), 0);
                return;
            }
            int iLIZ2 = c0f5eUT.LIZ();
            if (iLIZ2 <= 0 || c384570F5z2.LLLFZ() == iLIZ2) {
                return;
            }
            c0f5eUT.LIZ.LJI.getClass();
            highLightLayoutManager.LLILLL = 400.0f;
            CaptionUtterance captionUtterance = (CaptionUtterance) C13LP.LJJJLZIJ(iLIZ2, c384570F5z2.LL);
            if (captionUtterance != null) {
                strLJ = captionUtterance.LJ();
            } else {
                strLJ = null;
            }
            if (TextUtils.isEmpty(strLJ)) {
                return;
            }
            highLightLayoutManager.smoothScrollToPosition(c425240Glu, new C21673919s1(), iLIZ2);
            c384570F5z2.LLLI(iLIZ2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PS(X.EnumC357140DzM r10) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment.PS(X.0DzM):void");
    }

    @Override // X.C0F6L
    public final void Qq(boolean z) {
        float f;
        TuxIconView tuxIconView = zT().LJJIFFI;
        if (tuxIconView != null) {
            tuxIconView.setEnabled(z);
        }
        ViewGroup viewGroup = zT().LJJI;
        if (viewGroup != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            C786410Ut5.R4(f, viewGroup);
        }
        TuxIconView tuxIconView2 = zT().LJJIFFI;
        if (tuxIconView2 != null) {
            tuxIconView2.refreshDrawableState();
        }
    }

    @Override // X.C0F6L
    public final void Wf(C0F90 c0f90) {
        InputMethodManager inputMethodManager = this.LLLLLJLJLL;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(c0f90, 1);
        }
    }

    public final void lT(boolean z) {
        CreativeModel creativeModel;
        long jLIZLLL;
        C1DRG c1drg;
        C0EGY c0egyLIZIZ;
        InterfaceC359850E8x interfaceC359850E8xB20;
        LiveState<TrackShowType> liveStateQ82;
        NLEEditor nLEEditorLJI;
        CaptionQueryInfo captionQueryInfo;
        CreativeModel creativeModel2;
        String str;
        String str2;
        C0E55 player;
        ArrayList<TextStickerData> arrayListIP;
        C0F5J c0f5jCT = CT();
        C0E48 c0e48 = c0f5jCT.LIZ.LIZIZ;
        if (c0e48 != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
            C361680EFy.LIZ(C361680EFy.LJIJI("caption_edit_all_duration") + (System.currentTimeMillis() - c0f5jCT.LIZ.LIZ.LLLJ.LJIL), "caption_edit_all_duration");
            C0F5K c0f5k = c0f5jCT.LIZ;
            if (c0f5k.LIZ.LLLLIL && c0f5k.LIZIZ()) {
                nLEModelLJI.setExtra("is_editorpro_edit_captions", "true");
            }
        }
        TrackShowType trackShowTypeLIZJ = null;
        if (c0f5jCT.LIZ.LIZIZ()) {
            C0EJ3 c0ej3 = c0f5jCT.LIZ.LJ;
            if (c0ej3 != null && (arrayListIP = c0ej3.IP()) != null) {
                C0F5K c0f5k2 = c0f5jCT.LIZ;
                c0f5k2.LIZ.LLLFFI.LJ(c0f5k2.LJI.LIZ, arrayListIP, null, null);
            }
        } else {
            C0F5K c0f5k3 = c0f5jCT.LIZ;
            ArrayList<TextStickerData> arrayListLJI = C363740ENw.LJI(c0f5k3.LIZIZ, Integer.valueOf(c0f5k3.LJI.LJIIJ), Integer.valueOf(c0f5jCT.LIZ.LJI.LJIIJJI));
            if (arrayListLJI != null) {
                C0F5K c0f5k4 = c0f5jCT.LIZ;
                c0f5k4.LIZ.LLLFFI.LJ(c0f5k4.LJI.LIZ, arrayListLJI, null, null);
            }
        }
        new C384340F5c().LIZ.storeString("last_selected_language", c0f5jCT.LIZ.LJI.LIZ);
        c0f5jCT.LIZ.LIZ.LT();
        C0E48 c0e482 = c0f5jCT.LIZ.LIZIZ;
        if (c0e482 != null && (player = c0e482.getPlayer()) != null) {
            player.LJIJJLI();
            player.pause(false);
        }
        C0F5K c0f5k5 = c0f5jCT.LIZ;
        if (C363740ENw.LJI(c0f5k5.LIZIZ, Integer.valueOf(c0f5k5.LJI.LJIIJ), Integer.valueOf(c0f5jCT.LIZ.LJI.LJIIJJI)) != null) {
            CaptionCachesModel captionCachesModel = c0f5jCT.LIZ.LIZ.LLLFFI.LIZ.get(new C384340F5c().LIZ(null));
            if (captionCachesModel != null) {
                captionQueryInfo = captionCachesModel.captionQueryInfo;
            } else {
                captionQueryInfo = null;
            }
            VideoPublishEditModel videoPublishEditModel = c0f5jCT.LIZ.LIZJ;
            if (videoPublishEditModel != null && (creativeModel2 = videoPublishEditModel.creativeModel) != null) {
                if (captionQueryInfo != null) {
                    str = captionQueryInfo.audioTosKey;
                    str2 = captionQueryInfo.taskId;
                } else {
                    str = null;
                    str2 = null;
                }
                creativeModel2.inlineCaptionModel = new InlineCaptionModel(str, null, C371890Ei3.LIZIZ(new C384340F5c().LIZ(null)), new C384340F5c().LIZ(null), c0f5jCT.LIZ.LJI.LIZIZ, null, str2, 0.0f, 0.0f, 0.0f, 0.0f);
            }
        } else {
            VideoPublishEditModel videoPublishEditModel2 = c0f5jCT.LIZ.LIZJ;
            if (videoPublishEditModel2 != null && (creativeModel = videoPublishEditModel2.creativeModel) != null) {
                creativeModel.inlineCaptionModel = null;
            }
        }
        if (z) {
            String strHS = c0f5jCT.LIZ.LIZ.hS();
            C0E48 c0e483 = c0f5jCT.LIZ.LIZIZ;
            if (c0e483 != null && (nLEEditorLJI = c0e483.LLFII().LJI()) != null) {
                C350410DoV.LIZLLL(nLEEditorLJI, true, strHS, false, true);
            }
        }
        C0E48 c0e484 = c0f5jCT.LIZ.LIZIZ;
        if (c0e484 != null) {
            c0e484.S7().LIZIZ(new C1263904x3(false, false), "quit_edit_caption", false);
        }
        C0E5S c0e5s = c0f5jCT.LIZ.LJIILLIIL;
        if (c0e5s != null && (liveStateQ82 = c0e5s.Q82()) != null) {
            trackShowTypeLIZJ = liveStateQ82.LIZJ();
        }
        if (trackShowTypeLIZJ == TrackShowType.NORMAL && (c1drg = c0f5jCT.LIZ.LJFF) != null && (c0egyLIZIZ = C361460EFc.LIZIZ(c1drg)) != null && (interfaceC359850E8xB20 = c0egyLIZIZ.B20()) != null) {
            interfaceC359850E8xB20.LJIIL("bottom_item_root_text");
        }
        C0E48 c0e485 = c0f5jCT.LIZ.LIZIZ;
        if (c0e485 != null) {
            jLIZLLL = C352310DrZ.LIZLLL(c0e485.getPlayer().Jh());
        } else {
            jLIZLLL = 0;
        }
        c0f5jCT.LIZIZ(jLIZLLL);
        c0f5jCT.LIZ.LIZ.NR();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityCreated(android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment.onActivityCreated(android.os.Bundle):void");
    }

    public final void pT(C0E1X c0e1x) {
        NLEEditor nLEEditorLJI;
        if (C0E2B.LIZ()) {
            jT();
            C0E1X c0e1x2 = new C0E1X(C0E1V.EDIT_CAPTION.getNameId(), null, null, null, null, 30);
            if (c0e1x == null) {
                c0e1x = c0e1x2;
            }
            C0E48 c0e48 = this.LL;
            if (c0e48 != null) {
                nLEEditorLJI = c0e48.LLFII().LJI();
            } else {
                nLEEditorLJI = null;
            }
            C350410DoV.LIZLLL(nLEEditorLJI, true, C051R.LIZIZ(c0e1x), false, true);
        }
    }

    @Override // X.C0F6L
    public final void rR(boolean z) {
        C0HZQ c0hzq = zT().LJJII;
        if (c0hzq != null) {
            c0hzq.setChecked(z);
        }
    }

    @Override // X.C0EVI
    public final void t4(boolean z) {
        vT().LIZLLL(z);
    }

    @Override // X.C0F77
    public final void El(int i, boolean z) {
        int i2;
        Integer numValueOf;
        C0FHM c0fhmLIZJ;
        int iLIZ;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C385670FAf<C0FHM> c385670FAfS1;
        C384420F5k c384420F5k = this.LLLLZI;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (c384420F5k == null) {
            c384420F5k = null;
        }
        if (c384420F5k.LIZ.LIZIZ()) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onKeyboardStateChanged, visible: ");
            sbLIZ.append(z);
            sbLIZ.append(", height: ");
            sbLIZ.append(i);
            C201955140j.LIZLLL(c563650M8t, "InlineCaptionFragment", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                C0F5K c0f5k = c384420F5k.LIZ;
                boolean z2 = c0f5k.LJI.LJIILL;
                InterfaceC384330F5b interfaceC384330F5b = c0f5k.LJIIIZ;
                if (interfaceC384330F5b != null && (c385670FAfS1 = interfaceC384330F5b.S1()) != null) {
                    c0fhmLIZJ = c385670FAfS1.LIZJ();
                } else {
                    c0fhmLIZJ = null;
                }
                if (c0fhmLIZJ != C0FHM.VISIBLE) {
                    C0F5K c0f5k2 = c384420F5k.LIZ;
                    if (!c0f5k2.LJI.LJIIL) {
                        if (z2) {
                            ((C0F51) c0f5k2.LIZ.LLLZIIL.getValue()).LIZ();
                            ViewGroup viewGroup = c384420F5k.LIZIZ.LJIIZILJ;
                            if (viewGroup != null) {
                                layoutParams2 = viewGroup.getLayoutParams();
                            } else {
                                layoutParams2 = null;
                            }
                            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                                if (marginLayoutParams != null) {
                                    marginLayoutParams.bottomMargin = i;
                                }
                            } else {
                                marginLayoutParams = null;
                            }
                            ViewGroup viewGroup2 = c384420F5k.LIZIZ.LJIIZILJ;
                            if (viewGroup2 != null) {
                                C786410Ut5.X5(marginLayoutParams, viewGroup2);
                                C786410Ut5.R4(0.0f, viewGroup2);
                                C786410Ut5.LJLZ(0, viewGroup2);
                                c384420F5k.LIZ.LIZ.getClass();
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup2, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f);
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                C786410Ut5.Pd(objectAnimatorOfFloat);
                            }
                        } else {
                            TuxIconView tuxIconView = c384420F5k.LIZIZ.LJIILJJIL;
                            if (tuxIconView != null) {
                                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                            }
                        }
                        InterfaceC376450EpP interfaceC376450EpP = c384420F5k.LIZ.LJIIJJI;
                        if (interfaceC376450EpP != null) {
                            interfaceC376450EpP.D01(false);
                        }
                        InterfaceC360800ECo interfaceC360800ECo = c384420F5k.LIZ.LJII;
                        if (interfaceC360800ECo != null) {
                            C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.FULL_SCREEN}, null, Boolean.FALSE, null, null, 26);
                        }
                        c384420F5k.LIZ.LIZ.YT(true, false);
                        InterfaceC361710EGb interfaceC361710EGb = c384420F5k.LIZ.LJIIJ;
                        if (interfaceC361710EGb != null) {
                            interfaceC361710EGb.LLJJIJIIJIL(false);
                        }
                        C0F5K c0f5k3 = c384420F5k.LIZ;
                        VideoPublishEditModel videoPublishEditModel = c0f5k3.LIZJ;
                        if (videoPublishEditModel != null) {
                            C1402610mbT.LJJIIZI(videoPublishEditModel, "click", "caption_edit", c0f5k3.LIZLLL.vQ2(c0f5k3.LJI.LIZ));
                        }
                    }
                    if (!z2) {
                        TuxIconView tuxIconView2 = c384420F5k.LIZIZ.LJIILJJIL;
                        if (tuxIconView2 != null) {
                            layoutParams = tuxIconView2.getLayoutParams();
                        } else {
                            layoutParams = null;
                        }
                        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                            marginLayoutParams2.bottomMargin = C0EGK.LIZ(12) + i;
                        }
                        TuxIconView tuxIconView3 = c384420F5k.LIZIZ.LJIILJJIL;
                        if (tuxIconView3 != null) {
                            C786410Ut5.M6(tuxIconView3, marginLayoutParams2);
                        }
                    }
                    C0F5K c0f5k4 = c384420F5k.LIZ;
                    InterfaceC362230EIb interfaceC362230EIb = c0f5k4.LJIIIIZZ;
                    if (interfaceC362230EIb != null) {
                        int iMin = Math.min((int) (((double) ScreenUtils.getScreenHeight(c0f5k4.LIZ.getContext())) * 0.63d), C0EGK.LIZ(175) + i);
                        c384420F5k.LIZ.LJI.LJIILIIL = (iMin - i) - C0EGK.LIZ(52);
                        if (z2) {
                            iMin += C0ES3.LIZ;
                            iLIZ = C0EGK.LIZ(44);
                        } else {
                            iLIZ = C0ES3.LIZ;
                        }
                        interfaceC362230EIb.Dq1(iMin + iLIZ, true, AFwS191S0000000_5.get$arr$(288));
                    }
                    c384420F5k.LIZ.LJI.LJIIL = true;
                    return;
                }
                return;
            }
            if (!c384420F5k.LIZ.LJI.LJIIL) {
                return;
            }
            c384420F5k.LIZIZ.LJII.clearFocus();
            C0F5L c0f5l = c384420F5k.LIZIZ;
            C384570F5z c384570F5z = c0f5l.LJJIJIIJIL;
            int i3 = -1;
            if (c384570F5z != null) {
                c384570F5z.LLJILJIL = -1;
                c384570F5z.LLJILJILJ = -1;
            }
            c384420F5k.LIZ.LJI.LJIIL = false;
            TuxIconView tuxIconView4 = c0f5l.LJIILJJIL;
            if (tuxIconView4 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
            }
            ViewGroup viewGroup3 = c384420F5k.LIZIZ.LJIIZILJ;
            if (viewGroup3 != null) {
                C786410Ut5.LJLZ(8, viewGroup3);
            }
            InterfaceC360800ECo interfaceC360800ECo2 = c384420F5k.LIZ.LJII;
            if (interfaceC360800ECo2 != null) {
                C0EB4.LIZIZ(interfaceC360800ECo2, new EnumC373450EkZ[]{EnumC373450EkZ.FULL_SCREEN}, null, Boolean.TRUE, null, null, 26);
            }
            InterfaceC362230EIb interfaceC362230EIb2 = c384420F5k.LIZ.LJIIIIZZ;
            if (interfaceC362230EIb2 != null) {
                interfaceC362230EIb2.td1(EnumC362260EIe.MAX);
            }
            InterfaceC376450EpP interfaceC376450EpP2 = c384420F5k.LIZ.LJIIJJI;
            if (interfaceC376450EpP2 != null) {
                interfaceC376450EpP2.D01(true);
            }
            if (c384420F5k.LIZ.LJI.LIZJ) {
                if (c384570F5z != null) {
                    ArrayList<CaptionUtterance> arrayList = c384570F5z.LL;
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 0;
                    for (CaptionUtterance captionUtterance : arrayList) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            if (a0.LJJJIL(captionUtterance.LJ()) && (numValueOf = Integer.valueOf(i4)) != null) {
                                arrayList2.add(numValueOf);
                            }
                            i4 = i5;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    Integer num = (Integer) C13LP.LJJLIIIJL(arrayList2);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        if (iIntValue < c384570F5z.LL.size() - 1) {
                            i2 = iIntValue + 1;
                        } else {
                            i2 = 0;
                        }
                        Integer numValueOf2 = Integer.valueOf(i2);
                        if (numValueOf2 != null) {
                            Object obj = ListProtector.get(c384570F5z.LL, numValueOf2.intValue());
                            C19719612Di.LJJIIJ(c384570F5z.LL, AFwS234S0000000_5.get$arr$(68), true);
                            Iterator<CaptionUtterance> it2 = c384570F5z.LL.iterator();
                            int i6 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (Intrinsics.LJFF(it2.next(), obj)) {
                                    i3 = i6;
                                    break;
                                }
                                i6++;
                            }
                            c384570F5z.notifyDataSetChanged();
                            c384570F5z.LLLI(i3);
                            C0F6L c0f6l = c384570F5z.LLILZIL;
                            if (c0f6l != null) {
                                c0f6l.M2(i3);
                            }
                        }
                    }
                }
                c384420F5k.LIZ.LIZ.ET().LIZ();
                c384420F5k.LIZ.LIZ.pT(null);
            }
            if (c384570F5z != null) {
                Iterator<CaptionUtterance> it3 = c384570F5z.LL.iterator();
                while (it3.hasNext()) {
                    it3.next().isSelected = false;
                }
            }
            C0HZQ c0hzq = c384420F5k.LIZIZ.LJJII;
            if (c0hzq != null) {
                c0hzq.setChecked(false);
            }
            C0F5K c0f5k5 = c384420F5k.LIZ;
            if (!c0f5k5.LJI.LJIILJJIL) {
                c0f5k5.LIZ.YT(true, true);
            }
            InterfaceC361710EGb interfaceC361710EGb2 = c384420F5k.LIZ.LJIIJ;
            if (interfaceC361710EGb2 != null) {
                interfaceC361710EGb2.LLJJIJIIJIL(true);
            }
            C0F5K c0f5k6 = c384420F5k.LIZ;
            VideoPublishEditModel videoPublishEditModel2 = c0f5k6.LIZJ;
            if (videoPublishEditModel2 != null) {
                C1402610mbT.LJJJIL(videoPublishEditModel2, c0f5k6.LIZ.LLLLIL, 1, c0f5k6.LIZLLL.vQ2(c0f5k6.LJI.LIZ), null);
            }
            C0F5K c0f5k7 = c384420F5k.LIZ;
            c0f5k7.LJI.LIZJ = false;
            NLEModel nLEModelLIZJ = c0f5k7.LIZJ();
            if (nLEModelLIZJ != null && C349550Dn7.LIZJ(nLEModelLIZJ).isEmpty()) {
                InlineCaptionFragment inlineCaptionFragment = c384420F5k.LIZ.LIZ;
                inlineCaptionFragment.getClass();
                inlineCaptionFragment.FT();
                return;
            }
            c384420F5k.LIZ.LIZ.CT().LIZJ.LIZIZ(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void GT(java.util.List<com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData> r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment.GT(java.util.List, boolean):void");
    }

    public final void YT(boolean z, boolean z2) {
        boolean z3;
        InterfaceC360800ECo interfaceC360800ECo;
        NLEEditor nLEEditorLJI;
        NLEBranch branch;
        NLECommit head;
        String uuid;
        InterfaceC360800ECo interfaceC360800ECo2;
        NLEEditor nLEEditorLJI2;
        NLEBranch branch2;
        NLECommit head2;
        int i;
        if (C0E2B.LIZ()) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            InterfaceC360800ECo interfaceC360800ECo3 = xT().LJII;
            if (interfaceC360800ECo3 != null) {
                C0EB4.LIZIZ(interfaceC360800ECo3, new EnumC373450EkZ[]{EnumC373450EkZ.REDO, EnumC373450EkZ.UNDO, EnumC373450EkZ.FULL_SCREEN}, Integer.valueOf(i), null, null, null, 28);
            }
        }
        C0E48 c0e48 = this.LL;
        if (c0e48 != null && c0e48.Bo().LIZ()) {
            z3 = true;
        } else {
            z3 = false;
        }
        String uuid2 = null;
        if (z3) {
            C0E48 c0e482 = this.LL;
            if (c0e482 != null && (nLEEditorLJI2 = c0e482.LLFII().LJI()) != null && (branch2 = nLEEditorLJI2.getBranch()) != null && (head2 = branch2.getHead()) != null) {
                uuid = head2.getUUID();
            } else {
                uuid = null;
            }
            if (!Intrinsics.LJFF(uuid, this.LLLLLLLLL) && (interfaceC360800ECo2 = xT().LJII) != null) {
                C0EB4.LIZIZ(interfaceC360800ECo2, new EnumC373450EkZ[]{EnumC373450EkZ.UNDO}, null, Boolean.valueOf(z2), null, null, 26);
            }
        }
        C0E48 c0e483 = this.LL;
        if (c0e483 != null && c0e483.Bo().LJFF()) {
            C0E48 c0e484 = this.LL;
            if (c0e484 != null && (nLEEditorLJI = c0e484.LLFII().LJI()) != null && (branch = nLEEditorLJI.getBranch()) != null && (head = branch.getHead()) != null) {
                uuid2 = head.getUUID();
            }
            if (!Intrinsics.LJFF(uuid2, this.LLLLLLLLL) && (interfaceC360800ECo = xT().LJII) != null) {
                C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.REDO}, null, Boolean.valueOf(z2), null, null, 26);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0aec  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0b17  */
    /* JADX WARN: Type inference failed for: r0v213, types: [X.0F5f, X.0Uyz] */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, com.ss.ugc.android.editor.bottom.panel.EditorContextFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 2909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C0F6L
    public final void Yt(Pair<Integer, Integer> pair, TextStickerData textStickerData, TextStickerData textStickerData2) {
        C0F52 c0f52ET = ET();
        C0F5S c0f5s = this.LLZIL;
        c0f52ET.getClass();
        C363710ENt c363710ENt = c0f5s.LIZ.LLLJL;
        if (c363710ENt != null) {
            String placeholderSlotId = textStickerData.getPlaceholderSlotId();
            if (placeholderSlotId == null) {
                placeholderSlotId = "";
            }
            c363710ENt.LIZIZ(placeholderSlotId, textStickerData, textStickerData2);
        }
        C201955140j.LIZ("CaptionTrackOperator -> splitCaption -> hasEdited = true");
        C0EJ3 c0ej3 = c0f52ET.LIZ.LJ;
        if (c0ej3 != null) {
            c0ej3.Rc();
        }
        InlineCaptionFragment inlineCaptionFragment = c0f5s.LIZ;
        inlineCaptionFragment.LLLLIL = true;
        inlineCaptionFragment.LLLJ.LIZJ = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    @Override // X.C0F6L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kO(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r65, int r66, int r67) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment.kO(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[PHI: r10
      0x0052: PHI (r10v15 java.lang.String) = (r10v12 java.lang.String), (r10v16 java.lang.String) binds: [B:14:0x0050, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[PHI: r10
      0x0056: PHI (r10v14 java.lang.String) = (r10v12 java.lang.String), (r10v15 java.lang.String) binds: [B:14:0x0050, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    @Override // X.C0EVI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bO(java.util.List<com.ss.android.ugc.aweme.sticker.data.Utterance> r68, java.lang.String r69, java.lang.Boolean r70, java.lang.String r71) {
        /*
            Method dump skipped, instruction units count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment.bO(java.util.List, java.lang.String, java.lang.Boolean, java.lang.String):void");
    }

    public TextStickerData mT(Utterance utterance, C19EG c19eg, Effect effect, Effect effect2) {
        return C363730ENv.LJI(utterance, c19eg, true, effect, effect2);
    }

    @Override // X.C0F6L
    public final void sr(TextStickerData textStickerData, Pair<Integer, Integer> pair, TextStickerData textStickerData2, Pair<Integer, Integer> pair2) {
        C0F52 c0f52ET = ET();
        C0F5S c0f5s = this.LLZIL;
        c0f52ET.getClass();
        C363710ENt c363710ENt = c0f5s.LIZ.LLLJL;
        if (c363710ENt != null) {
            String placeholderSlotId = textStickerData.getPlaceholderSlotId();
            String str = "";
            if (placeholderSlotId == null) {
                placeholderSlotId = "";
            }
            String placeholderSlotId2 = textStickerData2.getPlaceholderSlotId();
            if (placeholderSlotId2 != null) {
                str = placeholderSlotId2;
            }
            c363710ENt.LIZ(placeholderSlotId, str, textStickerData);
        }
        C201955140j.LIZ("CaptionTrackOperator -> mergerCaption -> hasEdited = true");
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" firstData: ");
        sbLIZ.append(textStickerData.getTextStr());
        sbLIZ.append(", secondData: ");
        sbLIZ.append(textStickerData2.getTextStr());
        C201955140j.LIZLLL(c563650M8t, "elfred", C2188811AlT.LIZIZ(sbLIZ));
        C0EJ3 c0ej3 = c0f52ET.LIZ.LJ;
        if (c0ej3 != null) {
            c0ej3.Rc();
        }
        InlineCaptionFragment inlineCaptionFragment = c0f5s.LIZ;
        inlineCaptionFragment.LLLLIL = true;
        inlineCaptionFragment.LLLJ.LIZJ = true;
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [X.0F5I] */
    public InlineCaptionFragment(C364440EQo c364440EQo, String str, boolean z, NLETrackSlot nLETrackSlot, C0EJ3 c0ej3, Effect effect, Effect effect2, boolean z2) {
        this.LLLFFI = c364440EQo;
        this.LLLFZ = str;
        this.LLLI = z;
        this.LLLII = nLETrackSlot;
        this.LLLIIII = c0ej3;
        this.LLLIIIIL = effect;
        this.LLLIIIL = effect2;
        this.LLLIIL = z2;
        this.LLLJ = new C0F5P();
        this.LLLJIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS549S0100000_5(this, 643));
        this.LLLL = new TextPaint();
        this.LLLLIIIILLL = new ArrayList<>();
        this.LLLLLLIL = C1697810uHb.LJIIJJI("my", "bn");
        this.LLLLLLLLL = "";
        this.LLLLLLLLLL = true;
        this.LLLLLLLZIL = new C0F76(this);
        this.LLLLLZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 635));
        this.LLLLLZL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 637));
        this.LLLLZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 645));
        this.LLLLZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 644));
        this.LLLLZLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 641));
        this.LLLLZLLLI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 649));
        this.LLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 638));
        this.LLLZI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 634));
        this.LLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 640));
        this.LLLZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 642));
        this.LLLZL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 650));
        this.LLLZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 651));
        this.LLLZLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 646));
        this.LLLZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 639));
        this.LLLZZIL = new C0F5R(new AwS549S0100000_5(this, 647), new AwS549S0100000_5(this, 648));
        this.LLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 636));
        this.LLZIL = new C0F5S(this);
        this.LLZILL = new C362450EIx(this);
        this.LLZL = new InterfaceC384400F5i() { // from class: X.0F5I
            @Override // X.InterfaceC384400F5i
            public final void LIZJ() {
                this.LIZ.zT().LJII.removeOnItemTouchListener(((C384320F5a) this.LIZ.LLLLZLLLI.getValue()).LJI);
                this.LIZ.zT().LJII.removeOnScrollListener(((C384320F5a) this.LIZ.LLLLZLLLI.getValue()).LJFF);
            }

            @Override // X.InterfaceC384400F5i
            public final void LIZLLL() {
                MutableLiveData<Integer> mutableLiveData;
                C0F5B c0f5bVT = this.LIZ.vT();
                C0F5K c0f5k = c0f5bVT.LIZ;
                AbstractC2217051Bpv abstractC2217051Bpv = c0f5k.LIZLLL.LLIZ;
                if (abstractC2217051Bpv != null && (mutableLiveData = abstractC2217051Bpv.LJIL) != null) {
                    mutableLiveData.removeObservers(c0f5k.LIZ);
                }
                c0f5bVT.LIZ.LIZ.DT().removeCallbacksAndMessages(null);
                AnonymousClass0956 anonymousClass0956 = c0f5bVT.LJFF;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c0f5bVT.LJFF = null;
            }

            @Override // X.InterfaceC384400F5i
            public final void LIZ(boolean z3) {
                float f;
                ViewGroup viewGroup = this.LIZ.zT().LJJIIZI;
                if (viewGroup != null) {
                    if (z3) {
                        f = 1.0f;
                    } else {
                        f = 0.4f;
                    }
                    C786410Ut5.R4(f, viewGroup);
                }
            }

            @Override // X.InterfaceC384400F5i
            public final void LIZIZ(boolean z3) {
                int i;
                View viewFindViewById;
                View viewFindViewById2;
                View viewFindViewById3;
                float f;
                TuxTextView tuxTextView = this.LIZ.zT().LJIJJLI;
                float f2 = 0.4f;
                if (tuxTextView != null) {
                    if (z3) {
                        f = 0.4f;
                    } else {
                        f = 1.0f;
                    }
                    C786410Ut5.B5(tuxTextView, f);
                }
                View view = this.LIZ.getView();
                if (view != null && (viewFindViewById3 = view.findViewById(R.id.ddg)) != null) {
                    if (!z3) {
                        f2 = 1.0f;
                    }
                    C786410Ut5.T4(viewFindViewById3, f2);
                }
                TuxTextView tuxTextView2 = this.LIZ.zT().LJIJJLI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setEnabled(!z3);
                }
                View view2 = this.LIZ.getView();
                if (view2 != null && (viewFindViewById2 = view2.findViewById(R.id.ddg)) != null) {
                    viewFindViewById2.setEnabled(!z3);
                }
                C425240Glu c425240Glu = this.LIZ.zT().LJII;
                int i2 = 4;
                if (z3) {
                    i = 4;
                } else {
                    i = 0;
                }
                C786410Ut5.f1(c425240Glu, i);
                View view3 = this.LIZ.getView();
                if (view3 != null && (viewFindViewById = view3.findViewById(R.id.zze)) != null) {
                    if (z3) {
                        i2 = 0;
                    }
                    C786410Ut5.LJLLLLLL(i2, viewFindViewById);
                }
            }
        };
    }

    public /* synthetic */ InlineCaptionFragment(C364440EQo c364440EQo, String str, boolean z, NLETrackSlot nLETrackSlot, C0EJ3 c0ej3, Effect effect, Effect effect2, boolean z2, int i) {
        this((i & 1) != 0 ? new C364440EQo() : c364440EQo, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : nLETrackSlot, (i & 16) != 0 ? null : c0ej3, (i & 32) != 0 ? null : effect, (i & 64) == 0 ? effect2 : null, (i & 128) != 0 ? false : z2);
    }
}
