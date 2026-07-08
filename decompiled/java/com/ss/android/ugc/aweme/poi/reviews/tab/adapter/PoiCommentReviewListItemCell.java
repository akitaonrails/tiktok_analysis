package com.ss.android.ugc.aweme.poi.reviews.tab.adapter;

import X.C01GW;
import X.C0FV2;
import X.C1189060h32;
import X.C1191140h6O;
import X.C1202300hOO;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697580uHE;
import X.C1843500y4a;
import X.C2211631BhB;
import X.C295050BhP;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427690Gpr;
import X.C452501pT;
import X.C523420Kfs;
import X.C786410Ut5;
import X.C814420VxA;
import X.ViewOnLongClickListenerC1208780hYq;
import Y.ACListenerS121S0200000_18;
import Y.ACListenerS153S0100000_18;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel.PoiCommentReviewListVM;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCommentReviewListItemCell extends PowerCell<PoiReviewsApi.PoiReviewModel> {
    public PoiCommentReviewListVM LL;
    public C1191140h6O LLILLJJLI;
    public C1202300hOO LLILLL;
    public ViewGroup LLILZ;
    public SmartImageView LLILZIL;
    public SmartImageView LLILZLL;
    public SmartImageView LLIZ;
    public View LLIZLLLIL;
    public TuxTextView LLJ;
    public View LLJI;
    public TuxTextView LLJIJIL;
    public TuxIconView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public int LLJILLL;
    public PoiReviewsApi.PoiReviewModel LLJJI;
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1980));
    public final ACListenerS153S0100000_18 LLJJIII = new ACListenerS153S0100000_18(this, 99);

    public final ArrayList<PoiGalleryAnchorData> N5() {
        ArrayList<PoiGalleryAnchorData> arrayList = new ArrayList<>();
        int[] iArr = new int[2];
        SmartImageView smartImageView = this.LLILZIL;
        if (smartImageView != null && smartImageView.getVisibility() == 0) {
            I5(this.LLILZIL, iArr, new AwS597S0100000_18((ArrayList) arrayList, (ArrayList<PoiGalleryAnchorData>) 488));
        }
        SmartImageView smartImageView2 = this.LLILZLL;
        if (smartImageView2 != null && smartImageView2.getVisibility() == 0) {
            I5(this.LLILZLL, iArr, new AwS597S0100000_18((ArrayList) arrayList, (ArrayList<PoiGalleryAnchorData>) 489));
        }
        SmartImageView smartImageView3 = this.LLIZ;
        if (smartImageView3 != null && smartImageView3.getVisibility() == 0) {
            I5(this.LLIZ, iArr, new AwS597S0100000_18((ArrayList) arrayList, (ArrayList<PoiGalleryAnchorData>) 490));
        }
        return arrayList;
    }

    public final PageFinder P5() {
        return (PageFinder) this.LLJJ.getValue();
    }

    public final int L5() {
        return getBindingAdapterPosition() + 1;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        SmartImageView smartImageView;
        SmartImageView smartImageView2;
        SmartImageView smartImageView3;
        PoiCommentReviewCellVAbility poiCommentReviewCellVAbility;
        super.onItemViewCreated();
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        SmartImageView smartImageView4 = null;
        if (fragmentLJIIJ != null && (poiCommentReviewCellVAbility = (PoiCommentReviewCellVAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiCommentReviewCellVAbility.class, null)) != null) {
            this.LL = poiCommentReviewCellVAbility.jM2();
        }
        this.LLILLJJLI = (C1191140h6O) this.itemView.findViewById(R.id.thf);
        this.LLILLL = (C1202300hOO) this.itemView.findViewById(R.id.text);
        this.LLJI = this.itemView.findViewById(R.id.mnd);
        this.LLJILJIL = (TuxIconView) this.itemView.findViewById(R.id.mnv);
        this.LLJIJIL = (TuxTextView) this.itemView.findViewById(R.id.mnh);
        this.itemView.findViewById(R.id.m6p);
        C427690Gpr.LJ(this.itemView, 0.0f);
        View view = this.LLJI;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 100), view);
        }
        this.LLILZ = (ViewGroup) this.itemView.findViewById(R.id.kc4);
        this.LLIZLLLIL = this.itemView.findViewById(R.id.olm);
        this.LLJ = (TuxTextView) this.itemView.findViewById(R.id.oll);
        this.LLJILJILJ = (TuxTextView) this.itemView.findViewById(R.id.ffs);
        this.LLJILLL = C814420VxA.LIZIZ(((((C0FV2.LIZIZ(getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) * 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / 3.0f);
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup == null || (smartImageView = (SmartImageView) viewGroup.findViewById(R.id.tgn)) == null) {
            smartImageView = null;
        } else {
            int i = this.LLJILLL;
            C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams(i, i));
        }
        this.LLILZIL = smartImageView;
        ViewGroup viewGroup2 = this.LLILZ;
        if (viewGroup2 == null || (smartImageView2 = (SmartImageView) viewGroup2.findViewById(R.id.tgo)) == null) {
            smartImageView2 = null;
        } else {
            int i2 = this.LLJILLL;
            C786410Ut5.G6(smartImageView2, new LinearLayout.LayoutParams(i2, i2));
        }
        this.LLILZLL = smartImageView2;
        ViewGroup viewGroup3 = this.LLILZ;
        if (viewGroup3 != null && (smartImageView3 = (SmartImageView) viewGroup3.findViewById(R.id.tgp)) != null) {
            int i3 = this.LLJILLL;
            C786410Ut5.G6(smartImageView3, new LinearLayout.LayoutParams(i3, i3));
            smartImageView4 = smartImageView3;
        }
        this.LLIZ = smartImageView4;
        int iLIZ = C295050BhP.LIZ();
        if (Build.VERSION.SDK_INT < 26 || iLIZ <= 0) {
            CommentService.LIZ.getClass();
            C523420Kfs.LIZ().LJLJI(this.LLILLL);
            C523420Kfs.LIZ().LJJJ(this.LLILLL);
        } else {
            C1202300hOO c1202300hOO = this.LLILLL;
            if (c1202300hOO != null) {
                c1202300hOO.setTypeface(C1697580uHE.LIZIZ(0.0f, iLIZ, 0.0f, 0.0f, null, 0.0f, 0, null, 253));
            }
        }
        SmartImageView smartImageView5 = this.LLILZIL;
        if (smartImageView5 != null) {
            C786410Ut5.Q8(smartImageView5, this.LLJJIII);
        }
        SmartImageView smartImageView6 = this.LLILZLL;
        if (smartImageView6 != null) {
            C786410Ut5.Q8(smartImageView6, this.LLJJIII);
        }
        SmartImageView smartImageView7 = this.LLIZ;
        if (smartImageView7 != null) {
            C786410Ut5.Q8(smartImageView7, this.LLJJIII);
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e3);
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(99)));
        Drawable drawableLIZ = c384050F3z.LIZ(this.itemView.getContext());
        View view2 = this.LLIZLLLIL;
        if (view2 != null) {
            view2.setBackground(drawableLIZ);
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 101), view2);
        }
        C1202300hOO c1202300hOO2 = this.LLILLL;
        if (c1202300hOO2 != null) {
            C786410Ut5.ja(c1202300hOO2, new ACListenerS121S0200000_18(this, c1202300hOO2, 67));
            c1202300hOO2.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 34));
        }
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 1029));
    }

    public final void R5(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        boolean zLJFF;
        Long l;
        long jLongValue;
        Long l2;
        View view = this.LLJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        TuxTextView tuxTextView = this.LLJIJIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        TuxTextView tuxTextView2 = this.LLJIJIL;
        if (tuxTextView2 != null) {
            PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModel.getStatistics();
            if (statistics != null && (l2 = statistics.likeCount) != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            tuxTextView2.setText(C1843500y4a.LIZIZ(jLongValue));
        }
        PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
        if (userStatus != null) {
            zLJFF = Intrinsics.LJFF(userStatus.liked, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            TuxTextView tuxTextView3 = this.LLJIJIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setTextColorRes(R.attr.a04);
            }
            TuxIconView tuxIconView = this.LLJILJIL;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_thumbs_up_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            TuxTextView tuxTextView4 = this.LLJIJIL;
            if (tuxTextView4 != null) {
                tuxTextView4.setTuxFont(71);
            }
        } else {
            TuxTextView tuxTextView5 = this.LLJIJIL;
            if (tuxTextView5 != null) {
                tuxTextView5.setTextColorRes(R.attr.a1k);
            }
            TuxIconView tuxIconView2 = this.LLJILJIL;
            if (tuxIconView2 != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_thumbs_up;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
                tuxIconView2.setTuxIcon(c419910GdJ2);
            }
            TuxTextView tuxTextView6 = this.LLJIJIL;
            if (tuxTextView6 != null) {
                tuxTextView6.setTuxFont(71);
            }
        }
        PoiReviewsApi.PoiReviewStatisticsModel statistics2 = poiReviewModel.getStatistics();
        if (statistics2 != null && (l = statistics2.likeCount) != null && l.longValue() == 0) {
            TuxTextView tuxTextView7 = this.LLJIJIL;
            if (tuxTextView7 != null) {
                C786410Ut5.LLLLZLL(tuxTextView7, 8);
                return;
            }
            return;
        }
        TuxTextView tuxTextView8 = this.LLJIJIL;
        if (tuxTextView8 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView8, 0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e1z, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        PoiCommentReviewListVM poiCommentReviewListVM = this.LL;
        if (poiCommentReviewListVM != null) {
            poiCommentReviewListVM.LLJJI = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cf  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r26, java.util.List r27) {
        /*
            Method dump skipped, instruction units count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.tab.adapter.PoiCommentReviewListItemCell.onBindItemView(X.0zJl, java.util.List):void");
    }

    public static void I5(SmartImageView smartImageView, int[] iArr, Function1 function1) {
        if (smartImageView != null && smartImageView.getVisibility() == 0) {
            smartImageView.getLocationOnScreen(iArr);
            function1.invoke(new PoiGalleryAnchorData(smartImageView.getWidth(), smartImageView.getHeight(), iArr[0], iArr[1], 240));
        }
    }
}
