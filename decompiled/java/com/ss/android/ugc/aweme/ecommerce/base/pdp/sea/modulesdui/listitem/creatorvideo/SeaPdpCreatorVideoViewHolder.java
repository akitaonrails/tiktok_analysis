package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo;

import X.AnonymousClass0956;
import X.C01GW;
import X.C03IT;
import X.C090P;
import X.C09YH;
import X.C09YO;
import X.C09YP;
import X.C0DXR;
import X.C0H1U;
import X.C0H9H;
import X.C0PEM;
import X.C1019003ye;
import X.C1054104Ah;
import X.C1061104Cz;
import X.C1071004Gu;
import X.C1087110eOb;
import X.C12ES;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1758870vs5;
import X.C1758880vs6;
import X.C1758890vs7;
import X.C1776200wK2;
import X.C19719912Dl;
import X.C23250099c;
import X.C427660Gpo;
import X.C452501pT;
import X.C786410Ut5;
import X.C817503Hh;
import X.InterfaceC1755440vmY;
import X.ViewTreeObserverOnPreDrawListenerC1077330e8p;
import Y.AsS52S0100000_26;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS12S0000000_26;
import g1c.AjS44S0200000_26;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpCreatorVideoViewHolder extends PdpHolder<C1061104Cz> implements InterfaceC1755440vmY {
    public static final /* synthetic */ int LLLF = 0;
    public final Fragment LLJJIJIL;
    public final C01GW LLJJJ;
    public C1758880vs6 LLJJJIL;
    public final TuxTextView LLJJJJ;
    public final ConstraintLayout LLJJJJJIL;
    public final C1758870vs5 LLJJJJLIIL;
    public final TuxTextView LLJJL;
    public final C427660Gpo LLJJLIIIJLLLLLLLZ;
    public final TuxTextView LLJL;
    public final C1087110eOb LLJLIL;
    public final C1758870vs5 LLJLILLLLZIIL;
    public final C1758870vs5 LLJLL;
    public final RecyclerView LLJLLIL;
    public boolean LLJLLL;
    public final C1776200wK2 LLJZ;
    public int LLJZIJLIL;
    public final AsS52S0100000_26 LLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void c6() {
        SeaPdpCreatorVideoCardDTO data;
        SeaPdpCreatorVideoCardDTO data2;
        SeaPdpCreatorVideoCardDTO data3;
        LinearLayoutManager linearLayoutManager;
        ArrayList arrayList = new ArrayList();
        if (this.LLJLLIL.getVisibility() == 0) {
            RecyclerView.LayoutManager layoutManager = this.LLJLLIL.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (iFindFirstVisibleItemPosition == -1) {
                    return;
                }
                C1758880vs6 c1758880vs6 = this.LLJJJIL;
                if (c1758880vs6 != null && iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                    while (true) {
                        SeaPdpCreatorVideoCardDTO seaPdpCreatorVideoCardDTO = (SeaPdpCreatorVideoCardDTO) ListProtector.get(c1758880vs6.LL.LJFF, iFindFirstVisibleItemPosition);
                        if (seaPdpCreatorVideoCardDTO != null) {
                            String str = seaPdpCreatorVideoCardDTO.vid;
                            if (str == null) {
                                str = "";
                            }
                            arrayList.add(new C09YP(iFindFirstVisibleItemPosition, str, C1758890vs7.LIZ(iFindFirstVisibleItemPosition), seaPdpCreatorVideoCardDTO.LIZ()));
                        }
                        if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                            break;
                        } else {
                            iFindFirstVisibleItemPosition++;
                        }
                    }
                }
            }
        } else {
            if (this.LLJJJJLIIL.getVisibility() == 0 && (data3 = this.LLJJJJLIIL.getData()) != null) {
                String str2 = data3.vid;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(new C09YP(0, str2, C1758890vs7.LIZ(0), data3.LIZ()));
            }
            if (this.LLJLILLLLZIIL.getVisibility() == 0 && (data2 = this.LLJLILLLLZIIL.getData()) != null) {
                String str3 = data2.vid;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(new C09YP(1, str3, C1758890vs7.LIZ(1), data2.LIZ()));
            }
            if (this.LLJLL.getVisibility() == 0 && (data = this.LLJLL.getData()) != null) {
                String str4 = data.vid;
                arrayList.add(new C09YP(2, str4 != null ? str4 : "", C1758890vs7.LIZ(2), data.LIZ()));
            }
        }
        C09YH c09yh = d6().LLLLLLLLLL;
        c09yh.LJIIJJI.addAll(arrayList);
        AnonymousClass0956 anonymousClass0956 = c09yh.LJIIL;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            c09yh.LJIIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(c09yh.LIZ), null, null, new C09YO(c09yh, null), 3);
        }
    }

    public final SeaPdpViewModel d6() {
        return (SeaPdpViewModel) this.LLJJJ.getValue();
    }

    @Override // X.InterfaceC1755440vmY
    public final void onViewAttachedToWindow() {
        this.LLJLLIL.addOnScrollListener(this.LLL);
    }

    @Override // X.InterfaceC1755440vmY
    public final void onViewDetachedFromWindow() {
        this.LLJLLIL.removeOnScrollListener(this.LLL);
        this.LLJZIJLIL = 0;
        AnonymousClass0956 anonymousClass0956 = d6().LLLLLLLLLL.LJIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        d6().LLLLLLLLLL.LJIIIIZZ = BtmSDK.INSTANCE.getPageId(PageFinder.via(this.LLJJIJIL));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        List<SeaPdpCreatorVideoCardDTO> list;
        int size;
        ArrayList arrayList;
        boolean z;
        C03IT c03it;
        SeaPdpCreatorVideoModuleDTO seaPdpCreatorVideoModuleDTO = ((C1061104Cz) obj).LIZ;
        if (seaPdpCreatorVideoModuleDTO != null) {
            list = seaPdpCreatorVideoModuleDTO.videos;
        } else {
            list = null;
        }
        C09YH c09yh = d6().LLLLLLLLLL;
        C090P c090p = C090P.BIND_DATA;
        if (list != null) {
            size = list.size();
        } else {
            size = -1;
        }
        c09yh.LIZIZ(c090p, Integer.valueOf(size));
        if (seaPdpCreatorVideoModuleDTO != null && list != null && !list.isEmpty()) {
            d6().LLLLLLLLLL.LJII = seaPdpCreatorVideoModuleDTO.recommendScene;
            d6().LLLLLLLLLL.LJI = seaPdpCreatorVideoModuleDTO.sessionId;
            d6().LLLLLLLLLL.LIZLLL = seaPdpCreatorVideoModuleDTO.daInfo;
            d6().LLLLLLLLLL.LJFF = seaPdpCreatorVideoModuleDTO.videoIds;
            C09YH c09yh2 = d6().LLLLLLLLLL;
            List<SeaPdpCreatorVideoCardDTO> list2 = seaPdpCreatorVideoModuleDTO.videos;
            if (list2 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<SeaPdpCreatorVideoCardDTO> it2 = list2.iterator();
                while (it2.hasNext()) {
                    String str = it2.next().daInfo;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(str);
                }
            } else {
                arrayList = null;
            }
            c09yh2.LJ = arrayList;
            C12ES.LJIILL(0, this.LLJJJJ);
            if (C1071004Gu.LIZIZ().LIZ()) {
                this.LLJJJJ.setTuxFont(102);
            }
            this.LLJJJJ.setText(seaPdpCreatorVideoModuleDTO.title);
            SeaPdpCreatorVideoCardDTO seaPdpCreatorVideoCardDTO = (SeaPdpCreatorVideoCardDTO) C13LP.LJJJLZIJ(0, list);
            if (seaPdpCreatorVideoCardDTO != null) {
                C786410Ut5.I7(new AjS44S0200000_26(this, seaPdpCreatorVideoCardDTO, 4), this.LLJJJJ);
            }
            int size2 = list.size();
            if (1 <= size2 && size2 < 4) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C12ES.LJIILL(0, this.LLJJJJJIL);
                C0H1U.LIZIZ(this.LLJLLIL);
                ConstraintLayout constraintLayout = this.LLJJJJJIL;
                if (!this.LLJLLL) {
                    C786410Ut5.y3(constraintLayout.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC1077330e8p(constraintLayout, this, 0));
                }
                float f = 2;
                int iLJIIJ = (int) ((((C12ES.LJIIJ(this.itemView.getContext()) - (C0H9H.LIZ(16) * f)) - (C0H9H.LIZ(8) * f)) / 3.0f) + 0.5f);
                SeaPdpCreatorVideoCardDTO seaPdpCreatorVideoCardDTO2 = (SeaPdpCreatorVideoCardDTO) C13LP.LJJJLZIJ(1, list);
                SeaPdpCreatorVideoCardDTO seaPdpCreatorVideoCardDTO3 = (SeaPdpCreatorVideoCardDTO) C13LP.LJJJLZIJ(2, list);
                if (seaPdpCreatorVideoCardDTO != null) {
                    C12ES.LJIILL(0, this.LLJJJJLIIL);
                    this.LLJJJJLIIL.LIZJ(iLJIIJ);
                    if (list.size() == 1) {
                        this.LLJJJJLIIL.LIZIZ(false);
                        C12ES.LJIILL(0, this.LLJLIL);
                        this.LLJJL.setText(seaPdpCreatorVideoCardDTO.videoTitle);
                        this.LLJL.setText(seaPdpCreatorVideoCardDTO.creatorName);
                        C427660Gpo c427660Gpo = this.LLJJLIIIJLLLLLLLZ;
                        Image image = seaPdpCreatorVideoCardDTO.creatorAvatar;
                        if (image == null || (c03it = image.toImageUrlModel()) == null) {
                            c03it = new C03IT(C13BV.INSTANCE);
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo, c03it, false, null, null, false, false, null, null, false, null, 1022);
                        this.LLJJLIIIJLLLLLLLZ.setForeground(null);
                        C786410Ut5.I7(new AjS44S0200000_26(this, seaPdpCreatorVideoCardDTO, 0), this.LLJJJJJIL);
                    } else {
                        C0H1U.LIZIZ(this.LLJLIL);
                        this.LLJJJJLIIL.LIZIZ(true);
                        C786410Ut5.I7(new AjS12S0000000_26(0), this.LLJJJJJIL);
                        C786410Ut5.I7(new AjS44S0200000_26(this, seaPdpCreatorVideoCardDTO, 1), this.LLJJJJLIIL);
                    }
                    this.LLJJJJLIIL.LIZ(seaPdpCreatorVideoCardDTO);
                } else {
                    C0H1U.LIZIZ(this.LLJJJJLIIL);
                }
                if (seaPdpCreatorVideoCardDTO2 != null) {
                    C12ES.LJIILL(0, this.LLJLILLLLZIIL);
                    this.LLJLILLLLZIIL.LIZJ(iLJIIJ);
                    this.LLJLILLLLZIIL.LIZIZ(true);
                    this.LLJLILLLLZIIL.LIZ(seaPdpCreatorVideoCardDTO2);
                    C786410Ut5.I7(new AjS44S0200000_26(this, seaPdpCreatorVideoCardDTO2, 2), this.LLJLILLLLZIIL);
                } else {
                    C0H1U.LIZIZ(this.LLJLILLLLZIIL);
                }
                if (seaPdpCreatorVideoCardDTO3 != null) {
                    C12ES.LJIILL(0, this.LLJLL);
                    this.LLJLL.LIZJ(iLJIIJ);
                    this.LLJLL.LIZIZ(true);
                    this.LLJLL.LIZ(seaPdpCreatorVideoCardDTO3);
                    C786410Ut5.I7(new AjS44S0200000_26(this, seaPdpCreatorVideoCardDTO3, 3), this.LLJLL);
                } else {
                    C0H1U.LIZIZ(this.LLJLL);
                }
            } else {
                C0H1U.LIZIZ(this.LLJJJJJIL);
                C12ES.LJIILL(0, this.LLJLLIL);
                RecyclerView recyclerView = this.LLJLLIL;
                if (!this.LLJLLL) {
                    C786410Ut5.y3(recyclerView.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC1077330e8p(recyclerView, this, 0));
                }
                if (this.LLJJJIL == null) {
                    this.LLJLLIL.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 0, false));
                    C1758880vs6 c1758880vs6 = new C1758880vs6(this.LLJZ);
                    this.LLJLLIL.setAdapter(c1758880vs6);
                    this.LLJJJIL = c1758880vs6;
                    RecyclerView recyclerView2 = this.LLJLLIL;
                    final int iLIZIZ = C0H9H.LIZIZ(8);
                    recyclerView2.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.0GiP
                        public final int LL;

                        {
                            this.LL = iLIZIZ;
                        }

                        @Override // X.C0DXR
                        public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView3, C21673919s1 c21673919s1) {
                            if (recyclerView3.getChildAdapterPosition(view) > 0) {
                                rect.left = this.LL;
                            }
                        }
                    });
                    this.LLJLLIL.setNestedScrollingEnabled(false);
                }
                C1758880vs6 c1758880vs62 = this.LLJJJIL;
                if (c1758880vs62 != null) {
                    c1758880vs62.LLLI(list);
                }
            }
            View view = this.itemView;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("module_name", "pdp_creator_video");
            C1054104Ah c1054104Ah = d6().LLJLIL;
            if (c1054104Ah != null) {
                Map<String, ? extends Object> map = d6().LLLLLLLLLL.LIZLLL;
                if (!c1054104Ah.LJJIJ) {
                    c1054104Ah.LJJIJ = true;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(linkedHashMap);
                    Object obj2 = c1054104Ah.LIZIZ.get("page_name");
                    if (obj2 != null) {
                        linkedHashMap2.put("page_name", obj2);
                    }
                    Object obj3 = c1054104Ah.LIZIZ.get("previous_page");
                    if (obj3 != null) {
                        linkedHashMap2.put("previous_page", obj3);
                    }
                    Object obj4 = c1054104Ah.LIZIZ.get("entrance_info");
                    if (obj4 != null) {
                        linkedHashMap2.put("entrance_info", obj4);
                    }
                    Object obj5 = c1054104Ah.LIZIZ.get("page_show_type");
                    if (obj5 != null) {
                        linkedHashMap2.put("page_show_type", obj5);
                    }
                    if (map != null) {
                        linkedHashMap2.putAll(map);
                    }
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1019003ye("tiktokec_module_show", linkedHashMap2, "c16746.d0", PageFinder.via(view), null), 2);
                    return;
                }
                return;
            }
            return;
        }
        C0H1U.LIZIZ(this.LLJJJJ);
        C0H1U.LIZIZ(this.LLJJJJJIL);
    }

    public SeaPdpCreatorVideoViewHolder(ViewGroup viewGroup, ECBaseFragment eCBaseFragment) {
        super(R.layout.aw2, viewGroup, false);
        this.LLJJIJIL = eCBaseFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 3));
        this.LLJJJJ = (TuxTextView) this.itemView.findViewById(R.id.z7j);
        this.LLJJJJJIL = (ConstraintLayout) this.itemView.findViewById(R.id.dun);
        this.LLJJJJLIIL = (C1758870vs5) this.itemView.findViewById(R.id.tnf);
        this.LLJJL = (TuxTextView) this.itemView.findViewById(R.id.z3y);
        this.LLJJLIIIJLLLLLLLZ = (C427660Gpo) this.itemView.findViewById(R.id.l6a);
        this.LLJL = (TuxTextView) this.itemView.findViewById(R.id.z3x);
        this.LLJLIL = (C1087110eOb) this.itemView.findViewById(R.id.hzd);
        this.LLJLILLLLZIIL = (C1758870vs5) this.itemView.findViewById(R.id.tng);
        this.LLJLL = (C1758870vs5) this.itemView.findViewById(R.id.tnh);
        this.LLJLLIL = (RecyclerView) this.itemView.findViewById(R.id.tuh);
        this.LLJZ = new C1776200wK2(this, 0);
        this.LLL = new AsS52S0100000_26(this, 0);
    }
}
