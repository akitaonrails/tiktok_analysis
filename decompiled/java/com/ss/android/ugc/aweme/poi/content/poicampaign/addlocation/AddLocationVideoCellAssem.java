package com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation;

import X.C019F;
import X.C1158280gFO;
import X.C1180060goW;
import X.C1180600gpO;
import X.C1189360h3W;
import X.C123100dR;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C339190DRl;
import X.C438710HIf;
import X.C654910PmT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class AddLocationVideoCellAssem extends ReusedUISlotAssem<AddLocationVideoCellAssem> implements InterfaceC712990Rxx<C1158280gFO> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;
    public ConstraintLayout LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public TuxTextView LLJZ;
    public boolean LLJZIJLIL;
    public TuxIconView LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddLocationVideoCellAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/content/poicampaign/addlocation/AddLocationVideoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AddLocationVideoCellAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddLocationVideoViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 959), AFwS256S0000000_18.get$arr$(308), null, true);
        this.LLJZIJLIL = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dxm;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final AddLocationVideoViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        return (AddLocationVideoViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLIL = (ConstraintLayout) view.findViewById(R.id.xlh);
        this.LLJL = (SmartImageView) view.findViewById(R.id.video_image);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.video_length);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.title);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.ffs);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.km1);
        this.LLJZ = (TuxTextView) view.findViewById(R.id.ae0);
        this.LLL = (TuxIconView) view.findViewById(R.id.ae1);
        TuxTextView tuxTextView = this.LLJLL;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(71);
        }
        TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(102);
        }
        TuxTextView tuxTextView3 = this.LLJLLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setTuxFont(62);
        }
        TuxTextView tuxTextView4 = this.LLJLLIL;
        if (tuxTextView4 != null) {
            tuxTextView4.setTuxFont(71);
        }
        TuxTextView tuxTextView5 = this.LLJZ;
        if (tuxTextView5 != null) {
            tuxTextView5.setTuxFont(72);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1158280gFO c1158280gFO) {
        String strK4;
        C1158280gFO c1158280gFO2 = c1158280gFO;
        C1189360h3W c1189360h3WLIZ = new C1180600gpO("add_poi_campaign", "video_img", null).LIZ(C438710HIf.LIZ(c1158280gFO2.LLILLL.getVideo().getCover()));
        c1189360h3WLIZ.LIZ.LJJIJL(getContext());
        c1189360h3WLIZ.LIZLLL(this.LLJL);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C654910PmT.LIZ(8.0f, getContext());
        c1189360h3WLIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
        c1189360h3WLIZ.LIZIZ();
        long duration = c1158280gFO2.LLILLL.getVideo().getDuration();
        if (duration <= 0) {
            strK4 = "00:00";
        } else {
            long j = duration / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            long j2 = 60;
            strK4 = C786410Ut5.k4(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / j2), Long.valueOf(j % j2)}, 2));
        }
        TuxTextView tuxTextView = this.LLJLL;
        if (tuxTextView != null) {
            tuxTextView.setText(strK4);
            tuxTextView.setTextColor(C1180060goW.LJII("#FFFFFFFF"));
        }
        TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
        if (tuxTextView2 != null) {
            String desc = c1158280gFO2.LLILLL.getDesc();
            if (!Boolean.valueOf(C123100dR.LIZ(desc)).booleanValue() || desc == null) {
                desc = tuxTextView2.getContext().getString(2131823075);
            }
            tuxTextView2.setText(desc);
            tuxTextView2.setTextColor(C1180060goW.LJII("#FF6C0000"));
        }
        TuxTextView tuxTextView3 = this.LLJLLIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(new BDDateFormat("LL").LIZIZ(c1158280gFO2.LLILLL.getCreateTime() * 1000, Locale.getDefault()));
            tuxTextView3.setTextColor(C1180060goW.LJII("#FF6C0000"));
        }
        SmartImageView smartImageView = this.LLJL;
        if (smartImageView != null) {
            C786410Ut5.I7(new AkS57S0200000_18(this, c1158280gFO2, 19), smartImageView);
        }
        ConstraintLayout constraintLayout = this.LLJLIL;
        if (constraintLayout != null) {
            C786410Ut5.I7(new AkS57S0200000_18(this, c1158280gFO2, 20), constraintLayout);
        }
        boolean z = !c1158280gFO2.LL;
        this.LLJZIJLIL = z;
        if (c1158280gFO2.LLILLJJLI) {
            TuxTextView tuxTextView4 = this.LLJLLL;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextColor(C1180060goW.LJII("#FF6C0000"));
                tuxTextView4.setText(2131823053);
                return;
            }
            return;
        }
        if (z) {
            TuxTextView tuxTextView5 = this.LLJLLL;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(2131823054);
                tuxTextView5.setTextColor(C1180060goW.LJII("#FF6C0000"));
            }
            TuxTextView tuxTextView6 = this.LLJZ;
            if (tuxTextView6 != null) {
                tuxTextView6.setText(2131823066);
                tuxTextView6.setTextColor(C1180060goW.LJII("#FFE72B20"));
            }
            TuxIconView tuxIconView = this.LLL;
            if (tuxIconView == null) {
                return;
            }
            tuxIconView.setTintColor(C1180060goW.LJII("#FFE72B20"));
            return;
        }
        TuxTextView tuxTextView7 = this.LLJZ;
        if (tuxTextView7 != null) {
            tuxTextView7.setTextColor(C1180060goW.LJII("#FF6C0000"));
            tuxTextView7.setText(2131823057);
        }
        TuxTextView tuxTextView8 = this.LLJLLL;
        if (tuxTextView8 != null) {
            C339190DRl.LIZIZ(tuxTextView8);
        }
        TuxIconView tuxIconView2 = this.LLL;
        if (tuxIconView2 == null) {
            return;
        }
        C339190DRl.LIZIZ(tuxIconView2);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1158280gFO c1158280gFO) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1158280gFO c1158280gFO) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
