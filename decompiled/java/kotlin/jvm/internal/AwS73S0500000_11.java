package kotlin.jvm.internal;

import X.C03H5;
import X.C09AY;
import X.C0SM7;
import X.C118300cf;
import X.C1770850wBP;
import X.C259800zU;
import X.C736800SvG;
import X.InterfaceC1631630sYr;
import X.InterfaceC719500SKe;
import X.InterfaceC720380SNo;
import X.InterfaceC736830SvJ;
import X.ViewOnClickListenerC725830SdZ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.AbsTakoRightBottomEntrance;
import com.ss.android.ugc.aweme.ui.feed.commerce.VSAMultiPhotoViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS73S0500000_11 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$0(AwS73S0500000_11 awS73S0500000_11) {
        InterfaceC736830SvJ<S> interfaceC736830SvJ = ((AssemViewModel) awS73S0500000_11.l0).vmDispatcher;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) awS73S0500000_11.l1;
        C1770850wBP c1770850wBP = (C1770850wBP) awS73S0500000_11.l2;
        Function1<? super Throwable, Unit> function1 = (Function1) awS73S0500000_11.l3;
        return interfaceC736830SvJ.LJJJJ(lifecycleOwner, (C1770850wBP<S>) c1770850wBP, function1, new C736800SvG(), AFwS198S0000000_11.get$arr$(33), (Function1<? super S, Unit>) ((Function1) awS73S0500000_11.l4));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$1(AwS73S0500000_11 awS73S0500000_11) {
        InterfaceC736830SvJ<S> interfaceC736830SvJ = ((AssemViewModel) awS73S0500000_11.l0).vmDispatcher;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) awS73S0500000_11.l1;
        C1770850wBP c1770850wBP = (C1770850wBP) awS73S0500000_11.l2;
        return interfaceC736830SvJ.LJJJJ(lifecycleOwner, (C1770850wBP<S>) c1770850wBP, (Function1) awS73S0500000_11.l3, new C736800SvG(), AFwS198S0000000_11.get$arr$(34), (Function1<? super S, Unit>) ((Function1) awS73S0500000_11.l4));
    }

    public static final Object invoke$2(AwS73S0500000_11 awS73S0500000_11) {
        ((InterfaceC1631630sYr) awS73S0500000_11.l0).invoke((C03H5) awS73S0500000_11.l1, awS73S0500000_11.l2, awS73S0500000_11.l3, awS73S0500000_11.l4);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static /* bridge */ /* synthetic */ Object invoke$3(AwS73S0500000_11 awS73S0500000_11) {
        ?? ValueOf;
        int iIntValue;
        int iIntValue2;
        int height = ((ViewGroup) awS73S0500000_11.l0).getHeight();
        View view = (View) ((C259800zU) awS73S0500000_11.l1).element;
        if (view != null) {
            ValueOf = Integer.valueOf(view.getHeight());
        } else {
            ValueOf = 0;
        }
        if (height != ((C118300cf) awS73S0500000_11.l2).element || !Intrinsics.LJFF(ValueOf, ((C259800zU) awS73S0500000_11.l3).element)) {
            ((C118300cf) awS73S0500000_11.l2).element = height;
            ((C259800zU) awS73S0500000_11.l3).element = ValueOf;
            if (ValueOf != 0) {
                iIntValue = ValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            int iMax = Math.max(height, iIntValue);
            if (ValueOf != 0) {
                iIntValue2 = ValueOf.intValue();
            } else {
                iIntValue2 = iMax;
            }
            AbsTakoRightBottomEntrance absTakoRightBottomEntrance = (AbsTakoRightBottomEntrance) awS73S0500000_11.l4;
            absTakoRightBottomEntrance.Bp().AQ2(Math.max(-AbsTakoRightBottomEntrance.LLLFFI, -iIntValue2), AbsTakoRightBottomEntrance.LLLFZ + (iMax - iIntValue2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS73S0500000_11 awS73S0500000_11) {
        ArrayList arrayList = new ArrayList();
        VSAMultiPhotoViewHolder vSAMultiPhotoViewHolder = (VSAMultiPhotoViewHolder) awS73S0500000_11.l0;
        View view = (View) awS73S0500000_11.l1;
        C0SM7 c0sm7 = (C0SM7) awS73S0500000_11.l2;
        InterfaceC719500SKe interfaceC719500SKe = (InterfaceC719500SKe) awS73S0500000_11.l3;
        InterfaceC720380SNo interfaceC720380SNo = (InterfaceC720380SNo) awS73S0500000_11.l4;
        Iterator<Integer> it2 = vSAMultiPhotoViewHolder.LLJJL.iterator();
        while (it2.hasNext()) {
            ViewOnClickListenerC725830SdZ viewOnClickListenerC725830SdZ = (ViewOnClickListenerC725830SdZ) view.findViewById(it2.next().intValue());
            if (viewOnClickListenerC725830SdZ != null) {
                viewOnClickListenerC725830SdZ.setFeedPhotoParams(c0sm7);
                viewOnClickListenerC725830SdZ.setImageLoadListener(interfaceC719500SKe);
                viewOnClickListenerC725830SdZ.setTouchInterceptor(interfaceC720380SNo);
            } else {
                viewOnClickListenerC725830SdZ = null;
            }
            arrayList.add(viewOnClickListenerC725830SdZ);
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS73S0500000_11(InterfaceC1631630sYr interfaceC1631630sYr, InterfaceC1631630sYr<C03H5, Object, Object, Object, Unit> interfaceC1631630sYr2, C03H5 c03h5, Object obj, Object obj2, Object obj3) {
        super(0);
        this.$t = obj3;
        this.l0 = interfaceC1631630sYr;
        this.l1 = interfaceC1631630sYr2;
        this.l2 = c03h5;
        this.l3 = obj;
        this.l4 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S0500000_11(ViewGroup viewGroup, C259800zU c259800zU, C118300cf c118300cf, C259800zU c259800zU2, AbsTakoRightBottomEntrance absTakoRightBottomEntrance, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = c259800zU;
        this.l2 = c118300cf;
        this.l3 = c259800zU2;
        this.l4 = absTakoRightBottomEntrance;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS73S0500000_11(AssemViewModel assemViewModel, AssemViewModel<S> assemViewModel2, LifecycleOwner lifecycleOwner, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function1<? super S, Unit> function12) {
        super(0);
        this.$t = function12;
        this.l0 = assemViewModel;
        this.l1 = assemViewModel2;
        this.l2 = lifecycleOwner;
        this.l3 = c1770850wBP;
        this.l4 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S0500000_11(VSAMultiPhotoViewHolder vSAMultiPhotoViewHolder, View view, C0SM7 c0sm7, InterfaceC719500SKe interfaceC719500SKe, InterfaceC720380SNo interfaceC720380SNo, int i) {
        super(0);
        this.$t = i;
        this.l0 = vSAMultiPhotoViewHolder;
        this.l1 = view;
        this.l2 = c0sm7;
        this.l3 = interfaceC719500SKe;
        this.l4 = interfaceC720380SNo;
    }
}
