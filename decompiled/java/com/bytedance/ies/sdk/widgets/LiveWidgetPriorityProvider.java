package com.bytedance.ies.sdk.widgets;

import X.C08FF;
import X.C13LP;
import X.C1954807lC;
import X.C19719512Dh;
import X.C2254308sP;
import X.C469240Iag;
import X.InterfaceC2044707zh;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public final class LiveWidgetPriorityProvider implements IWidgetProvider {
    public static final Companion Companion = new Companion();
    public static volatile LiveWidgetPriorityProvider sInstance;
    public final RecycledLiveWidgetPool recycledViewPool = new RecycledLiveWidgetPool();

    public static final class Companion {
        public static /* synthetic */ void getInstance$annotations() {
        }

        public final LiveWidgetPriorityProvider getInstance() {
            if (LiveWidgetPriorityProvider.sInstance == null) {
                synchronized (LiveWidgetPriorityProvider.class) {
                    try {
                        if (LiveWidgetPriorityProvider.sInstance == null) {
                            LiveWidgetPriorityProvider.sInstance = new LiveWidgetPriorityProvider();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return LiveWidgetPriorityProvider.sInstance;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Priority {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ Priority[] $VALUES;
        public static final Priority P0 = new Priority("P0", 0);
        public static final Priority P1 = new Priority("P1", 1);
        public static final Priority P2 = new Priority("P2", 2);

        public static final /* synthetic */ Priority[] $values() {
            return new Priority[]{P0, P1, P2};
        }

        public static InterfaceC2044707zh<Priority> getEntries() {
            return $ENTRIES;
        }

        static {
            Priority[] priorityArr$values = $values();
            $VALUES = priorityArr$values;
            $ENTRIES = new C2254308sP(priorityArr$values);
        }

        public static Priority[] values() {
            return (Priority[]) $VALUES.clone();
        }

        public static Priority valueOf(String str) {
            return (Priority) C08FF.LIZ(Priority.class, str);
        }

        public Priority(String str, int i) {
        }
    }

    public static final class RecycledLiveWidgetPool {
        public static final Companion Companion = new Companion();
        public int maxSize = 30;
        public final HashMap<Class<IRecyclableWidget>, Priority> priorityMap = new HashMap<>(64);
        public final LinkedHashMap<Class<IRecyclableWidget>, ScrapData> scrapP0 = new LinkedHashMap<>(16, 0.75f, true);
        public final LinkedHashMap<Class<IRecyclableWidget>, ScrapData> scrapP1 = new LinkedHashMap<>(32, 0.75f, true);
        public final LinkedHashMap<Class<IRecyclableWidget>, ScrapData> scrapP2 = new LinkedHashMap<>(64, 0.75f, true);

        public static final class Companion {
        }

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Priority.values().length];
                try {
                    iArr[Priority.P0.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                try {
                    iArr[Priority.P1.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                try {
                    iArr[Priority.P2.ordinal()] = 3;
                } catch (NoSuchFieldError e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private final void removeLowPriorityWidget() {
            if (this.scrapP2.size() > 0) {
                LinkedHashMap<Class<IRecyclableWidget>, ScrapData> linkedHashMap = this.scrapP2;
                C19719512Dh.LIZJ(linkedHashMap).remove(C13LP.LJJJJL(linkedHashMap.keySet(), 0));
            } else if (this.scrapP1.size() > 0) {
                LinkedHashMap<Class<IRecyclableWidget>, ScrapData> linkedHashMap2 = this.scrapP1;
                C19719512Dh.LIZJ(linkedHashMap2).remove(C13LP.LJJJJL(linkedHashMap2.keySet(), 0));
            } else if (this.scrapP0.size() > 0) {
                LinkedHashMap<Class<IRecyclableWidget>, ScrapData> linkedHashMap3 = this.scrapP0;
                C19719512Dh.LIZJ(linkedHashMap3).remove(C13LP.LJJJJL(linkedHashMap3.keySet(), 0));
            }
        }

        private final int size() {
            return this.scrapP0.size() + this.scrapP1.size() + this.scrapP2.size();
        }

        public final void clearAll() {
            Iterator<T> it2 = this.scrapP0.values().iterator();
            while (it2.hasNext()) {
                ((ScrapData) it2.next()).getScrapHeap().clear();
            }
            this.scrapP0.clear();
            Iterator<T> it3 = this.scrapP1.values().iterator();
            while (it3.hasNext()) {
                ((ScrapData) it3.next()).getScrapHeap().clear();
            }
            this.scrapP1.clear();
            Iterator<T> it4 = this.scrapP2.values().iterator();
            while (it4.hasNext()) {
                ((ScrapData) it4.next()).getScrapHeap().clear();
            }
            this.scrapP2.clear();
        }

        public static final class ScrapData {
            public final ArrayList<IRecyclableWidget> scrapHeap = new ArrayList<>(3);
            public final int maxScrap = 3;

            public final int getMaxScrap() {
                return this.maxScrap;
            }

            public final ArrayList<IRecyclableWidget> getScrapHeap() {
                return this.scrapHeap;
            }
        }

        private final MutableContextWrapper findMutableContextWrapper(Context context) {
            if (context == null) {
                return null;
            }
            if (context instanceof MutableContextWrapper) {
                return (MutableContextWrapper) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            return findMutableContextWrapper(((ContextWrapper) context).getBaseContext());
        }

        private final ScrapData getScrapDataForType(Class<IRecyclableWidget> cls) {
            LinkedHashMap<Class<IRecyclableWidget>, ScrapData> scrapX = getScrapX(cls);
            ScrapData scrapData = scrapX.get(cls);
            if (scrapData == null) {
                ScrapData scrapData2 = new ScrapData();
                scrapX.put(cls, scrapData2);
                return scrapData2;
            }
            return scrapData;
        }

        private final LinkedHashMap<Class<IRecyclableWidget>, ScrapData> getScrapX(Class<IRecyclableWidget> cls) {
            Priority priority = this.priorityMap.get(cls);
            if (priority != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        return this.scrapP1;
                    }
                } else {
                    return this.scrapP0;
                }
            }
            return this.scrapP2;
        }

        private final boolean isActivityContext(Context context) {
            Context baseContext;
            if (context == null) {
                return false;
            }
            MutableContextWrapper mutableContextWrapperFindMutableContextWrapper = findMutableContextWrapper(context);
            if (mutableContextWrapperFindMutableContextWrapper != null) {
                baseContext = mutableContextWrapperFindMutableContextWrapper.getBaseContext();
            } else {
                baseContext = null;
            }
            if (!(baseContext instanceof ContextThemeWrapper)) {
                return false;
            }
            return true;
        }

        public final void clear(Priority priority) {
            int i = WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.scrapP2.clear();
                        return;
                    }
                    throw new C1954807lC();
                }
                this.scrapP1.clear();
                return;
            }
            this.scrapP0.clear();
        }

        public final void clearWidgetCache(Class<IRecyclableWidget> cls) {
            if (cls != null) {
                getScrapDataForType(cls).getScrapHeap().clear();
            }
        }

        public final IRecyclableWidget getRecycledView(Class<IRecyclableWidget> cls) {
            ScrapData scrapDataForType = getScrapDataForType(cls);
            if (scrapDataForType != null && (!scrapDataForType.getScrapHeap().isEmpty())) {
                return (IRecyclableWidget) ListProtector.remove(scrapDataForType.getScrapHeap(), r1.size() - 1);
            }
            return null;
        }

        public final int getRecycledViewCount(Class<IRecyclableWidget> cls) {
            return getScrapDataForType(cls).getScrapHeap().size();
        }

        public final boolean hasMarked(Class<IRecyclableWidget> cls) {
            if (getScrapX(cls).get(cls) != null) {
                return true;
            }
            return false;
        }

        public final boolean isPriority(Class<? extends LiveRecyclableWidget> cls) {
            LinkedHashMap<Class<IRecyclableWidget>, ScrapData> linkedHashMap = this.scrapP0;
            if (cls == null) {
                cls = null;
            }
            return linkedHashMap.containsKey(cls);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void putRecycledView(IRecyclableWidget iRecyclableWidget) {
            if (size() >= this.maxSize) {
                removeLowPriorityWidget();
            }
            ScrapData scrapDataForType = getScrapDataForType(iRecyclableWidget.getClass());
            ArrayList<IRecyclableWidget> scrapHeap = scrapDataForType.getScrapHeap();
            if (scrapDataForType.getMaxScrap() <= scrapHeap.size()) {
                return;
            }
            iRecyclableWidget.resetInternal();
            scrapHeap.add(iRecyclableWidget);
        }

        public final void resetWidgetsViewContext(Context context) {
            Context context2;
            if (context == null) {
                return;
            }
            Iterator<T> it2 = this.scrapP0.values().iterator();
            while (it2.hasNext()) {
                for (Object obj : ((ScrapData) it2.next()).getScrapHeap()) {
                    if (obj instanceof LiveRecyclableWidget) {
                        com.bytedance.android.widget.Widget widget = (com.bytedance.android.widget.Widget) obj;
                        View view = widget.contentView;
                        Context context3 = null;
                        if (view != null) {
                            context2 = view.getContext();
                        } else {
                            context2 = null;
                        }
                        if (isActivityContext(context2)) {
                            View view2 = widget.contentView;
                            if (view2 != null) {
                                context3 = view2.getContext();
                            }
                            MutableContextWrapper mutableContextWrapperFindMutableContextWrapper = findMutableContextWrapper(context3);
                            if (mutableContextWrapperFindMutableContextWrapper != null) {
                                mutableContextWrapperFindMutableContextWrapper.setBaseContext(context);
                            }
                        }
                    }
                }
            }
        }

        public final void initPriorityPool(int i, HashMap<Class<IRecyclableWidget>, Priority> map) {
            this.maxSize = i;
            this.priorityMap.putAll(map);
        }
    }

    public static final LiveWidgetPriorityProvider getInstance() {
        return Companion.getInstance();
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ void cancelDelayedClear() {
        C469240Iag.LIZ(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ void clearNonWhitelist(Function1 function1) {
        C469240Iag.LIZJ(this, function1);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean isEnablePriority() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ void prepareWhitelistWidgetsForReuse(Context context) {
        C469240Iag.LJI(this, context);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ void scheduleDelayedClear(long j) {
        C469240Iag.LJIIIIZZ(this, j);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearAll() {
        this.recycledViewPool.clearAll();
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clear(Priority priority) {
        this.recycledViewPool.clear(priority);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearWidgetCache(Class<? extends IRecyclableWidget> cls) {
        RecycledLiveWidgetPool recycledLiveWidgetPool = this.recycledViewPool;
        if (cls == null) {
            cls = null;
        }
        recycledLiveWidgetPool.clearWidgetCache(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean hasMarked(Class<IRecyclableWidget> cls) {
        return this.recycledViewPool.hasMarked(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean isPriority(Class<? extends LiveRecyclableWidget> cls) {
        return this.recycledViewPool.isPriority(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public <T extends IRecyclableWidget> T provide(Class<T> cls) {
        T t = (T) this.recycledViewPool.getRecycledView(cls);
        if (t == null) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new RuntimeException(e2);
            }
        }
        return t;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public <T extends IRecyclableWidget> T provideWithOutReflect(Class<T> cls) {
        T t = (T) this.recycledViewPool.getRecycledView(cls);
        if (!(t instanceof IRecyclableWidget)) {
            return null;
        }
        return t;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void recycleRecyclableWidget(IRecyclableWidget iRecyclableWidget) {
        this.recycledViewPool.putRecycledView(iRecyclableWidget);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void resetWidgetsViewContext(Context context) {
        this.recycledViewPool.resetWidgetsViewContext(context);
    }

    public final void initPriorityPool(int i, HashMap<Class<IRecyclableWidget>, Priority> map) {
        this.recycledViewPool.initPriorityPool(i, map);
    }
}
