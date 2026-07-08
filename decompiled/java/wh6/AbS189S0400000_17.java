package wh6;

import X.AbstractC1110790f0n;
import X.AbstractC1113400f50;
import X.AbstractC1113530f5D;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C1113470f57;
import X.C1113490f59;
import X.C500260Jjc;
import android.view.View;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;

/* JADX INFO: loaded from: classes18.dex */
public class AbS189S0400000_17 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.AbstractViewOnClickListenerC1637610siV
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS189S0400000_17 abS189S0400000_17, View view) {
        if (view != null) {
            C1113490f59 c1113490f59 = (C1113490f59) abS189S0400000_17.l0;
            c1113490f59.LIZ((PublicAreaMessageCommon.CreatorSuccessInfo.Topic) abS189S0400000_17.l1, (PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton) abS189S0400000_17.l2, (AbstractC1110790f0n) abS189S0400000_17.l3, c1113490f59.LIZ.getContext(), true);
        }
    }

    public static final void LIZ$1(AbS189S0400000_17 abS189S0400000_17, View view) {
        if (view != null) {
            C1113490f59 c1113490f59 = (C1113490f59) abS189S0400000_17.l0;
            AbstractC1110790f0n abstractC1110790f0n = (AbstractC1110790f0n) abS189S0400000_17.l1;
            PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic = (PublicAreaMessageCommon.CreatorSuccessInfo.Topic) abS189S0400000_17.l2;
            AbstractC1113530f5D.LJFF(c1113490f59, abstractC1110790f0n, topic, "tag_cta", false, topic.eventTrackingFields, 8);
            if (C500260Jjc.LJJIFFI(Boolean.valueOf(((PublicAreaMessageCommon.CreatorSuccessInfo.Topic) abS189S0400000_17.l2).LIZ))) {
                AbstractC1113400f50 abstractC1113400f50 = ((C1113490f59) abS189S0400000_17.l0).LIZJ;
                if (abstractC1113400f50 != null) {
                    abstractC1113400f50.LIZJ((AbstractC1110790f0n) abS189S0400000_17.l1, (PublicAreaMessageCommon.CreatorSuccessInfo.Topic) abS189S0400000_17.l2);
                }
                C1113490f59 c1113490f592 = (C1113490f59) abS189S0400000_17.l0;
                c1113490f592.LIZ((PublicAreaMessageCommon.CreatorSuccessInfo.Topic) abS189S0400000_17.l2, (PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton) abS189S0400000_17.l3, (AbstractC1110790f0n) abS189S0400000_17.l1, c1113490f592.LIZ.getContext(), true);
            }
        }
    }

    public static final void LIZ$2(AbS189S0400000_17 abS189S0400000_17, View view) {
        if (view != null) {
            C1113470f57 c1113470f57 = (C1113470f57) abS189S0400000_17.l0;
            c1113470f57.LIZ((PublicAreaMessageCommon.CreatorSuccessInfo.Topic) abS189S0400000_17.l1, (PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton) abS189S0400000_17.l2, (AbstractC1110790f0n) abS189S0400000_17.l3, c1113470f57.LIZ.getContext(), true);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AbS189S0400000_17(X.AbstractC1110790f0n r4, X.C1113490f59 r5, com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton r6, com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.CreatorSuccessInfo.Topic r7, int r8) {
        /*
            r3 = this;
            r3.$t = r8
            if (r8 == 0) goto L13
            r2 = r3
            r2.l0 = r5
            r2.l1 = r4
            r2.l2 = r7
            r2.l3 = r6
            r0 = 300(0x12c, double:1.48E-321)
        Lf:
            r2.<init>(r0)
            return
        L13:
            r2 = r3
            r2.l0 = r5
            r2.l1 = r7
            r2.l2 = r6
            r2.l3 = r4
            r0 = 300(0x12c, double:1.48E-321)
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS189S0400000_17.<init>(X.0f0n, X.0f59, com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon$CreatorSuccessInfo$Topic$ActionButton, com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon$CreatorSuccessInfo$Topic, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS189S0400000_17(C1113470f57 c1113470f57, PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic, PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton actionButton, AbstractC1110790f0n abstractC1110790f0n, int i) {
        super(300L);
        this.$t = i;
        this.l0 = c1113470f57;
        this.l1 = topic;
        this.l2 = actionButton;
        this.l3 = abstractC1110790f0n;
    }
}
