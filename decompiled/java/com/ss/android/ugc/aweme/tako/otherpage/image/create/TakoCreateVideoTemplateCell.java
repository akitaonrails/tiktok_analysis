package com.ss.android.ugc.aweme.tako.otherpage.image.create;

import X.C0DSB;
import X.C13LP;
import X.C1697810uHb;
import X.C1840750y09;
import X.C1845250y7P;
import X.C1845260y7Q;
import X.C1845270y7R;
import X.C1845450y7j;
import X.C418440Gaw;
import X.C423410Gix;
import X.EnumC1761210vvr;
import X.InterfaceC1783650wW3;
import X.InterfaceC1845470y7l;
import X.InterfaceC1855990yOj;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoCreateVideoTemplateCell;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS141S1100000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoCreateVideoTemplateCell extends TakoTemplateBaseCell<C1845450y7j> implements InterfaceC1855990yOj {
    public static final int LLJJI = 12;
    public ViewGroup LLJILJIL;
    public C1845250y7P LLJILJILJ;
    public Size LLJILLL;
    public final int LLJIJIL = LLJJI;
    public final C1840750y09 LLJJ = new InterfaceC1783650wW3() { // from class: X.0y09
        @Override // X.InterfaceC1783650wW3
        public final void C0() {
        }

        @Override // X.InterfaceC1783650wW3
        public final View getDetectView() {
            TakoCreateVideoTemplateCell takoCreateVideoTemplateCell = this.LL;
            C1845250y7P c1845250y7P = takoCreateVideoTemplateCell.LLJILJILJ;
            return c1845250y7P == null ? takoCreateVideoTemplateCell.itemView : c1845250y7P;
        }

        @Override // X.InterfaceC1783650wW3
        public final void pause() {
            C1845250y7P c1845250y7P = this.LL.LLJILJILJ;
            if (c1845250y7P != null) {
                c1845250y7P.LJ();
            }
        }

        @Override // X.InterfaceC1783650wW3
        public final void play() {
            C1845250y7P c1845250y7P = this.LL.LLJILJILJ;
            if (c1845250y7P != null) {
                c1845250y7P.LJII();
            }
        }

        @Override // X.InterfaceC1783650wW3
        public final void release() {
            C1845250y7P c1845250y7P = this.LL.LLJILJILJ;
            if (c1845250y7P != null) {
                c1845250y7P.LJI();
            }
        }

        @Override // X.InterfaceC1783650wW3
        public final void LJIILJJIL(boolean z) {
            C1845250y7P c1845250y7P = this.LL.LLJILJILJ;
            if (c1845250y7P != null) {
                c1845250y7P.setMuteState(z);
            }
        }

        @Override // X.InterfaceC1783650wW3
        public final void l7(AwS141S1100000_27 awS141S1100000_27) {
            C1845250y7P c1845250y7P = this.LL.LLJILJILJ;
            if (c1845250y7P != null) {
                c1845250y7P.setMuteClickCallback(new AwS606S0100000_27(awS141S1100000_27, 262));
            }
        }
    };

    @Override // X.InterfaceC1855990yOj
    public final RecyclerView.ViewHolder k4() {
        return this;
    }

    @Override // X.InterfaceC1855990yOj
    public final InterfaceC1783650wW3 af() {
        C1845250y7P c1845250y7P = this.LLJILJILJ;
        if (c1845250y7P == null || c1845250y7P.getVisibility() != 0) {
            return null;
        }
        return this.LLJJ;
    }

    @Override // X.InterfaceC1855990yOj
    public final int gl() {
        return getBindingAdapterPosition();
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoTemplateBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1845250y7P c1845250y7P = (C1845250y7P) this.itemView.findViewById(R.id.x8g);
        c1845250y7P.setUIConfig(new C1845260y7Q(null, EnumC1761210vvr.BOTTOM_END, C1697810uHb.LJIIJJI(0, 0, 0, 0), C1697810uHb.LJIIJJI(0, 4, 4, 4), 81));
        c1845250y7P.setOutlineProvider(new C423410Gix(Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(LLJJI)))));
        c1845250y7P.setClipToOutline(true);
        this.LLJILJILJ = c1845250y7P;
        View viewFindViewById = this.itemView.findViewById(R.id.x87);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        C1845250y7P c1845250y7P2 = this.LLJILJILJ;
        if (c1845250y7P2 != null) {
            c1845250y7P2.setControlHost(viewGroup);
        }
        this.LLJILJIL = (ViewGroup) viewFindViewById;
        C1845250y7P c1845250y7P3 = this.LLJILJILJ;
        if (c1845250y7P3 != null) {
            C0DSB.LIZJ(c1845250y7P3);
        }
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView != null) {
            C0DSB.LIZIZ(smartImageView);
        }
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView != null) {
            C0DSB.LIZIZ(tuxIconView);
        }
    }

    @Override // X.InterfaceC1855990yOj
    public final View L4() {
        return this.itemView;
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoTemplateBaseCell
    public final int L5() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoTemplateBaseCell
    public final void P5(InterfaceC1845470y7l interfaceC1845470y7l) {
        String str;
        Size size;
        double dDoubleValue;
        C1845450y7j c1845450y7j = (C1845450y7j) interfaceC1845470y7l;
        C1845250y7P c1845250y7P = this.LLJILJILJ;
        if (c1845250y7P != null) {
            BaseVideo baseVideo = (BaseVideo) C13LP.LJJJLL(c1845450y7j.LLJ);
            if (baseVideo == null || (str = baseVideo.videoUrl) == null || str.length() == 0 || (size = this.LLJILLL) == null) {
                c1845250y7P.setCoverLoadedCallback(null);
                C0DSB.LIZIZ(c1845250y7P);
            } else {
                List<String> listSingletonList = baseVideo.urlList;
                if (!(!listSingletonList.isEmpty())) {
                    listSingletonList = Collections.singletonList(c1845450y7j.LLILLJJLI);
                }
                C1845250y7P c1845250y7P2 = this.LLJILJILJ;
                if (c1845250y7P2 != null) {
                    C0DSB.LIZJ(c1845250y7P2);
                }
                SmartImageView smartImageView = this.LLILLJJLI;
                if (smartImageView != null) {
                    C0DSB.LIZIZ(smartImageView);
                }
                TuxIconView tuxIconView = this.LLILLL;
                if (tuxIconView != null) {
                    C0DSB.LIZIZ(tuxIconView);
                }
                c1845250y7P.setCoverLoadedCallback(new AwS393S0200000_27(this, c1845450y7j, 181));
                String str2 = baseVideo.videoModel;
                String str3 = baseVideo.vid;
                String str4 = baseVideo.fileHash;
                Integer num = baseVideo.width;
                Integer num2 = baseVideo.height;
                Double d = baseVideo.duration;
                if (d != null) {
                    dDoubleValue = d.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                c1845250y7P.setData(new C1845270y7R(str2, str3, str4, listSingletonList, num, num2, size, "tako_auto_play_template_square", str, Long.valueOf((long) (dDoubleValue * ((double) LSPassThroughRecordSizeConfig.DEFAULT))), baseVideo.expireTime, null, null, c1845450y7j.LLJI, false, 22528, null));
                return;
            }
        }
        C1845250y7P c1845250y7P3 = this.LLJILJILJ;
        if (c1845250y7P3 != null) {
            C0DSB.LIZIZ(c1845250y7P3);
        }
        SmartImageView smartImageView2 = this.LLILLJJLI;
        if (smartImageView2 != null) {
            C0DSB.LIZJ(smartImageView2);
        }
        TuxIconView tuxIconView2 = this.LLILLL;
        if (tuxIconView2 != null) {
            C0DSB.LIZJ(tuxIconView2);
        }
        I5(c1845450y7j);
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoTemplateBaseCell
    public final void R5(Size size) {
        this.LLJILLL = size;
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoTemplateBaseCell
    /* JADX INFO: renamed from: S5, reason: merged with bridge method [inline-methods] */
    public final void N5(C1845450y7j c1845450y7j) {
        if (!Intrinsics.LJFF(this.LL, c1845450y7j.LL)) {
            return;
        }
        super.N5(c1845450y7j);
    }
}
