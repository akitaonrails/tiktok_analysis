package com.ss.android.ugc.aweme.services;

import X.C04TD;
import X.C09AY;
import X.C1255120ila;
import com.ss.android.ugc.aweme.ISaveInfoDialogService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class SaveInfoDialogService implements ISaveInfoDialogService {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.SaveInfoDialogService$tryShowDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends C09AY implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.LIZ;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.SaveInfoDialogService$tryShowDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends C09AY implements Function0<Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.LIZ;
        }
    }

    public static ISaveInfoDialogService createISaveInfoDialogServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ISaveInfoDialogService.class, z);
        if (objLIZ != null) {
            return (ISaveInfoDialogService) objLIZ;
        }
        if (C04TD.G4 == null) {
            synchronized (ISaveInfoDialogService.class) {
                if (C04TD.G4 == null) {
                    C04TD.G4 = new SaveInfoDialogService();
                }
            }
        }
        return C04TD.G4;
    }

    @Override // com.ss.android.ugc.aweme.ISaveInfoDialogService
    public void tryShowDialog(String str, Function0<Unit> function0, Function0<Unit> function02) {
        C1255120ila.LIZ.getClass();
        C1255120ila.LJI(str, function0, function02);
    }
}
