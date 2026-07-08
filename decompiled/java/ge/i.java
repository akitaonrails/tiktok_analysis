package ge;

import X.AbstractC1664470tPp;
import X.AbstractC1664490tPr;
import X.C01GW;
import X.C05YF;
import X.C0LFH;
import X.C19A3;
import X.C2188811AlT;
import X.C452501pT;
import X.EnumC371580EhY;
import com.bytedance.scene.Scene;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public abstract class i<API_COMPONENT extends C05YF, SCENE extends AbstractC1664490tPr<STATE, ACTION>, STATE, ACTION> extends AbstractC1664470tPp<API_COMPONENT, STATE, ACTION> {
    public final C19A3 LLILLL;
    public final String LLILZ;
    public int LLILZIL;
    public Class<?> LLILZLL;
    public EnumC371580EhY LLIZ;
    public final C01GW LLIZLLLIL;
    public boolean LLJ;
    public final Function0<SCENE> LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;

    public final SCENE B3() {
        return (SCENE) this.LLIZLLLIL.getValue();
    }

    public final Class<?> Q3() {
        Class<?> cls = this.LLILZLL;
        if (cls != null) {
            return cls;
        }
        return null;
    }

    public void hide() {
        C0LFH.LIZ(new AwS569S0100000_25((i) this, 781));
    }

    public boolean isShowing() {
        return this.LLJ && this.LLILLL.isShowing(B3());
    }

    public final EnumC371580EhY q3() {
        EnumC371580EhY enumC371580EhY = this.LLIZ;
        if (enumC371580EhY != null) {
            return enumC371580EhY;
        }
        return null;
    }

    public void show() {
        C0LFH.LIZ(new AwS569S0100000_25((i) this, 784));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Scene sceneFindSceneByTag = this.LLILLL.findSceneByTag(this.LLILZ);
        if (sceneFindSceneByTag != null) {
            this.LLILLL.remove(sceneFindSceneByTag);
        }
        if (q3() == EnumC371580EhY.SHOW) {
            show();
        }
    }

    public Function0<SCENE> E3() {
        return this.LLJI;
    }

    public int H3() {
        return this.LLJIJIL;
    }

    public final int O3() {
        return this.LLILZIL;
    }

    public int v3() {
        return this.LLJILJIL;
    }

    public i(C19A3 c19a3) {
        this.LLILLL = c19a3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UISlotComponent#");
        sbLIZ.append(getClass().getName());
        sbLIZ.append('#');
        sbLIZ.append(UUID.randomUUID());
        this.LLILZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS569S0100000_25((i) this, 782));
        this.LLJI = new AwS569S0100000_25((i) this, 783);
    }

    public final void e4(EnumC371580EhY enumC371580EhY) {
        this.LLIZ = enumC371580EhY;
    }

    public final void o4(int i) {
        this.LLILZIL = i;
    }

    public final void z4(Class<?> cls) {
        this.LLILZLL = cls;
    }
}
