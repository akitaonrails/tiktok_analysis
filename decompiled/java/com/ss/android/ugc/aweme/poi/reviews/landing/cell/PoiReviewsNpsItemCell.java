package com.ss.android.ugc.aweme.poi.reviews.landing.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09JN;
import X.C0NBH;
import X.C1157550gED;
import X.C1172760gck;
import X.C1175120ggY;
import X.C1180030goT;
import X.C1180050goV;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1190250h4x;
import X.C123100dR;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1954807lC;
import X.C197039127h;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C2365509Or;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426160GnO;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1157540gEC;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS54S0400000_18;
import Y.AfS154S0200000_18;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import irm.AkS9S0400000_18;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsNpsItemCell extends PowerCell<PoiReviewsApi.PoiNpsInfo> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;
    public LinearLayout LLILLL;
    public C426160GnO LLILZ;
    public final AssemVMLazy LLILZIL;
    public C197039127h LLILZLL;
    public final C01GW LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiReviewsNpsItemCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/reviews/landing/viewmodel/PoiReviewsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiReviewsNpsItemCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiReviewsListViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1811);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(577);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1795), awS562S0100000_18, AFwS206S0000000_18.get$arr$(469), new AwS562S0100000_18((C03K6) this, 1797), new AwS562S0100000_18((C03K6) this, 1799), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1801), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1803), null, new AwS562S0100000_18((C03K6) this, 1804));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 1798);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1800);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 1802);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 91));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 1805);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 1806);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 1807);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 1808);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 1809);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1810), awS562S0100000_18, AFwS206S0000000_18.get$arr$(470), new AwS562S0100000_18((C03K6) this, 1812), new AwS562S0100000_18((C03K6) this, 1813), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1814), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1815), null, new AwS562S0100000_18((C03K6) this, 1816));
        } else {
            if (!Intrinsics.LJFF(obj, obj)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1817), awS562S0100000_18, AFwS206S0000000_18.get$arr$(471), new AwS562S0100000_18((C03K6) this, 1818), new AwS562S0100000_18((C03K6) this, 1819), new AwS562S0100000_18((C03K6) this, 1820), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 1821));
        }
        this.LLILZIL = assemVMLazy;
        this.LLIZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1796));
    }

    public final PageFinder I5() {
        return (PageFinder) this.LLIZ.getValue();
    }

    public final PoiReviewsListViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (PoiReviewsListViewModel) assemVMLazy.getValue();
    }

    public final void S5() {
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJIIJ);
            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LJIIIZ(2131846608);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.r5y);
        this.LLILLJJLI = (TuxIconView) this.itemView.findViewById(R.id.r5u);
        this.LLILLL = (LinearLayout) this.itemView.findViewById(R.id.r5x);
        this.LLILZ = (C426160GnO) this.itemView.findViewById(R.id.r60);
        this.LLILZLL = (C197039127h) this.itemView.findViewById(R.id.r61);
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 58), tuxIconView);
        }
        C197039127h c197039127h = this.LLILZLL;
        if (c197039127h != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 59), c197039127h);
        }
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 749));
    }

    public final void P5(PoiReviewsApi.PoiNpsInfo poiNpsInfo) {
        C426160GnO c426160GnO;
        C426160GnO c426160GnO2;
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        int iLIZIZ5;
        int iLIZIZ6;
        int iLIZIZ7;
        C426160GnO c426160GnO3;
        String string;
        if (!poiNpsInfo.getStoreNpsInfo().hasShowReasonModule) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            N5();
            String str = N5().LL;
            String strZZ1 = N5().ZZ1();
            String strXQ2 = N5().xQ2();
            Integer num = poiNpsInfo.getStoreNpsInfo().selectedScore;
            if (num != null) {
                string = num.toString();
            } else {
                string = null;
            }
            PageFinder pageFinderI5 = I5();
            c1185430gxB.getClass();
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1189060h32.LJJ("enter_from", "poi_reviews", linkedHashMap);
            C1189060h32.LJJ("poi_id", str, linkedHashMap);
            C1189060h32.LJJ("reviews_id", strXQ2, linkedHashMap);
            C1189060h32.LJJ("star_level", string, linkedHashMap);
            C1189060h32.LIZ(strZZ1, linkedHashMap);
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderI5);
            c1185040gwY.getClass();
            C1185040gwY.LJFF("ttls_reviews_csat_unsatisfacted_feedback_show", linkedHashMap, c1185050gwZ);
            poiNpsInfo.getStoreNpsInfo().setHasShowReasonModule(true);
        }
        C1180030goT storeNpsInfo = poiNpsInfo.getStoreNpsInfo();
        if (storeNpsInfo != null) {
            storeNpsInfo.setNpsShowStep(EnumC1157540gEC.REASON_FEEDBACK);
        }
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(poiNpsInfo.getNegativeTitle());
        }
        Context context = this.itemView.getContext();
        if (context != null) {
            List<PoiReviewsApi.NegativeReason> negativeReasonList = poiNpsInfo.getNegativeReasonList();
            if (negativeReasonList == null) {
                negativeReasonList = C13BV.INSTANCE;
            }
            if (!negativeReasonList.isEmpty()) {
                C426160GnO c426160GnO4 = this.LLILZ;
                if (c426160GnO4 != null) {
                    C786410Ut5.LLZLLLL(c426160GnO4, 0);
                }
                C426160GnO c426160GnO5 = this.LLILZ;
                if (c426160GnO5 != null) {
                    c426160GnO5.setGravity(0);
                }
                if (negativeReasonList.size() == 1 && (c426160GnO3 = this.LLILZ) != null) {
                    c426160GnO3.addView(L5(context, (PoiReviewsApi.NegativeReason) ListProtector.get(negativeReasonList, 0), poiNpsInfo, -1, 0, 0));
                }
                TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
                tuxTextView2.setClickable(true);
                tuxTextView2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                if (numLIZJ != null) {
                    tuxTextView2.setTextColor(numLIZJ.intValue());
                }
                tuxTextView2.setTuxFont(52);
                int iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2;
                int i = 8;
                int iLIZIZ9 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                int width = (((this.itemView.getWidth() - iLIZIZ9) - iLIZIZ8) / 2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                int i2 = 1;
                int i3 = 0;
                int i4 = 0;
                while (i2 < negativeReasonList.size()) {
                    float fMeasureText = tuxTextView2.getPaint().measureText(((PoiReviewsApi.NegativeReason) ListProtector.get(negativeReasonList, i3)).text);
                    float fMeasureText2 = tuxTextView2.getPaint().measureText(((PoiReviewsApi.NegativeReason) ListProtector.get(negativeReasonList, i2)).text);
                    float f = width;
                    if (fMeasureText <= f && fMeasureText2 <= f) {
                        C426160GnO c426160GnO6 = this.LLILZ;
                        if (c426160GnO6 != null) {
                            PoiReviewsApi.NegativeReason negativeReason = (PoiReviewsApi.NegativeReason) ListProtector.get(negativeReasonList, i3);
                            int iLIZIZ10 = width + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                            if (i4 == 0) {
                                iLIZIZ7 = 0;
                            } else {
                                iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                            }
                            c426160GnO6.addView(L5(context, negativeReason, poiNpsInfo, iLIZIZ10, 0, iLIZIZ7));
                        }
                        C426160GnO c426160GnO7 = this.LLILZ;
                        if (c426160GnO7 != null) {
                            PoiReviewsApi.NegativeReason negativeReason2 = (PoiReviewsApi.NegativeReason) ListProtector.get(negativeReasonList, i2);
                            int iLIZIZ11 = width + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                            if (i4 == 0) {
                                iLIZIZ6 = 0;
                            } else {
                                iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                            }
                            c426160GnO7.addView(L5(context, negativeReason2, poiNpsInfo, iLIZIZ11, iLIZIZ9, iLIZIZ6));
                        }
                    } else {
                        float f2 = fMeasureText2 + fMeasureText;
                        float f3 = width * 2;
                        if (f2 <= f3) {
                            C426160GnO c426160GnO8 = this.LLILZ;
                            if (c426160GnO8 != null) {
                                PoiReviewsApi.NegativeReason negativeReason3 = (PoiReviewsApi.NegativeReason) ListProtector.get(negativeReasonList, i3);
                                int iLIZIZ12 = ((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + fMeasureText)) + 2;
                                if (i4 == 0) {
                                    iLIZIZ3 = 0;
                                } else {
                                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                                }
                                c426160GnO8.addView(L5(context, negativeReason3, poiNpsInfo, iLIZIZ12, 0, iLIZIZ3));
                            }
                            C426160GnO c426160GnO9 = this.LLILZ;
                            if (c426160GnO9 != null) {
                                PoiReviewsApi.NegativeReason negativeReason4 = (PoiReviewsApi.NegativeReason) ListProtector.get(negativeReasonList, i2);
                                int width2 = (int) ((((this.itemView.getWidth() - iLIZIZ8) - iLIZIZ9) - fMeasureText) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                                int i5 = iLIZIZ9 - 2;
                                if (i4 == 0) {
                                    iLIZIZ2 = 0;
                                } else {
                                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                                }
                                c426160GnO9.addView(L5(context, negativeReason4, poiNpsInfo, width2, i5, iLIZIZ2));
                            }
                        } else {
                            if (f2 > f3) {
                                C426160GnO c426160GnO10 = this.LLILZ;
                                if (c426160GnO10 != null) {
                                    PoiReviewsApi.NegativeReason negativeReason5 = (PoiReviewsApi.NegativeReason) ListProtector.get(negativeReasonList, i3);
                                    if (i4 == 0) {
                                        iLIZIZ5 = 0;
                                    } else {
                                        iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                                    }
                                    c426160GnO10.addView(L5(context, negativeReason5, poiNpsInfo, -1, 0, iLIZIZ5));
                                }
                            } else {
                                C426160GnO c426160GnO11 = this.LLILZ;
                                if (c426160GnO11 != null) {
                                    PoiReviewsApi.NegativeReason negativeReason6 = (PoiReviewsApi.NegativeReason) ListProtector.get(negativeReasonList, i3);
                                    if (i4 == 0) {
                                        iLIZIZ4 = 0;
                                    } else {
                                        iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                                    }
                                    c426160GnO11.addView(L5(context, negativeReason6, poiNpsInfo, -1, 0, iLIZIZ4));
                                }
                            }
                            i3++;
                            i2 = i3 + 1;
                            i4++;
                            i = 8;
                        }
                    }
                    i3 = i2 + 1;
                    i2 = i3 + 1;
                    i4++;
                }
                if (i3 == negativeReasonList.size() - 1 && (c426160GnO2 = this.LLILZ) != null) {
                    PoiReviewsApi.NegativeReason negativeReason7 = (PoiReviewsApi.NegativeReason) ListProtector.get(negativeReasonList, i3);
                    if (i4 == 0) {
                        iLIZIZ = 0;
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    }
                    c426160GnO2.addView(L5(context, negativeReason7, poiNpsInfo, -1, 0, iLIZIZ));
                }
            }
        }
        if (poiNpsInfo.getNegativeReasonList() != null && (!r0.isEmpty()) && (c426160GnO = this.LLILZ) != null) {
            C786410Ut5.LLZLLLL(c426160GnO, 0);
        }
        R5(poiNpsInfo);
    }

    public final void R5(PoiReviewsApi.PoiNpsInfo poiNpsInfo) {
        C197039127h c197039127h = this.LLILZLL;
        if (c197039127h != null) {
            boolean z = false;
            C786410Ut5.LLLLLLJ(c197039127h, 0);
            if (poiNpsInfo.getStoreNpsInfo().npsSelectedReason != null && (!r0.isEmpty())) {
                z = true;
            }
            c197039127h.setEnabled(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T5(Function0<Unit> function0) {
        String string;
        String string2;
        Double d;
        PoiReviewsApi.PoiNpsInfo item = getItem();
        if (item != null) {
            PoiReviewsListViewModel poiReviewsListViewModelN5 = N5();
            String questionId = item.getQuestionId();
            String str = "";
            if (questionId == null) {
                questionId = "";
            }
            String str2 = N5().LL;
            if (str2 != null) {
                str = str2;
            }
            int iLIZJ = C1175120ggY.LIZJ(item.getStoreNpsInfo().selectedScore);
            List<PoiReviewsApi.NegativeReason> list = item.getStoreNpsInfo().npsSelectedReason;
            String str3 = item.getStoreNpsInfo().recordId;
            String questionTitle = item.getQuestionTitle();
            String questionTitleEn = item.getQuestionTitleEn();
            String strXQ2 = N5().xQ2();
            String strValueOf = String.valueOf(getAbsoluteAdapterPosition() + 1);
            Integer npsPos = item.getNpsPos();
            String strLJJLIIIJ = null;
            if (npsPos != null) {
                string = npsPos.toString();
            } else {
                string = null;
            }
            PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = ((C1190250h4x) N5().getState()).LL;
            if (poiReviewSummaryModel != null && (d = poiReviewSummaryModel.score) != null) {
                string2 = d.toString();
            } else {
                string2 = null;
            }
            PoiReviewsApi.NpsExtraInfo npsExtraInfo = new PoiReviewsApi.NpsExtraInfo(questionTitle, questionTitleEn, strXQ2, strValueOf, string, string2);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (PoiReviewsApi.NegativeReason negativeReason : list) {
                    if (C123100dR.LIZ(negativeReason.id)) {
                        arrayList.add(negativeReason);
                    }
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS256S0000000_18.get$arr$(915), 30);
            }
            if (poiReviewsListViewModelN5.LLJJL != null) {
                PoiReviewsApi.LIZ.getClass();
                C0NBH.LIZ(C1172760gck.LIZ().submitPoiReviewNpsScore(questionId, str, iLIZJ, strLJJLIIIJ, str3, C2365509Or.LJ(npsExtraInfo))).LJJLL(new AfS154S0200000_18(function0, item, 22), new C09JN() { // from class: X.00Ol
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("PoiReviewsLandingViewModel@ad2c.submitNps$2");
                        C1C7U.LIZIZ("PoiReviewsLandingViewModel@ad2c.submitNps$2");
                    }
                });
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        EnumC1157540gEC enumC1157540gEC;
        int i;
        PoiReviewsApi.PoiNpsInfo poiNpsInfo = (PoiReviewsApi.PoiNpsInfo) interfaceC1891350zJl;
        super.onBindItemView(poiNpsInfo);
        LinearLayout linearLayout = this.LLILLL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        LinearLayout linearLayout2 = this.LLILLL;
        if (linearLayout2 != null) {
            C786410Ut5.LJJJJJL(linearLayout2);
        }
        TuxTextView tuxTextView3 = this.LL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText("");
        }
        C426160GnO c426160GnO = this.LLILZ;
        if (c426160GnO != null) {
            C786410Ut5.LLZLLLL(c426160GnO, 8);
        }
        C426160GnO c426160GnO2 = this.LLILZ;
        if (c426160GnO2 != null) {
            C786410Ut5.LJJJJZ(c426160GnO2);
        }
        C197039127h c197039127h = this.LLILZLL;
        if (c197039127h != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 8);
        }
        poiNpsInfo.getStoreNpsInfo().setHasShowRatingModule(true);
        C1180030goT storeNpsInfo = poiNpsInfo.getStoreNpsInfo();
        if (storeNpsInfo != null && (enumC1157540gEC = storeNpsInfo.npsShowStep) != null && (i = C1157550gED.LIZ[enumC1157540gEC.ordinal()]) != -1 && i != 1) {
            if (i == 2) {
                P5(poiNpsInfo);
                return;
            }
            throw new C1954807lC();
        }
        if (poiNpsInfo.getStoreNpsInfo().hasDoClick) {
            String responseTitle = poiNpsInfo.getResponseTitle();
            if (C123100dR.LIZ(responseTitle) && responseTitle != null && (tuxTextView2 = this.LL) != null) {
                tuxTextView2.setText(responseTitle);
            }
        } else {
            String questionTitle = poiNpsInfo.getQuestionTitle();
            if (C123100dR.LIZ(questionTitle) && questionTitle != null && (tuxTextView = this.LL) != null) {
                tuxTextView.setText(questionTitle);
            }
        }
        poiNpsInfo.getStoreNpsInfo().setNpsShowStep(EnumC1157540gEC.RATING);
        List<PoiReviewsApi.ScoreInfo> scoreInfoList = poiNpsInfo.getScoreInfoList();
        if (scoreInfoList == null || !(!scoreInfoList.isEmpty())) {
            return;
        }
        for (PoiReviewsApi.ScoreInfo scoreInfo : scoreInfoList) {
            LinearLayout linearLayout3 = this.LLILLL;
            if (linearLayout3 != null) {
                C786410Ut5.LJZL(0, linearLayout3);
            }
            LinearLayout linearLayout4 = this.LLILLL;
            if (linearLayout4 != null) {
                C1180050goV c1180050goV = new C1180050goV(this.itemView.getContext(), null);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1180050goV);
                c1180050goV.setLayoutParams(layoutParams);
                if (poiNpsInfo.getStoreNpsInfo().hasDoClick) {
                    c1180050goV.setUrl(scoreInfo.selectedUrl);
                } else {
                    c1180050goV.setUrl(scoreInfo.unselectedUrl);
                }
                c1180050goV.setText(scoreInfo.text);
                C786410Ut5.I7(new AkS9S0400000_18(c1180050goV, this, poiNpsInfo, scoreInfo, 3), c1180050goV);
                linearLayout4.addView(c1180050goV);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e1y, viewGroup, false);
    }

    public final TuxTextView L5(Context context, PoiReviewsApi.NegativeReason negativeReason, PoiReviewsApi.PoiNpsInfo poiNpsInfo, int i, int i2, int i3) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(negativeReason.text);
        tuxTextView.setClickable(true);
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        tuxTextView.setTuxFont(52);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
        tuxTextView.setGravity(17);
        C786410Ut5.R6(tuxTextView, marginLayoutParams);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        StateListDrawable stateListDrawable = new StateListDrawable();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJ = C1308910kAL.LIZJ(R.attr.a02, context);
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        Drawable drawableLIZ = c384050F3z.LIZ(context);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
        c384050F3z2.LJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, c384050F3z2.LIZ(context));
        stateListDrawable.addState(new int[]{-16842913}, drawableLIZ);
        tuxTextView.setBackground(stateListDrawable);
        List<PoiReviewsApi.NegativeReason> list = poiNpsInfo.getStoreNpsInfo().npsSelectedReason;
        if (list != null && list.contains(negativeReason)) {
            tuxTextView.setSelected(true);
        } else {
            tuxTextView.setSelected(false);
        }
        C1189060h32.LJJII(tuxTextView, Integer.valueOf(i2), Integer.valueOf(i3), null, null);
        C786410Ut5.h9(tuxTextView, new ACListenerS54S0400000_18(tuxTextView, poiNpsInfo, negativeReason, this, 1));
        return tuxTextView;
    }
}
