package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting;

import X.C013C;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C0IJT;
import X.C0JKJ;
import X.C0JU2;
import X.C0JU5;
import X.C0JU6;
import X.C0JY0;
import X.C0JYQ;
import X.C0JYR;
import X.C0JZ0;
import X.C0JZ1;
import X.C0JZ3;
import X.C0JZ4;
import X.C0JZ5;
import X.C0JZ6;
import X.C0JZ7;
import X.C0JZ8;
import X.C0JZ9;
import X.C0JZA;
import X.C0JZB;
import X.C0JZC;
import X.C0JZD;
import X.C0JZE;
import X.C0K70;
import X.C0KPJ;
import X.C0PEM;
import X.C0ZP4;
import X.C11G4;
import X.C11GO;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C1390410mHn;
import X.C13LE;
import X.C1622206Wu;
import X.C1697810uHb;
import X.C16F5;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C20743716Ff;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C473410IhP;
import X.C473420IhQ;
import X.C474500IjA;
import X.C490430JLd;
import X.C493770JXz;
import X.C493910JYn;
import X.C493930JYp;
import X.C493940JYq;
import X.C493950JYr;
import X.C493960JYs;
import X.C493970JYt;
import X.C494110JZh;
import X.C494220JZs;
import X.C494680Jac;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C516680KOc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC499450JiJ;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.comp.api.subscription.setting.SubVipSubOnlyLiveSetting;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLivePreviewSettingDialogNew;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingDialogNew;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.statistic.SubOnlyStatisticsEnhanceViewModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.SubOnlyLiveVipSettingSheet;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingVM;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyTrialLiveSwitchChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubOnlyAllowMusicSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.GetSubOnlyLiveStatResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubOnlyLiveSettingDialogNew extends LiveDialogFragment implements InterfaceC724530SbT {
    public static final C493910JYn LLJLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public static boolean LLJLLL = false;
    public static final List<Function1<Boolean, Unit>> LLJZ;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyHELIOSogO2s8LD04O2s/PC08Jik1JSYlLWs/LDsnISsrZxwmKgoiJTYfITMpGionPCwiLgs6KSkjLgE2Pw==";
    public LiveIconView LL;
    public ViewGroup LLILLJJLI;
    public ViewGroup LLILLL;
    public ViewGroup LLILZ;
    public C20743716Ff LLILZIL;
    public C197039127h LLILZLL;
    public C16F5 LLIZ;
    public C127K LLIZLLLIL;
    public ViewGroup LLJ;
    public C127K LLJI;
    public ViewGroup LLJIJIL;
    public C1390410mHn LLJILJIL;
    public ViewGroup LLJILJILJ;
    public ConstraintLayout LLJILLL;
    public C16F5 LLJJ;
    public C16F5 LLJJI;
    public C16F5 LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public C127K LLJJIJIL;
    public final C01GW LLJJJ;
    public Room LLJJJIL;
    public String LLJJJJ;
    public LiveSubOnlyConfig LLJJJJJIL;
    public String LLJJJJLIIL;
    public boolean LLJJL;
    public C494220JZs LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public final C01GW LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubOnlyLiveSettingDialogNew.class, "subOnlyLiveSettingVM", "getSubOnlyLiveSettingVM()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subonlylive/setting/vm/SubOnlyLiveSettingVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(SubOnlyLiveSettingDialogNew.class, "subOnlyLiveSettingDialogVM", "getSubOnlyLiveSettingDialogVM()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subonlylive/setting/vm/SubOnlyLiveSettingDialogVM;", 0)};
        LLJLL = new C493910JYn();
        LLJZ = Collections.synchronizedList(C1697810uHb.LJIILJJIL(new C0JZ0()));
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public SubOnlyLiveSettingDialogNew() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubOnlyLiveSettingVM.class);
        C493960JYs c493960JYs = new C493960JYs(c19719912DlLIZ);
        C0JZA c0jza = new C0JZA();
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c493960JYs, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C0JZ4(this), c0jza, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c493960JYs, new C0JZ5(this), c0jza, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c493960JYs, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C0JZ6(this), c0jza, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJI = assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq2 = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SubOnlyLiveSettingDialogVM.class);
        C493970JYt c493970JYt = new C493970JYt(c19719912DlLIZ2);
        C0JZB c0jzb = new C0JZB();
        if (Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c493970JYt, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new C0JZ7(this), c0jzb, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq2 instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq2, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c493970JYt, new C0JZ8(this), c0jzb, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq2)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c493970JYt, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C0JZ3(this), c0jzb, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLJJIJIIJIL = assemVMLazy2;
        this.LLJJJ = C452501pT.LIZIZ(new C493950JYr(this));
        this.LLJJJJ = "";
        this.LLJJJJLIIL = "";
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new C0JZ1());
    }

    public final SubOnlyLiveSettingDialogVM MR() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (SubOnlyLiveSettingDialogVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gb5);
        c500980Jkm.LIZJ = R.style.ahk;
        boolean z = this.LLJJL;
        c500980Jkm.LJI = z ? 0.6f : 0.0f;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = z ? 73 : 60;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        if (Intrinsics.LJFF(this.LLJJJJLIIL, "jsbOpen")) {
            return super.onBackPressed();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            C0JKJ.LIZ(dataChannel, this.LLJJJJ);
        }
        return super.onBackPressed();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((Handler) this.LLJLILLLLZIIL.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJL) {
            this.LLJL = false;
            C473410IhP.LIZJ(new Runnable() { // from class: X.0JYm
                public final void LIZ() {
                    if (SubVipSubOnlyLiveSetting.INSTANCE.isEnable()) {
                        SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVMMR = this.LL.MR();
                        subOnlyLiveSettingDialogVMMR.withState(new C494070JZd(subOnlyLiveSettingDialogVMMR, this.LL.getActivity()));
                        return;
                    }
                    SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew = this.LL;
                    C494220JZs c494220JZs = subOnlyLiveSettingDialogNew.LLJJLIIIJLLLLLLLZ;
                    if (c494220JZs == null) {
                        c494220JZs = null;
                    }
                    Context context = subOnlyLiveSettingDialogNew.getContext();
                    SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew2 = this.LL;
                    c494220JZs.LIZJ(context, subOnlyLiveSettingDialogNew2.LLILZIL, subOnlyLiveSettingDialogNew2.LLIZLLLIL, subOnlyLiveSettingDialogNew2.LLJI);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SubOnlyLiveSettingDialogNew@e757.onResume$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SubOnlyLiveSettingDialogNew@e757.onResume$1");
                }
            }, 200L);
        }
    }

    public final void NR(View view) {
        int i;
        C127M accessory;
        C127M accessory2;
        User owner;
        C127M accessory3;
        C127M accessory4;
        C127M accessory5;
        String str;
        C127M accessory6;
        boolean z;
        C127K c127k;
        C0K70.LIZLLL("SubOnlyLiveSettingDialogNew", getContext());
        int i2 = 0;
        if (Intrinsics.LJFF(this.LLJJJJ, "anchor_close_live_popup")) {
            C500260Jjc.LJLJLJ(this.LL, false);
        } else {
            LiveIconView liveIconView = this.LL;
            if (liveIconView != null) {
                C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0JZ2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.LL.dismiss();
                        this.LL.onBackPressed();
                    }
                });
            }
        }
        ViewGroup viewGroup = this.LLILLJJLI;
        if (viewGroup != null) {
            C500260Jjc.LLFFF(viewGroup);
        }
        SubVipSubOnlyLiveSetting subVipSubOnlyLiveSetting = SubVipSubOnlyLiveSetting.INSTANCE;
        Long lValueOf = null;
        if (subVipSubOnlyLiveSetting.isEnable()) {
            C500260Jjc.LJLJLJ(this.LLILZ, false);
            C500260Jjc.LJLJLJ(this.LLILZLL, true);
            C500260Jjc.LJLJLJ(this.LLIZ, true);
            C500260Jjc.LJLJLJ(this.LLJJIJIL, true);
            C127K c127k2 = this.LLIZLLLIL;
            if (c127k2 != null) {
                C786410Ut5.LJLLLLLL(0, c127k2);
            }
            if (LiveSubOnlyAllowMusicSetting.getEnableAllowMusic() && (c127k = this.LLJI) != null) {
                C500260Jjc.LLFFF(c127k);
            }
            C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.01ij
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C410401ig) obj).LL);
                }
            }, C736820SvI.LIZLLL(), new C0JU5(this), 4);
            SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVMMR = MR();
            LiveSubOnlyConfig liveSubOnlyConfig = this.LLJJJJJIL;
            C013C c013c = new C013C();
            if (C494680Jac.LJIILJJIL(subOnlyLiveSettingDialogVMMR.vQ2().LLILLJJLI)) {
                c013c.element = false;
            } else {
                if (liveSubOnlyConfig != null && liveSubOnlyConfig.disabled) {
                    z = true;
                } else {
                    z = false;
                }
                c013c.element = !z;
            }
            subOnlyLiveSettingDialogVMMR.setState(new C0JZE(c013c, liveSubOnlyConfig));
            C197039127h c197039127h = this.LLILZLL;
            if (c197039127h != null) {
                c197039127h.setSupportClickWhenDisable(true);
            }
            if (this.LLJJL) {
                C197039127h c197039127h2 = this.LLILZLL;
                if (c197039127h2 != null) {
                    c197039127h2.setText(C497740JfY.LJIJI(2131856610));
                }
            } else {
                C197039127h c197039127h3 = this.LLILZLL;
                if (c197039127h3 != null) {
                    c197039127h3.setText(C497740JfY.LJIJI(2131857035));
                }
            }
            C197039127h c197039127h4 = this.LLILZLL;
            if (c197039127h4 != null) {
                C786410Ut5.U8(c197039127h4, new View.OnClickListener() { // from class: X.0JYv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVMMR2 = this.LL.MR();
                        subOnlyLiveSettingDialogVMMR2.withState(new C494070JZd(subOnlyLiveSettingDialogVMMR2, this.LL.getActivity()));
                    }
                });
            }
        } else {
            C494220JZs c494220JZs = this.LLJJLIIIJLLLLLLLZ;
            if (c494220JZs == null) {
                c494220JZs = null;
            }
            C19EG activity = getActivity();
            C20743716Ff c20743716Ff = this.LLILZIL;
            LiveSubOnlyConfig liveSubOnlyConfig2 = this.LLJJJJJIL;
            if (C494680Jac.LJIILJJIL(c494220JZs.LIZIZ)) {
                if (c20743716Ff != null) {
                    c20743716Ff.setChecked(true);
                }
                c494220JZs.LIZIZ(c20743716Ff, false, new C493940JYq(c494220JZs));
            } else if (liveSubOnlyConfig2 != null && liveSubOnlyConfig2.disabled) {
                c494220JZs.LIZIZ(c20743716Ff, false, new C494110JZh(liveSubOnlyConfig2, activity, c494220JZs));
            } else {
                c494220JZs.LIZIZ(c20743716Ff, true, null);
            }
            final C494220JZs c494220JZs2 = this.LLJJLIIIJLLLLLLLZ;
            if (c494220JZs2 == null) {
                c494220JZs2 = null;
            }
            final Context context = getContext();
            ViewGroup viewGroup2 = this.LLILLL;
            c494220JZs2.getClass();
            if (viewGroup2 != null) {
                C786410Ut5.K7(viewGroup2, new View.OnClickListener() { // from class: X.0JYl
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String anchorSubOnlyLiveFaqPopup;
                        if (((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(c494220JZs2.LIZJ)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("aweme://roma_redirect/?spark_page=fan_club_anchor_faq_fullscreen&roma_group_key=spark_page_fan_club_anchor_faq_fullscreen&roma_page_key=p&show_entrance=");
                            sbLIZ.append(c494220JZs2.LIZ);
                            anchorSubOnlyLiveFaqPopup = C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            anchorSubOnlyLiveFaqPopup = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchorSubOnlyLiveFaqPopup();
                        }
                        C0K8F c0k8f = C0K8F.LIZ;
                        Context context2 = context;
                        if (anchorSubOnlyLiveFaqPopup == null) {
                            anchorSubOnlyLiveFaqPopup = "";
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("height", String.valueOf((int) (((double) C497740JfY.LJJI(C497740JfY.LJIILLIIL())) * 0.6d)));
                        linkedHashMap.put("transition_animation", "bottom");
                        c0k8f.getClass();
                        C0K8F.LJII(context2, anchorSubOnlyLiveFaqPopup, linkedHashMap);
                        C494220JZs c494220JZs3 = c494220JZs2;
                        c494220JZs3.getClass();
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscriber_only_live_faq_click");
                        c474500IjALIZ.LJIJJLI(c494220JZs3.LIZJ);
                        c474500IjALIZ.LJJII(c494220JZs3.LIZ, "click_position");
                        c474500IjALIZ.LIZ();
                    }
                });
            }
            C500260Jjc.LJLJLJ(this.LLILZLL, false);
            C500260Jjc.LJLJLJ(this.LLIZ, false);
            final C494220JZs c494220JZs3 = this.LLJJLIIIJLLLLLLLZ;
            if (c494220JZs3 == null) {
                c494220JZs3 = null;
            }
            final Context context2 = getContext();
            final C20743716Ff c20743716Ff2 = this.LLILZIL;
            final C127K c127k3 = this.LLIZLLLIL;
            final C127K c127k4 = this.LLJI;
            c494220JZs3.getClass();
            if (c20743716Ff2 != null) {
                c20743716Ff2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0JYx
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            c494220JZs3.LIZJ(context2, c20743716Ff2, c127k3, c127k4);
                        }
                        return true;
                    }
                });
            }
        }
        if (subVipSubOnlyLiveSetting.isEnable()) {
            C127K c127k5 = this.LLIZLLLIL;
            if (c127k5 != null) {
                C786410Ut5.LJLLLLLL(0, c127k5);
            }
        } else {
            C127K c127k6 = this.LLIZLLLIL;
            if (c127k6 != null) {
                if (C494680Jac.LJIILJJIL(this.LLJJJIL)) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, c127k6);
            }
        }
        C127K c127k7 = this.LLIZLLLIL;
        if (c127k7 != null) {
            c127k7.setTitle(C497740JfY.LJIJI(2131844228));
        }
        C127K c127k8 = this.LLIZLLLIL;
        if (c127k8 != null) {
            accessory = c127k8.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof C11G4) {
            C127K c127k9 = this.LLIZLLLIL;
            if (c127k9 != null) {
                accessory6 = c127k9.getAccessory();
            } else {
                accessory6 = null;
            }
            C11G4 c11g4 = (C11G4) accessory6;
            if (C494680Jac.LIZ(this.LLJJJIL)) {
                C127K c127k10 = this.LLIZLLLIL;
                if (c127k10 != null) {
                    c127k10.setCellEnabled(false);
                }
                c11g4.LJIILJJIL(C497740JfY.LJIJI(2131844230));
            } else {
                c11g4.LJIILJJIL(C497740JfY.LJIJI(2131844231));
            }
            c11g4.LJIILLIIL(true);
            c11g4.LJIILL(new View.OnClickListener() { // from class: X.0Ja4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FragmentManager fragmentManager;
                    C494360Ja6 c494360Ja6 = SubOnlyLivePreviewSettingDialogNew.LLIZLLLIL;
                    SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew = this.LL;
                    DataChannel dataChannel = subOnlyLiveSettingDialogNew.dataChannel;
                    String str2 = subOnlyLiveSettingDialogNew.LLJJJJ;
                    c494360Ja6.getClass();
                    if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                        SubOnlyLivePreviewSettingDialogNew subOnlyLivePreviewSettingDialogNew = new SubOnlyLivePreviewSettingDialogNew();
                        subOnlyLivePreviewSettingDialogNew.LL = str2;
                        subOnlyLivePreviewSettingDialogNew.LLILLJJLI = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(dataChannel);
                        subOnlyLivePreviewSettingDialogNew.show(fragmentManager, SubOnlyLivePreviewSettingDialogNew.class.getName());
                    }
                }
            });
            c11g4.LJI(new C0JZ9(this));
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, PreviewSubOnlyTrialLiveSwitchChannel.class, new C493930JYp(this));
        C516680KOc.LIZIZ((C16F5) view.findViewById(R.id.wfd), this.LLJJL);
        if (LiveSubOnlyAllowMusicSetting.getEnableAllowMusic() && !Intrinsics.LJFF(this.LLJJJJ, "anchor_close_live_popup") && !Intrinsics.LJFF(C0KPJ.We.LIZ(), Boolean.TRUE)) {
            if (this.LLJJL) {
                str = "super_fan";
            } else {
                str = "other";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LiveSubscriptionAnchorUrlSetting.musicIntro());
            sbLIZ.append("&anchor_id=");
            sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
            sbLIZ.append("&show_entrance=");
            sbLIZ.append(this.LLJJJJ);
            sbLIZ.append("&enter_from=");
            sbLIZ.append(str);
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C786410Ut5.LJJZZIII((Handler) this.LLJLILLLLZIIL.getValue(), new Runnable() { // from class: X.0Ij0
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SubOnlyLiveSettingDialogNew@e757.showAllowMusicHintDialog$1");
                    try {
                        try {
                            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LL.getContext(), strLIZIZ);
                            C0KPJ.We.LIZJ(Boolean.TRUE);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SubOnlyLiveSettingDialogNew@e757.showAllowMusicHintDialog$1");
                }
            });
        }
        if (LiveSubOnlyAllowMusicSetting.getEnableAllowMusic()) {
            ViewGroup viewGroup3 = this.LLJIJIL;
            if (viewGroup3 != null) {
                C500260Jjc.LJIILIIL(viewGroup3);
            }
        } else {
            ViewGroup viewGroup4 = this.LLJIJIL;
            if (viewGroup4 != null) {
                C500260Jjc.LLFFF(viewGroup4);
            }
        }
        if (C494680Jac.LJIILJJIL(this.LLJJJIL) && LiveSubOnlyAllowMusicSetting.getEnableAllowMusic()) {
            C127K c127k11 = this.LLJI;
            if (c127k11 != null) {
                C500260Jjc.LLFFF(c127k11);
            }
        } else if (subVipSubOnlyLiveSetting.isEnable() && LiveSubOnlyAllowMusicSetting.getEnableAllowMusic()) {
            C127K c127k12 = this.LLJI;
            if (c127k12 != null) {
                C500260Jjc.LLFFF(c127k12);
            }
        } else {
            C127K c127k13 = this.LLJI;
            if (c127k13 != null) {
                C500260Jjc.LJIILIIL(c127k13);
            }
        }
        C127K c127k14 = this.LLJI;
        if (c127k14 != null) {
            accessory2 = c127k14.getAccessory();
        } else {
            accessory2 = null;
        }
        if (accessory2 instanceof C127A) {
            C127K c127k15 = this.LLJI;
            if (c127k15 != null) {
                accessory5 = c127k15.getAccessory();
            } else {
                accessory5 = null;
            }
            ((C11GO) accessory5).LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.0JYw
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVMMR2 = this.LL.MR();
                    subOnlyLiveSettingDialogVMMR2.withState(new C0JZF(subOnlyLiveSettingDialogVMMR2, compoundButton.getContext(), z2));
                }
            });
        }
        C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.01ih
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C410401ig) obj).LLILLL;
            }
        }, null, new C0JU2(this), 6);
        C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.01ii
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C410401ig) obj).LLILLJJLI);
            }
        }, C736820SvI.LIZLLL(), new C0JU6(this), 4);
        SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVMMR2 = MR();
        Room room = subOnlyLiveSettingDialogVMMR2.vQ2().LLILLJJLI;
        if (room != null && room.liveSubOnlyUseMusic == 1) {
            subOnlyLiveSettingDialogVMMR2.setState(new C0JZC());
        } else {
            subOnlyLiveSettingDialogVMMR2.setState(new C0JZD());
        }
        if (!this.LLJJL && subVipSubOnlyLiveSetting.isEnable()) {
            this.LLJJIJIL = (C127K) view.findViewById(R.id.wfu);
            ViewGroup viewGroup5 = (ViewGroup) view.findViewById(R.id.vip_sub_only_live_paragraph);
            this.LLJILJILJ = viewGroup5;
            C500260Jjc.LJLJLJ(viewGroup5, true);
            C500260Jjc.LJLJLJ(this.LLJJIJIL, true);
            C127K c127k16 = this.LLJJIJIL;
            if (c127k16 != null) {
                c127k16.setTitle(C497740JfY.LJIJI(2131857043));
            }
            C127K c127k17 = this.LLJJIJIL;
            if (c127k17 != null) {
                accessory3 = c127k17.getAccessory();
            } else {
                accessory3 = null;
            }
            if (accessory3 instanceof C11G4) {
                C127K c127k18 = this.LLJJIJIL;
                if (c127k18 != null) {
                    accessory4 = c127k18.getAccessory();
                } else {
                    accessory4 = null;
                }
                C11G4 c11g42 = (C11G4) accessory4;
                Map<String, String> mapLIZ = C0KPJ.df.LIZ();
                if (mapLIZ == null) {
                    mapLIZ = new HashMap<>();
                }
                c11g42.LJIILJJIL(C0JYR.LIZ(mapLIZ).LIZ);
                c11g42.LJIILLIIL(true);
                c11g42.LJIILL(new View.OnClickListener() { // from class: X.0JLc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Boolean boolValueOf;
                        if (!C494680Jac.LIZJ()) {
                            C197039127h c197039127h5 = this.LL.LLILZLL;
                            if (c197039127h5 != null) {
                                boolValueOf = Boolean.valueOf(c197039127h5.isEnabled());
                            } else {
                                boolValueOf = null;
                            }
                            if (!C500260Jjc.LJJIFFI(boolValueOf)) {
                                FragmentManager parentFragmentManager = this.LL.getParentFragmentManager();
                                Bundle bundle = new Bundle();
                                SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew = this.LL;
                                bundle.putInt("is_close_back_icon", 1);
                                C786410Ut5.LJJJI("show_entrance", subOnlyLiveSettingDialogNew.LLJJJJ, bundle);
                                C19322110iZ.LIZLLL(parentFragmentManager, SubOnlyLiveVipSettingSheet.class, "SubOnlyLiveVipSettingSheet", null, bundle);
                                return;
                            }
                        }
                        if (this.LL.LLJJL) {
                            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131856635));
                        } else {
                            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131857037));
                        }
                    }
                });
                c11g42.LJI(new C490430JLd(this));
            }
            AssemVMLazy assemVMLazy = this.LLJJIJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0JYK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0JYI) obj).LLILLJJLI;
                }
            }, null, new C493770JXz(this), 6);
            C736680Sv4.LJIIIIZZ(this, this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0JYL
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0JYI) obj).LLILLJJLI;
                }
            }, null, new C0JY0(this), 6);
            SubOnlyLiveSettingVM subOnlyLiveSettingVM = (SubOnlyLiveSettingVM) this.LLJJIJI.getValue();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(subOnlyLiveSettingVM), C0PEM.LIZJ, null, new C0JYQ(subOnlyLiveSettingVM, null), 2);
        }
        C494220JZs c494220JZs4 = this.LLJJLIIIJLLLLLLLZ;
        if (c494220JZs4 == null) {
            c494220JZs4 = null;
        }
        c494220JZs4.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_management_page_show");
        c474500IjALIZ.LJJII(c494220JZs4.LIZ, "show_entrance");
        Room room2 = c494220JZs4.LIZIZ;
        if (room2 != null) {
            lValueOf = Long.valueOf(room2.getOwnerUserId());
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        Room room3 = c494220JZs4.LIZIZ;
        if (room3 != null && (owner = room3.getOwner()) != null && owner.isAnchorHasSubQualification()) {
            i2 = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "is_opt_in");
        c474500IjALIZ.LJJII("1", "is_in_live");
        Room room4 = c494220JZs4.LIZIZ;
        if (room4 != null) {
            c474500IjALIZ.LJJII(C473420IhQ.LIZ(Integer.valueOf((int) room4.visibleScopeType)), "distribution_type");
        }
        c474500IjALIZ.LIZ();
        this.LLJL = Intrinsics.LJFF(this.LLJJJJ, "anchor_close_live_popup");
        ((SubOnlyStatisticsEnhanceViewModel) this.LLJJJ.getValue()).xQ2();
        ((SubOnlyStatisticsEnhanceViewModel) this.LLJJJ.getValue()).LLILLL.observe(this, new Observer() { // from class: X.0JYF
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GetSubOnlyLiveStatResponse.GetSubOnlyLiveStatData getSubOnlyLiveStatData = (GetSubOnlyLiveStatResponse.GetSubOnlyLiveStatData) obj;
                if (getSubOnlyLiveStatData != null) {
                    if (!C500260Jjc.LJJJJIZL(this.LL.LLJILLL)) {
                        SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew = this.LL;
                        C500260Jjc.LLFFF(subOnlyLiveSettingDialogNew.LLJILLL);
                        C500260Jjc.LLFFF(subOnlyLiveSettingDialogNew.LLJJ);
                        C500260Jjc.LLFFF(subOnlyLiveSettingDialogNew.LLJJI);
                        SpannableString spannableStringLIZIZ = C494780Jam.LIZIZ(subOnlyLiveSettingDialogNew.getContext(), getSubOnlyLiveStatData, subOnlyLiveSettingDialogNew.LLJJL);
                        C16F5 c16f5 = subOnlyLiveSettingDialogNew.LLJJ;
                        if (c16f5 != null) {
                            c16f5.setText(spannableStringLIZIZ);
                        }
                        SpannableString spannableStringLIZ = C494780Jam.LIZ(getSubOnlyLiveStatData, subOnlyLiveSettingDialogNew.LLJJL);
                        if (spannableStringLIZ != null) {
                            C16F5 c16f52 = subOnlyLiveSettingDialogNew.LLJJI;
                            if (c16f52 != null) {
                                c16f52.setText(spannableStringLIZ);
                            }
                        } else {
                            C500260Jjc.LJIILIIL(subOnlyLiveSettingDialogNew.LLJJI);
                        }
                    }
                    SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew2 = this.LL;
                    Object value = subOnlyLiveSettingDialogNew2.LLJJJ.getValue();
                    String str2 = subOnlyLiveSettingDialogNew2.LLJJJJ;
                    String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                    value.getClass();
                    SubOnlyStatisticsEnhanceViewModel.wQ2(str2, strValueOf, getSubOnlyLiveStatData);
                }
            }
        });
        C0K70.LJ("SubOnlyLiveSettingDialogNew", requireContext(), EnumC499450JiJ.GENERAL);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        context.setTheme(R.style.my);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Room room;
        super.onCreate(bundle);
        C0K70.LJFF(requireContext(), "SubOnlyLiveSettingDialogNew", this.LLJJJJ, "sub_only_live_inroom");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLJJJIL = room;
        this.LLJJLIIIJLLLLLLLZ = new C494220JZs(this.LLJJJIL, this.dataChannel, this.LLJJJJ);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Iterator<Function1<Boolean, Unit>> it2 = LLJZ.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Boolean.FALSE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01e2 A[PHI: r2
      0x01e2: PHI (r2v6 java.lang.String) = (r2v2 java.lang.String), (r2v7 java.lang.String) binds: [B:56:0x01b2, B:54:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(final android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingDialogNew.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
