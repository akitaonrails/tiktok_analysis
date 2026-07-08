package com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.right;

import X.AbstractC21673619ry;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03IT;
import X.C03J8;
import X.C03K6;
import X.C03O0;
import X.C03XA;
import X.C0DXR;
import X.C0H9H;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C1546210qL5;
import X.C19719912Dl;
import X.C2132808Xe;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C679280Qkg;
import X.C737910Sx3;
import X.C757602xa;
import X.C786410Ut5;
import X.C7963039d;
import X.C960203pA;
import X.InterfaceC1891350zJl;
import X.InterfaceC21676019sM;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class UserRightsCell extends ECPowerCell<C757602xa> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final AwS545S0100000_1 LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UserRightsCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public UserRightsCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 986);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(54);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 970), awS577S0100000_33, AFwS224S0000000_33.get$arr$(149), new AwS577S0100000_33((C03K6) this, 971), new AwS577S0100000_33((C03K6) this, 973), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 975), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 977), null, new AwS577S0100000_33((C03K6) this, 978));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 972);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 974);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 976);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 36));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 979);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 981);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 982);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 983);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 984);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 985), awS577S0100000_33, AFwS224S0000000_33.get$arr$(150), new AwS577S0100000_33((C03K6) this, 987), new AwS577S0100000_33((C03K6) this, 988), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 989), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 990), null, new AwS577S0100000_33((C03K6) this, 991));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 992), awS577S0100000_33, AFwS224S0000000_33.get$arr$(151), new AwS577S0100000_33((C03K6) this, 993), new AwS577S0100000_33((C03K6) this, 994), new AwS577S0100000_33((C03K6) this, 995), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 969));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 980));
        this.LLJIJIL = new AwS545S0100000_1(this, 382);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, java.lang.Object> L5() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.right.UserRightsCell.L5():java.util.HashMap");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ExposeUserRightPanel exposeUserRightPanel;
        final List<ExposeUserRight> list;
        ExposeUserRightPanel exposeUserRightPanel2;
        Image icon;
        C03IT imageUrlModel;
        super.onBindItemView(interfaceC1891350zJl);
        C03J8.LIZ(this.itemView, true);
        C757602xa c757602xa = (C757602xa) getItem();
        if (c757602xa != null && (exposeUserRightPanel2 = c757602xa.LL) != null) {
            SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.tmv);
            if (C960203pA.LIZIZ(this.itemView.getContext())) {
                Icon icon2 = exposeUserRightPanel2.icon;
                if (icon2 != null) {
                    icon = icon2.getIconDark();
                    if (icon != null && (imageUrlModel = icon.toImageUrlModel()) != null) {
                        C1326790kdB.LIZ.getClass();
                        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
                        c1331670kl3LIZLLL.LJJ(smartImageView);
                        C786410Ut5.h3(c1331670kl3LIZLLL);
                    }
                }
                ((TextView) this.itemView.findViewById(R.id.title)).setText(exposeUserRightPanel2.title);
            } else {
                Icon icon3 = exposeUserRightPanel2.icon;
                if (icon3 != null) {
                    icon = icon3.getIcon();
                    if (icon != null) {
                        C1326790kdB.LIZ.getClass();
                        C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(imageUrlModel);
                        c1331670kl3LIZLLL2.LJJ(smartImageView);
                        C786410Ut5.h3(c1331670kl3LIZLLL2);
                    }
                }
                ((TextView) this.itemView.findViewById(R.id.title)).setText(exposeUserRightPanel2.title);
            }
        }
        C757602xa c757602xa2 = (C757602xa) getItem();
        if (c757602xa2 != null && (exposeUserRightPanel = c757602xa2.LL) != null && (list = exposeUserRightPanel.exposeUserRights) != null) {
            final int iLIZIZ = C679280Qkg.LIZIZ(Integer.valueOf(C2132808Xe.LJ(this.itemView.getContext()))) - 32;
            ((RecyclerView) this.LLJI.getValue()).setAdapter(new AbstractC21673619ry<C7963039d>(list, iLIZIZ) { // from class: X.039c
                public final List<ExposeUserRight> LL;
                public final int LLILLJJLI;

                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LL.size();
                }

                {
                    this.LL = list;
                    this.LLILLJJLI = iLIZIZ;
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    C03C1 c03c1;
                    Image icon4;
                    C03IT thumbFirstImageUrlModel;
                    ExposeUserRight exposeUserRight = (ExposeUserRight) C7727030b.LIZ(i, this.LL);
                    if (exposeUserRight != null) {
                        View view = viewHolder.itemView;
                        if ((view instanceof C03C1) && (c03c1 = (C03C1) view) != null) {
                            c03c1.LLILLL = C0H9H.LIZIZ((int) ((this.LLILLJJLI - ((this.LL.size() - 1) * 16.5f)) / this.LL.size()));
                            TuxTextView userRightItemText = c03c1.getUserRightItemText();
                            if (userRightItemText != null) {
                                C0H1U.LJIIL(userRightItemText, exposeUserRight.name, true);
                            }
                            Icon icon5 = exposeUserRight.icon;
                            if (icon5 != null) {
                                if (C960203pA.LIZIZ(c03c1.getContext())) {
                                    icon4 = icon5.getIconDark();
                                } else {
                                    icon4 = icon5.getIcon();
                                }
                                if (icon4 != null && (thumbFirstImageUrlModel = icon4.toThumbFirstImageUrlModel()) != null) {
                                    C1326790kdB.LIZ.getClass();
                                    C1331670kl3 c1331670kl3LIZLLL3 = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
                                    c1331670kl3LIZLLL3.LJJIIZI(C1308910kAL.LJ(R.attr.c7, c03c1.getContext()));
                                    c1331670kl3LIZLLL3.LJJI(c03c1.getUserRightIcon());
                                    C786410Ut5.h3(c1331670kl3LIZLLL3);
                                }
                            }
                        }
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    final C03C1 c03c1 = new C03C1(viewGroup.getContext());
                    RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(c03c1) { // from class: X.039d
                    };
                    try {
                        View view = viewHolder.itemView;
                        if (view != null) {
                            view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                    try {
                        if (viewHolder.itemView.getParent() != null) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(C7963039d.class.getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
                                C1AF0.LIZJ(stringBuffer.toString());
                                ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                                if (viewGroup2 != null) {
                                    C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2081408Dk.LIZ(e2);
                        C2344809Gs.LIZ(e2);
                    }
                    C20612085q.LIZ = C7963039d.class.getName();
                    return viewHolder;
                }
            });
            final Context context = this.itemView.getContext();
            C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
            Float fValueOf = Float.valueOf(0.5f);
            c1546210qL5.getClass();
            final float fLIZ = C1546210qL5.LIZ(fValueOf);
            final int iLIZIZ2 = C0H9H.LIZIZ(8);
            ((RecyclerView) this.LLJI.getValue()).addItemDecoration(new C0DXR(context, iLIZIZ2, fLIZ) { // from class: X.03ob
                public final float LL;
                public final int LLILLJJLI;
                public final Paint LLILLL;

                {
                    int iIntValue;
                    this.LL = fLIZ;
                    this.LLILLJJLI = iLIZIZ2;
                    Paint paint = new Paint();
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = -7829368;
                    }
                    paint.setColor(iIntValue);
                    paint.setStyle(Paint.Style.FILL);
                    this.LLILLL = paint;
                }

                @Override // X.C0DXR
                public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int childCount = recyclerView.getChildCount();
                    int bottom = 0;
                    for (int i = 0; i < childCount; i++) {
                        View childAt = recyclerView.getChildAt(i);
                        if (childAt.getBottom() > bottom) {
                            bottom = childAt.getBottom();
                        }
                    }
                    int i2 = childCount - 1;
                    for (int i3 = 0; i3 < i2; i3++) {
                        View childAt2 = recyclerView.getChildAt(i3);
                        float right = childAt2.getRight() + ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).rightMargin + this.LLILLJJLI;
                        canvas.drawRect(right, childAt2.getTop(), right + this.LL, bottom, this.LLILLL);
                    }
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int itemCount;
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    AbstractC21673619ry adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        itemCount = adapter.getItemCount();
                    } else {
                        itemCount = 0;
                    }
                    if (childAdapterPosition < itemCount - 1) {
                        rect.right = (this.LLILLJJLI * 2) + ((int) this.LL);
                    }
                }
            });
            ((RecyclerView) this.LLJI.getValue()).addOnItemTouchListener(new InterfaceC21676019sM() { // from class: X.03od
                public float LL;
                public float LLILLJJLI;
                public final int LLILLL;

                @Override // X.InterfaceC21676019sM
                public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
                }

                @Override // X.InterfaceC21676019sM
                public final void LJIIZILJ(boolean z) {
                }

                {
                    this.LLILLL = ViewConfiguration.get(this.LLILZ.itemView.getContext()).getScaledTouchSlop();
                }

                @Override // X.InterfaceC21676019sM
                public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action == 1) {
                            float x = motionEvent.getX();
                            float y = motionEvent.getY();
                            float fAbs = Math.abs(x - this.LL);
                            float fAbs2 = Math.abs(y - this.LLILLJJLI);
                            float f = this.LLILLL;
                            if (fAbs < f && fAbs2 < f) {
                                this.LLILZ.LLJIJIL.invoke();
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    this.LL = motionEvent.getX();
                    this.LLILLJJLI = motionEvent.getY();
                    return false;
                }
            });
        }
        C03O0 c03o0 = C03O0.LIZ;
        HashMap map = new HashMap();
        map.putAll(L5());
        C03O0.LJJJZ(c03o0, "user_rights", map, null, null, null, null, null, null, null, null, null, null, null, 1048572);
        C786410Ut5.I7(new AjS60S0100000_1(this, 74), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.ap8, viewGroup, false);
    }
}
