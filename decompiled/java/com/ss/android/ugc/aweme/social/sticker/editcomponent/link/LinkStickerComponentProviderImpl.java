package com.ss.android.ugc.aweme.social.sticker.editcomponent.link;

import X.AbstractC1442160ndG;
import X.AbstractC19589811ke;
import X.AbstractC388880FMo;
import X.C0FUH;
import X.C1440500naa;
import X.C19612111oF;
import X.C19612511oJ;
import X.C19612811oM;
import X.C390420FSm;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.link.ILinkStickerComponentProvider;
import com.ss.android.ugc.aweme.tools.sticker.core.link.LinkStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public final class LinkStickerComponentProviderImpl implements ILinkStickerComponentProvider {
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.link.ILinkStickerComponentProvider
    public final Class<? extends AbstractC19589811ke<?>> LIZIZ() {
        return C19612111oF.class;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11oJ] */
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.link.ILinkStickerComponentProvider
    public final C19612511oJ LIZJ(Context context, String str, C1440500naa c1440500naa) {
        return new AbstractC1442160ndG<LinkStickerModel>(context, str, c1440500naa) { // from class: X.11oJ
            public final Context LIZJ;
            public final String LIZLLL;

            @Override // X.AbstractC1442160ndG
            public final EnumC1466150oFx LIZJ() {
                return EnumC1466150oFx.LINK;
            }

            @Override // X.AbstractC1442160ndG
            public final String LIZ(StickerModel stickerModel) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append("/link_sticker/");
                sbLIZ.append(((LinkStickerModel) stickerModel).getId());
                sbLIZ.append(".png");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC1442160ndG
            public final View LIZIZ(StickerModel stickerModel) {
                C19613111oP c19613111oP = new C19613111oP(this.LIZJ, null);
                c19613111oP.LIZLLL(stickerModel);
                return c19613111oP;
            }

            {
                super(context, c1440500naa);
                this.LIZJ = context;
                this.LIZLLL = str;
            }

            @Override // X.AbstractC1442160ndG
            public final StickerModel LIZLLL(StickerModel stickerModel, int i, int i2) {
                LinkStickerModel linkStickerModel = (LinkStickerModel) stickerModel;
                return LinkStickerModel.copy$default(linkStickerModel, BaseStickerModel.copy$default(linkStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, i, i2, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -385, 15, null), 0, null, false, null, null, null, 0, 0, 510, null);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11oM] */
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.link.ILinkStickerComponentProvider
    public final C19612811oM LIZ(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C0FUH c0fuh, C390420FSm c390420FSm) {
        return new AbstractC388880FMo<LinkStickerModel>(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm) { // from class: X.11oM
            public C19656211vM LJII;

            @Override // X.AbstractC388880FMo
            public final EnumC1466150oFx LIZLLL() {
                return EnumC1466150oFx.LINK;
            }

            @Override // X.AbstractC388880FMo
            public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                LinkStickerModel linkStickerModel = (LinkStickerModel) stickerModel;
                return LinkStickerModel.copy$default(linkStickerModel, BaseStickerModel.copy$default(linkStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), 0, null, false, null, null, null, 0, 0, 510, null);
            }

            @Override // X.AbstractC388880FMo
            public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner2) {
                return new C19613611oU(this.LIZ, (LinkStickerModel) stickerModel, this.LIZIZ, c0ffo, lifecycleOwner2, this.LJFF);
            }

            @Override // X.AbstractC388880FMo
            public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
                int height = this.LIZIZ.getHeight();
                int width = this.LIZIZ.getWidth();
                int left = this.LIZIZ.getLeft();
                int top = this.LIZIZ.getTop();
                EnumC1466150oFx enumC1466150oFx = EnumC1466150oFx.LINK;
                this.LJII = new C19656211vM(this.LIZ, this.LJFF, new LinkStickerModel(new BaseStickerModel(0, 0, enumC1466150oFx, 0, 0, 0.0f, 0.0f, 0, 0, left, top, width, height, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -7685, 15, null), 0, EnumC19613311oR.DEFAULT, true, "", "", "Enabled", 100, 0), c390370FSh, this.LIZLLL);
                this.LIZJ.addView(this.LJII, new ViewGroup.LayoutParams(-1, -1));
                C19656211vM c19656211vM = this.LJII;
                if (c19656211vM != null) {
                    c19656211vM.setStickerEditListener(new C0FSM(enumC1466150oFx, function1, c390370FSh, c0ftj));
                }
            }
        };
    }
}
