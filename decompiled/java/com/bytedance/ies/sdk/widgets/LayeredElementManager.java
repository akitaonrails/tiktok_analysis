package com.bytedance.ies.sdk.widgets;

import X.C09JN;
import X.C1083090eI7;
import X.C1083340eIW;
import X.C1090450eTz;
import X.C1099860ejA;
import X.C1100290ejr;
import X.C1101530elr;
import X.C1119470fEn;
import X.C11NZ;
import X.C19ME;
import X.C19MX;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C830540Wi4;
import X.InterfaceC420801kM;
import X.InterfaceC742320T9y;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveMultiPropertyGroupSideEnableSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.recycleelement.IRecycleLayeredElementManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public abstract class LayeredElementManager<T extends LayeredElementContext> implements PropertyResolver, IRecycleLayeredElementManager, GenericLifecycleObserver {
    public AnimationListener mAnimationListener;
    public int mContentViewCount;
    public DataChannel mDataChannel;
    public boolean mDrawOptimization;
    public IHiddenChangeObserver mHiddenChangeObserver;
    public String mLastAttachedTag;
    public String mLastDetachedTag;
    public int mLayerIndex;
    public final C1083340eIW mLayeredConstraintLayout;
    public final T mLayeredElementContext;
    public LifecycleOwner mLifecycleOwner;
    public final Ordering mOrdering = new Ordering();
    public final C1119470fEn<GroupHolderConstraintElement> mGroupHolderConstraintElements = new C1119470fEn<>();
    public final Map<Integer, ElementSpec> mElements = new HashMap();
    public final SparseArray<C1083090eI7> mGroups = new SparseArray<>();
    public final SparseArray<Set<Integer>> mGroupElements = new SparseArray<>();
    public final List<InterfaceC420801kM> mDisposables = new LinkedList();
    public final SparseArray<List<WidgetHiddenChangedSceneObserver>> mHiddenChangedObservers = new SparseArray<>();
    public final Map<WidgetHiddenChangedSceneObserver, Integer> mHiddenChangedObserverElementMap = new HashMap();
    public final Map<Integer, ChainResolver> mChainResolvers = new HashMap();
    public final Map<Integer, SpacingResolver> mSpacingResolvers = new HashMap();
    public final SparseArray<AnimationInfo> mAnimationInfoArray = new SparseArray<>();
    public final List<XmlViewHolderConstraintElement> mXmlViewHolderConstraintElements = new ArrayList();
    public final boolean isLocalTest = LayeredElementConfiguration.INSTANCE.getDebug();
    public final Map<Integer, GroupHolderConstraintElement> mElementMap = new LinkedHashMap();

    public abstract <V> C11NZ<V> createRxObservable(Class<V> cls);

    public abstract <V> InterfaceC742320T9y<V, V> createRxTransformer();

    public boolean needReuse() {
        return false;
    }

    public abstract T onCreateLayeredElementContext(Context context, ViewGroup viewGroup, DataChannel dataChannel);

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public void recycle() {
        this.mLifecycleOwner = null;
        this.mDataChannel = null;
        this.mAnimationListener = null;
        this.mLayeredElementContext.setDataChannel(new DataChannel());
    }

    private void reorder() {
        for (XmlViewHolderConstraintElement xmlViewHolderConstraintElement : this.mXmlViewHolderConstraintElements) {
            if (!(xmlViewHolderConstraintElement.getView() instanceof C1090450eTz) && !(xmlViewHolderConstraintElement.getView() instanceof C19MX)) {
                this.mLayeredConstraintLayout.bringChildToFront(xmlViewHolderConstraintElement.getView());
            }
        }
    }

    private void resolveGuidelineIfNeeded() {
        if (LayeredElementConfiguration.INSTANCE.getGuidelineIndicatorEnabled()) {
            ArrayList arrayList = new ArrayList();
            int childCount = this.mLayeredConstraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (this.mLayeredConstraintLayout.getChildAt(i) instanceof C1090450eTz) {
                    arrayList.add(this.mLayeredConstraintLayout.getChildAt(i));
                }
            }
            int size = arrayList.size();
            int[] iArr = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = ((View) ListProtector.get(arrayList, i2)).getId();
            }
            C1099860ejA c1099860ejA = new C1099860ejA(this.mLayeredConstraintLayout.getContext());
            LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams = new LayeredConstraintLayout$LayoutParams(0, 0);
            layeredConstraintLayout$LayoutParams.startToStart = 0;
            layeredConstraintLayout$LayoutParams.endToEnd = 0;
            layeredConstraintLayout$LayoutParams.topToTop = 0;
            layeredConstraintLayout$LayoutParams.bottomToBottom = 0;
            layeredConstraintLayout$LayoutParams.setLayer(this.mLayerIndex);
            layeredConstraintLayout$LayoutParams.setOrder(this.mOrdering.requestOrder(this.mLayerIndex));
            c1099860ejA.setReferencedIds(iArr);
            this.mLayeredConstraintLayout.addView(c1099860ejA, layeredConstraintLayout$LayoutParams);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.PropertyResolver
    public void decreaseContentView() {
        this.mContentViewCount--;
    }

    @Override // com.bytedance.ies.sdk.widgets.PropertyResolver
    public void increaseContentView() {
        this.mContentViewCount++;
    }

    public boolean isAllContentViewDetached() {
        return this.mContentViewCount == 0;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        for (ElementSpec elementSpec : this.mElements.values()) {
            if (!elementSpec.getSceneObservers().isEmpty()) {
                ConstraintProperty constraintPropertyById = getConstraintPropertyById(elementSpec.getId());
                for (SceneObserver sceneObserver : elementSpec.getSceneObservers()) {
                    if (constraintPropertyById != null) {
                        sceneObserver.dispose(this.mLayeredElementContext, constraintPropertyById);
                    }
                }
            }
            elementSpec.dispose();
        }
        for (InterfaceC420801kM interfaceC420801kM : this.mDisposables) {
            if (!interfaceC420801kM.isDisposed()) {
                interfaceC420801kM.dispose();
            }
        }
        this.mDisposables.clear();
        if (needReuse()) {
            return;
        }
        this.mAnimationInfoArray.clear();
        this.mChainResolvers.clear();
        this.mSpacingResolvers.clear();
    }

    public void setGroupReferenceIds() {
        int size = this.mGroupElements.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.mGroupElements.keyAt(i);
            Set<Integer> setValueAt = this.mGroupElements.valueAt(i);
            int[] iArr = new int[setValueAt.size()];
            Iterator<Integer> it2 = setValueAt.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                iArr[i2] = it2.next().intValue();
                i2++;
            }
            C1083090eI7 c1083090eI7 = this.mGroups.get(iKeyAt);
            if (c1083090eI7 != null) {
                c1083090eI7.setReferencedIds(iArr);
            }
        }
    }

    public void finishRegistration() {
        reorder();
        resolveGuidelineIfNeeded();
        setGroupReferenceIds();
    }

    public T getLayeredElementContext() {
        return this.mLayeredElementContext;
    }

    public void animateHide(int i) {
        AnimationInfo animationInfo = this.mAnimationInfoArray.get(i);
        if (animationInfo != null) {
            animationInfo.animateHide();
        } else {
            notifyHideAnimationStart(i);
            notifyHideAnimationEnd(i);
        }
    }

    public void animateShow(int i) {
        AnimationInfo animationInfo = this.mAnimationInfoArray.get(i);
        if (animationInfo != null) {
            animationInfo.animateShow();
        } else {
            notifyShowAnimationStart(i);
            notifyShowAnimationEnd(i);
        }
    }

    public void cancelHideAnimation(int i) {
        AnimationInfo animationInfo = this.mAnimationInfoArray.get(i);
        if (animationInfo != null) {
            animationInfo.cancelHideAnimation();
        }
    }

    public void cancelShowAnimation(int i) {
        AnimationInfo animationInfo = this.mAnimationInfoArray.get(i);
        if (animationInfo != null) {
            animationInfo.cancelShowAnimation();
        }
    }

    public void downElement(int i) {
        ConstraintProperty constraintPropertyById = getConstraintPropertyById(i);
        if (constraintPropertyById == null) {
            return;
        }
        constraintPropertyById.layer((constraintPropertyById.layer() - this.mLayerIndex) - 1);
        constraintPropertyById.apply();
        this.mLayeredConstraintLayout.detach(constraintPropertyById.mView);
        this.mLayeredConstraintLayout.attach(constraintPropertyById.mView);
        this.mLayeredConstraintLayout.requestLayout();
        this.mLayeredConstraintLayout.invalidate();
    }

    public ConstraintProperty getConstraintPropertyById(int i) {
        GroupHolderConstraintElement groupHolderConstraintElementLIZLLL = this.mGroupHolderConstraintElements.LIZLLL(i);
        if (groupHolderConstraintElementLIZLLL != null) {
            return groupHolderConstraintElementLIZLLL.getConstraintProperty();
        }
        if (!this.isLocalTest) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("id is null");
                sbLIZ.append(this.mLayeredConstraintLayout.getContext().getResources().getResourceEntryName(i));
                sbLIZ.append(Log.getStackTraceString(new Throwable()));
                LayeredElementConfiguration.reportException("Layer_Get_Null", new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
                return null;
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("mGroupHolderConstraintElements.get(id) is null -- id is");
        sbLIZ2.append(this.mLayeredConstraintLayout.getContext().getResources().getResourceEntryName(i));
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public <E extends ElementSpec> E getElementById(int i) {
        return (E) MapCompat.getOrDefault(this.mElements, Integer.valueOf(i), null);
    }

    public C1083090eI7 getMultiPropertyGroup(int i) {
        return this.mGroups.get(i);
    }

    @Override // com.bytedance.ies.sdk.widgets.PropertyResolver
    public float getResolvedAlpha(int i) {
        GroupHolderConstraintElement groupHolderConstraintElementLIZLLL = this.mGroupHolderConstraintElements.LIZLLL(i);
        float alpha = groupHolderConstraintElementLIZLLL.getConstraintProperty().mAlpha;
        if (this.mDrawOptimization && alpha == 0.0f) {
            return alpha;
        }
        List<C1083090eI7> groups = groupHolderConstraintElementLIZLLL.getGroups();
        if (groups != null && !groups.isEmpty()) {
            Iterator<C1083090eI7> it2 = groups.iterator();
            while (it2.hasNext()) {
                alpha *= it2.next().getAlpha();
            }
        }
        return alpha;
    }

    @Override // com.bytedance.ies.sdk.widgets.PropertyResolver
    public float getResolvedTranslationX(int i) {
        GroupHolderConstraintElement groupHolderConstraintElementLIZLLL = this.mGroupHolderConstraintElements.LIZLLL(i);
        List<C1083090eI7> groups = groupHolderConstraintElementLIZLLL.getGroups();
        float transformedTranslationX = groupHolderConstraintElementLIZLLL.getConstraintProperty().mTranslationX;
        if (groups != null && !groups.isEmpty()) {
            Iterator<C1083090eI7> it2 = groups.iterator();
            while (it2.hasNext()) {
                transformedTranslationX += it2.next().getTransformedTranslationX(groupHolderConstraintElementLIZLLL.getConstraintProperty().mView);
            }
        }
        return transformedTranslationX;
    }

    @Override // com.bytedance.ies.sdk.widgets.PropertyResolver
    public float getResolvedTranslationY(int i) {
        GroupHolderConstraintElement groupHolderConstraintElementLIZLLL = this.mGroupHolderConstraintElements.LIZLLL(i);
        List<C1083090eI7> groups = groupHolderConstraintElementLIZLLL.getGroups();
        float transformedTranslationY = groupHolderConstraintElementLIZLLL.getConstraintProperty().mTranslationY;
        if (groups != null && !groups.isEmpty()) {
            Iterator<C1083090eI7> it2 = groups.iterator();
            while (it2.hasNext()) {
                transformedTranslationY += it2.next().getTransformedTranslationY(groupHolderConstraintElementLIZLLL.getConstraintProperty().mView);
            }
        }
        return transformedTranslationY;
    }

    @Override // com.bytedance.ies.sdk.widgets.PropertyResolver
    public int getResolvedVisibility(int i) {
        GroupHolderConstraintElement groupHolderConstraintElementLIZLLL = this.mGroupHolderConstraintElements.LIZLLL(i);
        int i2 = groupHolderConstraintElementLIZLLL.getConstraintProperty().mVisibility;
        if (this.mDrawOptimization && i2 != 0) {
            return i2;
        }
        List<C1083090eI7> groups = groupHolderConstraintElementLIZLLL.getGroups();
        if (groups != null && !groups.isEmpty()) {
            for (C1083090eI7 c1083090eI7 : groups) {
                if (c1083090eI7.getVisibility() == 8) {
                    return 8;
                }
                if (c1083090eI7.getVisibility() == 4) {
                    i2 = 4;
                }
            }
        }
        return i2;
    }

    public boolean isElementRegistered(int i) {
        if (this.mGroupHolderConstraintElements.LIZLLL(i) != null) {
            return true;
        }
        return false;
    }

    public boolean isWidgetPlaceholderElement(int i) {
        return this.mGroupHolderConstraintElements.LIZLLL(i) instanceof PlaceholderConstraintElement;
    }

    public void logDetachFailedViews(C09JN<String> c09jn) {
        StringBuilder sb = new StringBuilder("Widgets: ");
        for (int i = 0; i < this.mGroupHolderConstraintElements.LJII(); i++) {
            GroupHolderConstraintElement groupHolderConstraintElementLJIIIIZZ = this.mGroupHolderConstraintElements.LJIIIIZZ(i);
            if (groupHolderConstraintElementLJIIIIZZ.checkDetach() && groupHolderConstraintElementLJIIIIZZ.isAttached() && groupHolderConstraintElementLJIIIIZZ.getTag() != null) {
                sb.append(groupHolderConstraintElementLJIIIIZZ.getTag());
                sb.append(", ");
            }
        }
        if (this.mLastAttachedTag != null) {
            sb.append("Last Attached Widget: ");
            sb.append(this.mLastAttachedTag);
        }
        if (this.mLastDetachedTag != null) {
            sb.append(", Last Detached Tag: ");
            sb.append(this.mLastDetachedTag);
        }
        c09jn.accept(sb.toString());
    }

    public void notifyHide(int i) {
        IHiddenChangeObserver iHiddenChangeObserver = this.mHiddenChangeObserver;
        if (iHiddenChangeObserver != null) {
            iHiddenChangeObserver.onHide(i);
        }
    }

    public void notifyHideAnimationEnd(int i) {
        AnimationListener animationListener = this.mAnimationListener;
        if (animationListener != null) {
            animationListener.onHideAnimationEnd(i);
        }
    }

    public void notifyHideAnimationStart(int i) {
        AnimationListener animationListener = this.mAnimationListener;
        if (animationListener != null) {
            animationListener.onHideAnimationStart(i);
        }
    }

    public void notifyShow(int i) {
        IHiddenChangeObserver iHiddenChangeObserver = this.mHiddenChangeObserver;
        if (iHiddenChangeObserver != null) {
            iHiddenChangeObserver.onShow(i);
        }
    }

    public void notifyShowAnimationEnd(int i) {
        AnimationListener animationListener = this.mAnimationListener;
        if (animationListener != null) {
            animationListener.onShowAnimationEnd(i);
        }
    }

    public void notifyShowAnimationStart(int i) {
        AnimationListener animationListener = this.mAnimationListener;
        if (animationListener != null) {
            animationListener.onShowAnimationStart(i);
        }
    }

    public void registerGroup(ElementSpec elementSpec) {
        boolean z;
        View viewFindViewById = this.mLayeredConstraintLayout.findViewById(elementSpec.getId());
        if (viewFindViewById != null) {
            C786410Ut5.LJJLIIIJLJLI(this.mLayeredConstraintLayout, viewFindViewById);
        }
        C1083090eI7 c1083090eI7 = new C1083090eI7(this.mLayeredConstraintLayout.getContext());
        c1083090eI7.setId(elementSpec.getId());
        c1083090eI7.setPropertyResolver(this);
        LiveMultiPropertyGroupSideEnableSetting liveMultiPropertyGroupSideEnableSetting = LiveMultiPropertyGroupSideEnableSetting.INSTANCE;
        T t = this.mLayeredElementContext;
        if (t != null && t.isAnchor()) {
            z = true;
        } else {
            z = false;
        }
        if (liveMultiPropertyGroupSideEnableSetting.enable(z)) {
            c1083090eI7.updateContainer(this.mLayeredConstraintLayout);
            c1083090eI7.setEnableOpt(true);
            this.mLayeredConstraintLayout.addConstraintHelper(c1083090eI7);
        } else {
            this.mLayeredConstraintLayout.addView(c1083090eI7);
        }
        this.mGroups.put(elementSpec.getId(), c1083090eI7);
        LayeredElement layeredElement = new LayeredElement(c1083090eI7, null);
        this.mGroupHolderConstraintElements.LJFF(elementSpec.getId(), layeredElement);
        this.mElements.put(Integer.valueOf(elementSpec.getId()), elementSpec);
        Iterator<SceneObserver> it2 = elementSpec.getSceneObservers().iterator();
        while (it2.hasNext()) {
            addSceneObserver(elementSpec.getId(), it2.next());
        }
        elementSpec.attach(layeredElement.getConstraintProperty());
        if (needReuse()) {
            this.mElementMap.put(Integer.valueOf(elementSpec.getId()), layeredElement);
        }
    }

    public void registerGroups(MultiElementSpec multiElementSpec) {
        if (multiElementSpec != null && !multiElementSpec.getElements().isEmpty()) {
            Iterator<ElementSpec> it2 = multiElementSpec.getElements().iterator();
            while (it2.hasNext()) {
                registerGroup(it2.next());
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void registerLayer(LayerSpec layerSpec) {
        GroupHolderConstraintElement groupHolderConstraintElement;
        XmlViewHolderConstraintElement layeredElement;
        List<ElementSpec> elements = layerSpec.getElements();
        if (elements.isEmpty()) {
            return;
        }
        for (ElementSpec elementSpec : elements) {
            if (this.isLocalTest) {
                C1119470fEn<GroupHolderConstraintElement> c1119470fEn = this.mGroupHolderConstraintElements;
                int id = elementSpec.getId();
                if (c1119470fEn.LL) {
                    C1101530elr.LIZ(c1119470fEn);
                }
                if (C830540Wi4.LIZ(c1119470fEn.LLILZ, id, c1119470fEn.LLILLJJLI) >= 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Duplicate element, ");
                    sbLIZ.append(this.mLayeredElementContext.getContext().getResources().getResourceEntryName(elementSpec.getId()));
                    sbLIZ.append(" already exist.");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            if (elementSpec instanceof PlaceholderElementSpec) {
                int id2 = elementSpec.getId();
                PlaceholderConstraintElement placeholderConstraintElement = new PlaceholderConstraintElement(id2, this.mLayeredConstraintLayout, this);
                int i = this.mLayerIndex;
                placeholderConstraintElement.setLayerInfo(new LayerInfo(i, this.mOrdering.requestOrder(i)));
                this.mGroupHolderConstraintElements.LJFF(id2, placeholderConstraintElement);
                this.mElements.put(Integer.valueOf(id2), elementSpec);
            } else {
                View viewFindViewById = this.mLayeredConstraintLayout.findViewById(elementSpec.getId());
                if (viewFindViewById != null) {
                    LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams = (LayeredConstraintLayout$LayoutParams) viewFindViewById.getLayoutParams();
                    layeredConstraintLayout$LayoutParams.setLayer(this.mLayerIndex);
                    layeredConstraintLayout$LayoutParams.setOrder(this.mOrdering.requestOrder(this.mLayerIndex));
                    C786410Ut5.W5(viewFindViewById, layeredConstraintLayout$LayoutParams);
                    if (viewFindViewById instanceof C1100290ejr) {
                        if (viewFindViewById.getParent() != null && (viewFindViewById.getParent() instanceof C1083340eIW)) {
                            layeredElement = new LayeredPlaceholderElement(viewFindViewById, (C1083340eIW) viewFindViewById.getParent(), this, elementSpec.getConstraintWidget());
                        } else {
                            layeredElement = new LayeredPlaceholderElement(viewFindViewById, this.mLayeredConstraintLayout, this, elementSpec.getConstraintWidget());
                        }
                    } else {
                        layeredElement = new LayeredElement(viewFindViewById, this);
                    }
                    this.mXmlViewHolderConstraintElements.add(layeredElement);
                    this.mGroupHolderConstraintElements.LJFF(elementSpec.getId(), layeredElement);
                    this.mElements.put(Integer.valueOf(elementSpec.getId()), elementSpec);
                    elementSpec.attach(layeredElement.getConstraintProperty());
                    groupHolderConstraintElement = layeredElement;
                } else if (!this.isLocalTest) {
                    LayerInfoHolderElement layerInfoHolderElement = new LayerInfoHolderElement(elementSpec.getId(), this.mLayeredConstraintLayout, this);
                    layerInfoHolderElement.getLayerInfo().setLayer(this.mLayerIndex);
                    layerInfoHolderElement.getLayerInfo().setOrder(this.mOrdering.requestOrder(this.mLayerIndex));
                    this.mGroupHolderConstraintElements.LJFF(elementSpec.getId(), layerInfoHolderElement);
                    this.mElements.put(Integer.valueOf(elementSpec.getId()), elementSpec);
                    groupHolderConstraintElement = layerInfoHolderElement;
                } else {
                    throw new IllegalStateException(C786410Ut5.j4("You mast declare id %s in xml", new Object[]{this.mLayeredConstraintLayout.getContext().getResources().getResourceEntryName(elementSpec.getId())}));
                }
                if (needReuse()) {
                    this.mElementMap.put(Integer.valueOf(elementSpec.getId()), groupHolderConstraintElement);
                }
                register(elementSpec, groupHolderConstraintElement);
            }
        }
        this.mLayerIndex++;
    }

    public void resolveChain(int i) {
        ChainResolver chainResolver = (ChainResolver) MapCompat.getOrDefault(this.mChainResolvers, Integer.valueOf(i), null);
        if (chainResolver != null) {
            int[] ids = chainResolver.getIds();
            ArrayList arrayList = new ArrayList();
            for (int i2 : ids) {
                ConstraintProperty constraintPropertyById = getConstraintPropertyById(i2);
                if (constraintPropertyById != null) {
                    arrayList.add(constraintPropertyById);
                }
            }
            chainResolver.resolveChain(arrayList);
        }
    }

    public void resolveChainNew(int i) {
        this.mLayeredConstraintLayout.resolveChain(i);
    }

    public void resolveSpacing(int i) {
        SpacingResolver spacingResolver = (SpacingResolver) MapCompat.getOrDefault(this.mSpacingResolvers, Integer.valueOf(i), null);
        if (spacingResolver != null) {
            int[] ids = spacingResolver.getIds();
            ArrayList arrayList = new ArrayList();
            for (int i2 : ids) {
                ConstraintProperty constraintPropertyById = getConstraintPropertyById(i2);
                if (constraintPropertyById != null) {
                    arrayList.add(constraintPropertyById);
                }
            }
            spacingResolver.resolveSpacing(arrayList);
        }
    }

    public void resolveSpacingNew(int i) {
        this.mLayeredConstraintLayout.resolveSpace(i);
    }

    public void setAnimationListener(AnimationListener animationListener) {
        this.mAnimationListener = animationListener;
    }

    public void setDrawOptimization(boolean z) {
        this.mDrawOptimization = z;
    }

    public void setHiddenChangeObserver(IHiddenChangeObserver iHiddenChangeObserver) {
        this.mHiddenChangeObserver = iHiddenChangeObserver;
    }

    public void upElement(int i) {
        ConstraintProperty constraintPropertyById = getConstraintPropertyById(i);
        if (constraintPropertyById == null) {
            return;
        }
        constraintPropertyById.layer(constraintPropertyById.layer() + this.mLayerIndex + 1);
        constraintPropertyById.apply();
        this.mLayeredConstraintLayout.detach(constraintPropertyById.mView);
        this.mLayeredConstraintLayout.attach(constraintPropertyById.mView);
        this.mLayeredConstraintLayout.requestLayout();
        this.mLayeredConstraintLayout.invalidate();
    }

    private <O, V extends com.bytedance.ies.sdk.datachannel.NextLiveData<O>> void handleDataChannelSceneObserver(final int i, final DataChannelSceneObserver<O, V> dataChannelSceneObserver) {
        if (dataChannelSceneObserver.isSticky()) {
            this.mDataChannel.EQ2(this.mLifecycleOwner, dataChannelSceneObserver.getType(), new Function1() { // from class: X.0eHx
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.LL.lambda$handleDataChannelSceneObserver$0(i, dataChannelSceneObserver, obj);
                }
            });
        } else {
            this.mDataChannel.BQ2(this.mLifecycleOwner, dataChannelSceneObserver.getType(), new Function1() { // from class: X.0eHy
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.LL.lambda$handleDataChannelSceneObserver$1(i, dataChannelSceneObserver, obj);
                }
            });
        }
    }

    private <V> void handleRxBusSceneObserver(final int i, final RxBusSceneObserver<V> rxBusSceneObserver) {
        this.mDisposables.add(createRxObservable(rxBusSceneObserver.getType()).LJIILIIL(createRxTransformer()).LJJLJLI(new C09JN() { // from class: X.0eHw
            @Override // X.C09JN
            public final void accept(Object obj) {
                this.LL.lambda$handleRxBusSceneObserver$2(i, rxBusSceneObserver, obj);
            }
        }));
    }

    private void handleWidgetHiddenChangedSceneObserver(int i, WidgetHiddenChangedSceneObserver widgetHiddenChangedSceneObserver) {
        int id = widgetHiddenChangedSceneObserver.getId();
        List<WidgetHiddenChangedSceneObserver> linkedList = this.mHiddenChangedObservers.get(id);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.mHiddenChangedObservers.put(id, linkedList);
        }
        linkedList.add(widgetHiddenChangedSceneObserver);
        this.mHiddenChangedObserverElementMap.put(widgetHiddenChangedSceneObserver, Integer.valueOf(i));
    }

    private void notifyAnimationInfo(int i, boolean z) {
        AnimationInfo animationInfo = this.mAnimationInfoArray.get(i);
        if (animationInfo != null) {
            if (z) {
                animationInfo.onHide();
            } else {
                animationInfo.onShow();
            }
        }
    }

    private void register(ElementSpec elementSpec, ConstraintElement constraintElement) {
        Iterator<SceneObserver> it2 = elementSpec.getSceneObservers().iterator();
        while (it2.hasNext()) {
            addSceneObserver(elementSpec.getId(), it2.next());
        }
        if (elementSpec instanceof GroupableElementSpec) {
            Iterator<Integer> it3 = ((GroupableElementSpec) elementSpec).getGroupIds().iterator();
            while (it3.hasNext()) {
                int iIntValue = it3.next().intValue();
                C1083090eI7 c1083090eI7 = this.mGroups.get(iIntValue);
                if (c1083090eI7 != null && (constraintElement instanceof GroupHolderConstraintElement)) {
                    ((GroupHolderConstraintElement) constraintElement).addGroup(c1083090eI7);
                }
                Set<Integer> hashSet = this.mGroupElements.get(iIntValue);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    this.mGroupElements.put(iIntValue, hashSet);
                }
                hashSet.add(Integer.valueOf(elementSpec.getId()));
            }
        }
        if (elementSpec.getAnimation() != null) {
            this.mAnimationInfoArray.put(elementSpec.getId(), elementSpec.getAnimation());
        }
    }

    public void addSceneObserver(int i, SceneObserver sceneObserver) {
        if (sceneObserver instanceof DataChannelSceneObserver) {
            handleDataChannelSceneObserver(i, (DataChannelSceneObserver) sceneObserver);
        } else if (sceneObserver instanceof RxBusSceneObserver) {
            handleRxBusSceneObserver(i, (RxBusSceneObserver) sceneObserver);
        } else {
            if (!(sceneObserver instanceof WidgetHiddenChangedSceneObserver)) {
                return;
            }
            handleWidgetHiddenChangedSceneObserver(i, (WidgetHiddenChangedSceneObserver) sceneObserver);
        }
    }

    public void bindGroup(ElementSpec elementSpec, int i) {
        C1083090eI7 c1083090eI7;
        GroupHolderConstraintElement groupHolderConstraintElementLIZLLL;
        if (!(elementSpec instanceof GroupableElementSpec) || (c1083090eI7 = this.mGroups.get(i)) == null || (groupHolderConstraintElementLIZLLL = this.mGroupHolderConstraintElements.LIZLLL(elementSpec.getId())) == null) {
            return;
        }
        groupHolderConstraintElementLIZLLL.addGroup(c1083090eI7);
        Set<Integer> hashSet = this.mGroupElements.get(i);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.mGroupElements.put(i, hashSet);
        }
        hashSet.add(Integer.valueOf(elementSpec.getId()));
        int[] iArr = new int[hashSet.size()];
        Iterator<Integer> it2 = hashSet.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            iArr[i2] = it2.next().intValue();
            i2++;
        }
        c1083090eI7.setReferencedIds(iArr);
    }

    public boolean detachView(int i, String str) {
        GroupHolderConstraintElement groupHolderConstraintElementLIZLLL = this.mGroupHolderConstraintElements.LIZLLL(i);
        this.mLastDetachedTag = str;
        if (groupHolderConstraintElementLIZLLL instanceof LayeredPlaceholderElement) {
            ((LayeredPlaceholderElement) groupHolderConstraintElementLIZLLL).onDetachView();
            return true;
        }
        if (groupHolderConstraintElementLIZLLL instanceof PlaceholderConstraintElement) {
            ((PlaceholderConstraintElement) groupHolderConstraintElementLIZLLL).onDetachView();
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.PropertyResolver
    public void onHiddenChanged(int i, boolean z) {
        resolveChain(i);
        resolveSpacing(i);
    }

    public void onWidgetHiddenChanged(int i, boolean z) {
        List<WidgetHiddenChangedSceneObserver> list = this.mHiddenChangedObservers.get(i);
        if (list != null && !list.isEmpty()) {
            for (WidgetHiddenChangedSceneObserver widgetHiddenChangedSceneObserver : list) {
                int iIntValue = ((Integer) MapCompat.getOrDefault(this.mHiddenChangedObserverElementMap, widgetHiddenChangedSceneObserver, -1)).intValue();
                if (iIntValue != -1) {
                    widgetHiddenChangedSceneObserver.onHiddenChanged(this.mLayeredElementContext, this.mGroupHolderConstraintElements.LIZLLL(iIntValue).getConstraintProperty(), z);
                }
            }
        }
        notifyAnimationInfo(i, z);
        onHiddenChanged(i, z);
    }

    public void reuse(Fragment fragment, DataChannel dataChannel) {
        this.mLifecycleOwner = fragment;
        this.mDataChannel = dataChannel;
        fragment.getLifecycle().addObserver(this);
        this.mLayeredElementContext.setDataChannel(dataChannel);
        this.mContentViewCount = 0;
        this.mLastAttachedTag = null;
        this.mLastDetachedTag = null;
        for (Integer num : this.mElementMap.keySet()) {
            GroupHolderConstraintElement groupHolderConstraintElement = this.mElementMap.get(num);
            ElementSpec elementSpec = this.mElements.get(num);
            if (groupHolderConstraintElement instanceof XmlViewHolderConstraintElement) {
                View view = ((XmlViewHolderConstraintElement) groupHolderConstraintElement).getView();
                if (view instanceof C1083090eI7) {
                    ((C1083090eI7) view).reset();
                }
                groupHolderConstraintElement.getConstraintProperty().resetView(view);
            }
            if (elementSpec != null) {
                elementSpec.attach(groupHolderConstraintElement.getConstraintProperty());
                for (SceneObserver sceneObserver : elementSpec.getSceneObservers()) {
                    if (!(sceneObserver instanceof WidgetHiddenChangedSceneObserver)) {
                        addSceneObserver(elementSpec.getId(), sceneObserver);
                    }
                }
            }
        }
    }

    public void unbindGroup(ElementSpec elementSpec, int i) {
        C1083090eI7 c1083090eI7;
        GroupHolderConstraintElement groupHolderConstraintElementLIZLLL;
        if (!(elementSpec instanceof GroupableElementSpec) || (c1083090eI7 = this.mGroups.get(i)) == null || (groupHolderConstraintElementLIZLLL = this.mGroupHolderConstraintElements.LIZLLL(elementSpec.getId())) == null) {
            return;
        }
        groupHolderConstraintElementLIZLLL.removeGroup(c1083090eI7);
        Set<Integer> set = this.mGroupElements.get(i);
        if (set == null) {
            return;
        }
        set.remove(Integer.valueOf(elementSpec.getId()));
        int[] iArr = new int[set.size()];
        Iterator<Integer> it2 = set.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            iArr[i2] = it2.next().intValue();
            i2++;
        }
        c1083090eI7.setReferencedIds(iArr);
    }

    public void unregisterGroup(ElementSpec elementSpec, List<ElementSpec> list) {
        boolean z;
        GroupHolderConstraintElement groupHolderConstraintElementLIZLLL;
        if (elementSpec == null) {
            return;
        }
        this.mGroupHolderConstraintElements.LJI(elementSpec.getId());
        this.mElements.remove(Integer.valueOf(elementSpec.getId()));
        if (needReuse()) {
            this.mElementMap.remove(Integer.valueOf(elementSpec.getId()));
        }
        C1083090eI7 c1083090eI7 = this.mGroups.get(elementSpec.getId());
        if (c1083090eI7 == null) {
            return;
        }
        c1083090eI7.reset();
        this.mGroups.remove(elementSpec.getId());
        if (list != null && !list.isEmpty()) {
            for (ElementSpec elementSpec2 : list) {
                if (elementSpec2 != null && (groupHolderConstraintElementLIZLLL = this.mGroupHolderConstraintElements.LIZLLL(elementSpec2.getId())) != null) {
                    groupHolderConstraintElementLIZLLL.removeGroup(c1083090eI7);
                }
            }
        }
        LiveMultiPropertyGroupSideEnableSetting liveMultiPropertyGroupSideEnableSetting = LiveMultiPropertyGroupSideEnableSetting.INSTANCE;
        T t = this.mLayeredElementContext;
        if (t != null && t.isAnchor()) {
            z = true;
        } else {
            z = false;
        }
        if (liveMultiPropertyGroupSideEnableSetting.enable(z)) {
            c1083090eI7.updateContainer(null);
            this.mLayeredConstraintLayout.removeConstraintHelper(c1083090eI7);
        } else {
            C786410Ut5.LJJLIIIJLJLI(this.mLayeredConstraintLayout, c1083090eI7);
        }
    }

    public static class MapCompat {
        public static <K, V> V getOrDefault(Map<K, V> map, K k, V v) {
            V v2 = map.get(k);
            if (v2 != null || map.containsKey(k)) {
                return v2;
            }
            return v;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$handleDataChannelSceneObserver$0(int i, DataChannelSceneObserver dataChannelSceneObserver, Object obj) {
        ConstraintProperty constraintPropertyById = getConstraintPropertyById(i);
        if (constraintPropertyById != null) {
            dataChannelSceneObserver.onEvent(this.mLayeredElementContext, constraintPropertyById, obj);
        }
        return Unit.LIZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$handleDataChannelSceneObserver$1(int i, DataChannelSceneObserver dataChannelSceneObserver, Object obj) {
        ConstraintProperty constraintPropertyById = getConstraintPropertyById(i);
        if (constraintPropertyById != null) {
            dataChannelSceneObserver.onEvent(this.mLayeredElementContext, constraintPropertyById, obj);
        }
        return Unit.LIZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleRxBusSceneObserver$2(int i, RxBusSceneObserver rxBusSceneObserver, Object obj) {
        C1C7U.LIZ("LayeredElementManager@3d84.handleRxBusSceneObserver$1L");
        ConstraintProperty constraintPropertyById = getConstraintPropertyById(i);
        if (constraintPropertyById != null) {
            rxBusSceneObserver.onEvent(this.mLayeredElementContext, constraintPropertyById, obj);
        }
        C1C7U.LIZIZ("LayeredElementManager@3d84.handleRxBusSceneObserver$1L");
    }

    public void attachView(int i, View view, String str) {
        GroupHolderConstraintElement groupHolderConstraintElementLIZLLL = this.mGroupHolderConstraintElements.LIZLLL(i);
        this.mLastAttachedTag = str;
        if (groupHolderConstraintElementLIZLLL instanceof LayeredPlaceholderElement) {
            ((LayeredPlaceholderElement) groupHolderConstraintElementLIZLLL).onAttachView(view, str);
            return;
        }
        if (groupHolderConstraintElementLIZLLL instanceof PlaceholderConstraintElement) {
            PlaceholderConstraintElement placeholderConstraintElement = (PlaceholderConstraintElement) groupHolderConstraintElementLIZLLL;
            placeholderConstraintElement.initConstraintProperty(view);
            PlaceholderElementSpec placeholderElementSpec = (PlaceholderElementSpec) this.mElements.get(Integer.valueOf(i));
            placeholderElementSpec.init(placeholderConstraintElement.getConstraintProperty());
            register(placeholderElementSpec, placeholderConstraintElement);
            placeholderConstraintElement.onAttachView(view);
            return;
        }
        if (!this.isLocalTest) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayeredPlaceholderElement not found, have you registered the layer info for ");
        sbLIZ.append(this.mLayeredElementContext.getContext().getResources().getResourceEntryName(i));
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void registerSpacingResolver(int i, int i2, int... iArr) {
        if (iArr != null && iArr.length != 0) {
            SpacingResolver spacingResolver = new SpacingResolver(this.mLayeredElementContext, i, i2, iArr);
            for (int i3 : iArr) {
                this.mSpacingResolvers.put(Integer.valueOf(i3), spacingResolver);
            }
        }
    }

    public void attachView(int i, View view, C19ME c19me) {
        GroupHolderConstraintElement groupHolderConstraintElementLIZLLL = this.mGroupHolderConstraintElements.LIZLLL(i);
        if (groupHolderConstraintElementLIZLLL instanceof LayerInfoHolderElement) {
            ((LayerInfoHolderElement) groupHolderConstraintElementLIZLLL).onAttachView(view, c19me);
        }
    }

    public LayeredElementManager(Context context, LifecycleOwner lifecycleOwner, C1083340eIW c1083340eIW, DataChannel dataChannel) {
        this.mLifecycleOwner = lifecycleOwner;
        this.mLayeredConstraintLayout = c1083340eIW;
        this.mDataChannel = dataChannel;
        lifecycleOwner.getLifecycle().addObserver(this);
        this.mLayeredElementContext = (T) onCreateLayeredElementContext(context, c1083340eIW, dataChannel);
    }

    public void registerSpacingResolverV2(int i, int i2, int i3, int... iArr) {
        if (iArr != null && iArr.length != 0) {
            this.mLayeredConstraintLayout.addSpaceSolver(i, i2, i3, iArr);
        }
    }

    public void registerHorizontalChain(int i, int i2, int i3, int i4, int... iArr) {
        if (iArr != null && iArr.length != 0) {
            ChainResolver chainResolver = new ChainResolver(i, i2, i3, i4, iArr);
            for (int i5 : iArr) {
                this.mChainResolvers.put(Integer.valueOf(i5), chainResolver);
            }
        }
    }

    public void registerHorizontalChainV2(int i, int i2, int i3, int i4, int... iArr) {
        if (iArr != null && iArr.length != 0) {
            this.mLayeredConstraintLayout.addChainSolver(i3, 0.0f, i4, iArr);
        }
    }
}
