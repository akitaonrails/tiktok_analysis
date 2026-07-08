package kotlin.jvm.internal;

import X.AbstractC1604130rqV;
import X.C013C;
import X.C09AY;
import X.C0JBF;
import X.C16F5;
import X.C786410Ut5;
import X.C816050Vzn;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public class AwS42S0500000_7 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object invoke$0(AwS42S0500000_7 awS42S0500000_7, Object obj) {
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = (BasePreviewSettingMainFragmentSheetInitializer) awS42S0500000_7.l0;
        View view = (View) awS42S0500000_7.l1;
        C16F5 c16f5 = (C16F5) awS42S0500000_7.l2;
        basePreviewSettingMainFragmentSheetInitializer.LJIIJ(view, (View) awS42S0500000_7.l4, (LiveIconView) awS42S0500000_7.l3, c16f5);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS42S0500000_7 awS42S0500000_7, Object obj) {
        ((AbstractC1604130rqV) ((C816050Vzn) awS42S0500000_7.l0).LIZIZ.getValue()).LJIIIZ("ShortcutReceiver invokeOnCancellation");
        if (((C013C) awS42S0500000_7.l1).element) {
            C786410Ut5.LJJIFFI((Context) awS42S0500000_7.l2, (C0JBF) awS42S0500000_7.l3);
            ((C013C) awS42S0500000_7.l1).element = false;
            Function2 function2 = (Function2) awS42S0500000_7.l4;
            if (function2 != null) {
                function2.invoke(Boolean.FALSE, new Throwable("awaitBroadcast cancel"));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS42S0500000_7(C816050Vzn c816050Vzn, C816050Vzn c816050Vzn2, C013C c013c, Context context, C0JBF c0jbf, Function2<? super Boolean, ? super Throwable, Unit> function2) {
        super(1);
        this.$t = function2;
        this.l0 = c816050Vzn;
        this.l1 = c816050Vzn2;
        this.l2 = c013c;
        this.l3 = context;
        this.l4 = c0jbf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S0500000_7(BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, View view, C16F5 c16f5, LiveIconView liveIconView, View view2, int i) {
        super(1);
        this.$t = i;
        this.l0 = basePreviewSettingMainFragmentSheetInitializer;
        this.l1 = view;
        this.l2 = c16f5;
        this.l3 = liveIconView;
        this.l4 = view2;
    }
}
