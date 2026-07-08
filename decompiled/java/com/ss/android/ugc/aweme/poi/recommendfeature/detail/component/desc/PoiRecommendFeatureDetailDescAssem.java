package com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.desc;

import X.C1308910kAL;
import X.C1361400lX0;
import X.C13BV;
import X.C13LP;
import X.C2188811AlT;
import X.C339190DRl;
import X.C418440Gaw;
import X.C425810Gmp;
import X.C427660Gpo;
import X.C438710HIf;
import X.C814420VxA;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureDetailDescAssem extends BaseSlashGlueSlotAssemComponent<PoiRecommendFeatureDetailDescModule> {
    public FrameLayout LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public C427660Gpo LLJL;
    public C425810Gmp LLJLIL;
    public Integer LLJLILLLLZIIL;
    public Integer LLJLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e6p;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        TuxTextView tuxTextView;
        TuxIconView tuxIconView;
        TuxTextView tuxTextView2;
        Pair pair;
        PoiRecommendFeatureDetailDescModule poiRecommendFeatureDetailDescModule = (PoiRecommendFeatureDetailDescModule) baseComponentData;
        super.CG1(poiRecommendFeatureDetailDescModule);
        Integer topRank = poiRecommendFeatureDetailDescModule.getTopRank();
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        String strLIZIZ = null;
        if (frameLayout != null) {
            if (topRank != null && topRank.intValue() > 0) {
                C339190DRl.LIZLLL(frameLayout);
                TuxTextView tuxTextView3 = this.LLJJIJIL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(topRank.toString());
                }
                if (topRank.intValue() == 1) {
                    pair = new Pair(Integer.valueOf(R.drawable.d8d), Integer.valueOf(R.attr.nt));
                } else if (topRank.intValue() == 2) {
                    pair = new Pair(Integer.valueOf(R.drawable.d8e), Integer.valueOf(R.attr.cb));
                } else if (topRank.intValue() == 3) {
                    pair = new Pair(Integer.valueOf(R.drawable.d8f), Integer.valueOf(R.attr.f2));
                } else {
                    frameLayout.setBackground(null);
                    Integer num = this.LLJLL;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        TuxTextView tuxTextView4 = this.LLJJIJIL;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setTextColor(iIntValue);
                        }
                    }
                }
                frameLayout.setBackgroundResource(((Number) pair.getFirst()).intValue());
                Integer numLIZJ = C1308910kAL.LIZJ(((Number) pair.getSecond()).intValue(), new C1361400lX0(LJJIJL().getContext(), R.style.y3));
                if (numLIZJ != null) {
                    int iIntValue2 = numLIZJ.intValue();
                    TuxTextView tuxTextView5 = this.LLJJIJIL;
                    if (tuxTextView5 != null) {
                        tuxTextView5.setTextColor(iIntValue2);
                    }
                }
            } else {
                C339190DRl.LIZIZ(frameLayout);
            }
        }
        String name = poiRecommendFeatureDetailDescModule.getName();
        TuxTextView tuxTextView6 = this.LLJJJ;
        if (tuxTextView6 != null) {
            if (name != null && !a0.LJJJIL(name)) {
                C339190DRl.LIZLLL(tuxTextView6);
                tuxTextView6.setText(name);
            } else {
                C339190DRl.LIZIZ(tuxTextView6);
            }
        }
        String priceCurrency = poiRecommendFeatureDetailDescModule.getPriceCurrency();
        String priceNum = poiRecommendFeatureDetailDescModule.getPriceNum();
        if (priceNum != null && !a0.LJJJIL(priceNum)) {
            if (priceCurrency != null && !a0.LJJJIL(priceCurrency)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(priceCurrency);
                sbLIZ.append(priceNum);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = priceNum;
            }
        }
        TuxTextView tuxTextView7 = this.LLJJJIL;
        if (tuxTextView7 != null) {
            if (strLIZIZ != null && !a0.LJJJIL(strLIZIZ)) {
                C339190DRl.LIZLLL(tuxTextView7);
                tuxTextView7.setText(strLIZIZ);
            } else {
                C339190DRl.LIZIZ(tuxTextView7);
            }
        }
        boolean zLJFF = Intrinsics.LJFF(poiRecommendFeatureDetailDescModule.isHot(), Boolean.TRUE);
        String likeNumDisplay = poiRecommendFeatureDetailDescModule.getLikeNumDisplay();
        if (zLJFF) {
            TuxIconView tuxIconView2 = this.LLJJJJJIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setImageResource(R.drawable.cv7);
                C339190DRl.LIZLLL(tuxIconView2);
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.nt, LJJIJL().getContext());
            if (numLIZJ2 != null) {
                int iIntValue3 = numLIZJ2.intValue();
                TuxTextView tuxTextView8 = this.LLJJJJ;
                if (tuxTextView8 != null) {
                    tuxTextView8.setTextColor(iIntValue3);
                }
            }
        } else {
            TuxIconView tuxIconView3 = this.LLJJJJJIL;
            if (tuxIconView3 != null) {
                C339190DRl.LIZIZ(tuxIconView3);
            }
            Integer num2 = this.LLJLILLLLZIIL;
            if (num2 != null) {
                int iIntValue4 = num2.intValue();
                TuxTextView tuxTextView9 = this.LLJJJJ;
                if (tuxTextView9 != null) {
                    tuxTextView9.setTextColor(iIntValue4);
                }
            }
        }
        TuxTextView tuxTextView10 = this.LLJJJJ;
        if (tuxTextView10 != null) {
            if (likeNumDisplay != null && !a0.LJJJIL(likeNumDisplay)) {
                C339190DRl.LIZLLL(tuxTextView10);
                tuxTextView10.setText(likeNumDisplay);
            } else {
                C339190DRl.LIZIZ(tuxTextView10);
            }
        }
        List<UrlModel> userAvatarList = poiRecommendFeatureDetailDescModule.getUserAvatarList();
        if (userAvatarList == null) {
            userAvatarList = C13BV.INSTANCE;
        }
        List listLL = C13LP.LL(userAvatarList, 2);
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            C339190DRl.LIZIZ(view);
        }
        C427660Gpo c427660Gpo = this.LLJL;
        if (c427660Gpo != null) {
            C339190DRl.LIZIZ(c427660Gpo);
        }
        C425810Gmp c425810Gmp = this.LLJLIL;
        if (c425810Gmp != null) {
            C339190DRl.LIZIZ(c425810Gmp);
        }
        int size = listLL.size();
        if (size != 1) {
            if (size == 2) {
                View view2 = this.LLJJLIIIJLLLLLLLZ;
                if (view2 != null) {
                    C339190DRl.LIZLLL(view2);
                }
                C425810Gmp c425810Gmp2 = this.LLJLIL;
                if (c425810Gmp2 != null) {
                    C339190DRl.LIZLLL(c425810Gmp2);
                }
                C425810Gmp c425810Gmp3 = this.LLJLIL;
                if (c425810Gmp3 != null) {
                    c425810Gmp3.LIZ((UrlModel) ListProtector.get(listLL, 0), (UrlModel) ListProtector.get(listLL, 1));
                }
            }
        } else {
            View view3 = this.LLJJLIIIJLLLLLLLZ;
            if (view3 != null) {
                C339190DRl.LIZLLL(view3);
            }
            C427660Gpo c427660Gpo2 = this.LLJL;
            if (c427660Gpo2 != null) {
                C339190DRl.LIZLLL(c427660Gpo2);
            }
            C427660Gpo c427660Gpo3 = this.LLJL;
            if (c427660Gpo3 != null) {
                C427660Gpo.LJIIJJI(c427660Gpo3, C438710HIf.LIZ((UrlModel) ListProtector.get(listLL, 0)), false, null, null, false, false, null, null, false, null, 1022);
            }
        }
        String recommendText = poiRecommendFeatureDetailDescModule.getRecommendText();
        TuxTextView tuxTextView11 = this.LLJJJJLIIL;
        if (tuxTextView11 != null) {
            if (recommendText != null && !a0.LJJJIL(recommendText)) {
                C339190DRl.LIZLLL(tuxTextView11);
                tuxTextView11.setText(recommendText);
            } else {
                C339190DRl.LIZIZ(tuxTextView11);
            }
        }
        View view4 = this.LLJJLIIIJLLLLLLLZ;
        if ((view4 != null && view4.getVisibility() == 0) || (((tuxTextView = this.LLJJJJ) != null && tuxTextView.getVisibility() == 0) || (((tuxIconView = this.LLJJJJJIL) != null && tuxIconView.getVisibility() == 0) || ((tuxTextView2 = this.LLJJJIL) != null && tuxTextView2.getVisibility() == 0)))) {
            View view5 = this.LLJJL;
            if (view5 != null) {
                C339190DRl.LIZLLL(view5);
                return;
            }
            return;
        }
        View view6 = this.LLJJL;
        if (view6 == null) {
            return;
        }
        C339190DRl.LIZIZ(view6);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numValueOf;
        super.onViewCreated(view);
        this.LLJJIJIIJIL = (FrameLayout) view.findViewById(R.id.r_0);
        this.LLJJIJIL = (TuxTextView) view.findViewById(R.id.r_1);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.r_3);
        this.LLJJJIL = (TuxTextView) view.findViewById(R.id.r9z);
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.r9y);
        this.LLJJJJJIL = (TuxIconView) view.findViewById(R.id.r9x);
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.r_2);
        this.LLJJL = view.findViewById(R.id.r9v);
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.r9t);
        this.LLJL = (C427660Gpo) view.findViewById(R.id.r9w);
        C425810Gmp c425810Gmp = (C425810Gmp) view.findViewById(R.id.r9u);
        this.LLJLIL = c425810Gmp;
        Double dValueOf = Double.valueOf(1.6d);
        if (c425810Gmp != null) {
            c425810Gmp.setGapPx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)));
        }
        C425810Gmp c425810Gmp2 = this.LLJLIL;
        if (c425810Gmp2 != null) {
            c425810Gmp2.setOverlapPx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)));
        }
        TuxTextView tuxTextView = this.LLJJJJ;
        Integer numValueOf2 = null;
        if (tuxTextView != null) {
            numValueOf = Integer.valueOf(tuxTextView.getCurrentTextColor());
        } else {
            numValueOf = null;
        }
        this.LLJLILLLLZIIL = numValueOf;
        TuxTextView tuxTextView2 = this.LLJJIJIL;
        if (tuxTextView2 != null) {
            numValueOf2 = Integer.valueOf(tuxTextView2.getCurrentTextColor());
        }
        this.LLJLL = numValueOf2;
    }
}
