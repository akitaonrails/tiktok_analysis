package com.bytedance.ies.sdk.widgets;

import X.C11NJ;
import X.C475510Ikn;
import X.C494750Jaj;
import X.EnumC494740Jai;
import X.InterfaceC1097170eep;
import X.InterfaceC2262351Dgn;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubWidgetScatterEnableSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.scatter.LiveExitRoomRunnableScatter;
import com.bytedance.ies.sdk.widgets.scatter.LiveExitRoomRunnableScatterData;
import com.bytedance.ies.sdk.widgets.scatter.LiveGoneViewIdList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public abstract class LiveWidget extends com.bytedance.android.widget.Widget implements ILayeredWidget {
    public C11NJ compositeDisposable;
    public ConstraintProperty constraintProperty;
    public boolean contentViewAttached;
    public DataChannel dataChannel;
    public LayeredElementContext internalLayeredElementContext;
    public RecyclableWidgetManager subWidgetManager;

    public void enableSubWidgetManager() {
        enableSubWidgetManager(false);
    }

    @Override // com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void onViewAttached() {
    }

    @Override // com.bytedance.android.widget.Widget
    public boolean enableAttachOpt() {
        List list;
        DataChannel dataChannel = this.dataChannel;
        return (dataChannel == null || (list = (List) dataChannel.gg0(LiveGoneViewIdList.class)) == null || !list.contains(Integer.valueOf(getId())) || this.widgetCallback == null || this.contentViewAttached) ? false : true;
    }

    @Override // com.bytedance.android.widget.Widget
    public LiveExitRoomRunnableScatter getExitRoomRunnableScatter() {
        DataChannel dataChannel = this.dataChannel;
        return dataChannel != null ? (LiveExitRoomRunnableScatter) dataChannel.gg0(LiveExitRoomRunnableScatterData.class) : super.getExitRoomRunnableScatter();
    }

    @Override // com.bytedance.android.widget.Widget
    public void hide() {
        LayeredElementContext layeredElementContext = this.internalLayeredElementContext;
        if (layeredElementContext == null || layeredElementContext.getConstraintPropertyById(getId()) == null) {
            super.hide();
            return;
        }
        ConstraintProperty constraintPropertyById = this.internalLayeredElementContext.getConstraintPropertyById(getId());
        if (constraintPropertyById == null || constraintPropertyById.visibility() != 0) {
            return;
        }
        constraintPropertyById.visibility(8);
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null) {
            interfaceC1097170eep.onHide(this);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onCreate() {
        C11NJ c11nj = this.compositeDisposable;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.compositeDisposable = new C11NJ();
        super.onCreate();
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null) {
            if (C494750Jaj.LIZ(interfaceC1097170eep.getRootLifeCycleOwner()) != EnumC494740Jai.WIDGET || this.widgetCallback.getFragment() == null || this.widgetCallback.getRootLifeCycleOwner() == null) {
                this.dataChannel = C475510Ikn.LJ(this.widgetCallback.getFragment());
            } else {
                this.dataChannel = new CellDataChannelProvider(this.widgetCallback.getRootLifeCycleOwner().hashCode(), this.widgetCallback.getFragment()).getValue();
            }
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onDetachWidget() {
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null) {
            interfaceC1097170eep.unloadWidget(this);
        }
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager == null || !recyclableWidgetManager.isSubWidgetManager) {
            return;
        }
        recyclableWidgetManager.detachWidget();
    }

    public void attachAndShow() {
        if (enableAttachOpt()) {
            show();
        }
    }

    public void attachBeforeViewShow() {
        if (enableAttachOpt()) {
            this.widgetCallback.attachContentView(this, this.containerView, this.contentView);
            onViewAttached();
        }
    }

    public void enablePreviewSubWidgetManager() {
        enableSubWidgetManager(null, null, LiveWidgetNonOpProvider.getInstance(), false);
        this.subWidgetManager.isPreviewWidgetManager = true;
    }

    @Override // com.bytedance.android.widget.Widget
    public void onDestroy() {
        Fragment fragment;
        super.onDestroy();
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null) {
            interfaceC1097170eep.removeAllMessages(this);
        }
        onDetachWidget();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        this.compositeDisposable.dispose();
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager != null && (fragment = recyclableWidgetManager.parentFragment) != null) {
            fragment.getLifecycle().removeObserver(this.subWidgetManager);
        }
        RecyclableWidgetManager recyclableWidgetManager2 = this.subWidgetManager;
        if (recyclableWidgetManager2 != null && (interfaceC1097170eep instanceof LiveRecyclableWidget.RecyclableWidgetCallback)) {
            ((LiveRecyclableWidget.RecyclableWidgetCallback) interfaceC1097170eep).onDestroySubWidgetManager(recyclableWidgetManager2, this);
        }
        this.subWidgetManager = null;
    }

    @Override // com.bytedance.android.widget.Widget
    public void show() {
        if (enableAttachOpt()) {
            attachBeforeViewShow();
        }
        LayeredElementContext layeredElementContext = this.internalLayeredElementContext;
        if (layeredElementContext == null || layeredElementContext.getConstraintPropertyById(getId()) == null) {
            super.show();
            return;
        }
        ConstraintProperty constraintPropertyById = this.internalLayeredElementContext.getConstraintPropertyById(getId());
        if (constraintPropertyById == null || constraintPropertyById.visibility() != 8) {
            return;
        }
        constraintPropertyById.visibility(0);
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null) {
            interfaceC1097170eep.onShow(this);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.ILayeredWidget
    public boolean getContentViewAttached() {
        return this.contentViewAttached;
    }

    public Context getContext() {
        return this.context;
    }

    public LayeredElementContext getLayeredElementContext() {
        return this.internalLayeredElementContext;
    }

    public DataChannel provideDataChannel() {
        return this.dataChannel;
    }

    public void enableSubWidgetManager(boolean z) {
        enableSubWidgetManager(null, null, LiveWidgetNonOpProvider.getInstance(), z);
    }

    public final <T extends View> T findViewById(int i) {
        View view = getView();
        if (view != null) {
            return (T) view.findViewById(i);
        }
        return null;
    }

    @Override // com.bytedance.android.widget.Widget
    public <T> void onCustomInfoCallBack(T t) {
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager != null && recyclableWidgetManager.isSubWidgetManager) {
            recyclableWidgetManager.onCustomInfoCallBack(t.getClass(), t);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void setAlpha(float f) {
        LayeredElementContext layeredElementContext;
        if (this.constraintProperty == null && (layeredElementContext = this.internalLayeredElementContext) != null) {
            this.constraintProperty = layeredElementContext.getConstraintPropertyById(getId());
        }
        ConstraintProperty constraintProperty = this.constraintProperty;
        if (constraintProperty != null) {
            constraintProperty.alpha(f);
        } else {
            super.setAlpha(f);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.ILayeredWidget
    public void setContentViewAttached(boolean z) {
        this.contentViewAttached = z;
    }

    public void setLayeredElementContext(LayeredElementContext layeredElementContext) {
        this.internalLayeredElementContext = layeredElementContext;
        if (layeredElementContext == null) {
            this.constraintProperty = null;
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void setWidgetCallback(InterfaceC1097170eep interfaceC1097170eep) {
        super.setWidgetCallback(interfaceC1097170eep);
        if (interfaceC1097170eep != null) {
            if (C494750Jaj.LIZ(interfaceC1097170eep.getRootLifeCycleOwner()) == EnumC494740Jai.WIDGET && interfaceC1097170eep.getFragment() != null && interfaceC1097170eep.getRootLifeCycleOwner() != null) {
                this.dataChannel = new CellDataChannelProvider(interfaceC1097170eep.getRootLifeCycleOwner().hashCode(), interfaceC1097170eep.getFragment()).getValue();
            } else {
                this.dataChannel = C475510Ikn.LJ(interfaceC1097170eep.getFragment());
            }
        }
    }

    public void enableSubWidgetManager(InterfaceC2262351Dgn interfaceC2262351Dgn, FluencyOpt fluencyOpt, IWidgetProvider iWidgetProvider) {
        enableSubWidgetManager(interfaceC2262351Dgn, fluencyOpt, iWidgetProvider, false);
    }

    public void enableSubWidgetManager(InterfaceC2262351Dgn interfaceC2262351Dgn, FluencyOpt fluencyOpt, IWidgetProvider iWidgetProvider, boolean z) {
        InterfaceC1097170eep interfaceC1097170eep;
        if (this.subWidgetManager == null && (interfaceC1097170eep = this.widgetCallback) != null) {
            if (C494750Jaj.LIZ(interfaceC1097170eep.getRootLifeCycleOwner()) == EnumC494740Jai.WIDGET) {
                this.subWidgetManager = RecyclableWidgetManager.of(this.widgetCallback.getFragment(), this.widgetCallback.getRootLifeCycleOwner(), getView(), iWidgetProvider, fluencyOpt, z, false);
            } else {
                this.subWidgetManager = RecyclableWidgetManager.of(this.widgetCallback.getFragment(), getView(), iWidgetProvider, fluencyOpt, z, false);
            }
            RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
            recyclableWidgetManager.mWidgetCreateTimeListener = interfaceC2262351Dgn;
            recyclableWidgetManager.isSubWidgetManager = true;
            if (this.widgetCallback.isScatterLoadEnable()) {
                this.subWidgetManager.setEnableScatterLoad(true, this.widgetCallback.getWidgetLoadScatter());
            }
            if (LiveSubWidgetScatterEnableSetting.INSTANCE.enable()) {
                this.subWidgetManager.exitRoomRunnableScatter = getExitRoomRunnableScatter();
            }
            InterfaceC1097170eep interfaceC1097170eep2 = this.widgetCallback;
            if (interfaceC1097170eep2 instanceof LiveRecyclableWidget.RecyclableWidgetCallback) {
                ((LiveRecyclableWidget.RecyclableWidgetCallback) interfaceC1097170eep2).onSubWidgetManagerCreated(this.subWidgetManager, this);
            }
        }
    }
}
