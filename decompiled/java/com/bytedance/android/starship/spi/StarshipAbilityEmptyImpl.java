package com.bytedance.android.starship.spi;

import X.C1307950k8n;
import X.C1307960k8o;
import X.C1307970k8p;
import X.C1307980k8q;
import X.C1308030k8v;
import X.C1309270kAv;
import X.InterfaceC1306440k6M;
import X.InterfaceC1306560k6Y;
import X.InterfaceC1307680k8M;
import X.InterfaceC1308020k8u;
import X.InterfaceC1309280kAw;
import Y.AObjectS121S0000000_20;
import com.bytedance.android.starship.base.IStarshipBaseBridge;
import com.bytedance.android.starship.engine.graph.node.StarShipTTMCommonFunctions;
import java.util.Map;
import kotlin.jvm.internal.AFwS258S0000000_20;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class StarshipAbilityEmptyImpl implements IStarshipAbility {
    public final C1307980k8q LIZ = new IStarshipBaseBridge() { // from class: X.0k8q
        @Override // com.bytedance.android.starship.base.IStarshipBaseBridge
        public final void LIZ(AFwS258S0000000_20 aFwS258S0000000_20) {
        }

        @Override // com.bytedance.android.starship.base.IStarshipBaseBridge
        public final void LIZIZ(String str, long j) {
        }

        @Override // com.bytedance.android.starship.base.IStarshipBaseBridge
        public final Object LIZJ(String str, String str2, String str3, String str4) {
            return null;
        }

        @Override // com.bytedance.android.starship.base.IStarshipBaseBridge
        public final Integer LIZLLL() {
            return null;
        }

        @Override // com.bytedance.android.starship.base.IStarshipBaseBridge
        public final void LJ(AObjectS121S0000000_20 aObjectS121S0000000_20) {
        }

        @Override // com.bytedance.android.starship.base.IStarshipBaseBridge
        public final String LJFF() {
            return null;
        }

        @Override // com.bytedance.android.starship.base.IStarshipBaseBridge
        public final boolean initPitaya(String str) {
            return false;
        }
    };
    public final C1308030k8v LIZIZ = new InterfaceC1306440k6M() { // from class: X.0k8v
        @Override // X.InterfaceC1306440k6M
        public final boolean LIZ() {
            return false;
        }

        @Override // X.InterfaceC1306440k6M
        public final int LIZIZ() {
            return 0;
        }

        @Override // X.InterfaceC1306440k6M
        public final String getChannel() {
            return "";
        }

        @Override // X.InterfaceC1306440k6M
        public final void isDebug() {
        }
    };
    public final C1307960k8o LIZJ = new InterfaceC1308020k8u() { // from class: X.0k8o
        @Override // X.InterfaceC1308020k8u
        public final void LIZIZ(String str) {
        }

        @Override // X.InterfaceC1308020k8u
        public final C588110N4v LIZJ(String str, JSONObject jSONObject) {
            return new C588110N4v(false, "Service not available");
        }

        @Override // X.InterfaceC1308020k8u
        public final C588110N4v LIZ(String str, String str2, JSONObject jSONObject, long j) {
            return new C588110N4v(false, "Service not available");
        }
    };
    public final C1307970k8p LIZLLL = new InterfaceC1306560k6Y() { // from class: X.0k8p
        @Override // X.InterfaceC1306560k6Y
        public final <T> T LIZIZ(Class<T> cls) {
            return null;
        }

        @Override // X.InterfaceC1306560k6Y
        public final Integer LIZJ(Throwable th) {
            return 0;
        }
    };
    public final C1309270kAv LJ = new InterfaceC1309280kAw() { // from class: X.0kAv
        @Override // X.InterfaceC1309280kAw
        public final void LIZ(String str, C1309290kAx c1309290kAx) {
        }

        @Override // X.InterfaceC1309280kAw
        public final void LIZIZ(C1309300kAy c1309300kAy) {
        }

        @Override // X.InterfaceC1309280kAw
        public final void LJ(C1309310kAz c1309310kAz) {
        }

        @Override // X.InterfaceC1309280kAw
        public final boolean isReady() {
            return false;
        }

        @Override // X.InterfaceC1309280kAw
        public final void LIZLLL(String str, C1309250kAt c1309250kAt) {
            c1309250kAt.LIZ(false, null, null);
        }

        @Override // X.InterfaceC1309280kAw
        public final void LIZJ(String str, JSONObject jSONObject, float f, C01X1 c01x1) {
            c01x1.LIZ(null, null);
        }
    };
    public final C1307950k8n LJFF = new InterfaceC1307680k8M() { // from class: X.0k8n
        @Override // X.InterfaceC1307680k8M
        public final void LIZ(String str) {
        }

        @Override // X.InterfaceC1307680k8M
        public final boolean LIZIZ(String str, String str2) {
            return false;
        }

        @Override // X.InterfaceC1307680k8M
        public final long LIZLLL(StarShipTTMCommonFunctions starShipTTMCommonFunctions) {
            return 0L;
        }

        @Override // X.InterfaceC1307680k8M
        public final long LJ() {
            return 0L;
        }

        @Override // X.InterfaceC1307680k8M
        public final void LJI(long j) {
        }

        @Override // X.InterfaceC1307680k8M
        public final long LJII(String str, long j) {
            return 0L;
        }

        @Override // X.InterfaceC1307680k8M
        public final byte[] LJIIIIZZ(String str, long j) {
            return null;
        }

        @Override // X.InterfaceC1307680k8M
        public final C1266004xO LIZJ(long j, Map map, String str) {
            return new C1266004xO(false, "Service not available");
        }

        @Override // X.InterfaceC1307680k8M
        public final C1307660k8K LJFF(long j, byte[] bArr, Map<String, ? extends Object> map) {
            return new C1307660k8K(null, "Service not available", true);
        }
    };

    @Override // com.bytedance.android.starship.spi.IStarshipAbility
    public final InterfaceC1307680k8M LIZ() {
        return this.LJFF;
    }

    @Override // com.bytedance.android.starship.spi.IStarshipAbility
    public final InterfaceC1308020k8u LIZIZ() {
        return this.LIZJ;
    }

    @Override // com.bytedance.android.starship.spi.IStarshipAbility
    public final InterfaceC1309280kAw LIZJ() {
        return this.LJ;
    }

    @Override // com.bytedance.android.starship.spi.IStarshipAbility
    public final InterfaceC1306440k6M LIZLLL() {
        return this.LIZIZ;
    }

    @Override // com.bytedance.android.starship.spi.IStarshipAbility
    public final IStarshipBaseBridge LJ() {
        return this.LIZ;
    }

    @Override // com.bytedance.android.starship.spi.IStarshipAbility
    public final InterfaceC1306560k6Y getNetworkService() {
        return this.LIZLLL;
    }
}
