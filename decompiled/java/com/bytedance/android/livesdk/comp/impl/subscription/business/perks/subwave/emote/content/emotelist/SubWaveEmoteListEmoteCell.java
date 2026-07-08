package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist;

import X.AnonymousClass1676;
import X.AnonymousClass1677;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C09JN;
import X.C0JBN;
import X.C0JUY;
import X.C0JWD;
import X.C0JWE;
import X.C0JWF;
import X.C0JWG;
import X.C0JWH;
import X.C0JWI;
import X.C0JWJ;
import X.C0JWK;
import X.C0JWL;
import X.C0JWM;
import X.C0JWN;
import X.C0JWP;
import X.C0JWQ;
import X.C0JWR;
import X.C0JWS;
import X.C0JWT;
import X.C0JWU;
import X.C0JWV;
import X.C0JWW;
import X.C0JWX;
import X.C0JWY;
import X.C0JWZ;
import X.C0L0G;
import X.C0PEM;
import X.C0WZX;
import X.C0ZP4;
import X.C1121670fIL;
import X.C1161920gLG;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1322090kVb;
import X.C1324610kZf;
import X.C13LE;
import X.C1770850wBP;
import X.C1819620xS4;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C23250099c;
import X.C292401Bi;
import X.C452080Ho6;
import X.C452501pT;
import X.C492780JUe;
import X.C493260JWa;
import X.C493270JWb;
import X.C493280JWc;
import X.C493290JWd;
import X.C493300JWe;
import X.C493310JWf;
import X.C493320JWg;
import X.C493330JWh;
import X.C493340JWi;
import X.C493350JWj;
import X.C493360JWk;
import X.C493370JWl;
import X.C493380JWm;
import X.C493390JWn;
import X.C493400JWo;
import X.C493410JWp;
import X.C493420JWq;
import X.C493430JWr;
import X.C493440JWs;
import X.C493450JWt;
import X.C497740JfY;
import X.C500260Jjc;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C842240X2g;
import X.C946803n0;
import X.EnumC1782750wUb;
import X.EnumC207219166v;
import X.InterfaceC0148002o;
import X.InterfaceC1487280oo2;
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
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.AuditInfo;
import com.bytedance.android.livesdk.chatroom.api.EmoteUploadInfo;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist.SubWaveEmoteListEmoteCell;
import com.bytedance.android.livesdk.livesetting.decoration.SubscribeDSAMap;
import com.bytedance.android.livesdk.livesetting.decoration.SubscriptionDSAUrl;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubWaveEmoteListEmoteCell extends PowerCell<C0JUY> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LL;
    public String LLILLJJLI;
    public IHostSubscription.Params LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public C0JUY LLJILJILJ;
    public int LLJILLL;
    public final C0JWE LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubWaveEmoteListEmoteCell.class, "subWaveEmotePageViewModel", "getSubWaveEmotePageViewModel()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subwave/emote/SubWaveEmotePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
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
        return (ConstraintLayout) this.LLJ.getValue();
    }

    public final ConstraintLayout L5() {
        return (ConstraintLayout) this.LLIZ.getValue();
    }

    public final SubWaveEmotePageViewModel N5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (SubWaveEmotePageViewModel) assemVMLazy.getValue();
    }

    public final ConstraintLayout P5() {
        return (ConstraintLayout) this.LLIZLLLIL.getValue();
    }

    public final void S5() {
        EmoteModel emoteModel;
        EmoteModel emoteModel2;
        ImageModel imageModel;
        Bitmap bitmap;
        EmoteModel emoteModel3;
        EmoteModel emoteModel4;
        final IHostSubscription.Params params = this.LLILLL;
        if (params != null) {
            C0JUY c0juy = this.LLJILJILJ;
            Drawable drawable = null;
            if (c0juy != null) {
                EmoteModel emoteModel5 = c0juy.LL;
                if (emoteModel5 != null) {
                    if (emoteModel5.emoteResource != null) {
                        if (((c0juy == null || (emoteModel4 = c0juy.LL) == null) ? null : emoteModel4.emoteResource) instanceof BitmapDrawable) {
                            if (c0juy != null && (emoteModel3 = c0juy.LL) != null) {
                                drawable = emoteModel3.emoteResource;
                            }
                            R5(params, ((BitmapDrawable) drawable).getBitmap());
                            return;
                        }
                    }
                    if (c0juy == null) {
                        return;
                    }
                }
                if (c0juy.LLILLJJLI != null) {
                    if (c0juy == null || (bitmap = c0juy.LLILLJJLI) == null) {
                        return;
                    }
                    R5(params, bitmap);
                    return;
                }
                if (c0juy == null || (emoteModel = c0juy.LL) == null || emoteModel.image == null || c0juy == null || (emoteModel2 = c0juy.LL) == null || (imageModel = emoteModel2.image) == null) {
                    return;
                }
                C1121670fIL.LJ(imageModel).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0JW4
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        EmoteModel emoteModel6;
                        Bitmap bitmap2 = (Bitmap) obj;
                        SubWaveEmoteListEmoteCell subWaveEmoteListEmoteCell = this.LL;
                        C0JUY c0juy2 = subWaveEmoteListEmoteCell.LLJILJILJ;
                        if (c0juy2 != null && (emoteModel6 = c0juy2.LL) != null) {
                            emoteModel6.emoteResource = new BitmapDrawable(subWaveEmoteListEmoteCell.itemView.getContext().getResources(), bitmap2);
                        }
                        return bitmap2;
                    }
                }).LJJLL(new C09JN() { // from class: X.0JWO
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("SubWaveEmoteListEmoteCell@f4f7.startCropFragment$1$2$2");
                        this.LL.R5(params, (Bitmap) obj);
                        C1C7U.LIZIZ("SubWaveEmoteListEmoteCell@f4f7.startCropFragment$1$2$2");
                    }
                }, new C09JN() { // from class: X.00MF
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("SubWaveEmoteListEmoteCell@f4f7.startCropFragment$1$2$3");
                        C1C7U.LIZIZ("SubWaveEmoteListEmoteCell@f4f7.startCropFragment$1$2$3");
                    }
                });
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [X.0JWE] */
    public SubWaveEmoteListEmoteCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubWaveEmotePageViewModel.class);
        C0JWI c0jwi = new C0JWI(c19719912DlLIZ);
        C493450JWt c493450JWt = new C493450JWt();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C493410JWp(c19719912DlLIZ), c0jwi, new C493270JWb(), new C0JWS(this), new C0JWK(this), new C493300JWe(this), c493450JWt, new C0JWG(this), null, new C0JWL(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C0JWR c0jwr = new C0JWR(this);
            C493290JWd c493290JWd = new C493290JWd(this);
            C493420JWq c493420JWq = new C493420JWq(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C0JWZ((InterfaceC451590HnJ) obj, c0jwr));
            C0JWU c0jwu = new C0JWU(c01gwLIZIZ);
            C0JWV c0jwv = new C0JWV(c01gwLIZIZ);
            C0JWW c0jww = new C0JWW(c01gwLIZIZ);
            C0JWX c0jwx = new C0JWX(c01gwLIZIZ);
            C0JWY c0jwy = new C0JWY(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c493420JWq, c0jwi, new C452080Ho6(), c0jwu, c0jwv, c493290JWd, c493450JWt, c0jww, c0jwx, c0jwy);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C493430JWr(c19719912DlLIZ), c0jwi, new C493280JWc(), new C0JWT(this), new C0JWP(this), new C493310JWf(this), c493450JWt, new C0JWF(this), null, new C0JWJ(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C493400JWo(c19719912DlLIZ), c0jwi, new C493260JWa(), new C0JWQ(this), new C0JWM(this), new C0JWN(this), c493450JWt, null, null, new C0JWH(this));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = "";
        this.LLILZ = C292401Bi.LIZ(new C493440JWs(this));
        this.LLILZIL = C292401Bi.LIZ(new C493320JWg(this));
        this.LLILZLL = C292401Bi.LIZ(new C493380JWm(this));
        this.LLIZ = C292401Bi.LIZ(new C493350JWj(this));
        this.LLIZLLLIL = C292401Bi.LIZ(new C493390JWn(this));
        this.LLJ = C292401Bi.LIZ(new C493340JWi(this));
        this.LLJI = C292401Bi.LIZ(new C493360JWk(this));
        this.LLJIJIL = C292401Bi.LIZ(new C493370JWl(this));
        this.LLJILJIL = C292401Bi.LIZ(new C493330JWh(this));
        this.LLJJ = new AnonymousClass1676() { // from class: X.0JWE
            @Override // X.AnonymousClass1676
            public final void LIZ() {
            }

            @Override // X.AnonymousClass1676
            public final void LIZIZ() {
                SubWaveEmoteListEmoteCell subWaveEmoteListEmoteCell = this.LIZ;
                C0JUY c0juy = subWaveEmoteListEmoteCell.LLJILJILJ;
                if (c0juy == null || subWaveEmoteListEmoteCell.LLILLL == null) {
                    return;
                }
                SubWaveEmotePageViewModel subWaveEmotePageViewModelN5 = subWaveEmoteListEmoteCell.N5();
                subWaveEmotePageViewModelN5.withState(new C0JUQ(c0juy, subWaveEmotePageViewModelN5));
            }

            @Override // X.AnonymousClass1676
            public final void LIZJ(C207221166x c207221166x) {
                IHostSubscription.Params params;
                Integer numValueOf;
                SubWaveEmoteListEmoteCell subWaveEmoteListEmoteCell = this.LIZ;
                C0JUY c0juy = subWaveEmoteListEmoteCell.LLJILJILJ;
                if (c0juy != null && (params = subWaveEmoteListEmoteCell.LLILLL) != null) {
                    SubWaveEmotePageViewModel subWaveEmotePageViewModelN5 = subWaveEmoteListEmoteCell.N5();
                    Resources resources = subWaveEmoteListEmoteCell.itemView.getContext().getResources();
                    Bitmap bitmapCreateScaledBitmap = c207221166x.LIZIZ;
                    LiveSubMediaModel liveSubMediaModel = c207221166x.LIZ;
                    if (liveSubMediaModel != null) {
                        numValueOf = Integer.valueOf(liveSubMediaModel.getWithTextSticker());
                    } else {
                        numValueOf = null;
                    }
                    if (bitmapCreateScaledBitmap != null) {
                        if (bitmapCreateScaledBitmap.getWidth() > params.max_width || bitmapCreateScaledBitmap.getHeight() > params.max_height) {
                            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, params.max_width, params.max_height, true);
                        }
                        if (bitmapCreateScaledBitmap.getByteCount() > params.max_size) {
                            C766270U4b.LIZLLL(2131841517);
                        }
                        new IHostSubscription.Result.PhotoFile();
                        bitmapCreateScaledBitmap.getByteCount();
                        if (numValueOf != null) {
                            numValueOf.intValue();
                        }
                        subWaveEmotePageViewModelN5.withState(new C0JUX(c0juy, bitmapCreateScaledBitmap, subWaveEmotePageViewModelN5, resources));
                    }
                }
            }
        };
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        ViewGroup.LayoutParams layoutParams = L5().getLayoutParams();
        int i = this.LLJILLL;
        layoutParams.width = i / 4;
        layoutParams.height = i / 4;
        C786410Ut5.m6(L5(), layoutParams);
        ViewGroup.LayoutParams layoutParams2 = P5().getLayoutParams();
        layoutParams2.width = (this.LLJILLL / 4) + ((int) C497740JfY.LIZIZ(4.0f));
        layoutParams2.height = (this.LLJILLL / 4) + ((int) C497740JfY.LIZIZ(4.0f));
        C786410Ut5.m6(P5(), layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = I5().getLayoutParams();
        layoutParams3.width = (this.LLJILLL / 4) + ((int) C497740JfY.LIZIZ(5.0f));
        layoutParams3.height = (this.LLJILLL / 4) + ((int) C497740JfY.LIZIZ(5.0f));
        C786410Ut5.m6(I5(), layoutParams3);
        View view = (View) this.LLJILJIL.getValue();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(C20736316Cj.LIZIZ(R.attr.exn, this.itemView.getContext()));
        view.setBackground(shapeDrawable);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0JW8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EmoteModel emoteModel;
                AuditInfo auditInfo;
                SubWaveEmoteListEmoteCell subWaveEmoteListEmoteCell = this.LL;
                C0JUY c0juy = subWaveEmoteListEmoteCell.LLJILJILJ;
                if (c0juy != null) {
                    if (c0juy.LLILZ != 1 && c0juy.LLILZ != 4) {
                        if (c0juy.LLILZ != 2 && c0juy.LLILZIL != 3) {
                            EmoteModel emoteModel2 = c0juy.LL;
                            if (emoteModel2 != null && emoteModel2.emoteUploadInfo != null) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        SubscribeDSAMap value = SubscriptionDSAUrl.INSTANCE.getValue();
                        HashMap map = new HashMap();
                        SubWaveEmoteListEmoteCell subWaveEmoteListEmoteCell2 = this.LL;
                        C0JUY c0juy2 = subWaveEmoteListEmoteCell2.LLJILJILJ;
                        if (c0juy2 != null && (emoteModel = c0juy2.LL) != null && (auditInfo = emoteModel.auditInfo) != null) {
                            map.put("violation_id", String.valueOf(auditInfo.violationId));
                            map.put("enter_from", subWaveEmoteListEmoteCell2.LLILLJJLI);
                        }
                        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                        C494790Jan.LJIIIZ(this.LL.itemView.getContext(), value.getAppealUrl(), map);
                        return;
                    }
                }
                subWaveEmoteListEmoteCell.S5();
                this.LL.N5().xQ2("edit");
            }
        }, this.itemView);
        C786410Ut5.Y7(L5(), new View.OnClickListener() { // from class: X.0JW7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.LL.S5();
                this.LL.N5().xQ2("edit");
            }
        });
        C786410Ut5.Y7(P5(), new View.OnClickListener() { // from class: X.0JW9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EmoteModel emoteModel;
                AuditInfo auditInfo;
                C0JUY c0juy = this.LL.LLJILJILJ;
                if (c0juy != null) {
                    if (c0juy.LLILZ == 1 || c0juy.LLILZ == 4) {
                        SubscribeDSAMap value = SubscriptionDSAUrl.INSTANCE.getValue();
                        HashMap map = new HashMap();
                        SubWaveEmoteListEmoteCell subWaveEmoteListEmoteCell = this.LL;
                        C0JUY c0juy2 = subWaveEmoteListEmoteCell.LLJILJILJ;
                        if (c0juy2 != null && (emoteModel = c0juy2.LL) != null && (auditInfo = emoteModel.auditInfo) != null) {
                            map.put("violation_id", String.valueOf(auditInfo.violationId));
                            map.put("enter_from", subWaveEmoteListEmoteCell.LLILLJJLI);
                        }
                        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                        C494790Jan.LJIIIZ(this.LL.itemView.getContext(), value.getAppealUrl(), map);
                    }
                }
            }
        });
        C786410Ut5.Y7(I5(), new View.OnClickListener() { // from class: X.0JW5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SubWaveEmoteListEmoteCell subWaveEmoteListEmoteCell = this.LL;
                C0JUY c0juy = subWaveEmoteListEmoteCell.LLJILJILJ;
                if (c0juy != null) {
                    subWaveEmoteListEmoteCell.N5().xQ2("delete");
                    SubWaveEmotePageViewModel subWaveEmotePageViewModelN5 = subWaveEmoteListEmoteCell.N5();
                    subWaveEmotePageViewModelN5.withState(new C0JUQ(c0juy, subWaveEmotePageViewModelN5));
                }
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ImageModel avatarThumb;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        final C0JUY c0juy = (C0JUY) interfaceC1891350zJl;
        super.onBindItemView(c0juy);
        this.LLJILJILJ = c0juy;
        String str = N5().wQ2().LLILLL;
        if (str == null) {
            str = "";
        }
        this.LLILLJJLI = str;
        C736680Sv4.LJIJJ(N5(), new C0JWD(this));
        int i = c0juy.LLILZ;
        List<String> listLIZ = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        ((View) this.LLILZIL.getValue()).setBackground(null);
                        C786410Ut5.LL(8, P5());
                        ConstraintLayout constraintLayoutL5 = L5();
                        if (c0juy.LLILZIL != 3 && c0juy.LL.emoteUploadInfo == null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        C500260Jjc.LJLJLJ(constraintLayoutL5, z5);
                        ConstraintLayout constraintLayoutI5 = I5();
                        if (c0juy.LLILZIL != 3 && c0juy.LL.emoteUploadInfo == null) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        C500260Jjc.LJLJLJ(constraintLayoutI5, z6);
                    } else {
                        EmoteModel emoteModel = c0juy.LL;
                        if (emoteModel != null && emoteModel.emoteId != null) {
                            int iLIZIZ = C20736316Cj.LIZIZ(R.attr.f04, this.itemView.getContext());
                            ((LiveIconView) this.LLILZLL.getValue()).setIcon(C20736316Cj.LIZLLL(R.attr.ejo, this.itemView.getContext()));
                            ((LiveIconView) this.LLILZLL.getValue()).setIconTint(iLIZIZ);
                            C786410Ut5.LL(0, P5());
                            ConstraintLayout constraintLayoutL52 = L5();
                            if (c0juy.LLILZIL != 3 && c0juy.LL.emoteUploadInfo == null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            C500260Jjc.LJLJLJ(constraintLayoutL52, z3);
                            ConstraintLayout constraintLayoutI52 = I5();
                            if (c0juy.LLILZIL != 3 && c0juy.LL.emoteUploadInfo == null) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            C500260Jjc.LJLJLJ(constraintLayoutI52, z4);
                            ((View) this.LLILZIL.getValue()).setBackground(null);
                        }
                    }
                } else {
                    ((View) this.LLILZIL.getValue()).setBackground(null);
                    C786410Ut5.LL(8, P5());
                    C786410Ut5.LL(0, L5());
                    ConstraintLayout constraintLayoutL53 = L5();
                    if (c0juy.LLILZIL != 3 && c0juy.LL.emoteUploadInfo == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C500260Jjc.LJLJLJ(constraintLayoutL53, z);
                    ConstraintLayout constraintLayoutI53 = I5();
                    if (c0juy.LLILZIL != 3 && c0juy.LL.emoteUploadInfo == null) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    C500260Jjc.LJLJLJ(constraintLayoutI53, z2);
                }
            } else {
                ((View) this.LLILZIL.getValue()).setBackgroundResource(R.drawable.e8v);
                C786410Ut5.LL(8, P5());
                C786410Ut5.LL(8, L5());
                C786410Ut5.LL(0, I5());
            }
        } else {
            ((View) this.LLILZIL.getValue()).setBackgroundResource(R.drawable.e8v);
            int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.ezv, this.itemView.getContext());
            ((LiveIconView) this.LLILZLL.getValue()).setIcon(C20736316Cj.LIZLLL(R.attr.dn9, this.itemView.getContext()));
            ((LiveIconView) this.LLILZLL.getValue()).setIconTint(iLIZIZ2);
            C786410Ut5.LL(0, P5());
            C786410Ut5.LL(8, L5());
            C786410Ut5.LL(0, I5());
        }
        EmoteModel emoteModel2 = c0juy.LL;
        if (emoteModel2.emoteResource != null) {
            ((C1322090kVb) this.LLILZ.getValue()).setImageDrawable(emoteModel2.emoteResource);
        } else if (c0juy.LLILLL != null) {
            SubWaveEmotePageViewModel subWaveEmotePageViewModelN5 = N5();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(subWaveEmotePageViewModelN5), C0PEM.LIZJ, null, new C492780JUe(((View) this.LLILZ.getValue()).getContext(), subWaveEmotePageViewModelN5, c0juy, null), 2);
        } else {
            final SubWaveEmotePageViewModel subWaveEmotePageViewModelN52 = N5();
            final Resources resources = this.itemView.getContext().getResources();
            ImageModel imageModel = c0juy.LL.image;
            if (imageModel != null) {
                C1121670fIL.LJ(imageModel).LJJLL(new C09JN() { // from class: X.0JUa
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("SubWaveEmotePageViewModel@2b86.fetchEmoteImageBitmap$1$1");
                        SubWaveEmotePageViewModel subWaveEmotePageViewModel = subWaveEmotePageViewModelN52;
                        subWaveEmotePageViewModel.withState(new C0JUZ(c0juy, (Bitmap) obj, subWaveEmotePageViewModel, resources));
                        C1C7U.LIZIZ("SubWaveEmotePageViewModel@2b86.fetchEmoteImageBitmap$1$1");
                    }
                }, new C09JN() { // from class: X.00MC
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("SubWaveEmotePageViewModel@2b86.fetchEmoteImageBitmap$1$2");
                        C1C7U.LIZIZ("SubWaveEmotePageViewModel@2b86.fetchEmoteImageBitmap$1$2");
                    }
                });
            }
        }
        EmoteUploadInfo emoteUploadInfo = c0juy.LL.emoteUploadInfo;
        if (emoteUploadInfo != null) {
            if (emoteUploadInfo.userId != UserService.getInstance().user().getCurrentUserId()) {
                C500260Jjc.LJLJLJ((View) this.LLJI.getValue(), true);
                C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                User user = emoteUploadInfo.userInfo;
                if (user != null && (avatarThumb = user.getAvatarThumb()) != null) {
                    listLIZ = C842240X2g.LIZ(avatarThumb);
                }
                C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(listLIZ);
                c1324610kZfLIZJ.LJIIIZ = R.drawable.el_;
                c1324610kZfLIZJ.LJJI((View) this.LLJIJIL.getValue());
                return;
            }
            return;
        }
        C500260Jjc.LJLJLJ((View) this.LLJI.getValue(), false);
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

    public final void R5(IHostSubscription.Params params, Bitmap bitmap) {
        Fragment fragmentLIZ;
        FragmentManager fragmentManager;
        EnumC1782750wUb enumC1782750wUb;
        if (bitmap.getWidth() * bitmap.getHeight() <= params.max_size) {
            int i = params.emotesShowStyle;
            if ((i != 1 && i != 2) || (fragmentLIZ = C946803n0.LIZ(this.itemView)) == null || (fragmentManager = fragmentLIZ.getFragmentManager()) == null) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(params.logInfo);
            linkedHashMap.put("entrance", "edit");
            if (bitmap.getWidth() == bitmap.getHeight()) {
                enumC1782750wUb = EnumC1782750wUb.XY_SCALE_TO_CENTER;
            } else {
                enumC1782750wUb = EnumC1782750wUb.XY_MOVE_TO_CENTER;
            }
            EnumC207219166v enumC207219166v = EnumC207219166v.BITMAP;
            int i2 = params.emotesShowStyle;
            new C0L0G(params.min_width, params.min_height, params.max_width, params.max_height, params.max_size);
            ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).iQ1(new AnonymousClass1677(fragmentManager, enumC1782750wUb, enumC207219166v, i2, linkedHashMap, true, bitmap, null, null, this.LLJJ, 1792));
        }
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
