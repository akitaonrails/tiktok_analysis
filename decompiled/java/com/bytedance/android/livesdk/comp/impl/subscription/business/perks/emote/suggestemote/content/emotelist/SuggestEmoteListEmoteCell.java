package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C09JN;
import X.C0JVP;
import X.C0JWC;
import X.C0JX0;
import X.C0JX1;
import X.C0JX2;
import X.C0JX3;
import X.C0JX4;
import X.C0JX5;
import X.C0JX6;
import X.C0JX7;
import X.C0JX8;
import X.C0JX9;
import X.C0JXA;
import X.C0JXB;
import X.C0JXC;
import X.C0JXD;
import X.C0JXE;
import X.C0JXF;
import X.C0JXG;
import X.C0JXH;
import X.C0JXI;
import X.C0JXJ;
import X.C0JXK;
import X.C0JXL;
import X.C0JXM;
import X.C0JXN;
import X.C0JXO;
import X.C0JXP;
import X.C0JXQ;
import X.C0JXR;
import X.C0JXS;
import X.C0JXT;
import X.C0JXU;
import X.C0JXV;
import X.C0JXW;
import X.C0JXX;
import X.C0JXY;
import X.C0PEM;
import X.C0WZX;
import X.C0ZP4;
import X.C1121670fIL;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1322090kVb;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19R6;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C23250099c;
import X.C292401Bi;
import X.C452080Ho6;
import X.C452501pT;
import X.C492890JUp;
import X.C493460JWu;
import X.C493470JWv;
import X.C493480JWw;
import X.C493490JWx;
import X.C493500JWy;
import X.C493510JWz;
import X.C497740JfY;
import X.C500260Jjc;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.AuditInfo;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist.SuggestEmoteListEmoteCell;
import com.bytedance.android.livesdk.livesetting.decoration.SubscribeDSAMap;
import com.bytedance.android.livesdk.livesetting.decoration.SubscriptionDSAUrl;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SuggestEmoteListEmoteCell extends PowerCell<C492890JUp> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LL;
    public String LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public C492890JUp LLJILJILJ;
    public int LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SuggestEmoteListEmoteCell.class, "suggestEmotePageViewModel", "getSuggestEmotePageViewModel()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/suggestemote/SuggestEmotePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final ConstraintLayout I5() {
        return (ConstraintLayout) this.LLJIJIL.getValue();
    }

    public final ConstraintLayout L5() {
        return (ConstraintLayout) this.LLJ.getValue();
    }

    public final SuggestEmotePageViewModel N5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (SuggestEmotePageViewModel) assemVMLazy.getValue();
    }

    public final ConstraintLayout P5() {
        return (ConstraintLayout) this.LLIZLLLIL.getValue();
    }

    public SuggestEmoteListEmoteCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SuggestEmotePageViewModel.class);
        C493490JWx c493490JWx = new C493490JWx(c19719912DlLIZ);
        C0JXY c0jxy = new C0JXY();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C0JXV(c19719912DlLIZ), c493490JWx, new C0JXF(), new C0JX6(this), new C493510JWz(this), new C0JXI(this), c0jxy, new C493470JWv(this), null, new C0JX0(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C0JX5 c0jx5 = new C0JX5(this);
            C0JXH c0jxh = new C0JXH(this);
            C0JXW c0jxw = new C0JXW(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C0JXD((InterfaceC451590HnJ) obj, c0jx5));
            C0JX8 c0jx8 = new C0JX8(c01gwLIZIZ);
            C0JX9 c0jx9 = new C0JX9(c01gwLIZIZ);
            C0JXA c0jxa = new C0JXA(c01gwLIZIZ);
            C0JXB c0jxb = new C0JXB(c01gwLIZIZ);
            C0JXC c0jxc = new C0JXC(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c0jxw, c493490JWx, new C452080Ho6(), c0jx8, c0jx9, c0jxh, c0jxy, c0jxa, c0jxb, c0jxc);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C0JXX(c19719912DlLIZ), c493490JWx, new C0JXG(), new C0JX7(this), new C0JX3(this), new C0JXJ(this), c0jxy, new C493460JWu(this), null, new C493500JWy(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C0JXU(c19719912DlLIZ), c493490JWx, new C0JXE(), new C0JX4(this), new C0JX1(this), new C0JX2(this), c0jxy, null, null, new C493480JWw(this));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = "";
        this.LLILLL = C292401Bi.LIZ(new C0JXQ(this));
        this.LLILZ = C292401Bi.LIZ(new C0JXR(this));
        this.LLILZIL = C292401Bi.LIZ(new C0JXK(this));
        this.LLILZLL = C292401Bi.LIZ(new C0JXS(this));
        this.LLIZ = C292401Bi.LIZ(new C0JXP(this));
        this.LLIZLLLIL = C292401Bi.LIZ(new C0JXT(this));
        this.LLJ = C292401Bi.LIZ(new C0JXO(this));
        this.LLJI = C292401Bi.LIZ(new C0JXN(this));
        this.LLJIJIL = C292401Bi.LIZ(new C0JXL(this));
        this.LLJILJIL = C292401Bi.LIZ(new C0JXM(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.LL(8, (ConstraintLayout) this.LLIZ.getValue());
        C786410Ut5.LL(8, L5());
        C786410Ut5.LL(8, P5());
        ViewGroup.LayoutParams layoutParams = P5().getLayoutParams();
        layoutParams.width = (this.LLJILLL / 4) + ((int) C497740JfY.LIZIZ(4.0f));
        layoutParams.height = (this.LLJILLL / 4) + ((int) C497740JfY.LIZIZ(4.0f));
        C786410Ut5.m6(P5(), layoutParams);
        ViewGroup.LayoutParams layoutParams2 = L5().getLayoutParams();
        layoutParams2.width = (this.LLJILLL / 4) + ((int) C497740JfY.LIZIZ(5.0f));
        layoutParams2.height = (this.LLJILLL / 4) + ((int) C497740JfY.LIZIZ(5.0f));
        C786410Ut5.m6(L5(), layoutParams2);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0JWA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserEmote userEmote;
                AuditInfo auditInfo;
                C492890JUp c492890JUp = this.LL.LLJILJILJ;
                if (c492890JUp != null) {
                    if (c492890JUp.LLILZ == 1 || c492890JUp.LLILZ == 4) {
                        SubscribeDSAMap value = SubscriptionDSAUrl.INSTANCE.getValue();
                        HashMap map = new HashMap();
                        SuggestEmoteListEmoteCell suggestEmoteListEmoteCell = this.LL;
                        C492890JUp c492890JUp2 = suggestEmoteListEmoteCell.LLJILJILJ;
                        if (c492890JUp2 != null && (userEmote = c492890JUp2.LL) != null && (auditInfo = userEmote.auditInfo) != null) {
                            map.put("violation_id", String.valueOf(auditInfo.violationId));
                            map.put("enter_from", suggestEmoteListEmoteCell.LLILLJJLI);
                        }
                        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                        C494790Jan.LJIIIZ(this.LL.itemView.getContext(), value.getAppealUrl(), map);
                    }
                }
            }
        }, this.itemView);
        View view = (View) this.LLJI.getValue();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(C20736316Cj.LIZIZ(R.attr.exn, this.itemView.getContext()));
        view.setBackground(shapeDrawable);
        C786410Ut5.Y7(P5(), new View.OnClickListener() { // from class: X.0JWB
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UserEmote userEmote;
                AuditInfo auditInfo;
                C492890JUp c492890JUp = this.LL.LLJILJILJ;
                if (c492890JUp != null) {
                    if (c492890JUp.LLILZ == 1 || c492890JUp.LLILZ == 4) {
                        SubscribeDSAMap value = SubscriptionDSAUrl.INSTANCE.getValue();
                        HashMap map = new HashMap();
                        SuggestEmoteListEmoteCell suggestEmoteListEmoteCell = this.LL;
                        C492890JUp c492890JUp2 = suggestEmoteListEmoteCell.LLJILJILJ;
                        if (c492890JUp2 != null && (userEmote = c492890JUp2.LL) != null && (auditInfo = userEmote.auditInfo) != null) {
                            map.put("violation_id", String.valueOf(auditInfo.violationId));
                            map.put("enter_from", suggestEmoteListEmoteCell.LLILLJJLI);
                        }
                        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                        C494790Jan.LJIIIZ(this.LL.itemView.getContext(), value.getAppealUrl(), map);
                    }
                }
            }
        });
        C786410Ut5.Y7(L5(), new View.OnClickListener() { // from class: X.0JVy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SuggestEmoteListEmoteCell suggestEmoteListEmoteCell = this.LL;
                C492890JUp c492890JUp = suggestEmoteListEmoteCell.LLJILJILJ;
                if (c492890JUp != null) {
                    SuggestEmotePageViewModel suggestEmotePageViewModelN5 = suggestEmoteListEmoteCell.N5();
                    suggestEmotePageViewModelN5.withState(new C492910JUr(suggestEmotePageViewModelN5, c492890JUp));
                }
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        final C492890JUp c492890JUp = (C492890JUp) interfaceC1891350zJl;
        super.onBindItemView(c492890JUp);
        this.LLJILJILJ = c492890JUp;
        String str = N5().wQ2().LLILLJJLI;
        if (str == null) {
            str = "";
        }
        this.LLILLJJLI = str;
        C736680Sv4.LJIJJ(N5(), new C0JWC(this));
        int i = c492890JUp.LLILZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        ((View) this.LLILZIL.getValue()).setBackground(null);
                        C786410Ut5.LL(8, P5());
                        ConstraintLayout constraintLayoutL5 = L5();
                        if (c492890JUp.LLILZIL == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C500260Jjc.LJLJLJ(constraintLayoutL5, z);
                        C786410Ut5.LLLJIL((C19R6) this.LLILZ.getValue(), 0);
                        if (c492890JUp.LLILZLL >= 0) {
                            C786410Ut5.LL(0, I5());
                            ((TextView) this.LLJILJIL.getValue()).setText(C497740JfY.LJIJJ(2131852089, Integer.valueOf(c492890JUp.LLILZLL)));
                        } else {
                            C786410Ut5.LL(8, I5());
                        }
                    } else {
                        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.f04, this.itemView.getContext());
                        ((LiveIconView) this.LLILZLL.getValue()).setIcon(C20736316Cj.LIZLLL(R.attr.ejo, this.itemView.getContext()));
                        ((LiveIconView) this.LLILZLL.getValue()).setIconTint(iLIZIZ);
                        C786410Ut5.LL(0, P5());
                        C786410Ut5.LL(8, L5());
                        C786410Ut5.LL(8, I5());
                        C786410Ut5.LLLJIL((C19R6) this.LLILZ.getValue(), 8);
                        ((View) this.LLILZIL.getValue()).setBackground(null);
                    }
                } else {
                    ((View) this.LLILZIL.getValue()).setBackground(null);
                    C786410Ut5.LL(8, P5());
                    C786410Ut5.LL(8, L5());
                    C786410Ut5.LLLJIL((C19R6) this.LLILZ.getValue(), 0);
                    if (c492890JUp.LLILZLL >= 0) {
                        C786410Ut5.LL(0, I5());
                        ((TextView) this.LLJILJIL.getValue()).setText(C497740JfY.LJIJJ(2131852089, Integer.valueOf(c492890JUp.LLILZLL)));
                    } else {
                        C786410Ut5.LL(8, I5());
                    }
                }
            } else {
                ((View) this.LLILZIL.getValue()).setBackgroundResource(R.drawable.e8v);
                C786410Ut5.LL(8, P5());
                C786410Ut5.LL(0, L5());
                C786410Ut5.LL(8, I5());
                C786410Ut5.LLLJIL((C19R6) this.LLILZ.getValue(), 8);
            }
        } else {
            ((View) this.LLILZIL.getValue()).setBackgroundResource(R.drawable.e8v);
            int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.ezv, this.itemView.getContext());
            ((LiveIconView) this.LLILZLL.getValue()).setIcon(C20736316Cj.LIZLLL(R.attr.dn9, this.itemView.getContext()));
            ((LiveIconView) this.LLILZLL.getValue()).setIconTint(iLIZIZ2);
            C786410Ut5.LL(0, P5());
            C786410Ut5.LL(0, L5());
            C786410Ut5.LL(8, I5());
            C786410Ut5.LLLJIL((C19R6) this.LLILZ.getValue(), 8);
        }
        if (c492890JUp.LLILLJJLI != null) {
            ((C1322090kVb) this.LLILLL.getValue()).setImageDrawable(new BitmapDrawable(P5().getResources(), c492890JUp.LLILLJJLI));
            return;
        }
        if (c492890JUp.LLILLL != null) {
            SuggestEmotePageViewModel suggestEmotePageViewModelN5 = N5();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(suggestEmotePageViewModelN5), C0PEM.LIZJ, null, new C0JVP(((View) this.LLILLL.getValue()).getContext(), suggestEmotePageViewModelN5, c492890JUp, null), 2);
            return;
        }
        final SuggestEmotePageViewModel suggestEmotePageViewModelN52 = N5();
        ImageModel imageModel = c492890JUp.LL.image;
        if (imageModel == null) {
            return;
        }
        C1121670fIL.LJ(imageModel).LJJLL(new C09JN() { // from class: X.0JVV
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SuggestEmotePageViewModel@d5d7.fetchEmoteImageBitmap$1$1");
                SuggestEmotePageViewModel suggestEmotePageViewModel = suggestEmotePageViewModelN52;
                suggestEmotePageViewModel.withState(new C0JVU(c492890JUp, (Bitmap) obj, suggestEmotePageViewModel));
                C1C7U.LIZIZ("SuggestEmotePageViewModel@d5d7.fetchEmoteImageBitmap$1$1");
            }
        }, new C09JN() { // from class: X.00MQ
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("SuggestEmotePageViewModel@d5d7.fetchEmoteImageBitmap$1$2");
                C1C7U.LIZIZ("SuggestEmotePageViewModel@d5d7.fetchEmoteImageBitmap$1$2");
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        int iLIZIZ = 0;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gz3, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        Activity activityLIZIZ = C737910Sx3.LIZIZ(viewTd.getContext());
        if (activityLIZIZ != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            C2204961BRm.LLILZIL(activityLIZIZ.getWindowManager(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/j5U8mU9xUG0I/xwf+EP1TY=", null)).getRealMetrics(displayMetrics);
            iLIZIZ = (displayMetrics.widthPixels - (((int) C497740JfY.LIZIZ(12.0f)) * 2)) / 4;
        }
        this.LLJILLL = iLIZIZ;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && iLIZIZ > 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = iLIZIZ;
            marginLayoutParams.width = iLIZIZ;
            C786410Ut5.W5(viewTd, layoutParams);
        }
        return viewTd;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
