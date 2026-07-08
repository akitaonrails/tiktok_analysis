package com.ss.android.ugc.aweme.emoji.common.emojipagev2;

import X.AbstractC450910HmD;
import X.C0I0B;
import X.C0I98;
import X.C12ES;
import X.C21673919s1;
import X.C418440Gaw;
import X.C450550Hld;
import X.C450970HmJ;
import X.C451030HmP;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import X.C894660Z7w;
import X.EnumC454500Hs0;
import Y.ACListenerS73S0300000_6;
import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.common.model.IMGiphyInfo;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class SystemBigGridAdapter extends AbstractC450910HmD<C451030HmP> {
    public final LifecycleOwner LLILZIL;
    public final int LLILZLL;
    public final Function1<C21673919s1, Unit> LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;

    @Override // X.AbstractC450910HmD
    public final int LLLII() {
        return R.layout.c3l;
    }

    @Override // X.AbstractC450910HmD
    public final int LLLIILIL() {
        View view;
        RecyclerView recyclerView = this.LLILLL;
        Object parent = recyclerView != null ? recyclerView.getParent() : null;
        return LLLFZ((!(parent instanceof ViewGroup) || (view = (View) parent) == null) ? 0 : view.getWidth(), this.LLJI, this.LLIZLLLIL, this.LLJ);
    }

    @Override // X.AbstractC450910HmD
    public final void LLLIIIIL(RecyclerView recyclerView) {
        super.LLLIIIIL(recyclerView);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) recyclerView.getLayoutParams();
        int i = this.LLIZLLLIL;
        marginLayoutParams.setMargins(i, 0, i, 0);
        final Context context = this.LL;
        final int i2 = this.LLJ;
        recyclerView.setLayoutManager(new WrapGridLayoutManager(context, i2) { // from class: com.ss.android.ugc.aweme.emoji.common.emojipagev2.SystemBigGridAdapter$setup$lm$1
            @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                super.onLayoutCompleted(c21673919s1);
                this.LLJI.LLIZ.invoke(c21673919s1);
            }
        });
        HandlerHook.viewPost(recyclerView, new ARunnableS75S0200000_6((C450550Hld) recyclerView, this, 34));
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        UrlModel urlModel;
        StickerUrlStruct staticUrl;
        StickerUrlStruct animateUrl;
        VideoSticker videoSticker;
        UrlModel urlModel2;
        StickerUrlStruct staticUrl2;
        SetSticker setSticker;
        UrlModel urlModel3;
        StickerUrlStruct staticUrl3;
        String url;
        StickerUrlStruct animateUrl2;
        StickerUrlStruct animateUrl3;
        C450970HmJ c450970HmJ = (C450970HmJ) viewHolder;
        List<C451030HmP> data = getData();
        if (data != null && data.size() > 0 && c450970HmJ != null && c450970HmJ.LL != null) {
            C451030HmP c451030HmP = (C451030HmP) ListProtector.get(data, i);
            C786410Ut5.I7(new ACListenerS73S0300000_6(c451030HmP, this, i, c450970HmJ, 10), c450970HmJ.itemView);
            if (this.LLILZLL == 7) {
                str = "sticker_fav_choose_page_sticker";
            } else {
                str = "sticker_set_choose_page_sticker";
            }
            String callerId = EnumC454500Hs0.STICKER_PANEL.getCallerId();
            UrlModel urlModel4 = null;
            if (this.LLILZLL == 7) {
                VideoSticker videoSticker2 = c451030HmP.LJFF;
                if ((videoSticker2 == null || (animateUrl3 = videoSticker2.getAnimateUrl()) == null || (urlModel2 = animateUrl3.midResolutionUrl) == null || urlModel2.getUrlList() == null || !(!urlModel2.getUrlList().isEmpty())) && ((videoSticker = c451030HmP.LJFF) == null || (staticUrl2 = videoSticker.getStaticUrl()) == null || (urlModel2 = staticUrl2.midResolutionUrl) == null || urlModel2.getUrlList() == null || !(!urlModel2.getUrlList().isEmpty()))) {
                    urlModel2 = null;
                }
                SetSticker setSticker2 = c451030HmP.LJ;
                if ((setSticker2 == null || (animateUrl2 = setSticker2.getAnimateUrl()) == null || (urlModel3 = animateUrl2.midResolutionUrl) == null || urlModel3.getUrlList() == null || !(!urlModel3.getUrlList().isEmpty())) && ((setSticker = c451030HmP.LJ) == null || (staticUrl3 = setSticker.getStaticUrl()) == null || (urlModel3 = staticUrl3.midResolutionUrl) == null || urlModel3.getUrlList() == null || !(!urlModel3.getUrlList().isEmpty()))) {
                    urlModel3 = null;
                }
                if (urlModel2 != null) {
                    C0I98 c0i98 = C0I98.LIZ;
                    RemoteImageView remoteImageView = c450970HmJ.LL;
                    int i2 = this.LLJI;
                    Integer numValueOf = Integer.valueOf(R.drawable.bq4);
                    Integer numValueOf2 = Integer.valueOf(R.drawable.bq4);
                    c0i98.getClass();
                    C0I98.LJ(remoteImageView, urlModel2, "sticker_store_fav_panel_video_sticker", callerId, i2, i2, null, numValueOf, numValueOf2);
                    return;
                }
                if (urlModel3 != null) {
                    C0I98 c0i982 = C0I98.LIZ;
                    RemoteImageView remoteImageView2 = c450970HmJ.LL;
                    int i3 = this.LLJI;
                    Integer numValueOf3 = Integer.valueOf(R.drawable.bq4);
                    Integer numValueOf4 = Integer.valueOf(R.drawable.bq4);
                    c0i982.getClass();
                    C0I98.LJ(remoteImageView2, urlModel3, str, callerId, i3, i3, null, numValueOf3, numValueOf4);
                    return;
                }
                IMGiphyInfo iMGiphyInfo = c451030HmP.LJI;
                if (iMGiphyInfo == null || (url = iMGiphyInfo.getUrl()) == null) {
                    return;
                }
                UrlModel urlModel5 = new UrlModel();
                urlModel5.setUrlList(Collections.singletonList(url));
                C0I98 c0i983 = C0I98.LIZ;
                RemoteImageView remoteImageView3 = c450970HmJ.LL;
                int i4 = this.LLJI;
                Integer numValueOf5 = Integer.valueOf(R.drawable.bq4);
                Integer numValueOf6 = Integer.valueOf(R.drawable.bq4);
                c0i983.getClass();
                C0I98.LJ(remoteImageView3, urlModel5, str, callerId, i4, i4, null, numValueOf5, numValueOf6);
                return;
            }
            SetSticker setSticker3 = c451030HmP.LJ;
            if (setSticker3 != null && (animateUrl = setSticker3.getAnimateUrl()) != null) {
                urlModel = animateUrl.midResolutionUrl;
            } else {
                urlModel = null;
            }
            SetSticker setSticker4 = c451030HmP.LJ;
            if (setSticker4 != null && (staticUrl = setSticker4.getStaticUrl()) != null) {
                urlModel4 = staticUrl.midResolutionUrl;
            }
            if (urlModel != null) {
                C0I98 c0i984 = C0I98.LIZ;
                RemoteImageView remoteImageView4 = c450970HmJ.LL;
                int i5 = this.LLJI;
                Integer numValueOf7 = Integer.valueOf(R.drawable.bq4);
                Integer numValueOf8 = Integer.valueOf(R.drawable.bq4);
                c0i984.getClass();
                C0I98.LJ(remoteImageView4, urlModel, str, callerId, i5, i5, null, numValueOf7, numValueOf8);
                return;
            }
            if (urlModel4 == null) {
                return;
            }
            C0I98 c0i985 = C0I98.LIZ;
            RemoteImageView remoteImageView5 = c450970HmJ.LL;
            int i6 = this.LLJI;
            Integer numValueOf9 = Integer.valueOf(R.drawable.bq4);
            Integer numValueOf10 = Integer.valueOf(R.drawable.bq4);
            c0i985.getClass();
            C0I98.LJ(remoteImageView5, urlModel4, str, callerId, i6, i6, null, numValueOf9, numValueOf10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SystemBigGridAdapter(LifecycleOwner lifecycleOwner, Context context, int i, Function1<? super C21673919s1, Unit> function1) {
        int i2;
        super(context, lifecycleOwner);
        this.LLILZIL = lifecycleOwner;
        this.LLILZLL = i;
        this.LLIZ = function1;
        this.LLIZLLLIL = (int) C12ES.LIZJ(16.0f, this.LL);
        C0I0B.LJFF.LIZJ();
        if (C497820Jfg.LIZIZ(C894660Z7w.LIZ()) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(484))) {
            i2 = 4;
        } else {
            i2 = 5;
        }
        this.LLJ = i2;
        this.LLJI = (int) ((((C497820Jfg.LIZIZ(r4) - 32.0f) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23)) * (i2 - 1))) * 1.0f) / i2);
    }
}
