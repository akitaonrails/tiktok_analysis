package com.ss.android.ugc.aweme.poi.albummix.cell;

import X.C1183810guZ;
import X.C2211631BhB;
import X.C339190DRl;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.text.a0;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAlbumMixPageReuseAssem extends BasePoiAlbumMixCardAssem<PoiAlbumMixPageReuseAssem> {
    public SmartImageView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxIconView LLJLLIL;
    public TuxIconView LLJLLL;
    public View LLJZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dyd;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLILLLLZIIL = (SmartImageView) view.findViewById(R.id.qwh);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.qwm);
        this.LLJLLIL = (TuxIconView) view.findViewById(R.id.qwk);
        this.LLJLLL = (TuxIconView) view.findViewById(R.id.qwl);
        this.LLJZ = view.findViewById(R.id.qwj);
        C2211631BhB.LJ(view, new AwS597S0100000_18(this, 235));
        C786410Ut5.I7(new AbS699S0100000_18(this, 14, 42), view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1183810guZ c1183810guZ) {
        Aweme aweme;
        C1183810guZ c1183810guZ2 = c1183810guZ;
        PoiListApi.PoiMergedListItem poiMergedListItem = c1183810guZ2.LLILLJJLI;
        sp(this.LLJLILLLLZIIL, poiMergedListItem.getCropAwemeCover());
        String awemeTopicTag = poiMergedListItem.getAwemeTopicTag();
        Context context = getContext();
        if (context != null) {
            if (awemeTopicTag != null && !a0.LJJJIL(awemeTopicTag)) {
                TuxTextView tuxTextView = this.LLJLL;
                if (tuxTextView != null) {
                    int iLIZLLL = (((C418440Gaw.LIZLLL(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15))) / 2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    if (iLIZLLL <= 0) {
                        C339190DRl.LIZIZ(tuxTextView);
                        View view = this.LLJZ;
                        if (view != null) {
                            C339190DRl.LIZIZ(view);
                        }
                    } else if (StaticLayout.Builder.obtain(awemeTopicTag, 0, awemeTopicTag.length(), tuxTextView.getPaint(), iLIZLLL).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build().getLineCount() > 2) {
                        C339190DRl.LIZIZ(tuxTextView);
                        View view2 = this.LLJZ;
                        if (view2 != null) {
                            C339190DRl.LIZIZ(view2);
                        }
                    } else {
                        C339190DRl.LIZLLL(tuxTextView);
                        View view3 = this.LLJZ;
                        if (view3 != null) {
                            C339190DRl.LIZLLL(view3);
                        }
                        tuxTextView.setText(awemeTopicTag);
                    }
                }
            } else {
                TuxTextView tuxTextView2 = this.LLJLL;
                if (tuxTextView2 != null) {
                    C339190DRl.LIZIZ(tuxTextView2);
                }
                View view4 = this.LLJZ;
                if (view4 != null) {
                    C339190DRl.LIZIZ(view4);
                }
            }
        }
        if (c1183810guZ2.LLILLL == 53000) {
            TuxIconView tuxIconView = this.LLJLLIL;
            if (tuxIconView != null) {
                C339190DRl.LIZLLL(tuxIconView);
            }
            TuxIconView tuxIconView2 = this.LLJLLL;
            if (tuxIconView2 != null) {
                C339190DRl.LIZIZ(tuxIconView2);
                return;
            }
            return;
        }
        Aweme aweme2 = c1183810guZ2.LLILLJJLI.getAweme();
        if ((aweme2 != null && AwemeExtKt.isPhotoMode(aweme2)) || ((aweme = c1183810guZ2.LLILLJJLI.getAweme()) != null && aweme.getAwemeType() == 160)) {
            TuxIconView tuxIconView3 = this.LLJLLL;
            if (tuxIconView3 != null) {
                C339190DRl.LIZLLL(tuxIconView3);
            }
            TuxIconView tuxIconView4 = this.LLJLLIL;
            if (tuxIconView4 == null) {
                return;
            }
            C339190DRl.LIZIZ(tuxIconView4);
            return;
        }
        TuxIconView tuxIconView5 = this.LLJLLIL;
        if (tuxIconView5 != null) {
            C339190DRl.LIZIZ(tuxIconView5);
        }
        TuxIconView tuxIconView6 = this.LLJLLL;
        if (tuxIconView6 == null) {
            return;
        }
        C339190DRl.LIZIZ(tuxIconView6);
    }
}
