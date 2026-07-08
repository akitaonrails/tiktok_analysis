package com.ss.android.ugc.aweme.footnote.detail.ui;

import X.C01GW;
import X.C07HF;
import X.C09R3;
import X.C0HD1;
import X.C0HHT;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C13LE;
import X.C14LC;
import X.C1548820qPI;
import X.C1637806bA;
import X.C1637906bB;
import X.C1735430vGH;
import X.C1871910yoP;
import X.C197039127h;
import X.C19719912Dl;
import X.C2095008Iq;
import X.C21415018rM;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C262100zr;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C444830HcP;
import X.C444920HcY;
import X.C452501pT;
import X.C497820Jfg;
import X.C693570RIl;
import X.C718800SHm;
import X.C719090SIp;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC993840byA;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS100S0200000_31;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.FootNoteInfo;
import com.ss.android.ugc.aweme.feed.model.MainPendingFootNoteInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS114S1200000_31;
import kotlin.jvm.internal.AwS36S0001000_24;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class FootNoteRatingCardAssem extends BaseCellSlotComponent<FootNoteRatingCardAssem> implements InterfaceC1141530foN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZJ;
    public final InterfaceC1731706qJ LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public Aweme LLL;
    public C21415018rM LLLF;
    public TuxTextView LLLFF;
    public View LLLFFI;
    public View LLLFZ;
    public TuxTextView LLLI;
    public C197039127h LLLII;
    public C197039127h LLLIIII;
    public Layout LLLIIIIL;
    public Layout LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final int LLLIL;
    public final int LLLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FootNoteRatingCardAssem.class, "ratingCardVM", "getRatingCardVM()Lcom/ss/android/ugc/aweme/footnote/detail/ui/FootNoteRatingPanelVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FootNoteRatingCardAssem.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        c09r3.getClass();
        LLLILZJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FootNoteRatingCardAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FootNoteRatingPanelVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS575S0100000_31(c19719912DlLIZ, 686), null, AFwS276S0000000_31.get$arr$(126));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ConstraintSizeVM.class);
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new AwS575S0100000_31(c19719912DlLIZ2, 687), null, AFwS276S0000000_31.get$arr$(127));
        this.LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS276S0000000_31.get$arr$(128));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 683));
        this.LLLIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 684));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 685));
        this.LLLIL = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100))) - (C07HF.LIZ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) : 0);
        this.LLLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIIIZ ? 14 : 15))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b8u;
    }

    public final FootNoteRatingPanelVM Bp() {
        return (FootNoteRatingPanelVM) this.LLJLLIL.getValue(this, LLLILZJ[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1548820qPI.LJIIIIZZ("footnotes_rate_load_success", this);
        C1548820qPI.LJIIIIZZ("footnotes_rate_success", this);
        ((C1735430vGH) this.LLLIIL.getValue()).LIZ();
        ((C1735430vGH) this.LLLIILIL.getValue()).LIZ();
    }

    public final void Ep(boolean z) {
        Layout layout;
        if (z) {
            layout = this.LLLIIIIL;
        } else {
            layout = this.LLLIIIL;
            if (layout == null) {
                return;
            }
        }
        C21415018rM c21415018rM = this.LLLF;
        if (c21415018rM != null) {
            c21415018rM.setTextLayout(layout);
        }
        if (z) {
            TuxTextView tuxTextView = this.LLLFF;
            if (tuxTextView != null) {
                tuxTextView.setText(getContentView().getContext().getString(2131834550));
            }
            View view = this.LLLFFI;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLLFF;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(getContentView().getContext().getString(2131834551));
        }
        View view2 = this.LLLFFI;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view2);
    }

    public final void Fp(int i) {
        Object obj;
        Integer numValueOf;
        Object obj2;
        String aid;
        Object obj3;
        String authorUid;
        Object obj4;
        String str;
        Object obj5;
        Aweme aweme;
        FootNoteInfo footNoteInfo;
        MainPendingFootNoteInfo mainPendingFootNoteInfo;
        Aweme aweme2;
        FootNoteInfo footNoteInfo2;
        MainPendingFootNoteInfo mainPendingFootNoteInfo2;
        Aweme aweme3;
        Aweme aweme4;
        Aweme aweme5;
        Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?spark_page=footnotes_rate").buildUpon();
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams != null && (aweme5 = videoItemParams.getAweme()) != null) {
            numValueOf = Integer.valueOf(aweme5.getAwemeType());
        } else {
            numValueOf = null;
        }
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("type", String.valueOf(numValueOf));
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        VideoItemParams videoItemParams2 = (VideoItemParams) obj2;
        if (videoItemParams2 != null && (aweme4 = videoItemParams2.getAweme()) != null) {
            aid = aweme4.getAid();
        } else {
            aid = null;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("video_id", aid);
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        } else {
            obj3 = null;
        }
        VideoItemParams videoItemParams3 = (VideoItemParams) obj3;
        if (videoItemParams3 != null && (aweme3 = videoItemParams3.getAweme()) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme3);
        } else {
            authorUid = null;
        }
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("video_author_id", authorUid).appendQueryParameter("rate_result", String.valueOf(i));
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj4 = c724270Sb34.LL;
        } else {
            obj4 = null;
        }
        VideoItemParams videoItemParams4 = (VideoItemParams) obj4;
        if (videoItemParams4 != null && (aweme2 = videoItemParams4.getAweme()) != null && (footNoteInfo2 = aweme2.getFootNoteInfo()) != null && (mainPendingFootNoteInfo2 = footNoteInfo2.mainPendingFootNote) != null) {
            str = mainPendingFootNoteInfo2.noteID;
        } else {
            str = null;
        }
        Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("footnote_id", str);
        C724270Sb3 c724270Sb35 = this.LLJI;
        if (c724270Sb35 != null) {
            obj5 = c724270Sb35.LL;
        } else {
            obj5 = null;
        }
        VideoItemParams videoItemParams5 = (VideoItemParams) obj5;
        if (videoItemParams5 != null && (aweme = videoItemParams5.getAweme()) != null && (footNoteInfo = aweme.getFootNoteInfo()) != null && (mainPendingFootNoteInfo = footNoteInfo.mainPendingFootNote) != null) {
            str2 = mainPendingFootNoteInfo.footNoteAuthorId;
        }
        SmartRouter.buildRoute(getContext(), builderAppendQueryParameter4.appendQueryParameter("footnote_author_id", str2).appendQueryParameter("enter_from", "footnote_feed").appendQueryParameter("silent_load_type", "2").toString()).open();
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Object obj;
        String string;
        String strLJFF;
        Aweme aweme;
        FootNoteInfo footNoteInfo;
        MainPendingFootNoteInfo mainPendingFootNoteInfo;
        String strLJFF2;
        FootNoteInfo footNoteInfo2;
        MainPendingFootNoteInfo mainPendingFootNoteInfo2;
        Map<String, Object> mapLIZ;
        Object obj2;
        String string2;
        String strLJFF3;
        String str;
        String strLJFF4;
        int iIntValue;
        C197039127h c197039127h;
        FootNoteInfo footNoteInfo3;
        MainPendingFootNoteInfo mainPendingFootNoteInfo3;
        Map<String, Object> mapLIZ2;
        boolean zLJFF = Intrinsics.LJFF(c262100zr.LIZ, "footnotes_rate_load_success");
        int iIntValue2 = 0;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        String str3 = null;
        if (zLJFF) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PAGE LOAD SUCCESS, JS EVENT RECEIVED!!, position = ");
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj2 = c724270Sb3.LL;
            } else {
                obj2 = null;
            }
            sbLIZ.append(((VideoItemParams) obj2).currentPosition);
            sbLIZ.append(", ");
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null && (mapLIZ2 = interfaceC1107590evd.LIZ()) != null) {
                string2 = mapLIZ2.toString();
            } else {
                string2 = null;
            }
            sbLIZ.append(string2);
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd2, "footnote_id", "");
            } else {
                strLJFF3 = null;
            }
            Aweme aweme2 = this.LLL;
            if (aweme2 != null && (footNoteInfo3 = aweme2.getFootNoteInfo()) != null && (mainPendingFootNoteInfo3 = footNoteInfo3.mainPendingFootNote) != null) {
                str = mainPendingFootNoteInfo3.noteID;
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(strLJFF3, str)) {
                return;
            }
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 == null || (strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd3, "rate_result", "")) == null) {
                strLJFF4 = CardStruct.IStatusCode.DEFAULT;
            }
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(strLJFF4);
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue == EnumC993840byA.HELPFUL.ordinal()) {
                C197039127h c197039127h2 = this.LLLII;
                if (c197039127h2 != null) {
                    HandlerHook.viewPost(c197039127h2, new ARunnableS100S0200000_31(this, c197039127h2, 15));
                }
            } else if (iIntValue == EnumC993840byA.NOT_HELPFUL.ordinal() && (c197039127h = this.LLLIIII) != null) {
                HandlerHook.viewPost(c197039127h, new ARunnableS100S0200000_31(this, c197039127h, 16));
            }
        }
        if (Intrinsics.LJFF(c262100zr.LIZ, "footnotes_rate_success")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Footnote rate success, JS EVENT RECEIVED!!, position = ");
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj = c724270Sb32.LL;
            } else {
                obj = null;
            }
            sbLIZ2.append(((VideoItemParams) obj).currentPosition);
            sbLIZ2.append(", ");
            InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
            if (interfaceC1107590evd4 != null && (mapLIZ = interfaceC1107590evd4.LIZ()) != null) {
                string = mapLIZ.toString();
            } else {
                string = null;
            }
            sbLIZ2.append(string);
            C2188811AlT.LIZIZ(sbLIZ2);
            InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
            if (interfaceC1107590evd5 != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd5, "footnote_id", "");
            } else {
                strLJFF = null;
            }
            Aweme aweme3 = this.LLL;
            if (aweme3 != null && (footNoteInfo2 = aweme3.getFootNoteInfo()) != null && (mainPendingFootNoteInfo2 = footNoteInfo2.mainPendingFootNote) != null) {
                str3 = mainPendingFootNoteInfo2.noteID;
            }
            if (!Intrinsics.LJFF(strLJFF, str3)) {
                return;
            }
            InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
            if (interfaceC1107590evd6 != null && (strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd6, "rate_result", "")) != null) {
                str2 = strLJFF2;
            }
            Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(str2);
            if (numLJIIJJI2 != null) {
                iIntValue2 = numLJIIJJI2.intValue();
            }
            FootNoteRatingPanelVM footNoteRatingPanelVMBp = Bp();
            VideoItemParams item = footNoteRatingPanelVMBp.getItem();
            if (item != null && (aweme = item.getAweme()) != null && (footNoteInfo = aweme.getFootNoteInfo()) != null && (mainPendingFootNoteInfo = footNoteInfo.mainPendingFootNote) != null) {
                mainPendingFootNoteInfo.setRateResult(Integer.valueOf(iIntValue2));
            }
            footNoteRatingPanelVMBp.setState(new AwS36S0001000_24(iIntValue2, 10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017d  */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.0lX0] */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.footnote.detail.ui.FootNoteRatingCardAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        FootNoteInfo footNoteInfo;
        MainPendingFootNoteInfo mainPendingFootNoteInfo;
        String str;
        String str2;
        String str3;
        int iIntValue;
        int iWQ2;
        int iIntValue2;
        float fMeasureText;
        Pair pair;
        TextPaint paint;
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLL = videoItemParams2.getAweme();
        Aweme aweme = videoItemParams2.getAweme();
        if (aweme != null && (footNoteInfo = aweme.getFootNoteInfo()) != null && (mainPendingFootNoteInfo = footNoteInfo.mainPendingFootNote) != null && (str = mainPendingFootNoteInfo.link) != null && (str2 = mainPendingFootNoteInfo.linkText) != null && (str3 = mainPendingFootNoteInfo.title) != null) {
            ViewGroup.LayoutParams layoutParams = null;
            this.LLLIIIIL = null;
            this.LLLIIIL = null;
            C1361400lX0 c1361400lX0 = new C1361400lX0(getContentView().getContext(), R.style.y0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) "*");
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_link_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            C786410Ut5.q2(spannableStringBuilder, c419910GdJ.LIZIZ(2, c1361400lX0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(72, false), length2, spannableStringBuilder.length(), 33);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, c1361400lX0);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            C0HD1 c0hd1 = new C0HD1(0.75f, iIntValue, (Object) null);
            c0hd1.LLILZ = new AwS114S1200000_31(this, str, c1361400lX0, 9);
            C786410Ut5.q2(spannableStringBuilder, c0hd1, length, spannableStringBuilder.length(), 33);
            C718800SHm c718800SHm = new C718800SHm(spannableStringBuilder);
            if (this.LLLIIIIL == null) {
                int iLIZIZ = C497820Jfg.LIZIZ(c1361400lX0);
                if (C693570RIl.LIZ()) {
                    iWQ2 = ((ConstraintSizeVM) this.LLJLLL.getValue(this, LLLILZJ[1])).wQ2();
                } else {
                    iWQ2 = this.LLLIL;
                }
                int paddingLeft = ((iLIZIZ - iWQ2) - getContentView().getPaddingLeft()) - getContentView().getPaddingEnd();
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1i, c1361400lX0);
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                C444830HcP c444830HcP = new C444830HcP();
                c444830HcP.LJIILL(paddingLeft);
                c444830HcP.LIZIZ.LJIIIZ = TextDirectionHeuristics.LOCALE;
                c444830HcP.LJIILJJIL(iIntValue2);
                c444830HcP.LJII(51);
                c444830HcP.LJIIIIZZ(this.LLLILZ);
                c444830HcP.LJIILIIL(spannableStringBuilder);
                Layout layoutLIZIZ = c444830HcP.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(' ');
                sbLIZ.append(c1361400lX0.getString(2131834551));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                TuxTextView tuxTextView = this.LLLFF;
                if (tuxTextView != null && (paint = tuxTextView.getPaint()) != null) {
                    fMeasureText = paint.measureText(strLIZIZ);
                } else {
                    fMeasureText = 0.0f;
                }
                c718800SHm.LJI(3);
                c718800SHm.LIZLLL(fMeasureText);
                C444830HcP c444830HcP2 = new C444830HcP();
                c444830HcP2.LJIILL(paddingLeft);
                c444830HcP2.LIZIZ.LJIIIZ = TextDirectionHeuristics.LOCALE;
                c444830HcP2.LJIILJJIL(iIntValue2);
                c444830HcP2.LJII(51);
                c444830HcP2.LJIIIIZZ(this.LLLILZ);
                C719090SIp c719090SIpLIZJ = C718800SHm.LIZJ(c718800SHm, c444830HcP2, layoutLIZIZ, null, 12);
                Layout layout = c719090SIpLIZJ.LIZIZ;
                if (layout == null) {
                    pair = new Pair(c719090SIpLIZJ.LIZ, null);
                } else {
                    pair = new Pair(layoutLIZIZ, layout);
                }
                this.LLLIIIIL = (Layout) pair.getFirst();
                this.LLLIIIL = (Layout) pair.getSecond();
                if (pair.getSecond() != null) {
                    Ep(false);
                    TuxTextView tuxTextView2 = this.LLLFF;
                    if (tuxTextView2 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView2, 0);
                    }
                } else {
                    C21415018rM c21415018rM = this.LLLF;
                    if (c21415018rM != null) {
                        c21415018rM.setTextLayout(this.LLLIIIIL);
                    }
                    TuxTextView tuxTextView3 = this.LLLFF;
                    if (tuxTextView3 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView3, 8);
                    }
                    View view = this.LLLFFI;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(8, view);
                    }
                }
            }
            View view2 = this.LLLFZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            View view3 = this.LLLFZ;
            if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                layoutParams.height = -2;
            }
            View view4 = this.LLLFZ;
            if (view4 != null) {
                C786410Ut5.W5(view4, layoutParams);
            }
        }
    }
}
