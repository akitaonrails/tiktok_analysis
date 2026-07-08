package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C03H5;
import X.C13IQ;
import X.C1865890yeh;
import X.C657340PqO;
import X.C657530Pqh;
import X.C657670Pqv;
import X.InterfaceC111300bX;
import X.InterfaceC494301wD;
import X.InterfaceC657770Pr5;
import X.InterfaceC657870PrF;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public interface SearchComponentCenter {
    public static final /* synthetic */ C657530Pqh LIZ = C657530Pqh.LIZ;

    public static final class SoundIcon implements InterfaceC657870PrF {
        public final Function1<C657340PqO, Unit> LIZ;

        public interface SoundIconAbility extends InterfaceC494301wD {
            void fv1(AwS589S0100000_10 awS589S0100000_10);
        }

        public SoundIcon() {
            this(null);
        }

        @Override // X.InterfaceC657870PrF
        public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LIZ() {
            SearchComponentCenter.LIZ.getClass();
            return C657530Pqh.LIZ().LJI();
        }

        @Override // X.InterfaceC657780Pr6
        public final InterfaceC111300bX getConfig() {
            Function1<C657340PqO, Unit> function1 = this.LIZ;
            if (function1 == null) {
                return null;
            }
            C657340PqO c657340PqO = new C657340PqO(0);
            function1.invoke(c657340PqO);
            return c657340PqO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SoundIcon(Function1<? super C657340PqO, Unit> function1) {
            this.LIZ = function1;
        }
    }

    public static final class Top1Interaction implements InterfaceC657870PrF {
        public final Function1<C1865890yeh, Unit> LIZ;

        public interface ISearchInteractAbility extends InterfaceC494301wD {
            void Jx2(boolean z);

            void Zy();
        }

        @Override // X.InterfaceC657870PrF
        public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LIZ() {
            SearchComponentCenter.LIZ.getClass();
            return C657530Pqh.LIZ().LJIIIIZZ();
        }

        @Override // X.InterfaceC657780Pr6
        public final InterfaceC111300bX getConfig() {
            Function1<C1865890yeh, Unit> function1 = this.LIZ;
            if (function1 == null) {
                return null;
            }
            C1865890yeh c1865890yeh = new C1865890yeh(null);
            function1.invoke(c1865890yeh);
            return c1865890yeh;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Top1Interaction(Function1<? super C1865890yeh, Unit> function1) {
            this.LIZ = function1;
        }
    }

    public static final class TopBarComponent implements InterfaceC657770Pr5 {
        public final Function1<C657670Pqv, Unit> LIZ;

        public interface ISearchTopBarAbility extends InterfaceC494301wD {
            void ET1();

            int Gf0();

            void Lp1(AwS589S0100000_10 awS589S0100000_10);

            void OM(AwS589S0100000_10 awS589S0100000_10);

            void PL1(boolean z);

            int Qc1();

            int Qr();

            void Rl1(Fragment fragment, SearchTopBarStruct searchTopBarStruct, boolean z, int i);

            boolean Uj1();

            boolean WN();

            void We2(boolean z);

            void YO0();

            void eD(Drawable drawable);

            SearchTopBarStruct getData();

            Map<String, Object> id1();

            boolean ni2();

            void oC1(boolean z);

            void px(boolean z);

            void wy1();

            boolean xL1();

            void yx0(int i, int i2);
        }

        @Override // X.InterfaceC657770Pr5
        public final C13IQ<? extends UISlotAssem> LIZIZ() {
            SearchComponentCenter.LIZ.getClass();
            return C657530Pqh.LIZ().LJIILIIL();
        }

        @Override // X.InterfaceC657780Pr6
        public final InterfaceC111300bX getConfig() {
            Function1<C657670Pqv, Unit> function1 = this.LIZ;
            if (function1 == null) {
                return null;
            }
            InterfaceC111300bX interfaceC111300bX = new InterfaceC111300bX() { // from class: X.0Pqv
            };
            function1.invoke((C657670Pqv) interfaceC111300bX);
            return interfaceC111300bX;
        }

        public TopBarComponent(AFwS241S0000000_10 aFwS241S0000000_10) {
            this.LIZ = aFwS241S0000000_10;
        }
    }
}
