package com.ss.android.ugc.aweme.story.avatar.adaper;

import X.AbstractC1606860ruu;
import X.C1294720jnS;
import X.C1605480rsg;
import X.C1605770rt9;
import X.C1606010rtX;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1606780rum;
import X.C1606830rur;
import X.C1606840rus;
import X.C1607070rvF;
import X.C356901a3;
import X.EnumC1256840ioM;
import X.EnumC1605470rsf;
import X.EnumC1606030rtZ;
import X.EnumC1606080rte;
import X.EnumC1607270rvZ;
import X.EnumC1615506Uf;
import X.EnumC727930Sgx;
import X.InterfaceC1398730mVD;
import X.InterfaceC1605750rt7;
import X.InterfaceC1605840rtG;
import X.InterfaceC1606880ruw;
import X.InterfaceC1607380rvk;
import X.InterfaceC1608820ry4;
import X.InterfaceC1608830ry5;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class AvatarStoryDataAdapter implements InterfaceC1608830ry5<AbstractC1606860ruu, C1606750ruj>, InterfaceC1608820ry4<AbstractC1606860ruu, C1606750ruj>, DefaultLifecycleObserver, InterfaceC1605750rt7, GenericLifecycleObserver {
    public final C1606750ruj LL;
    public String LLILLL;
    public boolean LLILZ;
    public Boolean LLIZ;
    public float LLIZLLLIL;
    public AvatarComponentView LLJ;
    public C1606830rur LLJI;
    public String LLJIJIL;
    public InterfaceC1607380rvk LLJILJIL;
    public InterfaceC1398730mVD LLJILJILJ;
    public AbstractC1606860ruu LLJILLL;
    public EnumC1606030rtZ LLJJ;
    public EnumC727930Sgx LLILLJJLI = EnumC727930Sgx.PROGRESS_BAR;
    public EnumC1605470rsf LLILZIL = EnumC1605470rsf.DEFAULT;
    public Integer LLILZLL = 0;

    @Override // X.InterfaceC1605750rt7
    public final void LIZ() {
    }

    @Override // X.InterfaceC1605750rt7
    public final void LIZIZ(C1294720jnS c1294720jnS) {
    }

    @Override // X.InterfaceC1605750rt7
    public final View getView() {
        return null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // X.InterfaceC1605750rt7
    public final void setColorList(int[] iArr) {
    }

    @Override // X.InterfaceC1605750rt7
    public final void setPositionList(float[] fArr) {
    }

    @Override // X.InterfaceC1605750rt7
    public final EnumC1605470rsf getMode() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1605750rt7
    public final String getScheduleId() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1605750rt7
    public final boolean q1() {
        return this.LLILZ;
    }

    public AvatarStoryDataAdapter(C1606750ruj c1606750ruj) {
        this.LL = c1606750ruj;
    }

    @Override // X.InterfaceC1608830ry5
    public final InterfaceC1606880ruw LIZLLL(Object obj) {
        int iIntValue;
        User user;
        InterfaceC1398730mVD interfaceC1398730mVD = this.LLJILJILJ;
        if (interfaceC1398730mVD != null) {
            if (obj instanceof User) {
                user = (User) obj;
            } else {
                user = null;
            }
            interfaceC1398730mVD.LJIJ(user);
        }
        EnumC1605470rsf enumC1605470rsf = this.LLILZIL;
        Integer num = this.LLILZLL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return LJII(enumC1605470rsf, iIntValue);
    }

    @Override // X.InterfaceC1608820ry4
    public final InterfaceC1606880ruw LJFF(Object obj) {
        int iIntValue;
        if (obj instanceof EnumC1605470rsf) {
            EnumC1605470rsf enumC1605470rsf = (EnumC1605470rsf) obj;
            Integer num = this.LLILZLL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            return LJII(enumC1605470rsf, iIntValue);
        }
        return null;
    }

    @Override // X.InterfaceC1605750rt7
    public final void setMine(boolean z) {
        this.LLILZ = z;
    }

    @Override // X.InterfaceC1605750rt7
    public final void setMode(EnumC1605470rsf enumC1605470rsf) {
        this.LLILZIL = enumC1605470rsf;
    }

    @Override // X.InterfaceC1605750rt7
    public final void setProgress(float f) {
        InterfaceC1606880ruw interfaceC1606880ruw;
        AvatarComponentView avatarComponentView;
        Map<EnumC1607270rvZ, InterfaceC1606880ruw> currentActiveBusiness;
        this.LLIZLLLIL = f;
        if (f >= 0.0f) {
            AvatarComponentView avatarComponentView2 = this.LLJ;
            if (avatarComponentView2 != null && (currentActiveBusiness = avatarComponentView2.getCurrentActiveBusiness()) != null) {
                interfaceC1606880ruw = currentActiveBusiness.get(EnumC1607270rvZ.STORY);
            } else {
                interfaceC1606880ruw = null;
            }
            if ((interfaceC1606880ruw instanceof C1606840rus) && (avatarComponentView = this.LLJ) != null) {
                avatarComponentView.LJI(EnumC1607270rvZ.STORY, EnumC1256840ioM.START_ANIMATION, new C1606780rum(f, this.LLILLJJLI));
            }
        }
    }

    @Override // X.InterfaceC1605750rt7
    public final void setProgressMode(EnumC727930Sgx enumC727930Sgx) {
        this.LLILLJJLI = enumC727930Sgx;
    }

    @Override // X.InterfaceC1605750rt7
    public final void setScheduleId(String str) {
        this.LLILLL = str;
    }

    @Override // X.InterfaceC1605750rt7
    public final void setUnReadNum(Integer num) {
        this.LLILZLL = num;
    }

    @Override // X.InterfaceC1608820ry4
    public final void LJ(AvatarComponentView avatarComponentView, LifecycleOwner lifecycleOwner) {
        EnumC1606080rte enumC1606080rte;
        boolean delegateShowEvent;
        String str;
        C1606770rul c1606770rul;
        Function1<InterfaceC1398730mVD, Unit> function1;
        Function0<Boolean> function0;
        String str2;
        EnumC1606030rtZ enumC1606030rtZ;
        this.LLJ = avatarComponentView;
        this.LLJI = avatarComponentView.getConfig().LIZJ;
        if (lifecycleOwner == null) {
            return;
        }
        C1606750ruj c1606750ruj = this.LL;
        String str3 = null;
        if (c1606750ruj != null) {
            InterfaceC1605840rtG interfaceC1605840rtGLJIIIZ = C1607070rvF.LIZIZ.LJI().LJIIIZ(c1606750ruj.LIZ);
            if (interfaceC1605840rtGLJIIIZ instanceof EnumC1606030rtZ) {
                enumC1606030rtZ = (EnumC1606030rtZ) interfaceC1605840rtGLJIIIZ;
            } else {
                enumC1606030rtZ = null;
            }
            this.LLJJ = enumC1606030rtZ;
        }
        EnumC1615506Uf enumC1615506Uf = EnumC1615506Uf.STORY;
        C1606750ruj c1606750ruj2 = this.LL;
        if (c1606750ruj2 == null || (enumC1606080rte = c1606750ruj2.LIZ) == null) {
            enumC1606080rte = EnumC1606080rte.MY_PROFILE;
        }
        C1605770rt9 c1605770rt9 = new C1605770rt9(enumC1615506Uf, this, lifecycleOwner, enumC1606080rte);
        c1605770rt9.LJIILJJIL = new AwS638S0100000_24(this, 101);
        EnumC1606030rtZ enumC1606030rtZ2 = this.LLJJ;
        boolean showPublishEntry = false;
        if (enumC1606030rtZ2 != null) {
            delegateShowEvent = enumC1606030rtZ2.getDelegateShowEvent();
        } else {
            delegateShowEvent = false;
        }
        c1605770rt9.LJIIJ = delegateShowEvent;
        C1606830rur c1606830rur = this.LLJI;
        if (c1606830rur != null) {
            str3 = c1606830rur.LIZ;
        }
        c1605770rt9.LJ = str3;
        String str4 = "";
        if (c1606830rur == null || (str = c1606830rur.LIZIZ) == null) {
            str = "";
        }
        c1605770rt9.LJFF = str;
        if (c1606830rur != null && (str2 = c1606830rur.LIZJ) != null) {
            str4 = str2;
        }
        c1605770rt9.LJI = str4;
        EnumC1606030rtZ enumC1606030rtZ3 = this.LLJJ;
        if (enumC1606030rtZ3 != null) {
            showPublishEntry = enumC1606030rtZ3.getShowPublishEntry();
        }
        c1605770rt9.LJIIIZ = showPublishEntry;
        c1605770rt9.LJIIL = avatarComponentView.getConfig().LIZ.LJIJ;
        C1606750ruj c1606750ruj3 = this.LL;
        if (c1606750ruj3 != null) {
            C1606770rul c1606770rul2 = c1606750ruj3.LIZIZ;
            if (c1606770rul2 != null && (function0 = c1606770rul2.LJII) != null) {
                c1605770rt9.LJII = function0;
            }
            C1606770rul c1606770rul3 = c1606750ruj3.LIZIZ;
            if (c1606770rul3 != null) {
                Function1<EnumC1605470rsf, Unit> function12 = c1606770rul3.LIZJ;
                if (function12 != null) {
                    c1605770rt9.LJIIIIZZ = function12;
                }
                Function2<String, HashMap<String, String>, Boolean> function2 = c1606770rul3.LIZLLL;
                if (function2 != null) {
                    c1605770rt9.LJIILIIL = function2;
                }
                Function0<Boolean> function02 = c1606770rul3.LJ;
                if (function02 != null) {
                    c1605770rt9.LJIIJJI = function02;
                }
            }
        }
        InterfaceC1398730mVD interfaceC1398730mVDLIZ = C1606010rtX.LIZIZ.LIZ(c1605770rt9);
        this.LLJILJILJ = interfaceC1398730mVDLIZ;
        C1606750ruj c1606750ruj4 = this.LL;
        if (c1606750ruj4 != null && (c1606770rul = c1606750ruj4.LIZIZ) != null && (function1 = c1606770rul.LJI) != null) {
            function1.invoke(interfaceC1398730mVDLIZ);
        }
        AvatarComponentView avatarComponentView2 = this.LLJ;
        if (avatarComponentView2 != null) {
            avatarComponentView2.LJIIJJI(EnumC1607270rvZ.STORY, new AwS603S0100000_24(this, 573));
        }
    }

    public final AbstractC1606860ruu LJII(EnumC1605470rsf enumC1605470rsf, int i) {
        if (enumC1605470rsf == null) {
            return null;
        }
        switch (C1605480rsg.LIZ[enumC1605470rsf.ordinal()]) {
            case 6:
                final Boolean boolValueOf = Boolean.valueOf(this.LLILZ);
                final InterfaceC1398730mVD interfaceC1398730mVD = this.LLJILJILJ;
                break;
        }
        return null;
    }

    @Override // X.InterfaceC1608820ry4
    public final void LIZJ(String str, InterfaceC1607380rvk interfaceC1607380rvk, Object obj) {
        this.LLJILJIL = interfaceC1607380rvk;
        this.LLJIJIL = str;
        this.LLILZIL = EnumC1605470rsf.DEFAULT;
        InterfaceC1398730mVD interfaceC1398730mVD = this.LLJILJILJ;
        if (interfaceC1398730mVD != null) {
            interfaceC1398730mVD.LIZIZ(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1605750rt7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.EnumC1605470rsf r7, X.EnumC1605470rsf r8, int r9, boolean r10, boolean r11) {
        /*
            r6 = this;
            X.0mVD r0 = r6.LLJILJILJ
            r2 = 0
            if (r0 == 0) goto L29
            boolean r0 = r0.LJIIJ()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            if (r3 == 0) goto L2a
            java.lang.Boolean r0 = r6.LLIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 != 0) goto L2a
            r1 = 1
        L18:
            r6.LLIZ = r3
            if (r7 != r8) goto L2c
            java.lang.Integer r0 = r6.LLILZLL
            if (r0 == 0) goto L2c
            int r0 = r0.intValue()
            if (r0 != r9) goto L2c
            if (r1 != 0) goto L2c
            return
        L29:
            r3 = r2
        L2a:
            r1 = 0
            goto L18
        L2c:
            X.0rsf r0 = X.EnumC1605470rsf.DEFAULT
            if (r8 != r0) goto L31
            return
        L31:
            if (r11 != 0) goto L38
            java.lang.String r0 = r6.LLJIJIL
            if (r0 != 0) goto L38
            return
        L38:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onchanged, mode = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", user_uid = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", name = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", unReadNum: "
            r1.append(r0)
            r1.append(r9)
            X.C2188811AlT.LIZIZ(r1)
            java.lang.Boolean r0 = X.C1256670io5.LIZ
            r0.booleanValue()
            X.0rvk r0 = r6.LLJILJIL
            if (r0 == 0) goto L75
            java.lang.String r1 = r6.LLJIJIL
            X.0ruu r2 = r6.LJII(r8, r9)
            X.0rvZ r3 = X.EnumC1607270rvZ.STORY
            r5 = 0
            r4 = 0
            r0.LJIIZILJ(r1, r2, r3, r4, r5)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.avatar.adaper.AvatarStoryDataAdapter.LJI(X.0rsf, X.0rsf, int, boolean, boolean):void");
    }
}
