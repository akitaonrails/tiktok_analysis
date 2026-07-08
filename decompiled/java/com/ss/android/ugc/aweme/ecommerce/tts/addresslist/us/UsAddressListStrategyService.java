package com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us;

import X.AbstractC1746380vXw;
import X.C040C;
import X.C04JV;
import X.C1002803w2;
import X.C19465311Dn;
import X.EnumC969503qf;
import X.InterfaceC1002303vx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.changeaddressmsgv2.ChangeAddressMsgV2Cell;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addaddress.UsAddAddressCell;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addressitem.UsAddressItemCell;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.changeaddressmsg.USChangeAddressMsgCell;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.divider.UsAddressDividerCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS280S0300000_1;

/* JADX INFO: loaded from: classes2.dex */
@C040C(name = "shipping_info")
public class UsAddressListStrategyService extends DefaultAddressListStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LJ(AbstractC1746380vXw abstractC1746380vXw, C19465311Dn c19465311Dn) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService, X.AbstractC1003203w6, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModelProvider.Factory LIZ() {
        return new C04JV(1);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new AddressListViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public EnumC969503qf getType() {
        return EnumC969503qf.TTS_US_ADDRESS_LIST_V1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC1002303vx<ViewModel> LIZJ(final LifecycleOwner lifecycleOwner) {
        return new C1002803w2(lifecycleOwner) { // from class: X.03w5
            @Override // X.C1002803w2, X.AbstractC1002403vy, X.InterfaceC1002303vx
            public final void LIZ(View view) {
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.ah9);
                recyclerView.addItemDecoration(new C1058220de0(C960203pA.LIZ(R.attr.ng, view.getContext()), 0, C418440Gaw.LIZIZ(16), 2));
                C426750GoL.LJIIIZ(recyclerView, 0, 0, 0, null, false, 24);
            }

            @Override // X.C1002803w2, X.AbstractC1002403vy
            public final void LIZJ(Fragment fragment, C19EG c19eg, ViewModel viewModel, List<C1746370vXv> list) {
                if (c19eg == null) {
                    return;
                }
                C736680Sv4.LJIIIIZZ(this, (AssemViewModel) viewModel, new C2217381BqS() { // from class: X.03w4
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Integer.valueOf(((AddressListState) obj).getStatus());
                    }
                }, null, new AwS280S0300000_1(this, c19eg, viewModel, 13), 6);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService, X.AbstractC1003203w6, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZLLL(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(USChangeAddressMsgCell.class, UsAddressItemCell.class, UsAddAddressCell.class, UsAddressDividerCell.class, ChangeAddressMsgV2Cell.class);
    }
}
