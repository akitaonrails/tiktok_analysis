package com.ss.android.ugc.aweme.newselector.protocol.topentry;

import X.AbstractC1225770i0F;
import X.C1226700i1k;
import X.C1226750i1p;
import X.C1226930i27;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.bulletinboard.BulletinBoardFeature;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class CreateBBHeaderProtocolFactory implements IContactSelectorHeaderFactory {
    public final String LL = "id_header_bulletin_board";

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final String lW() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final C1226700i1k Fu0(AbstractC1225770i0F abstractC1225770i0F, C1226750i1p c1226750i1p, String str) {
        C1226930i27 c1226930i27;
        if (!(c1226750i1p instanceof C1226930i27) || (c1226930i27 = (C1226930i27) c1226750i1p) == null) {
            return null;
        }
        C1226700i1k c1226700i1k = new C1226700i1k(abstractC1225770i0F, c1226930i27) { // from class: X.0i46
            public boolean LLJI;

            @Override // X.C1226700i1k, X.InterfaceC1224260hxo
            public final void onShow() {
                if (this.LLJI) {
                    return;
                }
                this.LLJI = true;
                BulletinBoardFeature bulletinBoardFeatureLIZ = BulletinBoardFeature.LIZ.LIZ();
                if (bulletinBoardFeatureLIZ != null) {
                    bulletinBoardFeatureLIZ.LLILII("top_entrance", this.LLILLL.LIZ());
                }
            }

            @Override // X.C1226700i1k, X.InterfaceC1224260hxo
            public final void LIZIZ() {
                AbsContactSelectorFragment fragment;
                InterfaceC1226510i1R interfaceC1226510i1R;
                C19EG activity;
                View view;
                View rootView;
                BulletinBoardFeature bulletinBoardFeatureLIZ;
                super.LIZIZ();
                InterfaceC1226510i1R interfaceC1226510i1R2 = this.LL.LIZ;
                if (interfaceC1226510i1R2 == null || (fragment = interfaceC1226510i1R2.getFragment()) == null || (interfaceC1226510i1R = this.LL.LIZ) == null || (activity = interfaceC1226510i1R.getActivity()) == null || (view = fragment.getView()) == null || (rootView = view.getRootView()) == null || (bulletinBoardFeatureLIZ = BulletinBoardFeature.LIZ.LIZ()) == null) {
                    return;
                }
                bulletinBoardFeatureLIZ.LLILL(activity, rootView, "top_entrance", new AwS563S0100000_19(this, 3052));
            }

            @Override // X.C1226700i1k
            public final C1224220hxk LJJJJIZL(Context context) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_ltr;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                return new C1224220hxk("id_header_bulletin_board", null, context.getString(2131828090), null, tuxIconDrawableLIZ, this.LLILLL.LIZIZ(), this.LLILLL.LIZ());
            }
        };
        c1226700i1k.LLJ = str;
        return c1226700i1k;
    }
}
