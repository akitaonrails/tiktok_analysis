package kotlin.jvm.internal;

import X.C09AY;
import X.C1618506Vj;
import X.C913140Zs0;
import X.InterfaceC1631620sYq;
import android.app.Activity;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class AFwS337S0000000_14 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(6);
    public final int $t;

    public static AFwS337S0000000_14 get$arr$(int i) {
        AFwS337S0000000_14 aFwS337S0000000_14 = (AFwS337S0000000_14) arr$.get(i);
        if (aFwS337S0000000_14 != null) {
            return aFwS337S0000000_14;
        }
        arr$.compareAndSet(i, null, new AFwS337S0000000_14(i));
        return (AFwS337S0000000_14) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS337S0000000_14(int i) {
        super(3);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AFwS337S0000000_14 aFwS337S0000000_14, Object obj, Object obj2, Object obj3) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AFwS337S0000000_14 aFwS337S0000000_14, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS337S0000000_14 aFwS337S0000000_14, Object obj, Object obj2, Object obj3) {
        Activity activity = (Activity) obj;
        C913140Zs0 c913140Zs0 = (C913140Zs0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        C1618506Vj c1618506Vj = IMGroupChatApi.LIZIZ;
        IMGroupChatApi iMGroupChatApiLIZ = c1618506Vj.LIZ();
        C1618506Vj.LIZ.getClass();
        C1618506Vj.LIZLLL(iMGroupChatApiLIZ, "open_group_chat_detail");
        if (iMGroupChatApiLIZ != null) {
            iMGroupChatApiLIZ.LJJIIJZLJL(activity, c913140Zs0, iIntValue);
        } else {
            AwS99S0201000_14 awS99S0201000_14 = new AwS99S0201000_14(activity, c913140Zs0, iIntValue, 3);
            c1618506Vj.getClass();
            C1618506Vj.LJ(activity, awS99S0201000_14);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0178 A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:27:0x016d, B:29:0x0178, B:30:0x0181), top: B:55:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0181 A[Catch: Exception -> 0x018e, TRY_LEAVE, TryCatch #0 {Exception -> 0x018e, blocks: (B:27:0x016d, B:29:0x0178, B:30:0x0181), top: B:55:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AFwS337S0000000_14 r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS337S0000000_14.invoke$3(kotlin.jvm.internal.AFwS337S0000000_14, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AFwS337S0000000_14 aFwS337S0000000_14, Object obj, Object obj2, Object obj3) throws JSONException {
        ((JSONObject) obj).put((String) obj2, obj3);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$5(AFwS337S0000000_14 aFwS337S0000000_14, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }
}
