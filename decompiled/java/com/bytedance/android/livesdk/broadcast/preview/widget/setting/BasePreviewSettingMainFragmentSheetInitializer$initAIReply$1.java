package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C05YD;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C155000ia;
import X.C16F5;
import X.C1C7U;
import X.C2197108jB;
import X.C445870He5;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import X.InterfaceC497601wk;
import android.view.View;
import com.bytedance.android.live.aireply.IAIReplyAnchorManagerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer$initAIReply$1", f = "BasePreviewSettingMainFragmentSheetInitializer.kt", l = {1449}, m = "invokeSuspend")
public final class BasePreviewSettingMainFragmentSheetInitializer$initAIReply$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ BasePreviewSettingMainFragmentSheetInitializer LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ C16F5 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePreviewSettingMainFragmentSheetInitializer$initAIReply$1(View view, BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, View view2, C16F5 c16f5, InterfaceC1364105Vn<? super BasePreviewSettingMainFragmentSheetInitializer$initAIReply$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = view;
        this.LLILZ = basePreviewSettingMainFragmentSheetInitializer;
        this.LLILZIL = view2;
        this.LLILZLL = c16f5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        BasePreviewSettingMainFragmentSheetInitializer$initAIReply$1 basePreviewSettingMainFragmentSheetInitializer$initAIReply$1 = new BasePreviewSettingMainFragmentSheetInitializer$initAIReply$1(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        basePreviewSettingMainFragmentSheetInitializer$initAIReply$1.LLILLJJLI = obj;
        return basePreviewSettingMainFragmentSheetInitializer$initAIReply$1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.initAIReply$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            View view = this.LLILLL;
            IAIReplyAnchorManagerService.Companion.getClass();
            C05YD<Boolean> hasPermission = C445870He5.LIZ().getHasPermission();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(view, interfaceC497601wk, this.LLILZ, this.LLILZIL, this.LLILZLL);
            this.LL = 1;
            if (hasPermission.collect(anonymousClass1, this) == objLJFF) {
                C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.initAIReply$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    /* JADX INFO: renamed from: com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer$initAIReply$1$1, reason: invalid class name */
    public final class AnonymousClass1<T> implements InterfaceC346701Wf {
        public final /* synthetic */ View LL;
        public final /* synthetic */ InterfaceC497601wk LLILLJJLI;
        public final /* synthetic */ BasePreviewSettingMainFragmentSheetInitializer LLILLL;
        public final /* synthetic */ View LLILZ;
        public final /* synthetic */ C16F5 LLILZIL;

        public AnonymousClass1(View view, InterfaceC497601wk interfaceC497601wk, BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, View view2, C16F5 c16f5) {
            this.LL = view;
            this.LLILLJJLI = interfaceC497601wk;
            this.LLILLL = basePreviewSettingMainFragmentSheetInitializer;
            this.LLILZ = view2;
            this.LLILZIL = c16f5;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object LIZ(boolean r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
            /*
                Method dump skipped, instruction units count: 212
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer$initAIReply$1.AnonymousClass1.LIZ(boolean, X.05Vn):java.lang.Object");
        }

        @Override // X.InterfaceC346701Wf
        public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
            return LIZ(((Boolean) obj).booleanValue(), interfaceC1364105Vn);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
