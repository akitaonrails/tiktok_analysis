package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C13LP;
import X.C1508390pM5;
import X.C1758880vs6;
import X.C1758890vs7;
import X.C1758920vsA;
import X.C1762410vxn;
import X.C1762420vxo;
import X.C259800zU;
import X.EnumC1508950pMz;
import X.InterfaceC1685420txc;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaFeature;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo.SeaPdpCreatorVideoCardDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo.SeaPdpCreatorVideoViewHolder;
import kotlin.Unit;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class AjS3S0301000_26 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS3S0301000_26 ajS3S0301000_26, View view) {
        if (view != null) {
            InterfaceC1685420txc<Context, SeaPdpCreatorVideoCardDTO, View, Integer, String, Unit> interfaceC1685420txc = ((C1758880vs6) ajS3S0301000_26.l0).LLILLJJLI;
            Context context = ((C1758920vsA) ajS3S0301000_26.l1).itemView.getContext();
            SeaPdpCreatorVideoCardDTO seaPdpCreatorVideoCardDTO = (SeaPdpCreatorVideoCardDTO) ajS3S0301000_26.l2;
            View view2 = ((C1758920vsA) ajS3S0301000_26.l1).itemView;
            Integer numValueOf = Integer.valueOf(ajS3S0301000_26.i3);
            int i = SeaPdpCreatorVideoViewHolder.LLLF;
            interfaceC1685420txc.invoke(context, seaPdpCreatorVideoCardDTO, view2, numValueOf, C1758890vs7.LIZ(ajS3S0301000_26.i3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$1(g1c.AjS3S0301000_26 r15, android.view.View r16) {
        /*
            if (r16 == 0) goto Lab
            java.lang.Object r1 = r15.l0
            X.0vhg r1 = (X.C1752420vhg) r1
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r1.LLILLL
            X.04Ag r0 = r0.LLJLILLLLZIIL
            android.view.View r1 = r1.itemView
            X.049O r0 = new X.049O
            r0.<init>()
            kotlin.jvm.internal.AwS50S0301000_26 r2 = new kotlin.jvm.internal.AwS50S0301000_26
            java.lang.Object r5 = r15.l0
            X.0vhg r5 = (X.C1752420vhg) r5
            int r3 = r15.i3
            java.lang.Object r4 = r15.l1
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed r4 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed) r4
            java.lang.Object r6 = r15.l2
            java.util.Map r6 = (java.util.Map) r6
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            X.C1748720vbi.LIZLLL(r1, r0, r2)
            java.lang.Object r0 = r15.l0
            X.0vhg r0 = (X.C1752420vhg) r0
            android.view.View r1 = r0.itemView
            r0 = 2131386567(0x7f0a60c7, float:1.8393596E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r10 = r0.toString()
            java.lang.Object r1 = r15.l0
            X.0vhg r1 = (X.C1752420vhg) r1
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r1.LLILLL
            X.04HR r2 = r0.LLLLLJIL
            android.view.View r3 = r1.itemView
            java.lang.Object r4 = r15.l1
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed r4 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed) r4
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Object r0 = r15.l0
            X.0vhg r0 = (X.C1752420vhg) r0
            java.lang.String r0 = r0.LLILZ
            r1.append(r0)
            r0 = 95
            r1.append(r0)
            int r0 = r15.i3
            int r0 = r0 + 1
            r1.append(r0)
            java.lang.String r5 = X.C2188811AlT.LIZIZ(r1)
            java.lang.Object r0 = r15.l0
            X.0vhg r0 = (X.C1752420vhg) r0
            java.lang.String r6 = r0.LLILZ
            java.lang.Object r7 = r15.l2
            java.util.Map r7 = (java.util.Map) r7
            com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment r8 = r0.LL
            int r9 = r15.i3
            java.lang.Object r0 = r15.l1
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedProduct r0 = r0.product
            r14 = 0
            if (r0 == 0) goto Lac
            java.lang.String r11 = r0.schema
            java.lang.String r12 = r0.id
            java.util.List<com.ss.android.ugc.aweme.ecommerce.service.vo.Image> r1 = r0.images
            if (r1 == 0) goto Lae
            r0 = 0
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = (com.ss.android.ugc.aweme.ecommerce.service.vo.Image) r0
            if (r0 == 0) goto Lae
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto Lae
            java.lang.Object r13 = X.C13LP.LJJJLL(r0)
            java.lang.String r13 = (java.lang.String) r13
        L9e:
            java.lang.Object r0 = r15.l1
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedProduct r0 = r0.product
            if (r0 == 0) goto La8
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack r14 = r0.standardEvent
        La8:
            X.C04HR.LJ(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        Lab:
            return
        Lac:
            r11 = r14
            r12 = r14
        Lae:
            r13 = r14
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS3S0301000_26.LIZ$1(g1c.AjS3S0301000_26, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$2(AjS3S0301000_26 ajS3S0301000_26, View view) {
        String str;
        if (view != null) {
            MediaItem mediaItem = (MediaItem) C13LP.LJJJLZIJ(ajS3S0301000_26.i3, ((C1762420vxo) ajS3S0301000_26.l0).LLJJI);
            String str2 = null;
            if (mediaItem != null) {
                str = mediaItem.category;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "size_guide")) {
                str2 = "c54417.d8413_i";
            } else if (Intrinsics.LJFF(str, "spu_image")) {
                str2 = "c54417.d11256_i";
            }
            C1762420vxo c1762420vxo = (C1762420vxo) ajS3S0301000_26.l0;
            Context context = ((View) ((C259800zU) ajS3S0301000_26.l1).element).getContext();
            int i = ajS3S0301000_26.i3;
            ViewGroup viewGroup = (ViewGroup) ajS3S0301000_26.l2;
            ((C1762420vxo) ajS3S0301000_26.l0).LJJIL(i, str2);
            c1762420vxo.LJJIJLIJ(i, context, viewGroup);
        }
    }

    public static final void LIZ$3(AjS3S0301000_26 ajS3S0301000_26, View view) {
        if (view != null) {
            if (!((C1762420vxo) ajS3S0301000_26.l0).LLJ.LJI()) {
                C1762420vxo c1762420vxo = (C1762420vxo) ajS3S0301000_26.l0;
                if (c1762420vxo.LLJIJIL) {
                    AwS640S0100000_26 awS640S0100000_26 = c1762420vxo.LLJILJILJ;
                    if (awS640S0100000_26 != null) {
                        awS640S0100000_26.invoke(Integer.valueOf(ajS3S0301000_26.i3), "video_play");
                    }
                    C1508390pM5 c1508390pM5 = ((C1762420vxo) ajS3S0301000_26.l0).LLJ;
                    if (c1508390pM5.LJIILLIIL == EnumC1508950pMz.PLAYER_IDLE) {
                        c1508390pM5.LJIIJJI();
                        return;
                    } else {
                        c1508390pM5.resume();
                        return;
                    }
                }
            }
            C1762420vxo c1762420vxo2 = (C1762420vxo) ajS3S0301000_26.l0;
            Context context = ((View) ajS3S0301000_26.l1).getContext();
            int i = ajS3S0301000_26.i3;
            ViewGroup viewGroup = (ViewGroup) ajS3S0301000_26.l2;
            ((C1762420vxo) ajS3S0301000_26.l0).LJJIL(i, "c54417.d93546_i");
            c1762420vxo2.LJJIJLIJ(i, context, viewGroup);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$4(AjS3S0301000_26 ajS3S0301000_26, View view) {
        MediaFeature mediaFeatureLIZ;
        if (view != null) {
            MediaItem mediaItem = (MediaItem) C13LP.LJJJLZIJ(ajS3S0301000_26.i3, ((C1762410vxn) ajS3S0301000_26.l0).LLJJIJI);
            if (mediaItem != null && (mediaFeatureLIZ = mediaItem.LIZ()) != null && !mediaFeatureLIZ.getCanShowInGallery()) {
                return;
            }
            C1762410vxn c1762410vxn = (C1762410vxn) ajS3S0301000_26.l0;
            ((View) ((C259800zU) ajS3S0301000_26.l1).element).getContext();
            c1762410vxn.LJJIL(ajS3S0301000_26.i3, (ViewGroup) ajS3S0301000_26.l2);
        }
    }

    public static final void LIZ$5(AjS3S0301000_26 ajS3S0301000_26, View view) {
        if (view != null) {
            if (!((C1762410vxn) ajS3S0301000_26.l0).LLJ.LJI()) {
                C1762410vxn c1762410vxn = (C1762410vxn) ajS3S0301000_26.l0;
                if (c1762410vxn.LLJIJIL) {
                    AwS640S0100000_26 awS640S0100000_26 = c1762410vxn.LLJILLL;
                    if (awS640S0100000_26 != null) {
                        awS640S0100000_26.invoke(Integer.valueOf(ajS3S0301000_26.i3), "video_play");
                    }
                    C1508390pM5 c1508390pM5 = ((C1762410vxn) ajS3S0301000_26.l0).LLJ;
                    if (c1508390pM5.LJIILLIIL == EnumC1508950pMz.PLAYER_IDLE) {
                        c1508390pM5.LJIIJJI();
                        return;
                    } else {
                        c1508390pM5.resume();
                        return;
                    }
                }
            }
            C1762410vxn c1762410vxn2 = (C1762410vxn) ajS3S0301000_26.l0;
            ((View) ajS3S0301000_26.l1).getContext();
            c1762410vxn2.LJJIL(ajS3S0301000_26.i3, (ViewGroup) ajS3S0301000_26.l2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$6(g1c.AjS3S0301000_26 r26, android.view.View r27) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS3S0301000_26.LIZ$6(g1c.AjS3S0301000_26, android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS3S0301000_26(Object obj, Object obj2, Object obj3, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i3 = i;
    }
}
