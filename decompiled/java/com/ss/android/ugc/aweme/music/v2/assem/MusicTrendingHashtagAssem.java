package com.ss.android.ugc.aweme.music.v2.assem;

import X.AbstractC1255880imo;
import X.C019F;
import X.C1324750kZt;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C279490AxP;
import X.C631040Op4;
import X.C724750Sbp;
import X.InterfaceC1526205yG;
import X.InterfaceC2217461Bqa;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.discovery.api.MusicChartVideosV1Response;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicTrendingHashtagAssem extends DynamicAssem implements InterfaceC1526205yG {
    public static final C631040Op4 LLJJJJLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public View LLJJI;
    public SmartImageView LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public String LLJJJ;
    public boolean LLJJJIL;
    public AbstractC1255880imo<Aweme, MusicChartVideosV1Response> LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicTrendingHashtagAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJLIIL = new C631040Op4();
    }

    public MusicTrendingHashtagAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1623), AFwS259S0000000_21.get$arr$(204), null, true);
    }

    @Override // X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return ((Number) C279490AxP.LIZ.getValue()).intValue() == 1 ? R.layout.dra : R.layout.dr_;
    }

    @Override // X.InterfaceC1526205yG
    public final void onSuccess() {
        List<Aweme> items;
        Aweme aweme;
        Video video;
        UrlModel cover;
        List<String> urlList;
        if (this.LLJJJIL) {
            return;
        }
        AbstractC1255880imo<Aweme, MusicChartVideosV1Response> abstractC1255880imo = this.LLJJJJ;
        String str = (abstractC1255880imo == null || (items = abstractC1255880imo.getItems()) == null || (aweme = (Aweme) C13LP.LJJJLL(items)) == null || (video = aweme.getVideo()) == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null) ? null : (String) C13LP.LJJJLL(urlList);
        SmartImageView smartImageView = this.LLJJIII;
        if (smartImageView != null) {
            C1324750kZt.LJIIJJI(smartImageView, str, -1, -1, Bitmap.Config.ARGB_8888, null, null, null);
        }
        this.LLJJJIL = true;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        this.LLJJI = view.findViewById(R.id.tqy);
        this.LLJJIII = (SmartImageView) view.findViewById(R.id.video_cover);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.jhg);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.view_count);
        this.LLJJIJIL = (TuxIconView) view.findViewById(R.id.yk6);
        AssemVMLazy assemVMLazy = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0mVr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, this, null, null, null, new AwS600S0100000_21(this, 158), 28, null);
    }
}
