package tiktok.communication;

import X.AbstractC903280Zc6;
import X.C0QSJ;
import X.C13LE;
import X.C20136413qc;
import X.C20136513qd;
import X.C2217371BqR;
import X.C738350Sxl;
import X.C769700UHg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC713360RyY;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.provider.impl.GScope;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public abstract class ComposeScope implements C0QSJ, InterfaceC713360RyY, HasDefaultViewModelProviderFactory {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public InterfaceC665370Q7z LL = GScope.LL;
    public final C20136513qd LLILLJJLI;
    public final C20136413qc LLILLL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(ComposeScope.class, "lifecycle", "getLifecycle()Landroidx/lifecycle/Lifecycle;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        return C738350Sxl.LIZ(this);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return new ViewModelProvider.NewInstanceFactory();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.LLILLJJLI.getValue(this, LLILZ[0]);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.13qc] */
    public ComposeScope() {
        C769700UHg.LIZ.getClass();
        this.LLILLJJLI = new C20136513qd();
        this.LLILLL = new ViewModelStoreOwner() { // from class: X.13qc
            public final ViewModelStore LL = new ViewModelStore();

            @Override // androidx.lifecycle.ViewModelStoreOwner
            public final ViewModelStore getViewModelStore() {
                return this.LL;
            }
        };
    }

    @Override // X.C0QSJ
    public List<Class<Object>> getScopes() {
        return Collections.singletonList(getClass());
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return this.LL;
    }

    @Override // X.C0QSJ
    public Object getAbility(Class<?> cls) {
        throw new IllegalStateException("NOT IMPLEMENTATION");
    }

    @Override // X.C0QSJ
    public void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        throw new IllegalStateException("NOT IMPLEMENTATION");
    }

    @Override // X.C0QSJ
    public void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        throw new IllegalStateException("NOT IMPLEMENTATION");
    }

    @Override // X.C0QSJ
    public void bindAbility(Object obj, Class<?> cls) {
        throw new IllegalStateException("NOT IMPLEMENTATION");
    }

    @Override // X.C0QSJ
    public void unbindAbility(Object obj, Class<?> cls) {
        throw new IllegalStateException("NOT IMPLEMENTATION");
    }
}
