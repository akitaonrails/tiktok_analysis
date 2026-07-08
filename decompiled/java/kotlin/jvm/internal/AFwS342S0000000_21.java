package kotlin.jvm.internal;

import X.C09AY;
import X.C2344009Gk;
import X.InterfaceC1631620sYq;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public class AFwS342S0000000_21 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(2);
    public final int $t;

    public static AFwS342S0000000_21 get$arr$(int i) {
        AFwS342S0000000_21 aFwS342S0000000_21 = (AFwS342S0000000_21) arr$.get(i);
        if (aFwS342S0000000_21 != null) {
            return aFwS342S0000000_21;
        }
        arr$.compareAndSet(i, null, new AFwS342S0000000_21(i));
        return (AFwS342S0000000_21) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS342S0000000_21(int i) {
        super(3);
        this.$t = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AFwS342S0000000_21 r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem r5 = (com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem) r5
            if (r6 != 0) goto L9
            if (r7 != 0) goto L9
        L6:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9:
            X.0lGd r4 = X.C1351250lGd.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.getCommentInputAweme()
            X.0Sb3 r0 = r5.LLJI
            r2 = 0
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r0.LL
        L16:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            java.lang.String r1 = r0.mEventType
            r4.getClass()
            r0 = 0
            boolean r0 = X.C1351250lGd.LJIILIIL(r3, r1, r0)
            if (r0 == 0) goto L6
            boolean r0 = X.C1351290lGh.LIZJ()
            r1 = 1
            if (r0 == 0) goto L4e
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L31
            java.lang.Object r2 = r0.LL
        L31:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r2 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.getAweme()
            com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig r0 = r0.getCommentConfig()
            if (r0 == 0) goto L4e
            com.ss.android.ugc.aweme.feed.model.QuickCommentConfig r0 = r0.quickCommentConfig
            if (r0 == 0) goto L4e
            java.lang.Integer r0 = r0.recLevel
            if (r0 == 0) goto L4e
            int r0 = r0.intValue()
            if (r0 != r1) goto L4e
            goto L6
        L4c:
            r0 = r2
            goto L16
        L4e:
            com.ss.android.ugc.aweme.experiment.QuickCommentV2Config r0 = X.C1351290lGh.LIZ()
            if (r0 == 0) goto L59
            boolean r0 = r0.disablePlayAppear
            if (r0 == 0) goto L59
            goto L6
        L59:
            X.0lGT r0 = X.EnumC1351150lGT.ZERO_COMMENT
            r5.kq(r1, r0)
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS342S0000000_21.invoke$0(kotlin.jvm.internal.AFwS342S0000000_21, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AFwS342S0000000_21 aFwS342S0000000_21, Object obj, Object obj2, Object obj3) {
        ((C2344009Gk) obj).LJFF((String) obj2, (String) obj3);
        return Unit.LIZ;
    }
}
