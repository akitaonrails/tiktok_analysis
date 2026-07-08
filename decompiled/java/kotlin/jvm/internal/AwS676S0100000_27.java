package kotlin.jvm.internal;

import X.AbstractC21673619ry;
import X.AbstractC738140SxQ;
import X.C09AY;
import X.C0L9F;
import X.C1161920gLG;
import X.C118300cf;
import X.C1272404yQ;
import X.C13LP;
import X.C1561220qjI;
import X.C1697810uHb;
import X.C1852860yJg;
import X.C1853550yKn;
import X.C1853560yKo;
import X.C1854080yLe;
import X.C1861310yXJ;
import X.C1861360yXO;
import X.C197039127h;
import X.C1ACA;
import X.C20600815jK;
import X.C418440Gaw;
import X.C470010Ibv;
import X.C540120LGg;
import X.C626640Ohy;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1767370w5n;
import X.EnumC1853760yL8;
import X.InterfaceC1631620sYq;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC474360Iiw;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.LiveRepostVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.guide.RepostGuideShowRecordsModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowAssem;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoMediaChooseView;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public class AwS676S0100000_27 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS676S0100000_27(LabelContainerWidget labelContainerWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = labelContainerWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS676S0100000_27(TakoMenuWindowAssem takoMenuWindowAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = takoMenuWindowAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS676S0100000_27(TakoMediaChooseView takoMediaChooseView, int i) {
        super(3);
        this.$t = i;
        this.l0 = takoMediaChooseView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS676S0100000_27(TakoImageCreateFragment takoImageCreateFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = takoImageCreateFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS676S0100000_27(Integer num, int i) {
        super(3);
        this.$t = i;
        this.l0 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS676S0100000_27(Function0 function0, Function0<Unit> function02) {
        super(3);
        this.$t = function02;
        this.l0 = function0;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS676S0100000_27 awS676S0100000_27, Object obj, Object obj2, Object obj3) {
        C20600815jK<InterfaceC1891350zJl> state;
        TuxTextView tuxTextView;
        C1852860yJg c1852860yJg = (C1852860yJg) obj2;
        List list = (List) obj3;
        String str = c1852860yJg.LIZIZ;
        int i = 0;
        int i2 = 1;
        if (str.length() > 0 && (tuxTextView = ((TakoMediaChooseView) awS676S0100000_27.l0).LLJJIJIIJIL) != null) {
            tuxTextView.setText(str);
        }
        TakoMediaChooseView takoMediaChooseView = (TakoMediaChooseView) awS676S0100000_27.l0;
        List<TikTokMediaModel> list2 = c1852860yJg.LIZ;
        takoMediaChooseView.getClass();
        ArrayList arrayList = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel : list2) {
            if (tikTokMediaModel.loadSource != C0L9F.CAMERA) {
                arrayList.add(new C1853550yKn(tikTokMediaModel));
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        boolean zLIZLLL = C540120LGg.LIZLLL();
        boolean zLJ = C540120LGg.LJ();
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = 3;
        if (!zLIZLLL) {
            if (zLJ) {
                ListProtector.add(arrayList2, 0, new C1853560yKo(EnumC1853760yL8.ADD_PHOTOS, 3, false, 12));
            } else {
                c118300cf.element = 2;
                if (((Boolean) takoMediaChooseView.LLJZIJLIL.getValue()).booleanValue()) {
                    ListProtector.add(arrayList2, 0, new C1853560yKo(EnumC1853760yL8.PHOTO, 3, ((Boolean) takoMediaChooseView.LLJZIJLIL.getValue()).booleanValue(), 4));
                } else {
                    ListProtector.add(arrayList2, 0, new C1853560yKo(EnumC1853760yL8.PHOTO, c118300cf.element, false, 12));
                }
                if (!((Boolean) takoMediaChooseView.LLL.getValue()).booleanValue()) {
                    ArrayList arrayList3 = new ArrayList(3);
                    int i3 = 0;
                    do {
                        arrayList3.add(new C1272404yQ(0));
                        i3++;
                    } while (i3 < 3);
                    arrayList2.addAll(arrayList3);
                    ArrayList arrayList4 = new ArrayList(3);
                    int i4 = 0;
                    do {
                        arrayList4.add(new C1272404yQ(1));
                        i4++;
                    } while (i4 < 3);
                    arrayList2.addAll(arrayList4);
                }
            }
        }
        if (!((Boolean) takoMediaChooseView.LLJZIJLIL.getValue()).booleanValue()) {
            ListProtector.add(arrayList2, 0, new C1853560yKo(EnumC1853760yL8.CAMERA, c118300cf.element, false, 12));
        }
        int size = arrayList2.size();
        int i5 = c118300cf.element;
        int i6 = ((size + i5) - 1) / i5;
        int i7 = i6 - 1;
        int i8 = 0;
        for (Object obj4 : arrayList2) {
            int i9 = i8 + 1;
            if (i8 >= 0) {
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj4;
                if (i6 == i2) {
                    int i10 = size - 1;
                    if (i8 == 0) {
                        TakoMediaChooseView.op(interfaceC1891350zJl, EnumC1767370w5n.TOP_LEFT);
                    } else if (i8 == i10) {
                        TakoMediaChooseView.op(interfaceC1891350zJl, EnumC1767370w5n.TOP_RIGHT);
                        TakoMediaChooseView.op(interfaceC1891350zJl, EnumC1767370w5n.BOTTOM_RIGHT);
                    }
                } else {
                    int iLJI = C626640Ohy.LJI(c118300cf.element - 1, new int[0]);
                    int i11 = c118300cf.element * i7;
                    int iLJI2 = C626640Ohy.LJI(((i7 + 1) * r1) - 1, new int[0]);
                    if (i8 == 0) {
                        TakoMediaChooseView.op(interfaceC1891350zJl, EnumC1767370w5n.TOP_LEFT);
                    } else if (i8 == iLJI) {
                        TakoMediaChooseView.op(interfaceC1891350zJl, EnumC1767370w5n.TOP_RIGHT);
                    } else if (i8 == i11) {
                        TakoMediaChooseView.op(interfaceC1891350zJl, EnumC1767370w5n.BOTTOM_LEFT);
                    } else if (i8 == iLJI2) {
                        TakoMediaChooseView.op(interfaceC1891350zJl, EnumC1767370w5n.BOTTOM_RIGHT);
                    }
                }
                i8 = i9;
                i2 = 1;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((TakoMediaChooseView) awS676S0100000_27.l0).LLJJJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(arrayList2, null);
        }
        C1561220qjI.LIZ.getClass();
        if (!C1561220qjI.LIZ()) {
            boolean z = !list.isEmpty();
            View view = ((TakoMediaChooseView) awS676S0100000_27.l0).LLJL;
            if (view != null) {
                if (!z) {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, view);
            }
        }
        if (!((TakoMediaChooseView) awS676S0100000_27.l0).kp().LLILZIL) {
            AssemVMLazy assemVMLazy = ((TakoMediaChooseView) awS676S0100000_27.l0).LLJJL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoMediaChooseView.LLLIL;
            assemVMLazy.getValue().setState(new AwS393S0200000_27(c1852860yJg, (C1852860yJg) list, (List<? extends TikTokMediaModel>) 106));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS676S0100000_27 awS676S0100000_27, Object obj, Object obj2, Object obj3) {
        if (obj2 != null || obj3 != null) {
            ((TakoImageCreateFragment) awS676S0100000_27.l0).SR(-1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS676S0100000_27 awS676S0100000_27, Object obj, Object obj2, Object obj3) {
        RepostGuideShowRecordsModel repostGuideShowRecordsModel;
        long j;
        Object next;
        LiveRoomStruct liveRoomStruct;
        LiveRepostVM liveRepostVMT1 = ((LabelContainerWidget) awS676S0100000_27.l0).T1();
        if (liveRepostVMT1 != null) {
            Context context = ((LabelContainerWidget) awS676S0100000_27.l0).context;
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.LJFF(obj2, bool)) {
                liveRepostVMT1.BQ2("mutil_user_repost", "click");
            } else if (Intrinsics.LJFF(obj3, bool)) {
                liveRepostVMT1.BQ2("individual_repost", "click");
            }
            if (Intrinsics.LJFF(obj3, bool) && (repostGuideShowRecordsModel = liveRepostVMT1.LLJ) != null) {
                long j2 = repostGuideShowRecordsModel.guidanceShowTimestamp;
                C1ACA c1acaVQ2 = liveRepostVMT1.vQ2();
                if (c1acaVQ2 != null && (liveRoomStruct = c1acaVQ2.LIZJ) != null) {
                    j = liveRoomStruct.id;
                } else {
                    j = 0;
                }
                List listLIZIZ = C470010Ibv.LIZIZ();
                Iterator it2 = ((ArrayList) listLIZIZ).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        RepostGuideShowRecordsModel repostGuideShowRecordsModel2 = (RepostGuideShowRecordsModel) next;
                        if (repostGuideShowRecordsModel2.roomId == j && repostGuideShowRecordsModel2.guidanceShowTimestamp == j2) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                RepostGuideShowRecordsModel repostGuideShowRecordsModel3 = (RepostGuideShowRecordsModel) next;
                if (repostGuideShowRecordsModel3 != null) {
                    repostGuideShowRecordsModel3.interactTimestamp = j2;
                    C470010Ibv.LIZLLL(listLIZIZ);
                }
            }
            final AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(liveRepostVMT1, 1137);
            if (!((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).je1(context, new InterfaceC474360Iiw() { // from class: X.0yAy
                @Override // X.InterfaceC474360Iiw
                public final void LIZJ() {
                    awS571S0100000_27.invoke();
                }
            }, "preview_trigger_button", liveRepostVMT1.wQ2())) {
                awS571S0100000_27.invoke();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS676S0100000_27 awS676S0100000_27, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj3).booleanValue();
        Function0 function0 = (Function0) awS676S0100000_27.l0;
        if (function0 != null) {
            function0.invoke();
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$4(AwS676S0100000_27 awS676S0100000_27, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj3).booleanValue();
        Function0 function0 = (Function0) awS676S0100000_27.l0;
        if (function0 != null) {
            function0.invoke();
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$5(AwS676S0100000_27 awS676S0100000_27, Object obj, Object obj2, Object obj3) {
        int i;
        Resources resources;
        C20600815jK<InterfaceC1891350zJl> state;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C1852860yJg c1852860yJg = (C1852860yJg) obj2;
        List list = (List) obj3;
        TakoMenuWindowAssem takoMenuWindowAssem = (TakoMenuWindowAssem) awS676S0100000_27.l0;
        List<TikTokMediaModel> list2 = c1852860yJg.LIZ;
        takoMenuWindowAssem.getClass();
        ArrayList arrayList = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel : list2) {
            if (tikTokMediaModel.loadSource != C0L9F.CAMERA) {
                arrayList.add(new C1853550yKn(tikTokMediaModel));
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        boolean zLIZLLL = C540120LGg.LIZLLL();
        boolean zLJ = C540120LGg.LJ();
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = 3;
        if (!zLIZLLL) {
            if (zLJ) {
                ListProtector.add(arrayList2, 0, new C1853560yKo(EnumC1853760yL8.ADD_PHOTOS, 3, false, 12));
            } else {
                c118300cf.element = 2;
                ListProtector.add(arrayList2, 0, new C1853560yKo(EnumC1853760yL8.PHOTO, 2, false, 12));
            }
            i = 21;
        } else {
            i = 20;
        }
        ListProtector.add(arrayList2, 0, new C1853560yKo(EnumC1853760yL8.CAMERA, c118300cf.element, false, 12));
        int i2 = 1;
        int i3 = i + 1;
        int size = arrayList2.size();
        int i4 = c118300cf.element;
        int i5 = ((size + i4) - 1) / i4;
        int i6 = i5 - 1;
        int i7 = 0;
        for (Object obj4 : arrayList2) {
            int i8 = i7 + 1;
            if (i7 >= 0) {
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj4;
                if (i5 == i2) {
                    int i9 = size - 1;
                    if (i7 == 0) {
                        TakoMenuWindowAssem.tp(interfaceC1891350zJl, EnumC1767370w5n.TOP_LEFT);
                    } else if (i7 == i9) {
                        TakoMenuWindowAssem.tp(interfaceC1891350zJl, EnumC1767370w5n.TOP_RIGHT);
                        TakoMenuWindowAssem.tp(interfaceC1891350zJl, EnumC1767370w5n.BOTTOM_RIGHT);
                    }
                } else {
                    int iLJI = C626640Ohy.LJI(c118300cf.element - 1, new int[0]);
                    int i10 = c118300cf.element * i6;
                    int iLJI2 = C626640Ohy.LJI(((i6 + 1) * r1) - 1, new int[0]);
                    if (i7 == 0) {
                        TakoMenuWindowAssem.tp(interfaceC1891350zJl, EnumC1767370w5n.TOP_LEFT);
                    } else if (i7 == iLJI) {
                        TakoMenuWindowAssem.tp(interfaceC1891350zJl, EnumC1767370w5n.TOP_RIGHT);
                    } else if (i7 == i10) {
                        TakoMenuWindowAssem.tp(interfaceC1891350zJl, EnumC1767370w5n.BOTTOM_LEFT);
                    } else if (i7 == iLJI2) {
                        TakoMenuWindowAssem.tp(interfaceC1891350zJl, EnumC1767370w5n.BOTTOM_RIGHT);
                    }
                }
                i7 = i8;
                i2 = 1;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        String quantityString = null;
        List listLL = C13LP.LL(arrayList2, i3);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((TakoMenuWindowAssem) awS676S0100000_27.l0).LLJJJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(listLL, null);
        }
        if (!list.isEmpty()) {
            C197039127h c197039127h = ((TakoMenuWindowAssem) awS676S0100000_27.l0).LLJJJIL;
            if (c197039127h != null) {
                Context context = abstractC738140SxQ.getContext();
                if (context != null && (resources = context.getResources()) != null) {
                    quantityString = resources.getQuantityString(2131755044, list.size(), String.valueOf(list.size()));
                }
                c197039127h.setText(quantityString);
            }
            C1854080yLe c1854080yLe = ((TakoMenuWindowAssem) awS676S0100000_27.l0).LLJJL;
            if (c1854080yLe != null) {
                c1854080yLe.LIZJ(true);
            }
        } else {
            C1854080yLe c1854080yLe2 = ((TakoMenuWindowAssem) awS676S0100000_27.l0).LLJJL;
            if (c1854080yLe2 != null) {
                c1854080yLe2.LIZJ(false);
            }
        }
        ((TakoMenuWindowAssem) awS676S0100000_27.l0).op().setState(new AwS393S0200000_27(c1852860yJg, (C1852860yJg) list, (List<? extends TikTokMediaModel>) 147));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS676S0100000_27 awS676S0100000_27, Object obj, Object obj2, Object obj3) {
        int itemCount;
        Object objValueOf;
        int measuredHeight;
        View view;
        C1861310yXJ c1861310yXJ = (C1861310yXJ) obj;
        RecyclerView recyclerView = (RecyclerView) obj2;
        ((Number) obj3).intValue();
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = c1861310yXJ.LIZIZ;
        }
        int i = c1861310yXJ.LIZIZ;
        int i2 = itemCount - 1;
        int i3 = 0;
        while (true) {
            objValueOf = null;
            if (i >= i2) {
                break;
            }
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                objValueOf = viewHolderFindViewHolderForAdapterPosition.itemView;
            }
            if (!Intrinsics.LJFF(objValueOf, c1861310yXJ.LIZ)) {
                if (viewHolderFindViewHolderForAdapterPosition != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                    measuredHeight = view.getMeasuredHeight();
                } else {
                    measuredHeight = 0;
                }
                i3 += measuredHeight;
            }
            i++;
        }
        new Pair("targetPos", Integer.valueOf(c1861310yXJ.LIZIZ));
        new Pair("totalHeight", Integer.valueOf(i3));
        AbstractC21673619ry adapter2 = recyclerView.getAdapter();
        if (adapter2 != null) {
            objValueOf = Integer.valueOf(adapter2.getItemCount());
        }
        new Pair("itemCount", objValueOf);
        C1861360yXO c1861360yXO = C1861360yXO.LIZ;
        Integer num = (Integer) awS676S0100000_27.l0;
        c1861360yXO.getClass();
        new Pair("topPaddingDp", Integer.valueOf(C1861360yXO.LIZIZ(num)));
        return Integer.valueOf((c1861310yXJ.LIZLLL.getHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1861360yXO.LIZIZ((Integer) awS676S0100000_27.l0))))) - i3);
    }
}
