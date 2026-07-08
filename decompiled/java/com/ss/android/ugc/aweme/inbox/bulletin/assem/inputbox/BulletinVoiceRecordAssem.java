package com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox;

import X.AnonymousClass0956;
import X.C019F;
import X.C098200Yq;
import X.C09R3;
import X.C0DTR;
import X.C0OLV;
import X.C0OOY;
import X.C0OP4;
import X.C0OPQ;
import X.C0OPX;
import X.C0OSF;
import X.C0OWM;
import X.C0PEM;
import X.C0ZDN;
import X.C12DM;
import X.C12ES;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1619980sG4;
import X.C1637806bA;
import X.C1637906bB;
import X.C189200o6;
import X.C194434115c;
import X.C194438115g;
import X.C194440115i;
import X.C194442115k;
import X.C194443115l;
import X.C19514711Wn;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19741112Lp;
import X.C2151008bk;
import X.C2183208gw;
import X.C2183908h3;
import X.C2184408h8;
import X.C2185808hM;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2226908nz;
import X.C2227408o4;
import X.C2227508o5;
import X.C2227708o7;
import X.C2227908o9;
import X.C2228008oA;
import X.C2228108oB;
import X.C2228208oC;
import X.C2228308oD;
import X.C2228508oF;
import X.C2229008oK;
import X.C2229108oL;
import X.C2229308oN;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C620650OVz;
import X.C723580SZw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C838410Wul;
import X.C985403tE;
import X.EnumC194437115f;
import X.EnumC194439115h;
import X.EnumC194441115j;
import X.EnumC2227308o3;
import X.EnumC2228908oJ;
import X.EnumC617880OLi;
import X.EnumC619890OTb;
import X.InterfaceC1554640qYg;
import X.InterfaceC19515111Wr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2229408oO;
import X.InterfaceC494301wD;
import X.InterfaceC617820OLc;
import X.InterfaceC623330Ocd;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnLayoutChangeListenerC194444115m;
import Y.ACListenerS138S0100000_3;
import Y.ACListenerS163S0100000_29;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS37S0400000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinVoiceRecordAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListPageStatusViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMediaViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPublishViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinVoiceRecordViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinVoiceRecordUiAbility;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.ApplySkin;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridResourceResponse;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes30.dex */
public final class BulletinVoiceRecordAssem extends UISlotAssem implements BulletinVoiceRecordUiAbility, InterfaceC623330Ocd, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public boolean LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public final EnumC619890OTb LLJJJJ;
    public View LLJJJJJIL;
    public ViewPropertyAnimator LLJJJJLIIL;
    public boolean LLJJL;
    public TextView LLJJLIIIJLLLLLLLZ;
    public C194442115k LLJL;
    public LinearLayout LLJLIL;
    public FrameLayout LLJLILLLLZIIL;
    public C194434115c LLJLL;
    public TextView LLJLLIL;
    public String LLJLLL;
    public TuxIconView LLJZ;
    public TuxIconView LLJZIJLIL;
    public TuxIconView LLL;
    public View LLLF;
    public FrameLayout LLLFF;
    public TuxIconView LLLFFI;
    public View LLLFZ;
    public TextView LLLI;
    public TextView LLLII;
    public View LLLIIII;
    public C194443115l LLLIIIIL;
    public C2229008oK LLLIIIL;
    public C2229108oL LLLIIL;
    public long LLLIILIL;
    public boolean LLLIL;
    public EnumC194439115h LLLILZ;
    public TextView LLLILZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinVoiceRecordAssem.class, "recordVm", "getRecordVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinVoiceRecordViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BulletinVoiceRecordAssem.class, "publishVm", "getPublishVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinPublishViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BulletinVoiceRecordAssem.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(BulletinVoiceRecordAssem.class, "pageStatusVm", "getPageStatusVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListPageStatusViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(BulletinVoiceRecordAssem.class, "mediaVm", "getMediaVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinMediaViewModel;", 0);
        c09r3.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public BulletinVoiceRecordAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinVoiceRecordViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS573S0100000_29(c19719912DlLIZ, 138), AFwS273S0000000_29.get$arr$(87), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinPublishViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS573S0100000_29(c19719912DlLIZ2, 139), AFwS273S0000000_29.get$arr$(88), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(BulletinInputStateViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS573S0100000_29(c19719912DlLIZ3, 140), AFwS273S0000000_29.get$arr$(89), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(BulletinListPageStatusViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS573S0100000_29(c19719912DlLIZ4, 141), AFwS273S0000000_29.get$arr$(90), null, true);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(BulletinMediaViewModel.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS573S0100000_29(c19719912DlLIZ5, 142), AFwS273S0000000_29.get$arr$(86), null, true);
        this.LLJJJJ = EnumC619890OTb.VOICE_PANEL;
        this.LLLIILIL = System.currentTimeMillis();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a8r;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1723234385) {
            return null;
        }
        return this;
    }

    public final void Tp() {
        int i = this.LLLIL ? R.raw.icon_pause_fill : R.raw.icon_play_fill;
        TuxIconView tuxIconView = this.LLL;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinVoiceRecordUiAbility
    public final void cH0() {
        C0OPX.LJII("BulletinVoiceRecordAssem: mic tapped");
        Object value = tp().LLILZLL.getValue();
        if (value == EnumC194439115h.INITIAL || value == EnumC194439115h.DELETED) {
            Bp(new AwS547S0100000_3(this, 29));
        }
    }

    public final void lp() {
        C194443115l c194443115l = this.LLLIIIIL;
        if (c194443115l != null) {
            c194443115l.LIZ();
        }
    }

    public final BulletinInputStateViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        return (BulletinInputStateViewModel) assemVMLazy.getValue();
    }

    public final C2229308oN sp() {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        return ((BulletinMediaViewModel) assemVMLazy.getValue()).LLILLJJLI;
    }

    public final BulletinVoiceRecordViewModel tp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        return (BulletinVoiceRecordViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    public final void zp() {
        ?? arrayList;
        String absolutePath;
        String str;
        String str2;
        if (tp().LLILZLL.getValue() == EnumC194439115h.RECORDING) {
            tp().wQ2(EnumC2228908oJ.SEND);
        }
        BulletinVoiceRecordViewModel bulletinVoiceRecordViewModelTp = tp();
        if (((Number) bulletinVoiceRecordViewModelTp.LLJILJILJ.LIZ.getValue()).longValue() >= 1000) {
            ApplySkin applySkin = null;
            if (1 != 0) {
                if (bulletinVoiceRecordViewModelTp.AQ2()) {
                    bulletinVoiceRecordViewModelTp.EQ2(EnumC2227308o3.UPLOAD);
                }
                bulletinVoiceRecordViewModelTp.LLJJI.LJIIJ();
                C2228508oF c2228508oF = bulletinVoiceRecordViewModelTp.LLJJIJIL;
                if (c2228508oF != null) {
                    c2228508oF.LIZIZ();
                }
                C2184408h8 c2184408h8 = bulletinVoiceRecordViewModelTp.LLJILJILJ;
                if (c2184408h8.LJI) {
                    c2184408h8.LIZ();
                }
                c2184408h8.LJIIIZ = null;
                AnonymousClass0956 anonymousClass0956 = c2184408h8.LJII;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c2184408h8.LJII = null;
                C2228508oF c2228508oF2 = bulletinVoiceRecordViewModelTp.LLJJIJIL;
                if (c2228508oF2 != null) {
                    c2228508oF2.LJI();
                }
                bulletinVoiceRecordViewModelTp.LLJJIJIL = null;
                bulletinVoiceRecordViewModelTp.FQ2(EnumC194439115h.SENDING);
                long jLongValue = ((Number) bulletinVoiceRecordViewModelTp.LLJILJILJ.LIZIZ.getValue()).longValue();
                C2226908nz c2226908nz = bulletinVoiceRecordViewModelTp.LLJIJIL;
                synchronized (c2226908nz.LIZ) {
                    try {
                        if (!((ArrayList) c2226908nz.LIZIZ).isEmpty()) {
                            List<Float> list = c2226908nz.LIZ;
                            Float fLJJLIIJ = C13LP.LJJLIIJ(c2226908nz.LIZIZ);
                            ((ArrayList) list).add(Float.valueOf(fLJJLIIJ != null ? fLJJLIIJ.floatValue() : 0.0f));
                            ((ArrayList) c2226908nz.LIZIZ).clear();
                        }
                        List listLLIIII = C13LP.LLIIII(c2226908nz.LIZ);
                        if (listLLIIII.isEmpty()) {
                            arrayList = C13BV.INSTANCE;
                        } else {
                            List listLIZ = C2226908nz.LIZ(listLLIIII);
                            arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                            Iterator it2 = listLIZ.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Float.valueOf(((float) Math.rint(((Number) it2.next()).floatValue() * 100.0f)) / 100.0f));
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                bulletinVoiceRecordViewModelTp.LLJJIII.LIZJ = jLongValue;
                String str3 = bulletinVoiceRecordViewModelTp.LLJJJ;
                File file = bulletinVoiceRecordViewModelTp.LLJJJJ;
                if (file == null || (absolutePath = file.getAbsolutePath()) == null) {
                    return;
                }
                C2183208gw c2183208gw = bulletinVoiceRecordViewModelTp.LLJJIII;
                C2185808hM c2185808hM = new C2185808hM(jLongValue, c2183208gw.LIZJ, str3, absolutePath, c2183208gw.LIZ, arrayList, c2183208gw.LIZIZ);
                TuxIconView tuxIconView = this.LLJZIJLIL;
                if (tuxIconView != null) {
                    tuxIconView.performHapticFeedback(3);
                }
                C0OLV c0olv = (C0OLV) this.LLJJI.getValue();
                if (c0olv == null || c0olv.LL == null) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BulletinVoiceRecordAssem: send voice fakeId=");
                sbLIZ.append(c2185808hM.LIZ);
                sbLIZ.append(", duration=");
                sbLIZ.append(c2185808hM.LIZJ);
                sbLIZ.append("ms");
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                AssemVMLazy assemVMLazy = this.LLJJIJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
                BulletinPublishViewModel bulletinPublishViewModel = (BulletinPublishViewModel) assemVMLazy.getValue();
                String str4 = c2185808hM.LIZIZ;
                long j = c2185808hM.LIZJ;
                List<Float> list2 = c2185808hM.LIZLLL;
                String str5 = c2185808hM.LJ;
                boolean z = c2185808hM.LJFF;
                long j2 = c2185808hM.LJI;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("publishVoice() - ");
                C0OLV c0olvHh2 = bulletinPublishViewModel.Hh2();
                sbLIZ2.append(c0olvHh2 != null ? c0olvHh2.LL : null);
                sbLIZ2.append(", duration=");
                sbLIZ2.append(j);
                sbLIZ2.append("ms");
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                C0OLV c0olvHh22 = bulletinPublishViewModel.Hh2();
                if (c0olvHh22 != null && (str = c0olvHh22.LL) != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("channel_id", str);
                    linkedHashMap.put("content_type", "voice");
                    C0OLV c0olvHh23 = bulletinPublishViewModel.Hh2();
                    if (c0olvHh23 == null || (str2 = c0olvHh23.LLILLJJLI) == null) {
                        str2 = "";
                    }
                    linkedHashMap.put("entrance_page", str2);
                    C0OPQ.LIZ.getClass();
                    linkedHashMap.put("enter_method", Intrinsics.LJFF(str5, "hold") ? "long_press_voice" : "click_voice_icon");
                    String str6 = CardStruct.IStatusCode.DEFAULT;
                    linkedHashMap.put("is_resend", CardStruct.IStatusCode.DEFAULT);
                    if (z) {
                        str6 = "1";
                    }
                    linkedHashMap.put("has_used_locker", str6);
                    linkedHashMap.put("total_duration", String.valueOf(j2));
                    C0OOY c0ooy = C0OOY.LIZ;
                    BulletinProfileViewModel bulletinProfileViewModel = (BulletinProfileViewModel) bulletinPublishViewModel.LLILZ.getValue();
                    ApplySkin applySkin2 = bulletinProfileViewModel.LLJJJJJIL;
                    if (applySkin2 == null) {
                        BulletinHybridResourceResponse bulletinHybridResourceResponseLIZ = bulletinProfileViewModel.getState().LLJJJJJIL.LIZ();
                        if (bulletinHybridResourceResponseLIZ != null) {
                            applySkin = bulletinHybridResourceResponseLIZ.getApplySkin();
                        }
                    } else {
                        applySkin = applySkin2;
                    }
                    C0OOY.LJIJJLI(c0ooy, str, str4, j, list2, false, linkedHashMap, null, applySkin, 64);
                }
                BulletinVoiceRecordViewModel bulletinVoiceRecordViewModelTp2 = tp();
                bulletinVoiceRecordViewModelTp2.yQ2().LIZ();
                bulletinVoiceRecordViewModelTp2.LLJIJIL.LIZJ();
                bulletinVoiceRecordViewModelTp2.LLJILJILJ.LIZIZ();
                bulletinVoiceRecordViewModelTp2.LLJ.setValue(Boolean.FALSE);
                bulletinVoiceRecordViewModelTp2.LLIZ.setValue(EnumC194441115j.TAP);
                bulletinVoiceRecordViewModelTp2.FQ2(EnumC194439115h.INITIAL);
            }
        }
    }

    public final void Ap() {
        boolean zKp = kp();
        ip(this.LLJJLIIIJLLLLLLLZ, zKp);
        ip(this.LLLILZJ, zKp);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinVoiceRecordUiAbility
    public final void To0() {
        if (tp().LLILZLL.getValue() == EnumC194439115h.RECORDING) {
            tp().wQ2(EnumC2228908oJ.DELETE);
            lp();
            tp().vQ2();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinVoiceRecordUiAbility
    public final void Vg1() {
        if (tp().LLILZLL.getValue() == EnumC194439115h.RECORDING) {
            up();
            BulletinVoiceRecordViewModel bulletinVoiceRecordViewModelTp = tp();
            bulletinVoiceRecordViewModelTp.LLIZ.setValue(EnumC194441115j.LOCKED);
            bulletinVoiceRecordViewModelTp.LLJJIII.LIZIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinVoiceRecordUiAbility
    public final void gx0() {
        int i = C194440115i.LIZJ[((EnumC194441115j) tp().LLIZLLLIL.getValue()).ordinal()];
        if (i != 1) {
            if (i == 2) {
                lp();
                return;
            } else {
                if (i != 3) {
                    throw new C1954807lC();
                }
                return;
            }
        }
        lp();
        boolean z = ((Number) tp().LLJILLL.getValue()).longValue() >= 1000;
        if (tp().LLILZLL.getValue() == EnumC194439115h.RECORDING) {
            tp().wQ2(z ? EnumC2228908oJ.SEND : EnumC2228908oJ.DELETE);
        }
        if (z) {
            zp();
        } else {
            tp().vQ2();
        }
    }

    public final boolean kp() {
        if (((Boolean) tp().LLJI.getValue()).booleanValue()) {
            return false;
        }
        int i = C194440115i.LIZIZ[((EnumC194439115h) tp().LLILZLL.getValue()).ordinal()];
        if (i != 3) {
            if (i == 4 || i == 5) {
                return true;
            }
        } else if (tp().LLIZLLLIL.getValue() != EnumC194441115j.HOLD) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Unit unit;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        super.onDestroy();
        TextView textView = this.LLLILZJ;
        if (textView != null) {
            C0DTR.LIZIZ(textView);
        }
        C194442115k c194442115k = this.LLJL;
        if (c194442115k != null) {
            View view = c194442115k.LJII;
            ARunnableS37S0400000_29 aRunnableS37S0400000_29 = c194442115k.LJIIIIZZ;
            if (view != null && aRunnableS37S0400000_29 != null) {
                HandlerHook.viewRemoveCallbacks(view, aRunnableS37S0400000_29);
            }
            c194442115k.LJII = null;
            c194442115k.LJIIIIZZ = null;
            View view2 = c194442115k.LJIIIZ;
            ViewOnLayoutChangeListenerC194444115m viewOnLayoutChangeListenerC194444115m = c194442115k.LJIIJ;
            if (view2 != null && viewOnLayoutChangeListenerC194444115m != null) {
                view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC194444115m);
            }
            c194442115k.LJIIIZ = null;
            c194442115k.LJIIJ = null;
            LinearLayout linearLayout = c194442115k.LIZJ;
            if (linearLayout != null && (viewPropertyAnimatorAnimate = linearLayout.animate()) != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            try {
                PopupWindow popupWindow = c194442115k.LIZIZ;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            c194442115k.LIZIZ = null;
            c194442115k.LIZJ = null;
            c194442115k.LIZLLL = null;
            c194442115k.LJ = null;
            c194442115k.LJI = null;
        }
        this.LLJL = null;
        lp();
        ViewPropertyAnimator viewPropertyAnimator = this.LLJJJJLIIL;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.LLJJJJLIIL = null;
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.iA(this.LLJJJJ);
        }
        tp().LLJIJIL.LJ = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinVoiceRecordUiAbility
    public final void pb1() {
        Object value = tp().LLILZLL.getValue();
        if (value == EnumC194439115h.INITIAL || value == EnumC194439115h.DELETED) {
            Context context = getContext();
            if (context == null || C838410Wul.LIZ(context, "android.permission.RECORD_AUDIO") != 0) {
                C0OPX.LJII("BulletinVoiceRecordAssem: hold-mode missing audio permission, requesting");
                Bp(AFwS218S0000000_29.get$arr$(88));
                return;
            }
            long j = this.LLLIILIL + 1;
            this.LLLIILIL = j;
            String strValueOf = String.valueOf(j);
            up();
            tp().GQ2(strValueOf, "hold");
        }
    }

    public final void up() {
        Object c098200Yq;
        Context context = getContext();
        if (context == null) {
            return;
        }
        try {
            new C0ZDN(context).LIZ(0);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinVoiceRecordAssem: haptic impact light failed: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final View dk() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC623330Ocd
    public final EnumC619890OTb pd() {
        return this.LLJJJJ;
    }

    public static void Ip(Activity activity) {
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        c1397580mTM.LJI(activity.getString(2131828177));
        c1397580mTM.LIZIZ(activity.getString(2131828176));
        C985403tE.LIZ(c1397580mTM, new AwS608S0100000_29(activity, 132));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final void Bp(final Function0<Unit> function0) {
        final Activity activityLIZ;
        Context context = getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C19741112Lp.LIZ.getClass();
            if (C19741112Lp.LJI(activityLIZ, "android.permission.RECORD_AUDIO", false)) {
                Ip(activityLIZ);
            } else {
                C19514711Wn.LIZIZ.LIZIZ(activityLIZ, TokenCert.Companion.with("bpea-bulletin_voice_record")).LIZIZ("android.permission.RECORD_AUDIO").LIZJ(new InterfaceC19515111Wr() { // from class: X.0HjJ
                    @Override // X.InterfaceC19515111Wr
                    public final void onCanceled() {
                    }

                    @Override // X.InterfaceC19515111Wr
                    public final void LIZ(C0HWO... c0hwoArr) {
                        Function0<Unit> function02 = function0;
                        BulletinVoiceRecordAssem bulletinVoiceRecordAssem = this;
                        Activity activity = activityLIZ;
                        for (C0HWO c0hwo : c0hwoArr) {
                            if (Intrinsics.LJFF(c0hwo.LIZ, "android.permission.RECORD_AUDIO")) {
                                int i = C449100HjI.LIZ[c0hwo.LIZIZ.ordinal()];
                                if (i != 1) {
                                    if (i == 2 || i == 3) {
                                        bulletinVoiceRecordAssem.getClass();
                                        BulletinVoiceRecordAssem.Ip(activity);
                                    }
                                } else {
                                    function02.invoke();
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    public final void Ep(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZIZ;
        C194434115c c194434115c = this.LLJLL;
        if (c194434115c == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c194434115c.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.getMarginStart() != (iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))))) {
            marginLayoutParams.setMarginStart(iLIZIZ);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c194434115c);
            c194434115c.setLayoutParams(marginLayoutParams);
        }
    }

    public final void Fp(TuxIconView tuxIconView) {
        Context context = getContext();
        if (context != null && tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZ = R.raw.icon_trash_bin_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setTuxIcon(c419910GdJ);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zs);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(18));
            tuxIconView.setBackground(c384050F3z.LIZ(context));
            C786410Ut5.a9(tuxIconView, new ACListenerS138S0100000_3(this, 12));
        }
    }

    public final void Gp(EnumC194437115f enumC194437115f) {
        LinearLayout linearLayout;
        C194442115k c194442115k;
        PopupWindow popupWindow;
        if (this.LLJJJ && (linearLayout = this.LLJLIL) != null && (c194442115k = this.LLJL) != null) {
            if (c194442115k.LIZIZ == null || c194442115k.LIZJ == null) {
                Context context = c194442115k.LIZ;
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(16);
                linearLayout2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zo);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(18));
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.5f))));
                c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
                linearLayout2.setBackground(c384050F3z.LIZ(context));
                linearLayout2.setElevation(C418440Gaw.LIZIZ(4));
                C786410Ut5.R7(linearLayout2, new ACListenerS163S0100000_29(c194442115k, 263));
                TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
                C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
                c194442115k.LIZLLL = tuxIconView;
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                C786410Ut5.R6(tuxTextView, layoutParams);
                tuxTextView.setTuxFont(62);
                tuxTextView.setTextColorRes(R.attr.a1j);
                c194442115k.LJ = tuxTextView;
                linearLayout2.addView(c194442115k.LIZLLL);
                linearLayout2.addView(c194442115k.LJ);
                c194442115k.LIZJ = linearLayout2;
                PopupWindow popupWindow2 = new PopupWindow((View) linearLayout2, -2, C194442115k.LJIIJJI, false);
                popupWindow2.setOutsideTouchable(false);
                popupWindow2.setFocusable(false);
                popupWindow2.setBackgroundDrawable(null);
                c194442115k.LIZIZ = popupWindow2;
            }
            LinearLayout linearLayout3 = c194442115k.LIZJ;
            if (linearLayout3 != null && (popupWindow = c194442115k.LIZIZ) != null) {
                linearLayout3.animate().cancel();
                C786410Ut5.W4(linearLayout3, 1.0f);
                if (c194442115k.LJI != enumC194437115f) {
                    c194442115k.LJI = enumC194437115f;
                    int i = C194438115g.LIZ[enumC194437115f.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            TuxIconView tuxIconView2 = c194442115k.LIZLLL;
                            if (tuxIconView2 != null) {
                                C419910GdJ c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                c419910GdJ.LIZ = R.raw.icon_mic_fill;
                                c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                                tuxIconView2.setTuxIcon(c419910GdJ);
                            }
                            TuxTextView tuxTextView2 = c194442115k.LJ;
                            if (tuxTextView2 != null) {
                                tuxTextView2.setText(c194442115k.LIZ.getString(2131828178));
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        TuxIconView tuxIconView3 = c194442115k.LIZLLL;
                        if (tuxIconView3 != null) {
                            C419910GdJ c419910GdJ2 = new C419910GdJ();
                            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            c419910GdJ2.LIZ = R.raw.icon_pause_fill;
                            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1j);
                            tuxIconView3.setTuxIcon(c419910GdJ2);
                        }
                        TuxTextView tuxTextView3 = c194442115k.LJ;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setText(c194442115k.LIZ.getString(2131828179));
                        }
                    }
                }
                if (popupWindow.isShowing()) {
                    c194442115k.LIZLLL(linearLayout, linearLayout3, popupWindow);
                } else {
                    if (c194442115k.LJIIIIZZ != null || c194442115k.LJIIJ != null) {
                        return;
                    }
                    C786410Ut5.W4(linearLayout3, 0.0f);
                    c194442115k.LIZJ(linearLayout, linearLayout3, popupWindow);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinVoiceRecordUiAbility
    public final void MQ(float f) {
        boolean z;
        float f2;
        Object c098200Yq;
        float interpolation = C1619980sG4.LJFF().getInterpolation(f);
        View view = this.LLLIIII;
        if (view == null) {
            return;
        }
        if (view.getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = -1.0f;
        }
        C786410Ut5.Jc(view, f2 * C418440Gaw.LIZIZ(20) * interpolation);
        if (f >= 1.0f) {
            if (!this.LLJJL) {
                this.LLJJL = true;
                Context context = getContext();
                if (context != null) {
                    try {
                        new C0ZDN(context).LIZ(1);
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("BulletinVoiceRecordAssem: haptic impact heavy failed: ");
                        sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLJJL) {
            this.LLJJL = false;
        }
    }

    public final void Qp(EnumC194441115j enumC194441115j) {
        int i;
        int i2 = C194440115i.LIZJ[enumC194441115j.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    lp();
                    return;
                }
                throw new C1954807lC();
            }
            if (this.LLLIIIIL == null) {
                C0OPX.LJII("VoiceRecordAssem: syncPopup LOCKED but lockPopup==null → setLocked is no-op (race)");
            }
            C194443115l c194443115l = this.LLLIIIIL;
            if (c194443115l == null || c194443115l.LJII) {
                return;
            }
            c194443115l.LJII = true;
            c194443115l.LIZIZ();
            ValueAnimator valueAnimator = c194443115l.LJI;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c194443115l.LJI = null;
            LinearLayout linearLayout = c194443115l.LJFF;
            if (linearLayout == null) {
                c194443115l.LIZ();
                return;
            } else {
                linearLayout.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200L).setInterpolator(C1619980sG4.LJFF()).withEndAction(new ARunnableS124S0100000_24(c194443115l, 144)).start();
                return;
            }
        }
        if (!this.LLJJJ) {
            return;
        }
        View view = this.LLJJJJJIL;
        if (view == null) {
            C0OPX.LJII("VoiceRecordAssem: showLockPopup SKIPPED panelRoot==null");
            return;
        }
        Context context = getContext();
        if (context == null) {
            C0OPX.LJII("VoiceRecordAssem: showLockPopup SKIPPED context==null");
            return;
        }
        if (this.LLLIIIIL == null) {
            this.LLLIIIIL = new C194443115l(context);
        }
        C194443115l c194443115l2 = this.LLLIIIIL;
        if (c194443115l2 == null) {
            return;
        }
        PopupWindow popupWindow = c194443115l2.LIZIZ;
        if (popupWindow != null && popupWindow.isShowing()) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(c194443115l2.LIZ);
        int i3 = C194443115l.LJIIIIZZ;
        int i4 = C194443115l.LJIIL;
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(i3, i4));
        LinearLayout linearLayout2 = new LinearLayout(c194443115l2.LIZ);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        int i5 = C194443115l.LJIIIZ;
        linearLayout2.setPivotX(i5 / 2.0f);
        int i6 = C194443115l.LJIIJJI;
        linearLayout2.setPivotY(i6);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zm);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
        linearLayout2.setBackground(c384050F3z.LIZ(linearLayout2.getContext()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
        layoutParams.gravity = 49;
        C786410Ut5.d6(linearLayout2, layoutParams);
        int iLIZIZ = (i5 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) / 2;
        linearLayout2.setPadding(iLIZIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), iLIZIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        c194443115l2.LJFF = linearLayout2;
        TuxIconView tuxIconView = new TuxIconView(c194443115l2.LIZ, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        layoutParams2.gravity = 1;
        C786410Ut5.M6(tuxIconView, layoutParams2);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZ = R.raw.icon_unlock_fill;
        Integer numValueOf = Integer.valueOf(R.attr.a1k);
        c419910GdJ.LJ = numValueOf;
        tuxIconView.setTuxIcon(c419910GdJ);
        c194443115l2.LIZJ = tuxIconView;
        TuxIconView tuxIconView2 = new TuxIconView(c194443115l2.LIZ, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        layoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        layoutParams3.gravity = 1;
        C786410Ut5.M6(tuxIconView2, layoutParams3);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ2.LIZ = R.raw.icon_chevron_up_thin;
        c419910GdJ2.LJ = numValueOf;
        tuxIconView2.setTuxIcon(c419910GdJ2);
        c194443115l2.LIZLLL = tuxIconView2;
        LinearLayout linearLayout3 = c194443115l2.LJFF;
        if (linearLayout3 != null) {
            linearLayout3.addView(c194443115l2.LIZJ);
        }
        LinearLayout linearLayout4 = c194443115l2.LJFF;
        if (linearLayout4 != null) {
            linearLayout4.addView(c194443115l2.LIZLLL);
        }
        TuxIconView tuxIconView3 = new TuxIconView(c194443115l2.LIZ, null, 0, 6, null);
        int i7 = C194443115l.LJIIJ;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i7, i7);
        layoutParams4.gravity = 81;
        C786410Ut5.M6(tuxIconView3, layoutParams4);
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
        c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
        c419910GdJ3.LIZ = R.raw.icon_microphone;
        c419910GdJ3.LJ = Integer.valueOf(R.attr.ee);
        tuxIconView3.setTuxIcon(c419910GdJ3);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a0d);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(32));
        tuxIconView3.setBackground(c384050F3z2.LIZ(tuxIconView3.getContext()));
        c194443115l2.LJ = tuxIconView3;
        frameLayout.addView(c194443115l2.LJFF);
        frameLayout.addView(c194443115l2.LJ);
        PopupWindow popupWindow2 = new PopupWindow((View) frameLayout, i3, i4, false);
        popupWindow2.setOutsideTouchable(false);
        popupWindow2.setTouchable(false);
        popupWindow2.setFocusable(false);
        c194443115l2.LIZIZ = popupWindow2;
        if (view.getLayoutDirection() == 1) {
            i = 3;
        } else {
            i = 5;
        }
        PopupWindow popupWindow3 = c194443115l2.LIZIZ;
        if (popupWindow3 != null) {
            C786410Ut5.k3(popupWindow3, view, i | 80, C194443115l.LJIILIIL, C194443115l.LJIILJJIL);
        }
        c194443115l2.LIZIZ();
        ValueAnimator valueAnimator2 = c194443115l2.LJI;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        c194443115l2.LJI = null;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, C194443115l.LJIILL);
        valueAnimatorOfFloat.setDuration(700L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJFF());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(c194443115l2, 39));
        c194443115l2.LJI = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public final void hp(EnumC194441115j enumC194441115j) {
        TextView textView;
        int i;
        String strLJJIFFI;
        int i2 = C194440115i.LIZJ[enumC194441115j.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new C1954807lC();
            }
            FrameLayout frameLayout = this.LLJLILLLLZIIL;
            if (frameLayout != null) {
                C12ES.LJIILL(0, frameLayout);
            }
            FrameLayout frameLayout2 = this.LLLFF;
            if (frameLayout2 != null) {
                C0DTR.LIZIZ(frameLayout2);
            }
            Gp(EnumC194437115f.PAUSE);
            View view = this.LLLF;
            if (view != null) {
                C0DTR.LIZIZ(view);
            }
            TuxIconView tuxIconView = this.LLL;
            if (tuxIconView != null) {
                C0DTR.LIZIZ(tuxIconView);
            }
            TuxIconView tuxIconView2 = this.LLJZIJLIL;
            if (tuxIconView2 != null) {
                C12ES.LJIILL(0, tuxIconView2);
            }
            TuxIconView tuxIconView3 = this.LLJZ;
            if (tuxIconView3 != null) {
                C12ES.LJIILL(0, tuxIconView3);
            }
            Ep(12);
            TextView textView2 = this.LLLILZJ;
            if (textView2 != null) {
                C0DTR.LIZIZ(textView2);
            }
            Ap();
            return;
        }
        C194442115k c194442115k = this.LLJL;
        if (c194442115k != null) {
            c194442115k.LIZIZ();
        }
        FrameLayout frameLayout3 = this.LLJLILLLLZIIL;
        if (frameLayout3 != null) {
            C0DTR.LIZIZ(frameLayout3);
        }
        FrameLayout frameLayout4 = this.LLLFF;
        if (frameLayout4 != null) {
            C12ES.LJIILL(0, frameLayout4);
        }
        C0OP4.LIZ.getClass();
        if ((!C0OP4.LIZ().getBoolean("bulletin_voice_hold_guide_tip", false)) && (textView = this.LLLILZJ) != null && !textView.isShown() && (i = (int) (C2183908h3.LIZ().maxRecordingDurationMs / 60000)) >= 1) {
            String quantityString = textView.getResources().getQuantityString(2131755126, i, Integer.valueOf(i));
            if (quantityString != null) {
                String strValueOf = String.valueOf(i);
                if (strValueOf == null) {
                    strValueOf = "";
                }
                strLJJIFFI = u.LJJIFFI(quantityString, "{num}", strValueOf, false);
            } else {
                strLJJIFFI = null;
            }
            textView.setText(strLJJIFFI);
            ip(textView, false);
            C12ES.LJIILL(0, textView);
            C0OP4.LIZ().storeBoolean("bulletin_voice_hold_guide_tip", true);
        }
        Ap();
    }

    public final String mp(long j) {
        long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long j3 = 60;
        return C786410Ut5.j4("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf(j2 % j3)}, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.08oK] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.08oL] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        super.onViewCreated(view);
        this.LLLIIIL = new InterfaceC2229408oO() { // from class: X.08oK
            public final EnumC2229208oM LIZ = EnumC2229208oM.VOICE_RECORD;

            @Override // X.InterfaceC2229408oO
            public final void LIZIZ() {
                if (this.LIZIZ.tp().LLILZLL.getValue() == EnumC194439115h.RECORDING) {
                    this.LIZIZ.tp().BQ2(EnumC2228908oJ.LEAVE);
                }
            }

            @Override // X.InterfaceC2229408oO
            public final EnumC2229208oM LIZ() {
                return this.LIZ;
            }
        };
        C2229008oK c2229008oK = this.LLLIIIL;
        if (c2229008oK != null) {
            sp().LIZ(c2229008oK);
        }
        this.LLLIIL = new InterfaceC2229408oO() { // from class: X.08oL
            public final EnumC2229208oM LIZ = EnumC2229208oM.VOICE_PREVIEW;

            @Override // X.InterfaceC2229408oO
            public final void LIZIZ() {
                this.LIZIZ.tp().LLJJI.LIZLLL();
            }

            @Override // X.InterfaceC2229408oO
            public final EnumC2229208oM LIZ() {
                return this.LIZ;
            }
        };
        C2229108oL c2229108oL = this.LLLIIL;
        if (c2229108oL != null) {
            sp().LIZ(c2229108oL);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2228308oD(this, null), 3);
        this.LLJJJJJIL = LJJIJL().findViewById(R.id.voice_record_panel_root);
        this.LLJLIL = (LinearLayout) LJJIJL().findViewById(R.id.voice_record_bottom_area);
        this.LLJJLIIIJLLLLLLLZ = (TextView) LJJIJL().findViewById(R.id.voice_record_countdown_text);
        this.LLLILZJ = (TextView) LJJIJL().findViewById(R.id.voice_record_hold_guide_text);
        this.LLJLILLLLZIIL = (FrameLayout) LJJIJL().findViewById(R.id.voice_record_card);
        this.LLJLL = (C194434115c) LJJIJL().findViewById(R.id.voice_record_waveform);
        this.LLJLLIL = (TextView) LJJIJL().findViewById(R.id.voice_record_duration);
        this.LLJZ = (TuxIconView) LJJIJL().findViewById(R.id.voice_record_delete_btn);
        this.LLJZIJLIL = (TuxIconView) LJJIJL().findViewById(R.id.voice_record_send_btn);
        this.LLL = (TuxIconView) LJJIJL().findViewById(R.id.voice_record_play_btn);
        this.LLLF = LJJIJL().findViewById(R.id.voice_record_red_dot);
        this.LLLFF = (FrameLayout) LJJIJL().findViewById(R.id.voice_record_hold_card);
        this.LLLFFI = (TuxIconView) LJJIJL().findViewById(R.id.voice_record_hold_delete_btn);
        this.LLLFZ = LJJIJL().findViewById(R.id.voice_record_hold_red_dot);
        this.LLLI = (TextView) LJJIJL().findViewById(R.id.voice_record_hold_duration);
        this.LLLII = (TextView) LJJIJL().findViewById(R.id.voice_record_slide_hint);
        this.LLLIIII = LJJIJL().findViewById(R.id.voice_record_slide_hint_container);
        TextView textView = this.LLLII;
        if (textView != null) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(2131828180);
            } else {
                string = null;
            }
            textView.setText(string);
        }
        Context context2 = getContext();
        if (context2 != null) {
            FrameLayout frameLayout = this.LLJLILLLLZIIL;
            if (frameLayout != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zo);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
                frameLayout.setBackground(c384050F3z.LIZ(context2));
            }
            FrameLayout frameLayout2 = this.LLLFF;
            if (frameLayout2 != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zm);
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
                frameLayout2.setBackground(c384050F3z2.LIZ(context2));
            }
            Fp(this.LLJZ);
            Fp(this.LLLFFI);
            TuxIconView tuxIconView = this.LLJZIJLIL;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ.LIZ = R.raw.icon_arrow_up_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                tuxIconView.setTuxIcon(c419910GdJ);
                C384050F3z c384050F3z3 = new C384050F3z();
                c384050F3z3.LIZIZ = Integer.valueOf(R.attr.ob);
                c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(18));
                tuxIconView.setBackground(c384050F3z3.LIZ(context2));
                C786410Ut5.a9(tuxIconView, new ACListenerS163S0100000_29(this, 202));
            }
            TuxIconView tuxIconView2 = this.LLL;
            if (tuxIconView2 != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ2.LIZ = R.raw.icon_play_fill;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
                tuxIconView2.setTuxIcon(c419910GdJ2);
                C786410Ut5.a9(tuxIconView2, new ACListenerS138S0100000_3(this, 17));
            }
            View view2 = this.LLLF;
            if (view2 != null) {
                C384050F3z c384050F3z4 = new C384050F3z();
                c384050F3z4.LIZIZ = Integer.valueOf(R.attr.zs);
                c384050F3z4.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                view2.setBackground(c384050F3z4.LIZ(context2));
            }
            View view3 = this.LLLFZ;
            if (view3 != null) {
                C384050F3z c384050F3z5 = new C384050F3z();
                c384050F3z5.LIZIZ = Integer.valueOf(R.attr.zs);
                c384050F3z5.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                view3.setBackground(c384050F3z5.LIZ(context2));
            }
            C194442115k c194442115k = new C194442115k(context2);
            AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3(this, 98);
            c194442115k.LJFF = awS547S0100000_3;
            LinearLayout linearLayout = c194442115k.LIZJ;
            if (linearLayout != null) {
                C786410Ut5.R7(linearLayout, new ACListenerS163S0100000_29(awS547S0100000_3, 264));
            }
            this.LLJL = c194442115k;
            C194434115c c194434115c = this.LLJLL;
            if (c194434115c != null) {
                c194434115c.setOnSeekListener(new AwS582S0100000_3(this, 90));
            }
            C194434115c c194434115c2 = this.LLJLL;
            if (c194434115c2 != null) {
                c194434115c2.setOnSeekFinishedListener(new AwS547S0100000_3(this, 99));
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OMm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C618190OMn) obj).LLILLL;
            }
        }, this, null, new AwS608S0100000_29(this, 593), new AwS573S0100000_29(this, 848), new AwS608S0100000_29(this, 594), 4, null);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2228208oC(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2227908o9(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2228008oA(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2228108oB(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2227408o4(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2227708o7(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2227508o5(this, null), 3);
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.HK2(this);
        }
        BulletinVoiceRecordViewModel bulletinVoiceRecordViewModelTp = tp();
        AwS582S0100000_3 awS582S0100000_3 = new AwS582S0100000_3(this, 42);
        if (bulletinVoiceRecordViewModelTp.LLILZ) {
            awS582S0100000_3.invoke(Boolean.FALSE);
        } else {
            bulletinVoiceRecordViewModelTp.LLILZ = true;
            if (bulletinVoiceRecordViewModelTp.xQ2().length() == 0) {
                awS582S0100000_3.invoke(Boolean.FALSE);
            } else {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bulletinVoiceRecordViewModelTp), C0PEM.LIZJ, null, new C2151008bk(bulletinVoiceRecordViewModelTp, awS582S0100000_3, null), 2);
            }
        }
        C0OPX.LJII("VoiceRecordAssem: onViewCreated END");
    }

    public final void yp(boolean z) {
        if (this.LLJJJ == z) {
            return;
        }
        this.LLJJJ = z;
        if (z) {
            if (!kp()) {
                if (tp().LLILZLL.getValue() == EnumC194439115h.RECORDING) {
                    Qp((EnumC194441115j) tp().LLIZLLLIL.getValue());
                    return;
                }
                return;
            }
            int i = C194440115i.LIZIZ[((EnumC194439115h) tp().LLILZLL.getValue()).ordinal()];
            if (i != 3) {
                if (i != 4 && i != 5) {
                    return;
                }
                Gp(EnumC194437115f.CONTINUE);
                return;
            }
            Gp(EnumC194437115f.PAUSE);
            Qp((EnumC194441115j) tp().LLIZLLLIL.getValue());
            return;
        }
        C194442115k c194442115k = this.LLJL;
        if (c194442115k != null) {
            c194442115k.LIZIZ();
        }
        lp();
    }

    public static void ip(TextView textView, boolean z) {
        int iLIZIZ;
        if (textView == null) {
            return;
        }
        if (z) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        }
        if (textView.getPaddingBottom() == iLIZIZ) {
            return;
        }
        textView.setPaddingRelative(textView.getPaddingStart(), textView.getPaddingTop(), textView.getPaddingEnd(), iLIZIZ);
    }

    @Override // X.InterfaceC623330Ocd
    public final List Gl(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    public final void Jp(View view, float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.LLJJJJLIIL;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = view.animate().alpha(f).setDuration(300L).setInterpolator(new C12DM()).withEndAction(new ARunnableS129S0100000_29(this, 53));
        viewPropertyAnimatorWithEndAction.start();
        this.LLJJJJLIIL = viewPropertyAnimatorWithEndAction;
    }

    @Override // X.InterfaceC623330Ocd
    public final List eb(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC623330Ocd
    public final void D4(C620650OVz c620650OVz, EnumC617880OLi enumC617880OLi, InterfaceC617820OLc interfaceC617820OLc) {
        int i;
        View view = this.LLJJJJJIL;
        if (view == null) {
            return;
        }
        if (c620650OVz.LIZIZ()) {
            int i2 = C194440115i.LIZ[enumC617880OLi.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new C1954807lC();
                    }
                    return;
                } else {
                    Jp(view, 1.0f);
                    return;
                }
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
            }
            C786410Ut5.T4(view, 0.0f);
            C12ES.LJIILL(0, view);
            return;
        }
        if (c620650OVz.LIZLLL() && (i = C194440115i.LIZ[enumC617880OLi.ordinal()]) != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C1954807lC();
                }
            } else {
                Jp(view, 0.0f);
                interfaceC617820OLc.ig(view, 300L, true, false);
            }
        }
    }
}
