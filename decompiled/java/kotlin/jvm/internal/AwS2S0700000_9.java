package kotlin.jvm.internal;

import X.C09AY;
import X.C0OVN;
import X.C0OZT;
import X.C118300cf;
import X.C1771500wCS;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBubbleStruct;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS2S0700000_9 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S0700000_9 awS2S0700000_9, Object obj) {
        boolean z;
        String str = (String) obj;
        ((C1771500wCS) awS2S0700000_9.l0).getClass();
        String strLJFF = C1771500wCS.LJFF(str);
        if (strLJFF != null && strLJFF.length() != 0) {
            ((C118300cf) awS2S0700000_9.l1).element++;
            z = !((HashSet) awS2S0700000_9.l2).contains(strLJFF);
            if (z) {
                ((C118300cf) awS2S0700000_9.l3).element++;
            }
        } else {
            ((C118300cf) awS2S0700000_9.l4).element++;
            ((C1771500wCS) awS2S0700000_9.l0).getClass();
            z = !((HashSet) awS2S0700000_9.l5).contains(Long.valueOf((((long) str.hashCode()) << 32) ^ ((long) str.length())));
            if (z) {
                ((C118300cf) awS2S0700000_9.l6).element++;
            }
        }
        return Boolean.valueOf(z);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS2S0700000_9 awS2S0700000_9, Object obj) {
        C0OZT c0ozt;
        C786410Ut5.LJJJLZIJ((View) awS2S0700000_9.l1, (ViewGroup) awS2S0700000_9.l0);
        C786410Ut5.LJJJLZIJ((ImageView) awS2S0700000_9.l2, (ViewGroup) awS2S0700000_9.l0);
        int i = ((C118300cf) awS2S0700000_9.l3).element;
        if (i != 1) {
            if (i == 2 && (c0ozt = (C0OZT) awS2S0700000_9.l6) != null) {
                c0ozt.LIZJ();
            }
        } else {
            SmartRouter.buildRoute((Context) awS2S0700000_9.l4, ((BulletinBubbleStruct) awS2S0700000_9.l5).schemaUrl).open();
        }
        C0OZT c0ozt2 = (C0OZT) awS2S0700000_9.l6;
        if (c0ozt2 != null) {
            c0ozt2.LIZ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0700000_9(C1771500wCS c1771500wCS, C1771500wCS c1771500wCS2, C118300cf c118300cf, HashSet<String> hashSet, C118300cf c118300cf2, C118300cf c118300cf3, HashSet<Long> hashSet2, C118300cf c118300cf4) {
        super(1);
        this.$t = c118300cf4;
        this.l0 = c1771500wCS;
        this.l1 = c1771500wCS2;
        this.l2 = c118300cf;
        this.l3 = hashSet;
        this.l4 = c118300cf2;
        this.l5 = c118300cf3;
        this.l6 = hashSet2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0700000_9(ViewGroup viewGroup, View view, ImageView imageView, C118300cf c118300cf, Context context, BulletinBubbleStruct bulletinBubbleStruct, C0OVN c0ovn, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = view;
        this.l2 = imageView;
        this.l3 = c118300cf;
        this.l4 = context;
        this.l5 = bulletinBubbleStruct;
        this.l6 = c0ovn;
    }
}
