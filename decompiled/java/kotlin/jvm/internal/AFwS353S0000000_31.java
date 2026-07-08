package kotlin.jvm.internal;

import X.C09AY;
import X.C20653915rt;
import X.InterfaceC1631620sYq;
import X.InterfaceC20636315p3;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS42S0101000_31;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.search.detail.keyframe.ui.SearchDetailKeyFrameBottomAssemAssem;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
public class AFwS353S0000000_31 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(2);
    public final int $t;

    public static AFwS353S0000000_31 get$arr$(int i) {
        AFwS353S0000000_31 aFwS353S0000000_31 = (AFwS353S0000000_31) arr$.get(i);
        if (aFwS353S0000000_31 != null) {
            return aFwS353S0000000_31;
        }
        arr$.compareAndSet(i, null, new AFwS353S0000000_31(i));
        return (AFwS353S0000000_31) arr$.get(i);
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
    public AFwS353S0000000_31(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS353S0000000_31 aFwS353S0000000_31, Object obj, Object obj2, Object obj3) {
        InterfaceC20636315p3 interfaceC20636315p3;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        SearchDetailKeyFrameBottomAssemAssem searchDetailKeyFrameBottomAssemAssem = (SearchDetailKeyFrameBottomAssemAssem) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        if (iIntValue != -1 && (((interfaceC20636315p3 = (InterfaceC20636315p3) searchDetailKeyFrameBottomAssemAssem.LLJZ.getValue()) == null || interfaceC20636315p3.LLLLIIL(searchDetailKeyFrameBottomAssemAssem.LLLII)) && !zBooleanValue && (viewOnAttachStateChangeListenerC20604515jv = searchDetailKeyFrameBottomAssemAssem.LLJLLIL) != null)) {
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS42S0101000_31(iIntValue, searchDetailKeyFrameBottomAssemAssem, 4));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS353S0000000_31 aFwS353S0000000_31, Object obj, Object obj2, Object obj3) {
        return new C20653915rt("upload_server_clips_place_holder", (String) obj2, (String) obj3);
    }
}
