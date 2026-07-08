package kotlin.jvm.internal;

import X.AnonymousClass0408;
import X.C09AY;
import X.C0WZX;
import X.C1308910kAL;
import X.C13LP;
import X.C1708530uYt;
import X.C1713570uh1;
import X.C1713690uhD;
import X.C1744320vUc;
import X.C1744460vUq;
import X.C1745680vWo;
import X.C1746700vYS;
import X.C1746710vYT;
import X.C1746920vYo;
import X.C1747740va8;
import X.C1748720vbi;
import X.C2204961BRm;
import X.EnumC955203oM;
import X.EnumC969503qf;
import X.InterfaceC1631620sYq;
import android.os.SystemClock;
import android.text.Editable;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.OneSearchItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SearchInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public class AwS204S1100000_26 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS204S1100000_26(C1713570uh1 c1713570uh1, String str, int i) {
        super(3);
        this.$t = i;
        this.l1 = c1713570uh1;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS204S1100000_26(AddressEditViewModel addressEditViewModel, String str, int i) {
        super(3);
        this.$t = i;
        this.s0 = str;
        this.l1 = addressEditViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS204S1100000_26(OneSearchItemViewHolder oneSearchItemViewHolder, String str, int i) {
        super(3);
        this.$t = i;
        this.l1 = oneSearchItemViewHolder;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS204S1100000_26(SearchInputItemViewHolder searchInputItemViewHolder, String str, int i) {
        super(3);
        this.$t = i;
        this.l1 = searchInputItemViewHolder;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS204S1100000_26 awS204S1100000_26, Object obj, Object obj2, Object obj3) throws Throwable {
        String string;
        C1746700vYS<CandInputData> c1746700vYS;
        ViewItem viewItem;
        String str;
        CandInputDataOptions candInputDataOptions = (CandInputDataOptions) obj;
        ((Boolean) obj2).booleanValue();
        if (candInputDataOptions != null) {
            ((OneSearchItemViewHolder) awS204S1100000_26.l1).LLJJIJIIJIL = candInputDataOptions.sessionKey;
            ArrayList arrayList = new ArrayList();
            List<CandInputData> list = candInputDataOptions.candInputOptions;
            if (list != null) {
                String str2 = awS204S1100000_26.s0;
                for (CandInputData candInputData : list) {
                    List<ViewItem> list2 = candInputData.viewItems;
                    if (list2 != null && (viewItem = (ViewItem) C13LP.LJJJLZIJ(0, list2)) != null && (str = viewItem.text) != null) {
                        arrayList.add(new C1746920vYo(candInputData, str, null, str2, candInputData.type));
                    }
                }
            }
            ECRichText eCRichText = candInputDataOptions.manualGuide;
            if (eCRichText != null) {
                arrayList.add(new C1746920vYo(null, "", eCRichText, awS204S1100000_26.s0, -100));
            }
            C1746710vYT<CandInputData> c1746710vYT = ((OneSearchItemViewHolder) awS204S1100000_26.l1).LLJJI;
            OneSearchItemViewHolder oneSearchItemViewHolder = (OneSearchItemViewHolder) awS204S1100000_26.l1;
            Editable editableLLLLJI = C2204961BRm.LLLLJI(c1746710vYT.getSearchEditFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsD7eYi4WNqhSD+NfcDqLm/KtnAPUNgUI5K3KXERta", null));
            if (editableLLLLJI == null || (string = editableLLLLJI.toString()) == null) {
                string = "";
            }
            if (c1746710vYT.LIZJ(string) && (c1746700vYS = c1746710vYT.LLILZIL) != null) {
                c1746700vYS.LJIIIZ = new WeakReference<>(oneSearchItemViewHolder);
                c1746700vYS.LJIIJ = arrayList;
                c1746700vYS.LIZLLL = Boolean.FALSE;
                c1746700vYS.LJ = true;
                c1746700vYS.LJIIJJI.removeMessages(2);
                c1746700vYS.LJIIJJI.removeMessages(3);
                c1746700vYS.LJIIJJI.sendEmptyMessage(3);
            }
            if (arrayList.size() > 0) {
                OneSearchItemViewHolder oneSearchItemViewHolder2 = (OneSearchItemViewHolder) awS204S1100000_26.l1;
                if (!oneSearchItemViewHolder2.LLJJJJJIL) {
                    oneSearchItemViewHolder2.LLJJJJJIL = true;
                    oneSearchItemViewHolder2.LLJJJJLIIL = SystemClock.elapsedRealtime();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS204S1100000_26 awS204S1100000_26, Object obj, Object obj2, Object obj3) throws Throwable {
        ViewItem viewItem;
        String str;
        String str2;
        boolean z;
        ViewItem viewItem2;
        CandInputDataOptions candInputDataOptions = (CandInputDataOptions) obj;
        ((Boolean) obj2).booleanValue();
        if (candInputDataOptions != null) {
            SearchInputItemViewHolder searchInputItemViewHolder = (SearchInputItemViewHolder) awS204S1100000_26.l1;
            searchInputItemViewHolder.LLJJI = candInputDataOptions.sessionKey;
            searchInputItemViewHolder.a6().LLJLIL = ((SearchInputItemViewHolder) awS204S1100000_26.l1).LLJJI;
            ArrayList arrayList = new ArrayList();
            boolean zLJIIL = AnonymousClass0408.LIZ.LJIIL(EnumC955203oM.TTS, "shipping_address", EnumC969503qf.TTS_GLOBAL_ADDRESS_EDIT_V1.getTemplate());
            List<CandInputData> list = candInputDataOptions.candInputOptions;
            if (list != null) {
                String str3 = awS204S1100000_26.s0;
                SearchInputItemViewHolder searchInputItemViewHolder2 = (SearchInputItemViewHolder) awS204S1100000_26.l1;
                for (CandInputData candInputData : list) {
                    List<ViewItem> list2 = candInputData.viewItems;
                    if (list2 != null && (viewItem = (ViewItem) C13LP.LJJJLZIJ(0, list2)) != null && (str = viewItem.text) != null) {
                        Integer numLIZJ = null;
                        if (!zLJIIL && (viewItem2 = (ViewItem) C13LP.LJJJLZIJ(1, candInputData.viewItems)) != null) {
                            str2 = viewItem2.text;
                        } else {
                            str2 = null;
                        }
                        Integer num = candInputData.itemType;
                        if (num != null && num.intValue() == 1) {
                            z = false;
                        } else {
                            z = true;
                        }
                        Integer num2 = candInputData.itemType;
                        if (num2 != null && num2.intValue() == 1) {
                            numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, searchInputItemViewHolder2.itemView.getContext());
                        }
                        arrayList.add(new C1744320vUc(candInputData, str, str2, str3, z, numLIZJ, 192));
                    }
                }
            }
            C1744460vUq<CandInputData> c1744460vUq = ((SearchInputItemViewHolder) awS204S1100000_26.l1).LLJJ;
            if (c1744460vUq != null) {
                c1744460vUq.LIZLLL(true, arrayList, (SearchInputItemViewHolder) awS204S1100000_26.l1, false, true);
            }
            if (arrayList.size() > 0) {
                SearchInputItemViewHolder searchInputItemViewHolder3 = (SearchInputItemViewHolder) awS204S1100000_26.l1;
                if (!searchInputItemViewHolder3.LLJJIJIL) {
                    searchInputItemViewHolder3.LLJJIJIL = true;
                    searchInputItemViewHolder3.LLJJJ = SystemClock.elapsedRealtime();
                    C1748720vbi.LIZLLL(((SearchInputItemViewHolder) awS204S1100000_26.l1).itemView, new C1747740va8(), new AwS605S0100000_26(arrayList, (List<C1745680vWo>) 178));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS204S1100000_26 awS204S1100000_26, Object obj, Object obj2, Object obj3) {
        if (Intrinsics.LJFF(obj2, "sparkPageBackEvent")) {
            ((C1713570uh1) awS204S1100000_26.l1).LJIILIIL.LIZ(new C1713690uhD((Fragment) null, "CANCEL", awS204S1100000_26.s0, (String) null, (String) null, (C1708530uYt) null, (Map) null, 249));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS204S1100000_26 r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions r8 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions) r8
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            r3 = 0
            if (r0 == 0) goto L2c
            java.lang.String r1 = r7.s0
            java.lang.String r0 = "phone"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L1f
            java.lang.String r1 = r7.s0
            java.lang.String r0 = "tax_id"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L29
        L1f:
            java.lang.Object r2 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r2 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r2
            java.lang.String r1 = r7.s0
            r0 = 0
            r2.lR2(r1, r3, r0)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            if (r8 == 0) goto L80
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData> r0 = r8.candInputOptions
            if (r0 == 0) goto L80
            java.lang.String r6 = r7.s0
            java.lang.Object r7 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r7 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r7
            java.util.Iterator r4 = r0.iterator()
        L3c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r9 = r4.next()
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData r9 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData) r9
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r9.address
            if (r0 == 0) goto L7e
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem> r0 = r0.items
            if (r0 == 0) goto L7e
            java.util.Iterator r2 = r0.iterator()
        L54:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r0
            java.lang.String r0 = r0.key
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L54
        L69:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r1
            if (r1 == 0) goto L7e
            java.lang.String r8 = r1.value
        L6f:
            r7.getClass()
            kotlin.jvm.internal.AwS28S2200000_26 r5 = new kotlin.jvm.internal.AwS28S2200000_26
            r10 = 1
            r5.<init>(r6, r7, r8, r9, r10)
            r7.vS2(r6, r5)
            goto L3c
        L7c:
            r1 = r3
            goto L69
        L7e:
            r8 = r3
            goto L6f
        L80:
            java.lang.Object r3 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r3 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r3
            java.lang.String r2 = r7.s0
            r3.getClass()
            kotlin.jvm.internal.AwS140S1100000_26 r1 = new kotlin.jvm.internal.AwS140S1100000_26
            r0 = 59
            r1.<init>(r3, r2, r0)
            r3.vS2(r2, r1)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS204S1100000_26.invoke$3(kotlin.jvm.internal.AwS204S1100000_26, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
