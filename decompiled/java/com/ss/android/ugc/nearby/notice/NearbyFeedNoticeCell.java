package com.ss.android.ugc.nearby.notice;

import X.AbstractC426530Gnz;
import X.C01GW;
import X.C1203740hQi;
import X.C1204700hSG;
import X.C1204730hSJ;
import X.C1204740hSK;
import X.C1204750hSL;
import X.C1204920hSc;
import X.C1204980hSi;
import X.C1204990hSj;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C13LE;
import X.C21681819tI;
import X.C2188811AlT;
import X.C339190DRl;
import X.C431260Gvc;
import X.C444920HcY;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1204690hSF;
import X.InterfaceC1891350zJl;
import Y.ARunnableS118S0100000_18;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.nearby.container.ability.IContainerAbility;
import com.ss.android.ugc.nearby.container.model.NearbyNoticeModel;
import com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel;
import com.ss.android.ugc.nearby.notice.NearbyFeedNoticeCell;
import com.ss.android.ugc.nearby.settings.NearbyClientSettings;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.text.a0;
import wh6.AbS508S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFeedNoticeCell extends PowerCell<NearbyNoticeModel> {
    public View LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public TuxIconView LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2360));
    public final C736950SvV LLIZ;
    public boolean LLIZLLLIL;

    public final PageFinder I5() {
        return (PageFinder) this.LLILZLL.getValue();
    }

    public final NearbyFeedSharedViewModel L5() {
        return (NearbyFeedSharedViewModel) this.LLIZ.getValue();
    }

    public NearbyFeedNoticeCell() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(634);
        this.LLIZ = new C736950SvV(C13LE.LIZ(NearbyFeedSharedViewModel.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(803), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C21681819tI c21681819tI;
        super.onViewAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (!(layoutParams instanceof C21681819tI) || (c21681819tI = (C21681819tI) layoutParams) == null) {
            return;
        }
        c21681819tI.LLILLJJLI = true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        SpannableString spannableString;
        NearbyNoticeModel nearbyNoticeModel = (NearbyNoticeModel) interfaceC1891350zJl;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeCell onBindItemView t=");
        sbLIZ.append(nearbyNoticeModel);
        C2188811AlT.LIZIZ(sbLIZ);
        C1204980hSi c1204980hSi = EnumC1204690hSF.Companion;
        String str = nearbyNoticeModel.type;
        c1204980hSi.getClass();
        final EnumC1204690hSF enumC1204690hSFLIZ = C1204980hSi.LIZ(str);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(nearbyNoticeModel.title);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            String str2 = nearbyNoticeModel.content;
            String str3 = nearbyNoticeModel.buttonText;
            if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append(' ');
                sbLIZ2.append(str3);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                spannableString = new SpannableString(strLIZIZ);
                int iLJJJJI = a0.LJJJJI(strLIZIZ, str3, 0, 6);
                int length = str3.length() + iLJJJJI;
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ob, this.itemView.getContext());
                if (numLIZJ != null) {
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), iLJJJJI, length, 33);
                }
                C786410Ut5.p2(spannableString, new AbstractC426530Gnz() { // from class: X.0hSH
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        C19EG c19eg;
                        C19EG c19eg2;
                        EnumC1204690hSF enumC1204690hSF = enumC1204690hSFLIZ;
                        if (enumC1204690hSF != null) {
                            int i = C1204720hSI.LIZ[enumC1204690hSF.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            C1205110hSv c1205110hSv = new Object() { // from class: X.0hSv
                                            };
                                            Context context = this.itemView.getContext();
                                            c1205110hSv.getClass();
                                            String strJ4 = NearbyClientSettings.LIZIZ().learnMoreUrlIntroAndroid;
                                            if (strJ4 == null) {
                                                strJ4 = "https://support.tiktok.com/%s/using-tiktok/exploring-videos/nearby";
                                            }
                                            String appLanguage = ((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getAppLanguage();
                                            if (a0.LJJIIZI(strJ4, "%s", false)) {
                                                strJ4 = C786410Ut5.j4(strJ4, Arrays.copyOf(new Object[]{appLanguage}, 1));
                                            }
                                            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview");
                                            smartRouteBuildRoute.withParam("url", strJ4);
                                            smartRouteBuildRoute.withParam("title", "");
                                            smartRouteBuildRoute.withParam("show_separate_line", true);
                                            smartRouteBuildRoute.open();
                                            C1204920hSc c1204920hSc = C1204920hSc.LIZ;
                                            EnumC1204690hSF enumC1204690hSF2 = enumC1204690hSFLIZ;
                                            PageFinder pageFinderI5 = this.I5();
                                            c1204920hSc.getClass();
                                            C1204920hSc.LIZ(enumC1204690hSF2, true, pageFinderI5);
                                            NearbyFeedNoticeCell nearbyFeedNoticeCell = this;
                                            HandlerHook.viewPostDelay(nearbyFeedNoticeCell.itemView, new ARunnableS118S0100000_18(nearbyFeedNoticeCell, 91), 2000L);
                                            return;
                                        }
                                    } else {
                                        Activity activityLIZ = C1388190mED.LIZ(this.itemView.getContext());
                                        if (!(activityLIZ instanceof C19EG) || (c19eg2 = (C19EG) activityLIZ) == null) {
                                            return;
                                        }
                                        EnumC1204690hSF enumC1204690hSF3 = enumC1204690hSFLIZ;
                                        NearbyFeedNoticeCell nearbyFeedNoticeCell2 = this;
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        C1205150hSz.LIZ.getClass();
                                        C1205150hSz.LIZJ(c19eg2, jCurrentTimeMillis, null);
                                        C1204920hSc c1204920hSc2 = C1204920hSc.LIZ;
                                        PageFinder pageFinderI52 = nearbyFeedNoticeCell2.I5();
                                        c1204920hSc2.getClass();
                                        C1204920hSc.LIZ(enumC1204690hSF3, true, pageFinderI52);
                                        return;
                                    }
                                } else {
                                    C1204920hSc c1204920hSc3 = C1204920hSc.LIZ;
                                    EnumC1204690hSF enumC1204690hSF4 = enumC1204690hSFLIZ;
                                    PageFinder pageFinderI53 = this.I5();
                                    c1204920hSc3.getClass();
                                    C1204920hSc.LIZ(enumC1204690hSF4, true, pageFinderI53);
                                    final NearbyFeedNoticeCell nearbyFeedNoticeCell3 = this;
                                    nearbyFeedNoticeCell3.getClass();
                                    C1204840hSU.LIZ.getClass();
                                    TokenCert tokenCertLIZ = C1204840hSU.LIZ();
                                    C1207520hWo c1207520hWo = new C1207520hWo("homepage_nearby", "click_open_gps_banner", null, null, false, false, null, null, null, 508);
                                    final Activity activityLIZ2 = C1388190mED.LIZ(nearbyFeedNoticeCell3.itemView.getContext());
                                    if (activityLIZ2 == null) {
                                        return;
                                    }
                                    C1207450hWh c1207450hWh = C1207450hWh.LIZ;
                                    Fragment fragmentLJIIJ = C1189060h32.LJIIJ(nearbyFeedNoticeCell3);
                                    InterfaceC1207030hW1 interfaceC1207030hW1 = new InterfaceC1207030hW1() { // from class: X.0hS2
                                        @Override // X.InterfaceC1207030hW1
                                        public final void LIZ() {
                                            IContainerAbility iContainerAbility;
                                            Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ(nearbyFeedNoticeCell3);
                                            if (fragmentLJIIJ2 == null || (iContainerAbility = (IContainerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ2, null), IContainerAbility.class, null)) == null) {
                                                return;
                                            }
                                            C1203960hR4 c1203960hR4 = new C1203960hR4(EnumC1204030hRB.TURN_ON_GPS);
                                            c1203960hR4.LJI();
                                            iContainerAbility.U52(c1203960hR4);
                                        }

                                        @Override // X.InterfaceC1207030hW1
                                        public final void LIZJ(int i2) {
                                            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ2);
                                            c1389890mGx.LJIIIZ(2131837950);
                                            c1389890mGx.LJIIJJI();
                                            nearbyFeedNoticeCell3.L5().FQ2();
                                        }

                                        @Override // X.InterfaceC1207030hW1
                                        public final void LIZIZ(int i2, String str4) {
                                            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ2);
                                            c1389890mGx.LJIIIZ(2131837950);
                                            c1389890mGx.LJIIJJI();
                                            nearbyFeedNoticeCell3.L5().FQ2();
                                        }
                                    };
                                    c1207450hWh.getClass();
                                    C1207450hWh.LJJIFFI("nearby", "double_column", tokenCertLIZ, activityLIZ2, fragmentLJIIJ, c1207520hWo, interfaceC1207030hW1);
                                    return;
                                }
                            } else {
                                Activity activityLIZ3 = C1388190mED.LIZ(this.itemView.getContext());
                                if (!(activityLIZ3 instanceof C19EG) || (c19eg = (C19EG) activityLIZ3) == null) {
                                    return;
                                }
                                EnumC1204690hSF enumC1204690hSF5 = enumC1204690hSFLIZ;
                                NearbyFeedNoticeCell nearbyFeedNoticeCell4 = this;
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                C1205150hSz.LIZ.getClass();
                                C1205150hSz.LIZJ(c19eg, jCurrentTimeMillis2, "explore_regions_banner");
                                C1204920hSc c1204920hSc4 = C1204920hSc.LIZ;
                                PageFinder pageFinderI54 = nearbyFeedNoticeCell4.I5();
                                c1204920hSc4.getClass();
                                C1204920hSc.LIZ(enumC1204690hSF5, true, pageFinderI54);
                                return;
                            }
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("get unexpected notice type=");
                        sbLIZ3.append(enumC1204690hSFLIZ);
                        C2188811AlT.LIZIZ(sbLIZ3);
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setUnderlineText(false);
                    }
                }, iLJJJJI, length, 33);
                C786410Ut5.p2(spannableString, new C444920HcY(63, false), iLJJJJI, length, 33);
            } else {
                spannableString = null;
            }
            tuxTextView2.setText(spannableString);
        }
        TuxTextView tuxTextView3 = this.LLILLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setMovementMethod(C431260Gvc.LIZ);
        }
        TuxIconView tuxIconView = this.LLILZIL;
        if (tuxIconView != null) {
            C339190DRl.LIZLLL(tuxIconView);
        }
        if (enumC1204690hSFLIZ != null) {
            int i = C1204700hSG.LIZ[enumC1204690hSFLIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            TuxIconView tuxIconView2 = this.LLILZIL;
                            if (tuxIconView2 != null) {
                                C339190DRl.LIZIZ(tuxIconView2);
                            }
                            C1203740hQi c1203740hQi = C1203740hQi.LIZ;
                            Keva keva = C1203740hQi.LIZIZ;
                            c1203740hQi.getClass();
                            keva.storeBoolean(C1203740hQi.LIZ("nearby_intro_show"), true);
                            C1204920hSc c1204920hSc = C1204920hSc.LIZ;
                            PageFinder pageFinderI5 = I5();
                            c1204920hSc.getClass();
                            C1204920hSc.LIZIZ(enumC1204690hSFLIZ, pageFinderI5);
                            TuxIconView tuxIconView3 = this.LLILZ;
                            if (tuxIconView3 != null) {
                                C786410Ut5.I7(new AbS508S0200000_18(enumC1204690hSFLIZ, this, 35, 42), tuxIconView3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!this.LLIZLLLIL) {
                        C1204990hSj.LIZ.getClass();
                        C1204750hSL.LIZIZ.LJI(true);
                        C1204920hSc c1204920hSc2 = C1204920hSc.LIZ;
                        PageFinder pageFinderI52 = I5();
                        c1204920hSc2.getClass();
                        C1204920hSc.LIZIZ(enumC1204690hSFLIZ, pageFinderI52);
                        this.LLIZLLLIL = true;
                    }
                    TuxIconView tuxIconView4 = this.LLILZ;
                    if (tuxIconView4 == null) {
                        return;
                    }
                    C786410Ut5.I7(new AbS508S0200000_18(enumC1204690hSFLIZ, this, 34, 42), tuxIconView4);
                    return;
                }
                if (!this.LLIZLLLIL) {
                    C1204990hSj.LIZ.getClass();
                    C1204740hSK.LIZIZ.LJI(true);
                    C1204920hSc c1204920hSc3 = C1204920hSc.LIZ;
                    PageFinder pageFinderI53 = I5();
                    c1204920hSc3.getClass();
                    C1204920hSc.LIZIZ(enumC1204690hSFLIZ, pageFinderI53);
                    this.LLIZLLLIL = true;
                }
                TuxIconView tuxIconView5 = this.LLILZ;
                if (tuxIconView5 == null) {
                    return;
                }
                C786410Ut5.I7(new AbS508S0200000_18(enumC1204690hSFLIZ, this, 33, 42), tuxIconView5);
                return;
            }
            if (!this.LLIZLLLIL) {
                C1204990hSj.LIZ.getClass();
                C1204730hSJ.LIZIZ.LJI(true);
                C1204920hSc c1204920hSc4 = C1204920hSc.LIZ;
                PageFinder pageFinderI54 = I5();
                c1204920hSc4.getClass();
                C1204920hSc.LIZIZ(enumC1204690hSFLIZ, pageFinderI54);
                this.LLIZLLLIL = true;
            }
            TuxIconView tuxIconView6 = this.LLILZ;
            if (tuxIconView6 == null) {
                return;
            }
            C786410Ut5.I7(new AbS508S0200000_18(enumC1204690hSFLIZ, this, 32, 42), tuxIconView6);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ds9, viewGroup, false);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.p4_);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.p48);
        this.LLILZ = (TuxIconView) viewTd.findViewById(R.id.p47);
        this.LLILZIL = (TuxIconView) viewTd.findViewById(R.id.p49);
        this.LL = viewTd;
        return viewTd;
    }
}
