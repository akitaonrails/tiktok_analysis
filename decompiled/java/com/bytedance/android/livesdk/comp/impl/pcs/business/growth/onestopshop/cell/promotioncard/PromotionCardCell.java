package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell.promotioncard;

import X.AbstractC1820610xTf;
import X.AbstractC20627515nd;
import X.AbstractC20628015ni;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C0IJT;
import X.C0KPJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1324610kZf;
import X.C13LE;
import X.C1428300nGu;
import X.C16F5;
import X.C16FS;
import X.C1727800v3y;
import X.C176600m4;
import X.C1770850wBP;
import X.C1778970wOV;
import X.C1791160wiA;
import X.C1791170wiB;
import X.C1791180wiC;
import X.C1791190wiD;
import X.C1819620xS4;
import X.C1820110xSr;
import X.C1820120xSs;
import X.C1820130xSt;
import X.C1820140xSu;
import X.C1820150xSv;
import X.C1820160xSw;
import X.C1820170xSx;
import X.C1820180xSy;
import X.C1820190xSz;
import X.C1820230xT3;
import X.C1820240xT4;
import X.C1820310xTB;
import X.C1820320xTC;
import X.C1820330xTD;
import X.C1820340xTE;
import X.C1820350xTF;
import X.C1820370xTH;
import X.C1820380xTI;
import X.C1820390xTJ;
import X.C1820400xTK;
import X.C1820410xTL;
import X.C1820420xTM;
import X.C1820430xTN;
import X.C1820460xTQ;
import X.C1820480xTS;
import X.C1820490xTT;
import X.C1820500xTU;
import X.C1820510xTV;
import X.C1820540xTY;
import X.C1820550xTZ;
import X.C1820560xTa;
import X.C1820570xTb;
import X.C1820580xTc;
import X.C1820590xTd;
import X.C1820600xTe;
import X.C1820630xTh;
import X.C1820640xTi;
import X.C1820650xTj;
import X.C1825510xbZ;
import X.C1825530xbb;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19719912Dl;
import X.C20626615nU;
import X.C20627315nb;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C439101nJ;
import X.C452080Ho6;
import X.C452501pT;
import X.C474500IjA;
import X.C482070IvN;
import X.C500260Jjc;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onestopshop.LivePcsOneStopShopCacheDurationSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell.promotioncard.PromotionCardCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.OneStopPageVM;
import com.bytedance.android.livesdk.livesetting.broadcast.subscription.SubscribeUpsellLynxUrlSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class PromotionCardCell extends PowerCell<C1820390xTJ> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LL;
    public LinearLayout LLILLJJLI;
    public C20626615nU LLILLL;
    public C16F5 LLILZ;
    public C16FS LLILZIL;
    public LinearLayout LLILZLL;
    public FrameLayout LLIZ;
    public C20627315nb LLIZLLLIL;
    public LiveIconView LLJ;
    public C16F5 LLJI;
    public C16F5 LLJIJIL;
    public C20626615nU LLJILJIL;
    public final List<AbstractC20627515nd> LLJILJILJ;
    public String LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PromotionCardCell.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/onestopshop/vm/OneStopPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public final OneStopPageVM L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (OneStopPageVM) assemVMLazy.getValue();
    }

    public PromotionCardCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OneStopPageVM.class);
        C1791160wiA c1791160wiA = new C1791160wiA(c19719912DlLIZ);
        C1820600xTe c1820600xTe = new C1820600xTe();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C1820550xTZ(c19719912DlLIZ), c1791160wiA, new C1820490xTT(), new C1820230xT3(this), new C1820120xSs(this), new C1791180wiC(this), c1820600xTe, new C1825530xbb(this), null, new C1820130xSt(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1820180xSy c1820180xSy = new C1820180xSy(this);
            C1791170wiB c1791170wiB = new C1791170wiB(this);
            C1820560xTa c1820560xTa = new C1820560xTa(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1820480xTS((InterfaceC451590HnJ) obj, c1820180xSy));
            C1820310xTB c1820310xTB = new C1820310xTB(c01gwLIZIZ);
            C1820320xTC c1820320xTC = new C1820320xTC(c01gwLIZIZ);
            C1820330xTD c1820330xTD = new C1820330xTD(c01gwLIZIZ);
            C1820340xTE c1820340xTE = new C1820340xTE(c01gwLIZIZ);
            C1820350xTF c1820350xTF = new C1820350xTF(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c1820560xTa, c1791160wiA, new C452080Ho6(), c1820310xTB, c1820320xTC, c1791170wiB, c1820600xTe, c1820330xTD, c1820340xTE, c1820350xTF);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C1820570xTb(c19719912DlLIZ), c1791160wiA, new C1820500xTU(), new C1820240xT4(this), new C1820170xSx(this), new C1791190wiD(this), c1820600xTe, new C1825510xbZ(this), null, new C1820140xSu(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C1820580xTc(c19719912DlLIZ), c1791160wiA, new C1820510xTV(), new C1820190xSz(this), new C1820150xSv(this), new C1820160xSw(this), c1820600xTe, null, null, new C1820110xSr(this));
        }
        this.LL = assemVMLazy;
        this.LLJILJILJ = new ArrayList();
    }

    public final String I5() {
        C1820630xTh c1820630xThLIZ = L5().getState().LL.LIZ();
        if (c1820630xThLIZ != null) {
            return c1820630xThLIZ.LJ;
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [X.0xTg, android.view.View] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    public final void N5(C1820390xTJ c1820390xTJ) {
        boolean z;
        String str;
        List urls;
        CharSequence text;
        ?? c1820400xTK;
        if (c1820390xTJ == null) {
            return;
        }
        ((ArrayList) this.LLJILJILJ).clear();
        if (LivePcsOneStopShopCacheDurationSetting.INSTANCE.isPrefetchEnabled() && L5().getState().LLILZLL) {
            z = false;
        } else {
            z = true;
        }
        if (c1820390xTJ.LL.length() == 0) {
            C500260Jjc.LJIILIIL(this.LLILZ);
            C500260Jjc.LJIILIIL(this.LLILLL);
        } else {
            C1428300nGu.LIZ(this.LLILLL, c1820390xTJ.LL);
            C500260Jjc.LLFFF(this.LLILLL);
            ((ArrayList) this.LLJILJILJ).add(this.LLILLL);
            C16F5 c16f5 = this.LLILZ;
            if (c16f5 != null) {
                c16f5.setText(c1820390xTJ.LL);
            }
            C500260Jjc.LLFFF(this.LLILZ);
        }
        ?? r8 = this.LLILLJJLI;
        if (r8 != 0) {
            List<? extends AbstractC1820610xTf> list = c1820390xTJ.LLILZIL;
            Context context = r8.getContext();
            if (context != null) {
                C786410Ut5.LJJJJJL(r8);
                for (AbstractC1820610xTf abstractC1820610xTf : list) {
                    if (abstractC1820610xTf instanceof C1820430xTN) {
                        C1820430xTN c1820430xTN = (C1820430xTN) abstractC1820610xTf;
                        c1820400xTK = new C1820370xTH(c1820430xTN.LIZIZ, c1820430xTN.LIZ, context);
                    } else if (abstractC1820610xTf instanceof C1820420xTM) {
                        C1820420xTM c1820420xTM = (C1820420xTM) abstractC1820610xTf;
                        c1820400xTK = new C1820400xTK(context, c1820420xTM.LIZ, c1820420xTM.LIZIZ);
                    } else {
                        throw new C1954807lC();
                    }
                    ((ArrayList) this.LLJILJILJ).addAll(c1820400xTK.getSkeletonTextViews());
                    r8.addView(c1820400xTK);
                    if (z) {
                        String str2 = L5().LLILZIL.LIZ;
                        if (abstractC1820610xTf instanceof C1820420xTM) {
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_one_stop_shop_challenge_item");
                            c474500IjALIZ.LJJII(C1820640xTi.LIZ(), "anchor_id");
                            c474500IjALIZ.LJJII("show", "action_type");
                            c474500IjALIZ.LJJII(str2, "show_entrance");
                            C1820420xTM c1820420xTM2 = (C1820420xTM) abstractC1820610xTf;
                            c474500IjALIZ.LJJII(c1820420xTM2.LIZJ.LIZ, "challenge_id");
                            c474500IjALIZ.LJJII(Integer.valueOf(c1820420xTM2.LIZJ.LIZIZ), "challenge_type");
                            c474500IjALIZ.LJJII(Long.valueOf(c1820420xTM2.LIZJ.LIZJ), "current_progress");
                            c474500IjALIZ.LJJII(Long.valueOf(c1820420xTM2.LIZJ.LIZLLL), "max_progress");
                            c474500IjALIZ.LIZ();
                        }
                    }
                }
            }
        }
        final Context context2 = getContext();
        String str3 = "go_live";
        Boolean boolValueOf = null;
        if (context2 != null) {
            int i = C1778970wOV.LIZ[c1820390xTJ.LLILLL.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    String string = context2.getString(2131855999);
                    C16FS c16fs = this.LLILZIL;
                    if (c16fs != null) {
                        text = c16fs.getText();
                    } else {
                        text = null;
                    }
                    if (!Intrinsics.LJFF(text, string)) {
                        C16FS c16fs2 = this.LLILZIL;
                        if (c16fs2 != null) {
                            c16fs2.setText(string);
                        }
                        C16FS c16fs3 = this.LLILZIL;
                        if (c16fs3 != null) {
                            c16fs3.setIcon(R.raw.icon_video_fill);
                        }
                        C16FS c16fs4 = this.LLILZIL;
                        if (c16fs4 != null) {
                            c16fs4.setIconAutoMirrored(true);
                        }
                        C16FS c16fs5 = this.LLILZIL;
                        if (c16fs5 != null) {
                            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xTO
                                {
                                    super(300L);
                                }

                                @Override // X.AbstractViewOnClickListenerC1637610siV
                                public final void LIZ(View view) {
                                    if (view != null) {
                                        this.LLILZ.L5().wQ2();
                                        this.LLILZ.L5().yQ2(0, 0);
                                        String str4 = this.LLILZ.L5().LLILZIL.LIZ;
                                        PromotionCardCell promotionCardCell = this.LLILZ;
                                        C1820640xTi.LIZLLL("go_live", "click", str4, new C1820650xTj(promotionCardCell.LLJILLL, "go_live", null, null, promotionCardCell.I5(), 12));
                                    }
                                }
                            }, c16fs5);
                        }
                    }
                    if (z) {
                        C1820640xTi.LIZLLL("go_live", "show", L5().LLILZIL.LIZ, new C1820650xTj(this.LLJILLL, null, null, null, I5(), 14));
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                C16FS c16fs6 = this.LLILZIL;
                final C1820590xTd c1820590xTd = c1820390xTJ.LLILZ;
                if (c16fs6 != null) {
                    c16fs6.setText(context2.getString(2131855992));
                    C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xTG
                        @Override // X.AbstractViewOnClickListenerC1637610siV
                        public final void LIZ(View view) {
                            String str4;
                            String string2;
                            if (view != null) {
                                C1820640xTi.LIZLLL("add_dm", "click", this.LLILZ.L5().LLILZIL.LIZ, new C1820650xTj(null, null, null, null, null, 31));
                                C1820590xTd c1820590xTd2 = c1820590xTd;
                                if (c1820590xTd2.LIZ == 0) {
                                    C1820640xTi.LIZJ(this.LLILZ.L5().getState().LL.LIZ(), "click", this.LLILZ.L5().LLILZIL.LIZ, C2097608Jq.LJ());
                                    final PromotionCardCell promotionCardCell = this.LLILZ;
                                    Context context3 = context2;
                                    promotionCardCell.getClass();
                                    C782110Um9 c782110Um9 = new C782110Um9(context3);
                                    c782110Um9.LIZJ = context3.getString(2131856008);
                                    c782110Um9.LJIIIZ(context3.getString(2131856007));
                                    C494720Jag c494720Jag = new C494720Jag();
                                    C755620TkW c755620TkW = new C755620TkW();
                                    c755620TkW.LIZ = context3.getString(2131856005);
                                    c755620TkW.LIZJ = new InterfaceC743640TFa() { // from class: X.0xUH
                                        @Override // X.InterfaceC743640TFa
                                        public final void LIZ(LiveDialog liveDialog) {
                                            C1820640xTi.LIZIZ(Boolean.TRUE, "click", promotionCardCell.L5().LLILZIL.LIZ);
                                            final OneStopPageVM oneStopPageVML5 = promotionCardCell.L5();
                                            InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
                                            if (interfaceC517590KRpLIZJ != null) {
                                                interfaceC517590KRpLIZJ.LJIIIIZZ("OneStopShopOptInProcess", new C517510KRh(oneStopPageVML5.LLILLL, oneStopPageVML5.LLILZIL.LIZ, 1009));
                                            }
                                            oneStopPageVML5.setState(new C1821070xUP());
                                            oneStopPageVML5.disposeOnClear(((InterfaceC1821220xUe) oneStopPageVML5.LL.getValue().getOperator()).LJJIJL(1, 2).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0xUI
                                                @Override // X.C09JN
                                                public final void accept(Object obj) {
                                                    C1C7U.LIZ("OneStopPageVM@272c.optInToLeads$2");
                                                    OneStopPageVM oneStopPageVM = oneStopPageVML5;
                                                    oneStopPageVM.getClass();
                                                    oneStopPageVM.setState(new C1821040xUM(UriProtector.parse(SubscribeUpsellLynxUrlSetting.INSTANCE.getDmOneStopShopPopup()).buildUpon().build()));
                                                    oneStopPageVML5.xQ2(EnumC1782220wTk.OPT_IN, null);
                                                    OneStopPageVM oneStopPageVM2 = oneStopPageVML5;
                                                    oneStopPageVM2.getClass();
                                                    InterfaceC517590KRp interfaceC517590KRpLIZJ2 = C1826730xdX.LIZJ();
                                                    if (interfaceC517590KRpLIZJ2 != null) {
                                                        interfaceC517590KRpLIZJ2.LJFF(new C517550KRl(oneStopPageVM2.LLILLJJLI));
                                                    }
                                                    oneStopPageVML5.vQ2(false);
                                                    oneStopPageVML5.setState(new C1821060xUO());
                                                    C1C7U.LIZIZ("OneStopPageVM@272c.optInToLeads$2");
                                                }
                                            }, new C09JN() { // from class: X.0wYa
                                                @Override // X.C09JN
                                                public final void accept(Object obj) {
                                                    C1C7U.LIZ("OneStopPageVM@272c.optInToLeads$3");
                                                    Throwable th = (Throwable) obj;
                                                    oneStopPageVML5.setState(new C1819480xRq());
                                                    oneStopPageVML5.xQ2(EnumC1782220wTk.OPT_IN, th);
                                                    C501540Jlg.LIZJ(C497740JfY.LJII(), th);
                                                    C1C7U.LIZIZ("OneStopPageVM@272c.optInToLeads$3");
                                                }
                                            }));
                                            liveDialog.dismiss();
                                        }
                                    };
                                    c494720Jag.LIZ(new C0TZ2(c755620TkW));
                                    C755630TkX c755630TkX = new C755630TkX();
                                    c755630TkX.LIZ = context3.getString(2131856006);
                                    c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0xTP
                                        @Override // X.InterfaceC743640TFa
                                        public final void LIZ(LiveDialog liveDialog) {
                                            C1820640xTi.LIZIZ(Boolean.FALSE, "click", promotionCardCell.L5().LLILZIL.LIZ);
                                            liveDialog.dismiss();
                                        }
                                    };
                                    c494720Jag.LIZ(new C0TZ3(c755630TkX));
                                    c494720Jag.LIZIZ = 2;
                                    c782110Um9.LIZJ(new C494730Jah(c494720Jag));
                                    c782110Um9.LJIIZILJ = new DialogInterface.OnShowListener() { // from class: X.0xTR
                                        @Override // android.content.DialogInterface.OnShowListener
                                        public final void onShow(DialogInterface dialogInterface) {
                                            C1820640xTi.LIZIZ(null, "show", promotionCardCell.L5().LLILZIL.LIZ);
                                        }
                                    };
                                    C786410Ut5.E4(c782110Um9.LIZ());
                                    return;
                                }
                                PromotionCardCell promotionCardCell2 = this.LLILZ;
                                Context context4 = context2;
                                promotionCardCell2.getClass();
                                if (c1820590xTd2.LIZ == 1) {
                                    str4 = "upsell";
                                } else {
                                    str4 = "serviceplus";
                                }
                                SubscribeUpsellLynxUrlSetting subscribeUpsellLynxUrlSetting = SubscribeUpsellLynxUrlSetting.INSTANCE;
                                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                                if (interfaceC500940JkiUser != null) {
                                    string2 = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString();
                                } else {
                                    string2 = null;
                                }
                                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context4, subscribeUpsellLynxUrlSetting.getSMBOptInNotQualifiedSheet(str4, "service_one_stop_shop", string2));
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(300L);
                        }
                    }, c16fs6);
                }
                if (z) {
                    boolValueOf = null;
                    C1820640xTi.LIZLLL("add_dm", "show", L5().LLILZIL.LIZ, new C1820650xTj(null, null, null, null, null, 31));
                }
            }
        }
        C1820460xTQ c1820460xTQ = c1820390xTJ.LLILZLL;
        if (c1820460xTQ != null && (str = c1820460xTQ.LIZJ) != null && !a0.LJJJIL(str)) {
            LinearLayout linearLayout = this.LLILZLL;
            if (linearLayout != null) {
                ((ArrayList) this.LLJILJILJ).add(this.LLIZLLLIL);
                ((ArrayList) this.LLJILJILJ).add(this.LLJILJIL);
                ImageModel imageModel = c1820460xTQ.LIZ;
                if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                    boolValueOf = Boolean.valueOf(!urls.isEmpty());
                }
                if (C176600m4.LIZIZ(boolValueOf)) {
                    C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
                    int iLIZ = C439101nJ.LIZ(36);
                    int iLIZ2 = C439101nJ.LIZ(36);
                    c1324610kZfLJIIIZ.LJ = iLIZ;
                    c1324610kZfLJIIIZ.LJFF = iLIZ2;
                    c1324610kZfLJIIIZ.LJJ = Boolean.TRUE;
                    c1324610kZfLJIIIZ.LJJI(this.LLJ);
                    String str4 = c1820460xTQ.LIZIZ;
                    if (str4.length() == 0) {
                        C500260Jjc.LJIILIIL(this.LLJI);
                    } else {
                        C16F5 c16f52 = this.LLJI;
                        if (c16f52 != null) {
                            c16f52.setText(str4);
                        }
                        C16F5 c16f53 = this.LLJI;
                        if (c16f53 != null) {
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16f53);
                            c16f53.setRotation(15.0f);
                        }
                        C500260Jjc.LLFFF(this.LLJI);
                    }
                    C500260Jjc.LLFFF(this.LLIZLLLIL);
                    C500260Jjc.LLFFF(this.LLIZ);
                    C500260Jjc.LLFFF(this.LLJ);
                } else {
                    C500260Jjc.LJIILIIL(this.LLIZ);
                    C500260Jjc.LJIILIIL(this.LLIZLLLIL);
                }
                String str5 = c1820460xTQ.LIZJ;
                String strI5 = I5();
                if (strI5 == null || strI5.length() == 0) {
                    str3 = "campaign";
                }
                C16F5 c16f54 = this.LLJIJIL;
                if (c16f54 != null) {
                    c16f54.setText(C1727800v3y.LIZ(str5, c1820460xTQ.LIZLLL, 500, Integer.valueOf(R.attr.ezs), new C1820410xTL(this, c1820460xTQ, str3), linearLayout.getContext()));
                }
                C16F5 c16f55 = this.LLJIJIL;
                if (c16f55 != null) {
                    c16f55.setLinksClickable(true);
                }
                C16F5 c16f56 = this.LLJIJIL;
                if (c16f56 != null) {
                    c16f56.setClickable(true);
                }
                C16F5 c16f57 = this.LLJIJIL;
                if (c16f57 != null) {
                    c16f57.setMovementMethod(LinkMovementMethod.getInstance());
                }
                C1428300nGu.LIZ(this.LLJILJIL, c1820460xTQ.LIZJ);
                C500260Jjc.LLFFF(this.LLJILJIL);
                C500260Jjc.LLFFF(linearLayout);
            }
            if (z) {
                C1820640xTi.LIZLLL("campaign", "show", L5().LLILZIL.LIZ, new C1820650xTj(null, null, null, null, null, 31));
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL(this.LLILZLL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        C1820390xTJ c1820390xTJ = (C1820390xTJ) interfaceC1891350zJl;
        super.onBindItemView(c1820390xTJ);
        C1820540xTY.LIZ(getContext(), this.itemView, L5().LLILZ);
        String str = c1820390xTJ.LLILLJJLI;
        if (!L5().LLILZIL.LIZLLL) {
            C0KPJ.Re.LIZIZ().put(String.valueOf(UserService.getInstance().user().getCurrentUserId()), Boolean.TRUE);
            str = "first_time_launch";
        }
        this.LLJILLL = str;
        N5(c1820390xTJ);
        C1820630xTh c1820630xThLIZ = L5().getState().LL.LIZ();
        if (c1820630xThLIZ != null && c1820630xThLIZ.LIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        if (L5().getState().LLILZLL && !z) {
            if (!LivePcsOneStopShopCacheDurationSetting.INSTANCE.isPrefetchEnabled()) {
                for (AbstractC20628015ni abstractC20628015ni : (ArrayList) this.LLJILJILJ) {
                    if (abstractC20628015ni != null) {
                        abstractC20628015ni.setLoading(false);
                    }
                }
                return;
            }
            C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.0xTX
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1820790xTx) obj).LLILZLL);
                }
            }, null, new C1820380xTI(this), 6);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewInflateItemView$default = PowerCell.inflateItemView$default(this, viewGroup, R.layout.gtt, false, 4, null);
        this.LLILLJJLI = (LinearLayout) viewInflateItemView$default.findViewById(R.id.de_);
        this.LLILZ = (C16F5) viewInflateItemView$default.findViewById(R.id.dew);
        this.LLILLL = (C20626615nU) viewInflateItemView$default.findViewById(R.id.dex);
        this.LLILZIL = (C16FS) viewInflateItemView$default.findViewById(R.id.saa);
        this.LLILZLL = (LinearLayout) viewInflateItemView$default.findViewById(R.id.sab);
        this.LLJIJIL = (C16F5) viewInflateItemView$default.findViewById(R.id.dep);
        this.LLJILJIL = (C20626615nU) viewInflateItemView$default.findViewById(R.id.deq);
        this.LLIZ = (FrameLayout) viewInflateItemView$default.findViewById(R.id.dem);
        this.LLJ = (LiveIconView) viewInflateItemView$default.findViewById(R.id.del);
        this.LLIZLLLIL = (C20627315nb) viewInflateItemView$default.findViewById(R.id.den);
        this.LLJI = (C16F5) viewInflateItemView$default.findViewById(R.id.deo);
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.0i9j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1820790xTx) obj).LLILLL);
            }
        }, null, new C482070IvN(this.LLILZIL), 6);
        return viewInflateItemView$default;
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
