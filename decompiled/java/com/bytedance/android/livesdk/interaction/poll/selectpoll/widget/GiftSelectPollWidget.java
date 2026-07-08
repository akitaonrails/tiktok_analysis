package com.bytedance.android.livesdk.interaction.poll.selectpoll.widget;

import X.C1086690eNv;
import X.C1086830eO9;
import X.C1086850eOB;
import X.C1161920gLG;
import X.C1848410yCV;
import X.C21538719Qz;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C259800zU;
import X.C494680Jac;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C501520Jle;
import X.C766270U4b;
import X.EnumC1086920eOI;
import Y.ACListenerS83S0300000_17;
import Y.AObserverS221S0100000_17;
import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import avg.f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.MockGiftPollEvent;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.PollInfo;
import com.bytedance.android.livesdk.model.UserVoteInfo;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftSelectPollWidget extends AbsSelectPollWidget {
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (C494680Jac.LJI(this.dataChannel)) {
            return;
        }
        super.show();
        C1086830eO9.LIZLLL = false;
        SelectPollViewModel selectPollViewModel = this.LLJILJIL;
        if (selectPollViewModel != null) {
            selectPollViewModel.LLILLJJLI = EnumC1086920eOI.GIFT;
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget
    public final void F1(long j) {
        C1086690eNv.LIZIZ(j, this.dataChannel, EnumC1086920eOI.GIFT);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget
    public final void G1(Throwable th) {
        ConstraintProperty constraintPropertyById;
        z1(true);
        LayeredElementContext layeredElementContext = getLayeredElementContext();
        if (layeredElementContext != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(getId())) != null) {
            constraintPropertyById.alpha(1.0f);
        }
        String str = "network_error";
        if (th instanceof C501470JlZ) {
            switch (((C501520Jle) th).getErrorCode()) {
                case 4003095:
                    hide();
                    str = "timeout";
                    break;
                case 4003096:
                    break;
                default:
                    str = "other";
                    break;
            }
            E1(str);
            return;
        }
        if (Intrinsics.LJFF(th.getMessage(), "user dismiss")) {
            return;
        }
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843819));
        E1("network_error");
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        super.onUnload(recycleSource);
        this.dataChannel.zQ2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0eNt, X.19Qz, android.view.View] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget
    public final void D1(long j, List list) {
        T t;
        String quantityString;
        Gift gift;
        Resources resources;
        int i;
        T t2;
        String quantityString2;
        Gift gift2;
        Resources resources2;
        int i2;
        super.D1(j, list);
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            int i4 = i3 + 1;
            PollOptionInfo pollOptionInfo = (PollOptionInfo) it2.next();
            if (pollOptionInfo != null) {
                final Context context = this.context;
                ?? r4 = new C21538719Qz(context) { // from class: X.0eNt
                    public C16F5 LLILZIL;
                    public C1324720kZq LLILZLL;

                    public final C1324720kZq getGiftPollImageFromXml() {
                        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
                        if (callbackFindViewById == null) {
                            callbackFindViewById = findViewById(R.id.izj);
                            this.LLILZLL = (C1324720kZq) callbackFindViewById;
                        }
                        return (C1324720kZq) callbackFindViewById;
                    }

                    public final C16F5 getGiftPollTextFromXml() {
                        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
                        if (callbackFindViewById == null) {
                            callbackFindViewById = findViewById(R.id.izk);
                            this.LLILZIL = (C16F5) callbackFindViewById;
                        }
                        return (C16F5) callbackFindViewById;
                    }

                    {
                        super(context, null, 0);
                        FrameLayout.inflate(context, R.layout.hul, this);
                        setBackgroundColor(ColorProtector.parseColor("#33000000"));
                    }

                    public final void setGiftImage(ImageModel imageModel) {
                        C1324570kZb.LIZIZ(imageModel, getGiftPollImageFromXml());
                    }

                    public final void setGiftPollImageFromXml(C1324720kZq c1324720kZq) {
                        this.LLILZLL = c1324720kZq;
                    }

                    public final void setGiftPollTextFromXml(C16F5 c16f5) {
                        this.LLILZIL = c16f5;
                    }

                    public final void setGiftPrice(String str) {
                        getGiftPollTextFromXml().setText(str);
                    }

                    public final void setTextSize(float f) {
                        getGiftPollTextFromXml().setTextSize(1, f);
                    }
                };
                int i5 = 1;
                r4.setCircular(true);
                C1086850eOB pollGifts = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts();
                C259800zU c259800zU = new C259800zU();
                ImageModel imageModel = null;
                String str = "1";
                if (i3 == 0) {
                    if (pollGifts != null) {
                        t2 = pollGifts.LIZ;
                    } else {
                        t2 = 0;
                    }
                    c259800zU.element = t2;
                    Context context2 = r4.getContext();
                    if (context2 != null && (resources2 = context2.getResources()) != null) {
                        Gift gift3 = (Gift) c259800zU.element;
                        if (gift3 != null) {
                            i2 = gift3.diamondCount;
                        } else {
                            i2 = 1;
                        }
                        Object[] objArr = new Object[1];
                        if (gift3 != null) {
                            i5 = gift3.diamondCount;
                        }
                        objArr[0] = Integer.valueOf(i5);
                        quantityString2 = resources2.getQuantityString(2131755537, i2, objArr);
                    } else {
                        quantityString2 = null;
                    }
                    if (pollGifts != null && (gift2 = pollGifts.LIZ) != null) {
                        imageModel = gift2.icon;
                    }
                    r4.setGiftImage(imageModel);
                    if (quantityString2 != null) {
                        str = quantityString2;
                    }
                    r4.setGiftPrice(str);
                } else {
                    if (pollGifts != null) {
                        t = pollGifts.LIZIZ;
                    } else {
                        t = 0;
                    }
                    c259800zU.element = t;
                    Context context3 = r4.getContext();
                    if (context3 != null && (resources = context3.getResources()) != null) {
                        Gift gift4 = (Gift) c259800zU.element;
                        if (gift4 != null) {
                            i = gift4.diamondCount;
                        } else {
                            i = 1;
                        }
                        Object[] objArr2 = new Object[1];
                        if (gift4 != null) {
                            i5 = gift4.diamondCount;
                        }
                        objArr2[0] = Integer.valueOf(i5);
                        quantityString = resources.getQuantityString(2131755537, i, objArr2);
                    } else {
                        quantityString = null;
                    }
                    if (pollGifts != null && (gift = pollGifts.LIZIZ) != null) {
                        imageModel = gift.icon;
                    }
                    r4.setGiftImage(imageModel);
                    if (quantityString != null) {
                        str = quantityString;
                    }
                    r4.setGiftPrice(str);
                }
                if (!this.LLIZ) {
                    View.OnClickListener aCListenerS83S0300000_17 = new ACListenerS83S0300000_17(c259800zU, this, pollOptionInfo, 9);
                    if (C1848410yCV.LIZ) {
                        aCListenerS83S0300000_17 = new f(aCListenerS83S0300000_17);
                    }
                    a aVar = new a(aCListenerS83S0300000_17);
                    if (C2213981Bky.LIZIZ.isOffline()) {
                        C2211941Bhg.LIZ.injectViewListener(r4);
                    }
                    r4.setOnClickListener(aVar);
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ((Number) this.LLJ.getValue()).intValue());
                layoutParams.setMarginStart(A1());
                layoutParams.setMarginEnd(A1());
                B1().addView((View) r4, layoutParams);
            }
            i3 = i4;
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        Boolean boolValueOf;
        Room room;
        PollInfo pollInfo;
        PollData pollData;
        Room room2;
        PollInfo pollInfo2;
        PollData pollData2;
        List<PollOptionInfo> list;
        Room room3;
        PollInfo pollInfo3;
        PollData pollData3;
        PollInfo pollInfo4;
        UserVoteInfo userVoteInfo;
        LiveData liveData;
        super.onLoad(recycleSource, objArr);
        this.dataChannel.CQ2(MockGiftPollEvent.class, this, new AwS596S0100000_17(this, 187));
        SelectPollViewModel selectPollViewModel = this.LLJILJIL;
        if (selectPollViewModel != null && (liveData = (LiveData) selectPollViewModel.LLILZ.getValue()) != null) {
            liveData.observe(this, new AObserverS221S0100000_17(this, 16));
        }
        Room room4 = this.LLJILLL;
        if (room4 != null && (pollInfo4 = room4.advancedPollInfo) != null && (userVoteInfo = pollInfo4.userVoteInfo) != null) {
            boolValueOf = Boolean.valueOf(userVoteInfo.hasVoted);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf) && (room = this.LLJILLL) != null && (pollInfo = room.advancedPollInfo) != null && (pollData = pollInfo.pollData) != null && pollData.pollKind == EnumC1086920eOI.GIFT.ordinal() && (room2 = this.LLJILLL) != null && (pollInfo2 = room2.advancedPollInfo) != null && (pollData2 = pollInfo2.pollData) != null && (list = pollData2.pollOptionList) != null && list.size() > 0 && (room3 = this.LLJILLL) != null && (pollInfo3 = room3.advancedPollInfo) != null && (pollData3 = pollInfo3.pollData) != null && pollData3.pollStatus == 1 && room3.giftPollVoteEnabled) {
            C1(room3.advancedPollInfo.pollData);
        }
        if (this.LLIZ) {
            this.LLILLJJLI = new PollStartContent();
            show();
        }
    }
}
