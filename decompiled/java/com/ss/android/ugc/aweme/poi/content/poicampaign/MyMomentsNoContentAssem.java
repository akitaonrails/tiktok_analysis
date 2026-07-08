package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C019F;
import X.C1180060goW;
import X.C1198080hHa;
import X.C1198160hHi;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C339190DRl;
import X.C384050F3z;
import X.C654910PmT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.AddLocationVideoViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS6S1100000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class MyMomentsNoContentAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1198160hHi.class, "MyMomentsAddLocationStatusHierarchyData"), checkSupervisorPrepared());
    public SmartImageView LLJJIII;
    public SmartImageView LLJJIJI;
    public SmartImageView LLJJIJIIJIL;
    public View LLJJIJIL;
    public TuxTextView LLJJJ;
    public ConstraintLayout LLJJJIL;
    public TuxTextView LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MyMomentsNoContentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/content/poicampaign/addlocation/AddLocationVideoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MyMomentsNoContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddLocationVideoViewModel.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 957), AFwS256S0000000_18.get$arr$(306), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dxr;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        View view2;
        String str2;
        String str3;
        super.onViewCreated(view);
        this.LLJJIII = (SmartImageView) view.findViewById(R.id.bo6);
        this.LLJJIJI = (SmartImageView) view.findViewById(R.id.ae2);
        this.LLJJIJIIJIL = (SmartImageView) view.findViewById(R.id.kb6);
        this.LLJJIJIL = view.findViewById(R.id.bnw);
        this.LLJJJIL = (ConstraintLayout) view.findViewById(R.id.hlj);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.kn6);
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.hlk);
        AssemVMLazy assemVMLazy = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        MyMomentsVideoListResponse myMomentsVideoListResponseLIZ = ((C1198080hHa) assemVMLazy.getValue().getState()).LLILLJJLI.LIZ();
        TuxTextView tuxTextView = this.LLJJJ;
        if (tuxTextView != null) {
            if (myMomentsVideoListResponseLIZ != null) {
                str3 = myMomentsVideoListResponseLIZ.description;
            } else {
                str3 = null;
            }
            tuxTextView.setText(str3);
        }
        TuxTextView tuxTextView2 = this.LLJJJ;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(51);
        }
        Integer num = ((C1198160hHi) this.LLJJI.getValue()).LLILLL;
        if (num != null && num.intValue() == 1) {
            C339190DRl.LIZIZ(this.LLJJJIL);
        }
        if (myMomentsVideoListResponseLIZ != null && (str2 = myMomentsVideoListResponseLIZ.decorationImage) != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
            c1331670kl3LJIIIZ.LJJIJL(getContext());
            c1331670kl3LJIIIZ.LJJ(this.LLJJIJI);
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C654910PmT.LIZ(12.0f, getContext());
            c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        Context context = getContext();
        if (context != null && (view2 = this.LLJJIJIL) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(C1180060goW.LJII("#FFFFF7E7"));
            c384050F3z.LIZJ = Float.valueOf(C339190DRl.LIZ(12));
            view2.setBackground(c384050F3z.LIZ(context));
        }
        if (myMomentsVideoListResponseLIZ != null) {
            String str4 = myMomentsVideoListResponseLIZ.secondaryTopImage;
            if (str4 != null) {
                C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str4);
                c1331670kl3LJIIIZ2.LJJIJL(getContext());
                c1331670kl3LJIIIZ2.LJJ(this.LLJJIII);
                C786410Ut5.h3(c1331670kl3LJIIIZ2);
            }
            String str5 = myMomentsVideoListResponseLIZ.noDataImage;
            if (str5 != null) {
                C1331670kl3 c1331670kl3LJIIIZ3 = C1331660kl2.LJIIIZ(str5);
                c1331670kl3LJIIIZ3.LJJIJL(getContext());
                c1331670kl3LJIIIZ3.LJJ(this.LLJJIJIIJIL);
                C786410Ut5.h3(c1331670kl3LJIIIZ3);
            }
        }
        Integer num2 = ((C1198080hHa) this.LLJJJJJIL.getValue().getState()).LLILZ;
        if (num2 != null && num2.intValue() == 1) {
            str = "my_year_campaign_new_user";
        } else {
            str = "my_year_campaign_old_user";
        }
        ConstraintLayout constraintLayout = this.LLJJJIL;
        if (constraintLayout != null) {
            C786410Ut5.I7(new AkS6S1100000_18(this, str, 0), constraintLayout);
        }
        TuxTextView tuxTextView3 = this.LLJJJJ;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(2131823045);
        }
        TuxTextView tuxTextView4 = this.LLJJJJ;
        if (tuxTextView4 != null) {
            tuxTextView4.setTuxFont(33);
        }
    }
}
