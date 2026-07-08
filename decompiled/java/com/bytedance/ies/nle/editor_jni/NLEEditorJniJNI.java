package com.bytedance.ies.nle.editor_jni;

import com.bytedance.ies.nle.editor_jni.MapStrNLENodeSPtr;
import com.bytedance.ies.nle.editor_jni.MapStrNLENodeSPtrConst;
import com.bytedance.ies.nle.editor_jni.MapStrStr;
import com.bytedance.ies.nle.editor_jni.MapStrSwingKeyFramesPtr;
import com.bytedance.ies.nle.editor_jni.MapStrSwingKeyFramesPtrConst;
import com.bytedance.ies.nle.editor_jni.UnorderedMapStrStr;

/* JADX INFO: loaded from: classes6.dex */
public class NLEEditorJniJNI {
    public static final native void INLEMonitor_change_ownership(INLEMonitor iNLEMonitor, long j, boolean z);

    public static final native void INLEMonitor_director_connect(INLEMonitor iNLEMonitor, long j, boolean z, boolean z2);

    public static final native void INLEMonitor_onEvent(long j, INLEMonitor iNLEMonitor, String str, int i, String str2, long j2);

    public static final native void INLEMonitor_onEventSwigExplicitINLEMonitor(long j, INLEMonitor iNLEMonitor, String str, int i, String str2, long j2);

    public static final native String MapStrNLENodeSPtrConst_Iterator_getKey(long j, MapStrNLENodeSPtrConst.Iterator iterator);

    public static final native long MapStrNLENodeSPtrConst_Iterator_getNextUnchecked(long j, MapStrNLENodeSPtrConst.Iterator iterator);

    public static final native long MapStrNLENodeSPtrConst_Iterator_getValue(long j, MapStrNLENodeSPtrConst.Iterator iterator);

    public static final native boolean MapStrNLENodeSPtrConst_Iterator_isNot(long j, MapStrNLENodeSPtrConst.Iterator iterator, long j2, MapStrNLENodeSPtrConst.Iterator iterator2);

    public static final native void MapStrNLENodeSPtrConst_Iterator_setValue(long j, MapStrNLENodeSPtrConst.Iterator iterator, long j2, NLENode nLENode);

    public static final native long MapStrNLENodeSPtrConst_begin(long j, MapStrNLENodeSPtrConst mapStrNLENodeSPtrConst);

    public static final native void MapStrNLENodeSPtrConst_clear(long j, MapStrNLENodeSPtrConst mapStrNLENodeSPtrConst);

    public static final native boolean MapStrNLENodeSPtrConst_containsImpl(long j, MapStrNLENodeSPtrConst mapStrNLENodeSPtrConst, String str);

    public static final native long MapStrNLENodeSPtrConst_end(long j, MapStrNLENodeSPtrConst mapStrNLENodeSPtrConst);

    public static final native long MapStrNLENodeSPtrConst_find(long j, MapStrNLENodeSPtrConst mapStrNLENodeSPtrConst, String str);

    public static final native boolean MapStrNLENodeSPtrConst_isEmpty(long j, MapStrNLENodeSPtrConst mapStrNLENodeSPtrConst);

    public static final native void MapStrNLENodeSPtrConst_putUnchecked(long j, MapStrNLENodeSPtrConst mapStrNLENodeSPtrConst, String str, long j2, NLENode nLENode);

    public static final native void MapStrNLENodeSPtrConst_removeUnchecked(long j, MapStrNLENodeSPtrConst mapStrNLENodeSPtrConst, long j2, MapStrNLENodeSPtrConst.Iterator iterator);

    public static final native int MapStrNLENodeSPtrConst_sizeImpl(long j, MapStrNLENodeSPtrConst mapStrNLENodeSPtrConst);

    public static final native String MapStrNLENodeSPtr_Iterator_getKey(long j, MapStrNLENodeSPtr.Iterator iterator);

    public static final native long MapStrNLENodeSPtr_Iterator_getNextUnchecked(long j, MapStrNLENodeSPtr.Iterator iterator);

    public static final native long MapStrNLENodeSPtr_Iterator_getValue(long j, MapStrNLENodeSPtr.Iterator iterator);

    public static final native boolean MapStrNLENodeSPtr_Iterator_isNot(long j, MapStrNLENodeSPtr.Iterator iterator, long j2, MapStrNLENodeSPtr.Iterator iterator2);

    public static final native void MapStrNLENodeSPtr_Iterator_setValue(long j, MapStrNLENodeSPtr.Iterator iterator, long j2, NLENode nLENode);

    public static final native long MapStrNLENodeSPtr_begin(long j, MapStrNLENodeSPtr mapStrNLENodeSPtr);

    public static final native void MapStrNLENodeSPtr_clear(long j, MapStrNLENodeSPtr mapStrNLENodeSPtr);

    public static final native boolean MapStrNLENodeSPtr_containsImpl(long j, MapStrNLENodeSPtr mapStrNLENodeSPtr, String str);

    public static final native long MapStrNLENodeSPtr_end(long j, MapStrNLENodeSPtr mapStrNLENodeSPtr);

    public static final native long MapStrNLENodeSPtr_find(long j, MapStrNLENodeSPtr mapStrNLENodeSPtr, String str);

    public static final native boolean MapStrNLENodeSPtr_isEmpty(long j, MapStrNLENodeSPtr mapStrNLENodeSPtr);

    public static final native void MapStrNLENodeSPtr_putUnchecked(long j, MapStrNLENodeSPtr mapStrNLENodeSPtr, String str, long j2, NLENode nLENode);

    public static final native void MapStrNLENodeSPtr_removeUnchecked(long j, MapStrNLENodeSPtr mapStrNLENodeSPtr, long j2, MapStrNLENodeSPtr.Iterator iterator);

    public static final native int MapStrNLENodeSPtr_sizeImpl(long j, MapStrNLENodeSPtr mapStrNLENodeSPtr);

    public static final native String MapStrStr_Iterator_getKey(long j, MapStrStr.Iterator iterator);

    public static final native long MapStrStr_Iterator_getNextUnchecked(long j, MapStrStr.Iterator iterator);

    public static final native String MapStrStr_Iterator_getValue(long j, MapStrStr.Iterator iterator);

    public static final native boolean MapStrStr_Iterator_isNot(long j, MapStrStr.Iterator iterator, long j2, MapStrStr.Iterator iterator2);

    public static final native void MapStrStr_Iterator_setValue(long j, MapStrStr.Iterator iterator, String str);

    public static final native long MapStrStr_begin(long j, MapStrStr mapStrStr);

    public static final native void MapStrStr_clear(long j, MapStrStr mapStrStr);

    public static final native boolean MapStrStr_containsImpl(long j, MapStrStr mapStrStr, String str);

    public static final native long MapStrStr_end(long j, MapStrStr mapStrStr);

    public static final native long MapStrStr_find(long j, MapStrStr mapStrStr, String str);

    public static final native boolean MapStrStr_isEmpty(long j, MapStrStr mapStrStr);

    public static final native void MapStrStr_putUnchecked(long j, MapStrStr mapStrStr, String str, String str2);

    public static final native void MapStrStr_removeUnchecked(long j, MapStrStr mapStrStr, long j2, MapStrStr.Iterator iterator);

    public static final native int MapStrStr_sizeImpl(long j, MapStrStr mapStrStr);

    public static final native String MapStrSwingKeyFramesPtrConst_Iterator_getKey(long j, MapStrSwingKeyFramesPtrConst.Iterator iterator);

    public static final native long MapStrSwingKeyFramesPtrConst_Iterator_getNextUnchecked(long j, MapStrSwingKeyFramesPtrConst.Iterator iterator);

    public static final native long MapStrSwingKeyFramesPtrConst_Iterator_getValue(long j, MapStrSwingKeyFramesPtrConst.Iterator iterator);

    public static final native boolean MapStrSwingKeyFramesPtrConst_Iterator_isNot(long j, MapStrSwingKeyFramesPtrConst.Iterator iterator, long j2, MapStrSwingKeyFramesPtrConst.Iterator iterator2);

    public static final native void MapStrSwingKeyFramesPtrConst_Iterator_setValue(long j, MapStrSwingKeyFramesPtrConst.Iterator iterator, long j2, NLEKeyframe nLEKeyframe);

    public static final native long MapStrSwingKeyFramesPtrConst_begin(long j, MapStrSwingKeyFramesPtrConst mapStrSwingKeyFramesPtrConst);

    public static final native void MapStrSwingKeyFramesPtrConst_clear(long j, MapStrSwingKeyFramesPtrConst mapStrSwingKeyFramesPtrConst);

    public static final native boolean MapStrSwingKeyFramesPtrConst_containsImpl(long j, MapStrSwingKeyFramesPtrConst mapStrSwingKeyFramesPtrConst, String str);

    public static final native long MapStrSwingKeyFramesPtrConst_end(long j, MapStrSwingKeyFramesPtrConst mapStrSwingKeyFramesPtrConst);

    public static final native long MapStrSwingKeyFramesPtrConst_find(long j, MapStrSwingKeyFramesPtrConst mapStrSwingKeyFramesPtrConst, String str);

    public static final native boolean MapStrSwingKeyFramesPtrConst_isEmpty(long j, MapStrSwingKeyFramesPtrConst mapStrSwingKeyFramesPtrConst);

    public static final native void MapStrSwingKeyFramesPtrConst_putUnchecked(long j, MapStrSwingKeyFramesPtrConst mapStrSwingKeyFramesPtrConst, String str, long j2, NLEKeyframe nLEKeyframe);

    public static final native void MapStrSwingKeyFramesPtrConst_removeUnchecked(long j, MapStrSwingKeyFramesPtrConst mapStrSwingKeyFramesPtrConst, long j2, MapStrSwingKeyFramesPtrConst.Iterator iterator);

    public static final native int MapStrSwingKeyFramesPtrConst_sizeImpl(long j, MapStrSwingKeyFramesPtrConst mapStrSwingKeyFramesPtrConst);

    public static final native String MapStrSwingKeyFramesPtr_Iterator_getKey(long j, MapStrSwingKeyFramesPtr.Iterator iterator);

    public static final native long MapStrSwingKeyFramesPtr_Iterator_getNextUnchecked(long j, MapStrSwingKeyFramesPtr.Iterator iterator);

    public static final native long MapStrSwingKeyFramesPtr_Iterator_getValue(long j, MapStrSwingKeyFramesPtr.Iterator iterator);

    public static final native boolean MapStrSwingKeyFramesPtr_Iterator_isNot(long j, MapStrSwingKeyFramesPtr.Iterator iterator, long j2, MapStrSwingKeyFramesPtr.Iterator iterator2);

    public static final native void MapStrSwingKeyFramesPtr_Iterator_setValue(long j, MapStrSwingKeyFramesPtr.Iterator iterator, long j2, NLEKeyframe nLEKeyframe);

    public static final native long MapStrSwingKeyFramesPtr_begin(long j, MapStrSwingKeyFramesPtr mapStrSwingKeyFramesPtr);

    public static final native void MapStrSwingKeyFramesPtr_clear(long j, MapStrSwingKeyFramesPtr mapStrSwingKeyFramesPtr);

    public static final native boolean MapStrSwingKeyFramesPtr_containsImpl(long j, MapStrSwingKeyFramesPtr mapStrSwingKeyFramesPtr, String str);

    public static final native long MapStrSwingKeyFramesPtr_end(long j, MapStrSwingKeyFramesPtr mapStrSwingKeyFramesPtr);

    public static final native long MapStrSwingKeyFramesPtr_find(long j, MapStrSwingKeyFramesPtr mapStrSwingKeyFramesPtr, String str);

    public static final native boolean MapStrSwingKeyFramesPtr_isEmpty(long j, MapStrSwingKeyFramesPtr mapStrSwingKeyFramesPtr);

    public static final native void MapStrSwingKeyFramesPtr_putUnchecked(long j, MapStrSwingKeyFramesPtr mapStrSwingKeyFramesPtr, String str, long j2, NLEKeyframe nLEKeyframe);

    public static final native void MapStrSwingKeyFramesPtr_removeUnchecked(long j, MapStrSwingKeyFramesPtr mapStrSwingKeyFramesPtr, long j2, MapStrSwingKeyFramesPtr.Iterator iterator);

    public static final native int MapStrSwingKeyFramesPtr_sizeImpl(long j, MapStrSwingKeyFramesPtr mapStrSwingKeyFramesPtr);

    public static final native long NLEAIMatting_SWIGSmartPtrUpcast(long j);

    public static final native long NLEAIMatting_clone(long j, NLEAIMatting nLEAIMatting);

    public static final native long NLEAIMatting_dynamicCast(long j, NLENode nLENode);

    public static final native long NLEAIMatting_getSegment(long j, NLEAIMatting nLEAIMatting);

    public static final native void NLEAIMatting_setSegment(long j, NLEAIMatting nLEAIMatting, long j2, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native String NLEAlphaSplitTypeToString(int i);

    public static final native long NLEAutoFillFrame_SWIGSmartPtrUpcast(long j);

    public static final native long NLEAutoFillFrame_clone(long j, NLEAutoFillFrame nLEAutoFillFrame);

    public static final native long NLEAutoFillFrame_dynamicCast(long j, NLENode nLENode);

    public static final native long NLEAutoFillFrame_getSegment(long j, NLEAutoFillFrame nLEAutoFillFrame);

    public static final native void NLEAutoFillFrame_setSegment(long j, NLEAutoFillFrame nLEAutoFillFrame, long j2, NLESegmentAutoFillFrame nLESegmentAutoFillFrame);

    public static final native String NLEBase64ResourceProtocol_KEY_BASE64();

    public static final native String NLEBase64ResourceProtocol_PLATFORM_STRING();

    public static final native long NLEBase64ResourceProtocol_SWIGSmartPtrUpcast(long j);

    public static final native long NLEBase64ResourceProtocol_getParameters(long j, NLEBase64ResourceProtocol nLEBase64ResourceProtocol);

    public static final native String NLEBase64ResourceProtocol_getSourceFrom(long j, NLEBase64ResourceProtocol nLEBase64ResourceProtocol);

    public static final native boolean NLEBase64ResourceProtocol_isBase64Resource(String str);

    public static final native long NLEBezierCurvesPoint_SWIGSmartPtrUpcast(long j);

    public static final native long NLEBezierCurvesPoint_clone(long j, NLEBezierCurvesPoint nLEBezierCurvesPoint);

    public static final native long NLEBezierCurvesPoint_dynamicCast(long j, NLENode nLENode);

    public static final native long NLEBezierCurvesPoint_getAnchor(long j, NLEBezierCurvesPoint nLEBezierCurvesPoint);

    public static final native long NLEBezierCurvesPoint_getLeftControl(long j, NLEBezierCurvesPoint nLEBezierCurvesPoint);

    public static final native long NLEBezierCurvesPoint_getRightControl(long j, NLEBezierCurvesPoint nLEBezierCurvesPoint);

    public static final native void NLEBezierCurvesPoint_setAnchor(long j, NLEBezierCurvesPoint nLEBezierCurvesPoint, long j2, NLEPoint nLEPoint);

    public static final native void NLEBezierCurvesPoint_setLeftControl(long j, NLEBezierCurvesPoint nLEBezierCurvesPoint, long j2, NLEPoint nLEPoint);

    public static final native void NLEBezierCurvesPoint_setRightControl(long j, NLEBezierCurvesPoint nLEBezierCurvesPoint, long j2, NLEPoint nLEPoint);

    public static final native long NLEBezierCurvesPoint_toEffectPoints(long j, VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint);

    public static final native void NLEBranchListener_change_ownership(NLEBranchListener nLEBranchListener, long j, boolean z);

    public static final native void NLEBranchListener_director_connect(NLEBranchListener nLEBranchListener, long j, boolean z, boolean z2);

    public static final native void NLEBranchListener_onChanged(long j, NLEBranchListener nLEBranchListener);

    public static final native void NLEBranch_addCommit(long j, NLEBranch nLEBranch, long j2, NLECommit nLECommit);

    public static final native void NLEBranch_clear(long j, NLEBranch nLEBranch);

    public static final native void NLEBranch_collectResources(long j, NLEBranch nLEBranch, long j2, VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr);

    public static final native long NLEBranch_getCommits(long j, NLEBranch nLEBranch);

    public static final native long NLEBranch_getHead(long j, NLEBranch nLEBranch);

    public static final native long NLEBranch_getHeadNext(long j, NLEBranch nLEBranch);

    public static final native long NLEBranch_getHeadPrev(long j, NLEBranch nLEBranch);

    public static final native long NLEBranch_getListener(long j, NLEBranch nLEBranch);

    public static final native long NLEBranch_goTo(long j, NLEBranch nLEBranch, String str);

    public static final native long NLEBranch_resetToNext__SWIG_0(long j, NLEBranch nLEBranch, int i);

    public static final native long NLEBranch_resetToNext__SWIG_1(long j, NLEBranch nLEBranch);

    public static final native long NLEBranch_resetToPrev__SWIG_0(long j, NLEBranch nLEBranch, int i);

    public static final native long NLEBranch_resetToPrev__SWIG_1(long j, NLEBranch nLEBranch);

    public static final native void NLEBranch_setListener(long j, NLEBranch nLEBranch, long j2, NLEBranchListener nLEBranchListener);

    public static final native void NLEBranch_trim(long j, NLEBranch nLEBranch, long j2, long j3);

    public static final native boolean NLEBranch_trimRange__SWIG_0(long j, NLEBranch nLEBranch, String str, String str2);

    public static final native boolean NLEBranch_trimRange__SWIG_1(long j, NLEBranch nLEBranch, String str, String str2, boolean z);

    public static final native void NLEChangeListener_change_ownership(NLEChangeListener nLEChangeListener, long j, boolean z);

    public static final native void NLEChangeListener_director_connect(NLEChangeListener nLEChangeListener, long j, boolean z, boolean z2);

    public static final native void NLEChangeListener_onChanged(long j, NLEChangeListener nLEChangeListener);

    public static final native long NLEChromaChannel_SWIGSmartPtrUpcast(long j);

    public static final native long NLEChromaChannel_clone(long j, NLEChromaChannel nLEChromaChannel);

    public static final native long NLEChromaChannel_dynamicCast(long j, NLENode nLENode);

    public static final native long NLEChromaChannel_getSegment(long j, NLEChromaChannel nLEChromaChannel);

    public static final native void NLEChromaChannel_setSegment(long j, NLEChromaChannel nLEChromaChannel, long j2, NLESegmentChromaChannel nLESegmentChromaChannel);

    public static final native long NLECommit_SWIGSmartPtrUpcast(long j);

    public static final native long NLECommit_clone(long j, NLECommit nLECommit);

    public static final native long NLECommit_dynamicCast(long j, NLENode nLENode);

    public static final native String NLECommit_getDescription(long j, NLECommit nLECommit);

    public static final native long NLECommit_getModel(long j, NLECommit nLECommit);

    public static final native long NLECommit_getTimeStamp(long j, NLECommit nLECommit);

    public static final native long NLECommit_getVersion(long j, NLECommit nLECommit);

    public static final native boolean NLECommit_hasDescription(long j, NLECommit nLECommit);

    public static final native boolean NLECommit_hasTimeStamp(long j, NLECommit nLECommit);

    public static final native boolean NLECommit_hasVersion(long j, NLECommit nLECommit);

    public static final native void NLECommit_setDescription(long j, NLECommit nLECommit, String str);

    public static final native void NLECommit_setModel(long j, NLECommit nLECommit, long j2, NLEModel nLEModel);

    public static final native void NLECommit_setTimeStamp(long j, NLECommit nLECommit, long j2);

    public static final native void NLECommit_setVersion(long j, NLECommit nLECommit, long j2);

    public static final native long NLECommonKeyframe_SWIGSmartPtrUpcast(long j);

    public static final native long NLECommonKeyframe_clone(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native long NLECommonKeyframe_dynamicCast(long j, NLENode nLENode);

    public static final native int NLECommonKeyframe_getGraphType(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native long NLECommonKeyframe_getLeftControl(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native long NLECommonKeyframe_getLeftControlTime(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native long NLECommonKeyframe_getLeftControlValue(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native long NLECommonKeyframe_getRightControl(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native long NLECommonKeyframe_getRightControlTime(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native long NLECommonKeyframe_getRightControlValue(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native long NLECommonKeyframe_getTimeOffset(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native long NLECommonKeyframe_getValue(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native boolean NLECommonKeyframe_hasGraphType(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native boolean NLECommonKeyframe_hasLeftControlTime(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native boolean NLECommonKeyframe_hasLeftControlValue(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native boolean NLECommonKeyframe_hasRightControlTime(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native boolean NLECommonKeyframe_hasRightControlValue(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native boolean NLECommonKeyframe_hasTimeOffset(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native boolean NLECommonKeyframe_hasValue(long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native void NLECommonKeyframe_setGraphType(long j, NLECommonKeyframe nLECommonKeyframe, int i);

    public static final native void NLECommonKeyframe_setKeyframeValue(long j, NLECommonKeyframe nLECommonKeyframe, double d);

    public static final native void NLECommonKeyframe_setLeftControl(long j, NLECommonKeyframe nLECommonKeyframe, long j2, NLETimePointPair nLETimePointPair);

    public static final native void NLECommonKeyframe_setLeftControlTime(long j, NLECommonKeyframe nLECommonKeyframe, long j2);

    public static final native void NLECommonKeyframe_setLeftControlValue(long j, NLECommonKeyframe nLECommonKeyframe, long j2, VecDouble vecDouble);

    public static final native void NLECommonKeyframe_setRightControl(long j, NLECommonKeyframe nLECommonKeyframe, long j2, NLETimePointPair nLETimePointPair);

    public static final native void NLECommonKeyframe_setRightControlTime(long j, NLECommonKeyframe nLECommonKeyframe, long j2);

    public static final native void NLECommonKeyframe_setRightControlValue(long j, NLECommonKeyframe nLECommonKeyframe, long j2, VecDouble vecDouble);

    public static final native void NLECommonKeyframe_setTimeOffset(long j, NLECommonKeyframe nLECommonKeyframe, long j2);

    public static final native void NLECommonKeyframe_setValue(long j, NLECommonKeyframe nLECommonKeyframe, long j2, VecDouble vecDouble);

    public static final native long NLECurveActionBeam_SWIGSmartPtrUpcast(long j);

    public static final native long NLECurveActionBeam_clone(long j, NLECurveActionBeam nLECurveActionBeam);

    public static final native long NLECurveActionBeam_dynamicCast(long j, NLENode nLENode);

    public static final native long NLECurveActionBeam_getCycleTime(long j, NLECurveActionBeam nLECurveActionBeam);

    public static final native boolean NLECurveActionBeam_hasCycleTime(long j, NLECurveActionBeam nLECurveActionBeam);

    public static final native void NLECurveActionBeam_setCycleTime(long j, NLECurveActionBeam nLECurveActionBeam, long j2);

    public static final native long NLECurveSpeedCalculator_calculateCubePoint(float f, long j, NLEPoint nLEPoint, long j2, NLEPoint nLEPoint2, long j3, NLEPoint nLEPoint3, long j4, NLEPoint nLEPoint4);

    public static final native long NLECurveSpeedCalculator_generateBezierPathLookupTable(long j, VecNLEPointSPtr vecNLEPointSPtr);

    public static final native long NLECurveSpeedCalculator_generateThirdBezierPathPoints(long j, VecNLEPointSPtr vecNLEPointSPtr);

    public static final native double NLECurveSpeedCalculator_getAveCurveSpeedRatio(long j, NLECurveSpeedCalculator nLECurveSpeedCalculator);

    public static final native long NLECurveSpeedCalculator_getBezierPoint(long j, NLEPoint nLEPoint, long j2, NLEPoint nLEPoint2, long j3, long j4);

    public static final native double NLECurveSpeedCalculator_getSpeedRatioBySeqDelta(long j, NLECurveSpeedCalculator nLECurveSpeedCalculator, long j2);

    public static final native long NLECurveSpeedCalculator_recursiveCalculateCubePoint(long j, VecNLEPointSPtr vecNLEPointSPtr, float f);

    public static final native long NLECurveSpeedCalculator_segmentDelToSequenceDel(long j, NLECurveSpeedCalculator nLECurveSpeedCalculator, long j2);

    public static final native long NLECurveSpeedCalculator_segmentPToSequenceP(long j, VecNLEPointSPtr vecNLEPointSPtr);

    public static final native long NLECurveSpeedCalculator_sequenceDelToSegmentDel(long j, NLECurveSpeedCalculator nLECurveSpeedCalculator, long j2);

    public static final native void NLECurveSpeedCalculator_setRepeatDuration(long j, NLECurveSpeedCalculator nLECurveSpeedCalculator, long j2);

    public static final native void NLECurveSpeedCalculator_setSeqDuration(long j, NLECurveSpeedCalculator nLECurveSpeedCalculator, long j2);

    public static final native long NLECurveSpeedCalculator_splitCurvePoints(long j, VecNLEPointSPtr vecNLEPointSPtr, long j2, long j3);

    public static final native long NLECustomMattingParam_SWIGSmartPtrUpcast(long j);

    public static final native long NLECustomMattingParam_clone(long j, NLECustomMattingParam nLECustomMattingParam);

    public static final native long NLECustomMattingParam_dynamicCast(long j, NLENode nLENode);

    public static final native String NLECustomMattingParam_getCustomPath(long j, NLECustomMattingParam nLECustomMattingParam);

    public static final native long NLECustomMattingParam_getRestoreMaskPts(long j, NLECustomMattingParam nLECustomMattingParam);

    public static final native boolean NLECustomMattingParam_getReverseTracking(long j, NLECustomMattingParam nLECustomMattingParam);

    public static final native boolean NLECustomMattingParam_hasCustomPath(long j, NLECustomMattingParam nLECustomMattingParam);

    public static final native boolean NLECustomMattingParam_hasRestoreMaskPts(long j, NLECustomMattingParam nLECustomMattingParam);

    public static final native boolean NLECustomMattingParam_hasReverseTracking(long j, NLECustomMattingParam nLECustomMattingParam);

    public static final native void NLECustomMattingParam_setCustomPath(long j, NLECustomMattingParam nLECustomMattingParam, String str);

    public static final native void NLECustomMattingParam_setRestoreMaskPts(long j, NLECustomMattingParam nLECustomMattingParam, long j2);

    public static final native void NLECustomMattingParam_setReverseTracking(long j, NLECustomMattingParam nLECustomMattingParam, boolean z);

    public static final native void NLEEditorListener_change_ownership(NLEEditorListener nLEEditorListener, long j, boolean z);

    public static final native void NLEEditorListener_director_connect(NLEEditorListener nLEEditorListener, long j, boolean z, boolean z2);

    public static final native void NLEEditorListener_onChanged(long j, NLEEditorListener nLEEditorListener);

    public static final native void NLEEditor_addConsumer(long j, NLEEditor nLEEditor, long j2, NLEEditorListener nLEEditorListener);

    public static final native boolean NLEEditor_canRedo(long j, NLEEditor nLEEditor);

    public static final native boolean NLEEditor_canUndo(long j, NLEEditor nLEEditor);

    public static final native boolean NLEEditor_commit(long j, NLEEditor nLEEditor);

    public static final native boolean NLEEditor_done__SWIG_0(long j, NLEEditor nLEEditor, String str);

    public static final native boolean NLEEditor_done__SWIG_1(long j, NLEEditor nLEEditor);

    public static final native int NLEEditor_exportEditor(long j, NLEEditor nLEEditor, String str);

    public static final native long NLEEditor_getAllResources(long j, NLEEditor nLEEditor);

    public static final native long NLEEditor_getBranch(long j, NLEEditor nLEEditor);

    public static final native long NLEEditor_getBranchListener(long j, NLEEditor nLEEditor);

    public static final native long NLEEditor_getConsumer(long j, NLEEditor nLEEditor);

    public static final native String NLEEditor_getGlobalExtra(long j, NLEEditor nLEEditor, String str);

    public static final native long NLEEditor_getListener(long j, NLEEditor nLEEditor);

    public static final native long NLEEditor_getModel(long j, NLEEditor nLEEditor);

    public static final native long NLEEditor_getStageModel(long j, NLEEditor nLEEditor);

    public static final native boolean NLEEditor_goTo(long j, NLEEditor nLEEditor, String str);

    public static final native int NLEEditor_importEditor(long j, NLEEditor nLEEditor, String str);

    public static final native boolean NLEEditor_redo__SWIG_0(long j, NLEEditor nLEEditor, int i);

    public static final native boolean NLEEditor_redo__SWIG_1(long j, NLEEditor nLEEditor);

    public static final native void NLEEditor_removeConsumer(long j, NLEEditor nLEEditor, long j2, NLEEditorListener nLEEditorListener);

    public static final native boolean NLEEditor_resetHead(long j, NLEEditor nLEEditor);

    public static final native int NLEEditor_restore(long j, NLEEditor nLEEditor, String str);

    public static final native void NLEEditor_setBranchListener(long j, NLEEditor nLEEditor, long j2, NLEBranchListener nLEBranchListener);

    public static final native void NLEEditor_setGlobalExtra(long j, NLEEditor nLEEditor, String str, String str2);

    public static final native void NLEEditor_setListener(long j, NLEEditor nLEEditor, long j2, NLEEditorListener nLEEditorListener);

    public static final native void NLEEditor_setMeasureOption(long j, NLEEditor nLEEditor, boolean z);

    public static final native void NLEEditor_setModel(long j, NLEEditor nLEEditor, long j2, NLEModel nLEModel);

    public static final native String NLEEditor_store(long j, NLEEditor nLEEditor);

    public static final native String NLEEditor_storeWithoutLock(long j, NLEEditor nLEEditor);

    public static final native void NLEEditor_trim(long j, NLEEditor nLEEditor, long j2, long j3);

    public static final native boolean NLEEditor_trimRange__SWIG_0(long j, NLEEditor nLEEditor, String str, String str2);

    public static final native boolean NLEEditor_trimRange__SWIG_1(long j, NLEEditor nLEEditor, String str, String str2, boolean z);

    public static final native boolean NLEEditor_undo__SWIG_0(long j, NLEEditor nLEEditor, int i);

    public static final native boolean NLEEditor_undo__SWIG_1(long j, NLEEditor nLEEditor);

    public static final native void NLEEditor_updateRenderLayers(long j, NLEEditor nLEEditor, long j2, NLEModel nLEModel);

    public static final native String NLEEverPhotoResourceProtocol_KEY_EXTENSION();

    public static final native String NLEEverPhotoResourceProtocol_KEY_MD5();

    public static final native String NLEEverPhotoResourceProtocol_KEY_SIZE();

    public static final native String NLEEverPhotoResourceProtocol_PLATFORM_STRING();

    public static final native long NLEEverPhotoResourceProtocol_SWIGSmartPtrUpcast(long j);

    public static final native long NLEEverPhotoResourceProtocol_getParameters(long j, NLEEverPhotoResourceProtocol nLEEverPhotoResourceProtocol);

    public static final native String NLEEverPhotoResourceProtocol_getSourceFrom(long j, NLEEverPhotoResourceProtocol nLEEverPhotoResourceProtocol);

    public static final native boolean NLEEverPhotoResourceProtocol_isEverPhotoResource(String str);

    public static final native String NLEFilterName_getAI_MATTING();

    public static final native String NLEFilterName_getAUDIO_COMMON_FILTER();

    public static final native String NLEFilterName_getAUDIO_DSP_FILTER();

    public static final native String NLEFilterName_getAUDIO_EFFECT_ADJUST();

    public static final native String NLEFilterName_getAUDIO_FADE_FILTER();

    public static final native String NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER();

    public static final native String NLEFilterName_getAUDIO_MATRIX_FILTER();

    public static final native String NLEFilterName_getAUDIO_SAMI_FILTER();

    public static final native String NLEFilterName_getAUDIO_VOICE_BEAUTIFY_FILTER();

    public static final native String NLEFilterName_getAUDIO_VOLUME_FILTER();

    public static final native String NLEFilterName_getBEAUTFY_FILTER();

    public static final native String NLEFilterName_getBEAUTY();

    public static final native String NLEFilterName_getBRIGHTNESS();

    public static final native String NLEFilterName_getCOLOR_CURVES();

    public static final native String NLEFilterName_getCOMMON();

    public static final native String NLEFilterName_getCONTRACT();

    public static final native String NLEFilterName_getEFFECT_STICKER();

    public static final native String NLEFilterName_getFADE();

    public static final native String NLEFilterName_getFIGURE_SLIM();

    public static final native String NLEFilterName_getFIGURE_STRETCH();

    public static final native String NLEFilterName_getFIGURE_ZOOM();

    public static final native String NLEFilterName_getHDR();

    public static final native String NLEFilterName_getHIGHLIGHT();

    public static final native String NLEFilterName_getHSL();

    public static final native String NLEFilterName_getLENS_HDR();

    public static final native String NLEFilterName_getLIGHT_SENSATION();

    public static final native String NLEFilterName_getLOG_COLOR_WHEELS();

    public static final native String NLEFilterName_getLUT();

    public static final native String NLEFilterName_getPARTICLE();

    public static final native String NLEFilterName_getPRIMARY_COLOR_WHEELS();

    public static final native String NLEFilterName_getRESHAPE();

    public static final native String NLEFilterName_getSATURATION();

    public static final native String NLEFilterName_getSHADOW();

    public static final native String NLEFilterName_getSHARPEN();

    public static final native String NLEFilterName_getTEMPERATURE();

    public static final native String NLEFilterName_getTONE();

    public static final native String NLEFilterName_getVIDEO_EFFECT();

    public static final native String NLEFilterName_getVIDEO_LENS_HDR();

    public static final native String NLEFilterName_getVIGNETTING();

    public static final native long NLEFilter_SWIGSmartPtrUpcast(long j);

    public static final native long NLEFilter_clone(long j, NLEFilter nLEFilter);

    public static final native long NLEFilter_dynamicCast(long j, NLENode nLENode);

    public static final native long NLEFilter_getSegment(long j, NLEFilter nLEFilter);

    public static final native void NLEFilter_setSegment(long j, NLEFilter nLEFilter, long j2, NLESegmentFilter nLESegmentFilter);

    public static final native boolean NLEGlobalABConfig_enableLockStore_get(long j, NLEGlobalABConfig nLEGlobalABConfig);

    public static final native void NLEGlobalABConfig_enableLockStore_set(long j, NLEGlobalABConfig nLEGlobalABConfig, boolean z);

    public static final native long NLEGlobalABConfig_getInstance();

    public static final native String NLEInstantMode_InstantStickerRemove_get();

    public static final native String NLEInstantMode_InstantStickerScale_get();

    public static final native String NLEInstantMode_InstantStickerTransform_get();

    public static final native String NLEInstantMode_Key_get();

    public static final native String NLEInstantMode_PivotalStickerUUID_get();

    public static final native long NLEInteractivePenParam_SWIGSmartPtrUpcast(long j);

    public static final native long NLEInteractivePenParam_clone(long j, NLEInteractivePenParam nLEInteractivePenParam);

    public static final native long NLEInteractivePenParam_dynamicCast(long j, NLENode nLENode);

    public static final native long NLEInteractivePenParam_getBrushData(long j, NLEInteractivePenParam nLEInteractivePenParam);

    public static final native int NLEInteractivePenParam_getPenType(long j, NLEInteractivePenParam nLEInteractivePenParam);

    public static final native float NLEInteractivePenParam_getThickness(long j, NLEInteractivePenParam nLEInteractivePenParam);

    public static final native boolean NLEInteractivePenParam_hasBrushData(long j, NLEInteractivePenParam nLEInteractivePenParam);

    public static final native boolean NLEInteractivePenParam_hasPenType(long j, NLEInteractivePenParam nLEInteractivePenParam);

    public static final native boolean NLEInteractivePenParam_hasThickness(long j, NLEInteractivePenParam nLEInteractivePenParam);

    public static final native void NLEInteractivePenParam_setBrushData(long j, NLEInteractivePenParam nLEInteractivePenParam, long j2, VecFloat vecFloat);

    public static final native void NLEInteractivePenParam_setPenType(long j, NLEInteractivePenParam nLEInteractivePenParam, int i);

    public static final native void NLEInteractivePenParam_setThickness(long j, NLEInteractivePenParam nLEInteractivePenParam, float f);

    public static final native String NLEKeyFrameTransientExtrakey_getChromaChannelIntensity();

    public static final native String NLEKeyFrameTransientExtrakey_getChromaChannelShadow();

    public static final native String NLEKeyFrameTransientExtrakey_getFilterIntensity();

    public static final native String NLEKeyFrameTransientExtrakey_getMaskCenterX();

    public static final native String NLEKeyFrameTransientExtrakey_getMaskCenterY();

    public static final native String NLEKeyFrameTransientExtrakey_getMaskHeight();

    public static final native String NLEKeyFrameTransientExtrakey_getMaskRotation();

    public static final native String NLEKeyFrameTransientExtrakey_getMaskRoundCorner();

    public static final native String NLEKeyFrameTransientExtrakey_getMaskWidth();

    public static final native String NLEKeyFrameTransientExtrakey_getMaskfeather();

    public static final native String NLEKeyFrameTransientExtrakey_getSlotAlpha();

    public static final native String NLEKeyFrameTransientExtrakey_getSlotRotation();

    public static final native String NLEKeyFrameTransientExtrakey_getSlotScale();

    public static final native String NLEKeyFrameTransientExtrakey_getSlotVolume();

    public static final native String NLEKeyFrameTransientExtrakey_getSlotX();

    public static final native String NLEKeyFrameTransientExtrakey_getSlotY();

    public static final native String NLEKeyFrameTransientExtrakey_getTextBackgroundColor();

    public static final native String NLEKeyFrameTransientExtrakey_getTextColor();

    public static final native String NLEKeyFrameTransientExtrakey_getTextOutlineColor();

    public static final native String NLEKeyFrameTransientExtrakey_getTextOutlineWidth();

    public static final native String NLEKeyFrameTransientExtrakey_getTextShadowColor();

    public static final native String NLEKeyFrameTransientExtrakey_getTextShadowOffsetX();

    public static final native String NLEKeyFrameTransientExtrakey_getTextShadowOffsetY();

    public static final native String NLEKeyFrameTransientExtrakey_getTextShadowSmoothing();

    public static final native long NLEKeyframeGraphValue_SWIGSmartPtrUpcast(long j);

    public static final native void NLEKeyframeGraphValue_addKeyframeGraphPoint(long j, NLEKeyframeGraphValue nLEKeyframeGraphValue, long j2, NLEPoint nLEPoint);

    public static final native void NLEKeyframeGraphValue_clearKeyframeGraphPoint(long j, NLEKeyframeGraphValue nLEKeyframeGraphValue);

    public static final native long NLEKeyframeGraphValue_clone(long j, NLEKeyframeGraphValue nLEKeyframeGraphValue);

    public static final native long NLEKeyframeGraphValue_dynamicCast(long j, NLENode nLENode);

    public static final native long NLEKeyframeGraphValue_getKeyframeGraphPoints(long j, NLEKeyframeGraphValue nLEKeyframeGraphValue);

    public static final native boolean NLEKeyframeGraphValue_removeKeyframeGraphPoint(long j, NLEKeyframeGraphValue nLEKeyframeGraphValue, long j2, NLEPoint nLEPoint);

    public static final native long NLEKeyframe_SWIGSmartPtrUpcast(long j);

    public static final native void NLEKeyframe_addKeyframe(long j, NLEKeyframe nLEKeyframe, long j2, NLECommonKeyframe nLECommonKeyframe);

    public static final native void NLEKeyframe_addOrUpdateCommonKeyframeAtTimeOffset(long j, NLEKeyframe nLEKeyframe, long j2, long j3, long j4, VecDouble vecDouble);

    public static final native void NLEKeyframe_clearKeyframe(long j, NLEKeyframe nLEKeyframe);

    public static final native long NLEKeyframe_clone(long j, NLEKeyframe nLEKeyframe);

    public static final native long NLEKeyframe_commonKeyframeAtTimeOffset(long j, NLEKeyframe nLEKeyframe, long j2, long j3);

    public static final native long NLEKeyframe_create__SWIG_0(int i, String str);

    public static final native long NLEKeyframe_create__SWIG_1(int i);

    public static final native long NLEKeyframe_create__SWIG_2();

    public static final native long NLEKeyframe_dynamicCast(long j, NLENode nLENode);

    public static final native String NLEKeyframe_getKeyframeProperty(long j, NLEKeyframe nLEKeyframe);

    public static final native int NLEKeyframe_getKeyframeType(long j, NLEKeyframe nLEKeyframe);

    public static final native long NLEKeyframe_getKeyframes(long j, NLEKeyframe nLEKeyframe);

    public static final native long NLEKeyframe_getSortedCommonKeyframes(long j, NLEKeyframe nLEKeyframe);

    public static final native boolean NLEKeyframe_hasKeyframeProperty(long j, NLEKeyframe nLEKeyframe);

    public static final native boolean NLEKeyframe_hasKeyframeType(long j, NLEKeyframe nLEKeyframe);

    public static final native boolean NLEKeyframe_removeKeyframe(long j, NLEKeyframe nLEKeyframe, long j2, NLECommonKeyframe nLECommonKeyframe);

    public static final native void NLEKeyframe_setKeyframeProperty(long j, NLEKeyframe nLEKeyframe, String str);

    public static final native void NLEKeyframe_setKeyframeType(long j, NLEKeyframe nLEKeyframe, int i);

    public static final native long NLELoggerListener_SWIGSmartPtrUpcast(long j);

    public static final native void NLELoggerListener_change_ownership(NLELoggerListener nLELoggerListener, long j, boolean z);

    public static final native void NLELoggerListener_director_connect(NLELoggerListener nLELoggerListener, long j, boolean z, boolean z2);

    public static final native void NLELoggerListener_onLogSwigExplicitNLELoggerListener__SWIG_0(long j, NLELoggerListener nLELoggerListener, int i, String str, long j2);

    public static final native void NLELoggerListener_onLog__SWIG_0(long j, NLELoggerListener nLELoggerListener, int i, String str, long j2);

    public static final native void NLELoggerListener_onLog__SWIG_1(long j, NLELoggerListener nLELoggerListener, int i, String str);

    public static final native void NLELogger_d(long j, NLELogger nLELogger, String str);

    public static final native void NLELogger_e(long j, NLELogger nLELogger, String str);

    public static final native void NLELogger_i(long j, NLELogger nLELogger, String str);

    public static final native void NLELogger_initNativeLogger(long j, NLELogger nLELogger);

    public static final native long NLELogger_obtain();

    public static final native void NLELogger_setDelegate(long j, NLELogger nLELogger, long j2, NLELoggerFunc nLELoggerFunc, boolean z);

    public static final native void NLELogger_setLogLevel(long j, NLELogger nLELogger, int i);

    public static final native void NLELogger_v(long j, NLELogger nLELogger, String str);

    public static final native void NLELogger_w(long j, NLELogger nLELogger, String str);

    public static final native void NLELogger_wtf(long j, NLELogger nLELogger, String str);

    public static final native String NLELokiResourceProtocol_EXTRA_PARAM_SAVE_PATH();

    public static final native long NLELokiResourceProtocol_NLELokiResourceProtocolWithURS(String str);

    public static final native String NLELokiResourceProtocol_PARAM_EFFECT_ID();

    public static final native String NLELokiResourceProtocol_PARAM_PANEL();

    public static final native String NLELokiResourceProtocol_PARAM_RESOURCE_ID();

    public static final native String NLELokiResourceProtocol_PLATFORM_STRING();

    public static final native long NLELokiResourceProtocol_SWIGSmartPtrUpcast(long j);

    public static final native String NLELokiResourceProtocol_effectId_get(long j, NLELokiResourceProtocol nLELokiResourceProtocol);

    public static final native void NLELokiResourceProtocol_effectId_set(long j, NLELokiResourceProtocol nLELokiResourceProtocol, String str);

    public static final native long NLELokiResourceProtocol_getParameters(long j, NLELokiResourceProtocol nLELokiResourceProtocol);

    public static final native String NLELokiResourceProtocol_getSourceFrom(long j, NLELokiResourceProtocol nLELokiResourceProtocol);

    public static final native boolean NLELokiResourceProtocol_isLokiResource(String str);

    public static final native String NLELokiResourceProtocol_panel_get(long j, NLELokiResourceProtocol nLELokiResourceProtocol);

    public static final native void NLELokiResourceProtocol_panel_set(long j, NLELokiResourceProtocol nLELokiResourceProtocol, String str);

    public static final native String NLELokiResourceProtocol_resourceId_get(long j, NLELokiResourceProtocol nLELokiResourceProtocol);

    public static final native void NLELokiResourceProtocol_resourceId_set(long j, NLELokiResourceProtocol nLELokiResourceProtocol, String str);

    public static final native int NLELokiResourceProtocol_type_get(long j, NLELokiResourceProtocol nLELokiResourceProtocol);

    public static final native void NLELokiResourceProtocol_type_set(long j, NLELokiResourceProtocol nLELokiResourceProtocol, int i);

    public static final native long NLEMVExternalAlgorithmResult_SWIGSmartPtrUpcast(long j);

    public static final native long NLEMVExternalAlgorithmResult_clone(long j, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native long NLEMVExternalAlgorithmResult_dynamicCast(long j, NLENode nLENode);

    public static final native String NLEMVExternalAlgorithmResult_getAlgorithmName(long j, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native long NLEMVExternalAlgorithmResult_getMask(long j, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native long NLEMVExternalAlgorithmResult_getPhoto(long j, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native int NLEMVExternalAlgorithmResult_getResultInType(long j, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native boolean NLEMVExternalAlgorithmResult_hasAlgorithmName(long j, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native boolean NLEMVExternalAlgorithmResult_hasResultInType(long j, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native void NLEMVExternalAlgorithmResult_setAlgorithmName(long j, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult, String str);

    public static final native void NLEMVExternalAlgorithmResult_setMask(long j, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLEMVExternalAlgorithmResult_setPhoto(long j, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLEMVExternalAlgorithmResult_setResultInType(long j, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult, int i);

    public static final native void NLEManifest_registerNLEModelClass();

    public static final native long NLEMask_SWIGSmartPtrUpcast(long j);

    public static final native long NLEMask_clone(long j, NLEMask nLEMask);

    public static final native long NLEMask_dynamicCast(long j, NLENode nLENode);

    public static final native long NLEMask_getSegment(long j, NLEMask nLEMask);

    public static final native void NLEMask_setSegment(long j, NLEMask nLEMask, long j2, NLESegmentMask nLESegmentMask);

    public static final native float NLEMatrix_relativeHeight_get(long j, NLEMatrix nLEMatrix);

    public static final native void NLEMatrix_relativeHeight_set(long j, NLEMatrix nLEMatrix, float f);

    public static final native float NLEMatrix_relativeWidth_get(long j, NLEMatrix nLEMatrix);

    public static final native void NLEMatrix_relativeWidth_set(long j, NLEMatrix nLEMatrix, float f);

    public static final native float NLEMatrix_rotation_get(long j, NLEMatrix nLEMatrix);

    public static final native void NLEMatrix_rotation_set(long j, NLEMatrix nLEMatrix, float f);

    public static final native long NLEMatrix_startTime_get(long j, NLEMatrix nLEMatrix);

    public static final native void NLEMatrix_startTime_set(long j, NLEMatrix nLEMatrix, long j2);

    public static final native String NLEMatrix_toString(long j, NLEMatrix nLEMatrix);

    public static final native float NLEMatrix_transformX_get(long j, NLEMatrix nLEMatrix);

    public static final native void NLEMatrix_transformX_set(long j, NLEMatrix nLEMatrix, float f);

    public static final native float NLEMatrix_transformY_get(long j, NLEMatrix nLEMatrix);

    public static final native void NLEMatrix_transformY_set(long j, NLEMatrix nLEMatrix, float f);

    public static final native int NLEMatrix_transformZ_get(long j, NLEMatrix nLEMatrix);

    public static final native void NLEMatrix_transformZ_set(long j, NLEMatrix nLEMatrix, int i);

    public static final native long NLEMattingStroke_SWIGSmartPtrUpcast(long j);

    public static final native long NLEMattingStroke_clone(long j, NLEMattingStroke nLEMattingStroke);

    public static final native long NLEMattingStroke_dynamicCast(long j, NLENode nLENode);

    public static final native String NLEMattingStroke_getParams(long j, NLEMattingStroke nLEMattingStroke);

    public static final native long NLEMattingStroke_getStroke(long j, NLEMattingStroke nLEMattingStroke);

    public static final native boolean NLEMattingStroke_hasParams(long j, NLEMattingStroke nLEMattingStroke);

    public static final native void NLEMattingStroke_setParams(long j, NLEMattingStroke nLEMattingStroke, String str);

    public static final native void NLEMattingStroke_setStroke(long j, NLEMattingStroke nLEMattingStroke, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLEMeasure_measureInSwingTimeEffect(long j, NLETimeSpaceNode nLETimeSpaceNode, long j2);

    public static final native void NLEMeasure_performMeasure(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native void NLEMeasure_reCaculateSlotInSwing(long j, NLEModel nLEModel, boolean z);

    public static final native String NLEMediaResourceProtocol_EXTRA_AUTO_UNZIP_get();

    public static final native String NLEMediaResourceProtocol_EXTRA_EXTRA_INFO_get();

    public static final native String NLEMediaResourceProtocol_EXTRA_FILE_URL_get();

    public static final native String NLEMediaResourceProtocol_EXTRA_MD5_get();

    public static final native String NLEMediaResourceProtocol_EXTRA_MEDIA_EXTENSION_get();

    public static final native String NLEMediaResourceProtocol_EXTRA_PARAM_CACHE_DIR_get();

    public static final native String NLEMediaResourceProtocol_EXTRA_PARAM_CHANNEL_ID_get();

    public static final native String NLEMediaResourceProtocol_EXTRA_PARAM_DELETE_LOCAL_RES_RECORD_get();

    public static final native String NLEMediaResourceProtocol_EXTRA_PARAM_DELETE_LOCAL_RES_get();

    public static final native String NLEMediaResourceProtocol_EXTRA_PARAM_DELETE_REMOTE_RES_get();

    public static final native String NLEMediaResourceProtocol_EXTRA_PARAM_MEDIA_ITEM_get();

    public static final native String NLEMediaResourceProtocol_EXTRA_PARAM_SOURCE_PATH_get();

    public static final native String NLEMediaResourceProtocol_KEY_MEDIA_ID_get();

    public static final native String NLEMediaResourceProtocol_KEY_STORE_ID_get();

    public static final native String NLEMediaResourceProtocol_PLATFORM_STRING_get();

    public static final native long NLEMediaResourceProtocol_SWIGSmartPtrUpcast(long j);

    public static final native long NLEMediaResourceProtocol_getParameters(long j, NLEMediaResourceProtocol nLEMediaResourceProtocol);

    public static final native String NLEMediaResourceProtocol_getSourceFrom(long j, NLEMediaResourceProtocol nLEMediaResourceProtocol);

    public static final native boolean NLEMediaResourceProtocol_isMediaResource(String str);

    public static final native long NLEModel_SWIGSmartPtrUpcast(long j);

    public static final native void NLEModel_addTrack(long j, NLEModel nLEModel, long j2, NLETrack nLETrack);

    public static final native int NLEModel_applyPatch(long j, NLEModel nLEModel, long j2, NLEModel nLEModel2);

    public static final native void NLEModel_clearTrack(long j, NLEModel nLEModel);

    public static final native long NLEModel_clone(long j, NLEModel nLEModel);

    public static final native void NLEModel_copyValueNotMappedToStage(long j, NLEModel nLEModel);

    public static final native long NLEModel_deepClone__SWIG_0(long j, NLEModel nLEModel, boolean z);

    public static final native long NLEModel_deepClone__SWIG_1(long j, NLEModel nLEModel);

    public static final native long NLEModel_dynamicCast(long j, NLENode nLENode);

    public static final native void NLEModel_genNLEModelId(long j, NLEModel nLEModel);

    public static final native String NLEModel_getAlignMode(long j, NLEModel nLEModel);

    public static final native long NLEModel_getAllResources(long j, NLEModel nLEModel);

    public static final native float NLEModel_getCanvasRatio(long j, NLEModel nLEModel);

    public static final native long NLEModel_getCover(long j, NLEModel nLEModel);

    public static final native long NLEModel_getDuration(long j, NLEModel nLEModel);

    public static final native int NLEModel_getEffectLayerMax(long j, NLEModel nLEModel);

    public static final native long NLEModel_getFirstTrackWithType(long j, NLEModel nLEModel, int i);

    public static final native int NLEModel_getLayerMax(long j, NLEModel nLEModel);

    public static final native long NLEModel_getMainTrack__SWIG_0(long j, NLEModel nLEModel, boolean z);

    public static final native long NLEModel_getMainTrack__SWIG_1(long j, NLEModel nLEModel);

    public static final native long NLEModel_getMaxTargetEndExcludeDisabledNode(long j, NLEModel nLEModel, boolean z);

    public static final native long NLEModel_getMaxTargetEndWithoutTimeEffect(long j, NLEModel nLEModel);

    public static final native long NLEModel_getMaxTargetEnd__SWIG_0(long j, NLEModel nLEModel, long j2, VecNLETrackType vecNLETrackType);

    public static final native long NLEModel_getMaxTargetEnd__SWIG_1(long j, NLEModel nLEModel);

    public static final native long NLEModel_getMeasuredEndTime(long j, NLEModel nLEModel);

    public static final native long NLEModel_getMinTargetStart(long j, NLEModel nLEModel);

    public static final native long NLEModel_getNLEModelId(long j, NLEModel nLEModel);

    public static final native long NLEModel_getRawNLEMatrix__SWIG_0(long j, NLEModel nLEModel, long j2, NLETimeSpaceNode nLETimeSpaceNode, boolean z);

    public static final native long NLEModel_getRawNLEMatrix__SWIG_1(long j, NLEModel nLEModel, long j2, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native long NLEModel_getRenderSetting(long j, NLEModel nLEModel);

    public static final native int NLEModel_getSequenceDurationType(long j, NLEModel nLEModel);

    public static final native long NLEModel_getSetting(long j, NLEModel nLEModel);

    public static final native long NLEModel_getSortedTracks(long j, NLEModel nLEModel);

    public static final native long NLEModel_getSortedTracksWithNoNoneTrack(long j, NLEModel nLEModel);

    public static final native long NLEModel_getStartTime(long j, NLEModel nLEModel);

    public static final native long NLEModel_getThousandFps(long j, NLEModel nLEModel);

    public static final native long NLEModel_getTrackBySlot(long j, NLEModel nLEModel, long j2, NLETrackSlot nLETrackSlot);

    public static final native long NLEModel_getTracks(long j, NLEModel nLEModel);

    public static final native long NLEModel_getTracksWithTypes(long j, NLEModel nLEModel, long j2, VecNLETrackType vecNLETrackType);

    public static final native long NLEModel_getWorkingObjet(long j, NLEModel nLEModel);

    public static final native boolean NLEModel_hasAlignMode(long j, NLEModel nLEModel);

    public static final native boolean NLEModel_hasCanvasRatio(long j, NLEModel nLEModel);

    public static final native boolean NLEModel_hasSequenceDurationType(long j, NLEModel nLEModel);

    public static final native boolean NLEModel_hasThousandFps(long j, NLEModel nLEModel);

    public static final native boolean NLEModel_removeTrack(long j, NLEModel nLEModel, long j2, NLETrack nLETrack);

    public static final native void NLEModel_resetDefaultTimeEffect(long j, NLEModel nLEModel);

    public static final native void NLEModel_setAlignMode(long j, NLEModel nLEModel, String str);

    public static final native void NLEModel_setCanvasRatio(long j, NLEModel nLEModel, float f);

    public static final native void NLEModel_setCover(long j, NLEModel nLEModel, long j2, NLEVideoFrameModel nLEVideoFrameModel);

    public static final native void NLEModel_setRenderSetting(long j, NLEModel nLEModel, long j2, NLERenderSetting nLERenderSetting);

    public static final native void NLEModel_setRewind(long j, NLEModel nLEModel, boolean z, long j2, VecNLETrackType vecNLETrackType);

    public static final native void NLEModel_setSequenceDurationType(long j, NLEModel nLEModel, int i);

    public static final native void NLEModel_setSetting(long j, NLEModel nLEModel, long j2, NLESetting nLESetting);

    public static final native void NLEModel_setThousandFps(long j, NLEModel nLEModel, long j2);

    public static final native void NLEModel_setWorkingObject(long j, NLEModel nLEModel, long j2, NLEModel nLEModel2);

    public static final native int NLEModel_unapplyPatch(long j, NLEModel nLEModel, long j2, NLEModel nLEModel2);

    public static final native void NLEModel_updateRelativeSizeWhileGlobalCanvasChanged(long j, NLEModel nLEModel, float f, float f2);

    public static final native long NLEMonitorParamBuilder_appendParam(long j, NLEMonitorParamBuilder nLEMonitorParamBuilder, String str, String str2);

    public static final native String NLEMonitorParamBuilder_buildParamString(long j, NLEMonitorParamBuilder nLEMonitorParamBuilder);

    public static final native String NLEMonitor_KEY_API_MONITOR_CACHE_CLEAN_get();

    public static final native String NLEMonitor_KEY_API_MONITOR_CACHE_SAVE_get();

    public static final native String NLEMonitor_KEY_API_MONITOR_COST_get();

    public static final native String NLEMonitor_KEY_API_MONITOR_THREAD_get();

    public static final native String NLEMonitor_KEY_NLEIMAGE_MEDIA_CONVERT_get();

    public static final native String NLEMonitor_KEY_NLE_EDITOR_RESTORE_get();

    public static final native String NLEMonitor_KEY_NLE_EDITOR_STORE_get();

    public static final native String NLEMonitor_KEY_NLE_MEDIA_CONVERT_get();

    public static final native String NLEMonitor_KEY_NLE_MEDIA_PLAY_FPS_get();

    public static final native String NLEMonitor_KEY_NLE_MEDIA_PLAY_get();

    public static final native String NLEMonitor_KEY_NLE_SET_DATA_SOURCE_get();

    public static final native String NLEMonitor_PARAM_API_COST_AVERAGE_get();

    public static final native String NLEMonitor_PARAM_API_COST_MAX_get();

    public static final native String NLEMonitor_PARAM_API_COST_P90_get();

    public static final native String NLEMonitor_PARAM_API_NAME_get();

    public static final native String NLEMonitor_PARAM_API_THREAD_INFO_get();

    public static final native String NLEMonitor_PARAM_ERROR_CODE_get();

    public static final native String NLEMonitor_PARAM_ERROR_MSG_get();

    public static final native String NLEMonitor_PARAM_NLE_JSON_SIZE_get();

    public static final native String NLEMonitor_PARAM_TARGET_UUID_get();

    public static final native String NLEMonitor_PARAM_UUID_get();

    public static final native String NLEMonitor_PARAM_VE_API_get();

    public static final native boolean NLEMonitor_hasListener(long j, NLEMonitor nLEMonitor);

    public static final native long NLEMonitor_obtain();

    public static final native void NLEMonitor_onEvent__SWIG_0(long j, NLEMonitor nLEMonitor, String str, int i, String str2, long j2);

    public static final native void NLEMonitor_onEvent__SWIG_1(long j, NLEMonitor nLEMonitor, String str, int i, String str2);

    public static final native void NLEMonitor_setListener(long j, NLEMonitor nLEMonitor, long j2, INLEMonitor iNLEMonitor);

    public static final native String NLEMusicResourceProtocol_EXTRA_PARAM_SAVE_PATH();

    public static final native String NLEMusicResourceProtocol_KEY_CLIP_ID();

    public static final native String NLEMusicResourceProtocol_KEY_TIME_CLIP_START_ID();

    public static final native String NLEMusicResourceProtocol_PLATFORM_STRING();

    public static final native long NLEMusicResourceProtocol_SWIGSmartPtrUpcast(long j);

    public static final native long NLEMusicResourceProtocol_getParameters(long j, NLEMusicResourceProtocol nLEMusicResourceProtocol);

    public static final native String NLEMusicResourceProtocol_getSourceFrom(long j, NLEMusicResourceProtocol nLEMusicResourceProtocol);

    public static final native boolean NLEMusicResourceProtocol_isMusicResource(String str);

    public static final native long NLENodeGroup_SWIGSmartPtrUpcast(long j);

    public static final native void NLENodeGroup_addObject(long j, NLENodeGroup nLENodeGroup, long j2, NLENode nLENode);

    public static final native boolean NLENodeGroup_addToWorking(long j, NLENodeGroup nLENodeGroup, long j2, NLENode nLENode);

    public static final native long NLENodeGroup_clone(long j, NLENodeGroup nLENodeGroup);

    public static final native long NLENodeGroup_dynamicCast(long j, NLENode nLENode);

    public static final native boolean NLENodeGroup_removeObject(long j, NLENodeGroup nLENodeGroup, long j2, NLENode nLENode);

    public static final native void NLENode_addFeature(long j, NLENode nLENode, int i);

    public static final native void NLENode_addListener(long j, NLENode nLENode, long j2, NLEChangeListener nLEChangeListener);

    public static final native long NLENode_addToStage(long j, NLENode nLENode, long j2);

    public static final native boolean NLENode_addToWorking(long j, NLENode nLENode, long j2, NLENode nLENode2);

    public static final native void NLENode_clearExtra(long j, NLENode nLENode);

    public static final native void NLENode_clearExtraRecursively(long j, NLENode nLENode, long j2, VecString vecString);

    public static final native void NLENode_clearListener(long j, NLENode nLENode);

    public static final native void NLENode_clearTransientExtra(long j, NLENode nLENode);

    public static final native void NLENode_clearUnnecessaryExtraRecursively(long j, NLENode nLENode, long j2, VecString vecString);

    public static final native void NLENode_clearWorkingDirty(long j, NLENode nLENode);

    public static final native long NLENode_clone(long j, NLENode nLENode);

    public static final native void NLENode_cloneToNode(long j, NLENode nLENode, long j2, NLENode nLENode2, boolean z);

    public static final native void NLENode_collectResources(long j, NLENode nLENode, long j2, VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr);

    public static final native void NLENode_copyValueNotMappedToStage(long j, NLENode nLENode);

    public static final native long NLENode_deepCloneWithUUID(long j, NLENode nLENode, String str);

    public static final native long NLENode_deepClone__SWIG_0(long j, NLENode nLENode);

    public static final native long NLENode_deepClone__SWIG_1(long j, NLENode nLENode, boolean z);

    public static final native boolean NLENode_equals(long j, NLENode nLENode, long j2, NLENode nLENode2);

    public static final native long NLENode_fromModelJson(String str);

    public static final native long NLENode_getChildren(long j, NLENode nLENode);

    public static final native int NLENode_getClassType(long j, NLENode nLENode);

    public static final native boolean NLENode_getEnable(long j, NLENode nLENode);

    public static final native String NLENode_getExtra(long j, NLENode nLENode, String str);

    public static final native long NLENode_getExtraKeys(long j, NLENode nLENode);

    public static final native long NLENode_getFeatureList(long j, NLENode nLENode);

    public static final native long NLENode_getId(long j, NLENode nLENode);

    public static final native String NLENode_getName(long j, NLENode nLENode);

    public static final native long NLENode_getStage(long j, NLENode nLENode);

    public static final native String NLENode_getStringId(long j, NLENode nLENode);

    public static final native String NLENode_getTransientExtra(long j, NLENode nLENode, String str);

    public static final native String NLENode_getUUID(long j, NLENode nLENode);

    public static final native boolean NLENode_hasEnable(long j, NLENode nLENode);

    public static final native boolean NLENode_hasExtra(long j, NLENode nLENode, String str);

    public static final native boolean NLENode_hasName(long j, NLENode nLENode);

    public static final native boolean NLENode_hasTransientExtra(long j, NLENode nLENode, String str);

    public static final native boolean NLENode_hasUUID(long j, NLENode nLENode);

    public static final native boolean NLENode_isPropertyDirty(long j, NLENode nLENode);

    public static final native boolean NLENode_isWorkingDirty(long j, NLENode nLENode);

    public static final native void NLENode_removeExtraWithKey(long j, NLENode nLENode, String str);

    public static final native void NLENode_removeFeature(long j, NLENode nLENode, int i);

    public static final native void NLENode_removeTransientExtraWithKey(long j, NLENode nLENode, String str);

    public static final native void NLENode_setEnable(long j, NLENode nLENode, boolean z);

    public static final native void NLENode_setExtra(long j, NLENode nLENode, String str, String str2);

    public static final native void NLENode_setName(long j, NLENode nLENode, String str);

    public static final native void NLENode_setTransientExtra(long j, NLENode nLENode, String str, String str2);

    public static final native String NLENode_toJsonString(long j, NLENode nLENode);

    public static final native String NLENode_toModelJson(long j, NLENode nLENode);

    public static final native String NLENode_toString(long j, NLENode nLENode);

    public static final native boolean NLENode_unorderEquals__SWIG_0(long j, NLENode nLENode, long j2, NLENode nLENode2, boolean z);

    public static final native boolean NLENode_unorderEquals__SWIG_1(long j, NLENode nLENode, long j2, NLENode nLENode2);

    public static final native long NLENoiseReduction_SWIGSmartPtrUpcast(long j);

    public static final native long NLENoiseReduction_clone(long j, NLENoiseReduction nLENoiseReduction);

    public static final native long NLENoiseReduction_dynamicCast(long j, NLENode nLENode);

    public static final native long NLEPoint_SWIGSmartPtrUpcast(long j);

    public static final native long NLEPoint_clone(long j, NLEPoint nLEPoint);

    public static final native long NLEPoint_dynamicCast(long j, NLENode nLENode);

    public static final native float NLEPoint_getX(long j, NLEPoint nLEPoint);

    public static final native float NLEPoint_getY(long j, NLEPoint nLEPoint);

    public static final native boolean NLEPoint_hasX(long j, NLEPoint nLEPoint);

    public static final native boolean NLEPoint_hasY(long j, NLEPoint nLEPoint);

    public static final native void NLEPoint_setX(long j, NLEPoint nLEPoint, float f);

    public static final native void NLEPoint_setY(long j, NLEPoint nLEPoint, float f);

    public static final native long NLERenderImageResizeInfo_SWIGSmartPtrUpcast(long j);

    public static final native long NLERenderImageResizeInfo_clone(long j, NLERenderImageResizeInfo nLERenderImageResizeInfo);

    public static final native long NLERenderImageResizeInfo_dynamicCast(long j, NLENode nLENode);

    public static final native int NLERenderImageResizeInfo_getHeight(long j, NLERenderImageResizeInfo nLERenderImageResizeInfo);

    public static final native int NLERenderImageResizeInfo_getResAlgorithm(long j, NLERenderImageResizeInfo nLERenderImageResizeInfo);

    public static final native int NLERenderImageResizeInfo_getResFillMode(long j, NLERenderImageResizeInfo nLERenderImageResizeInfo);

    public static final native int NLERenderImageResizeInfo_getWidth(long j, NLERenderImageResizeInfo nLERenderImageResizeInfo);

    public static final native boolean NLERenderImageResizeInfo_hasHeight(long j, NLERenderImageResizeInfo nLERenderImageResizeInfo);

    public static final native boolean NLERenderImageResizeInfo_hasResAlgorithm(long j, NLERenderImageResizeInfo nLERenderImageResizeInfo);

    public static final native boolean NLERenderImageResizeInfo_hasResFillMode(long j, NLERenderImageResizeInfo nLERenderImageResizeInfo);

    public static final native boolean NLERenderImageResizeInfo_hasWidth(long j, NLERenderImageResizeInfo nLERenderImageResizeInfo);

    public static final native void NLERenderImageResizeInfo_setHeight(long j, NLERenderImageResizeInfo nLERenderImageResizeInfo, int i);

    public static final native void NLERenderImageResizeInfo_setResAlgorithm(long j, NLERenderImageResizeInfo nLERenderImageResizeInfo, int i);

    public static final native void NLERenderImageResizeInfo_setResFillMode(long j, NLERenderImageResizeInfo nLERenderImageResizeInfo, int i);

    public static final native void NLERenderImageResizeInfo_setWidth(long j, NLERenderImageResizeInfo nLERenderImageResizeInfo, int i);

    public static final native long NLERenderProxySegment_SWIGSmartPtrUpcast(long j);

    public static final native long NLERenderProxySegment_clone(long j, NLERenderProxySegment nLERenderProxySegment);

    public static final native long NLERenderProxySegment_dynamicCast(long j, NLENode nLENode);

    public static final native long NLERenderProxySegment_getAVFile(long j, NLERenderProxySegment nLERenderProxySegment);

    public static final native long NLERenderProxySegment_getRenderConfigRes(long j, NLERenderProxySegment nLERenderProxySegment);

    public static final native long NLERenderProxySegment_getResource(long j, NLERenderProxySegment nLERenderProxySegment);

    public static final native void NLERenderProxySegment_setAVFile(long j, NLERenderProxySegment nLERenderProxySegment, long j2, NLEResourceAV nLEResourceAV);

    public static final native void NLERenderProxySegment_setRenderConfigRes(long j, NLERenderProxySegment nLERenderProxySegment, long j2, NLEResourceNode nLEResourceNode);

    public static final native long NLERenderSetting_SWIGSmartPtrUpcast(long j);

    public static final native long NLERenderSetting_clone(long j, NLERenderSetting nLERenderSetting);

    public static final native long NLERenderSetting_dynamicCast(long j, NLENode nLENode);

    public static final native int NLERenderSetting_getCanvasHeight(long j, NLERenderSetting nLERenderSetting);

    public static final native int NLERenderSetting_getCanvasWidth(long j, NLERenderSetting nLERenderSetting);

    public static final native boolean NLERenderSetting_getEnableEffect(long j, NLERenderSetting nLERenderSetting);

    public static final native long NLERenderSetting_getImageResizeInfo(long j, NLERenderSetting nLERenderSetting);

    public static final native int NLERenderSetting_getMaxHeight(long j, NLERenderSetting nLERenderSetting);

    public static final native int NLERenderSetting_getMaxWidth(long j, NLERenderSetting nLERenderSetting);

    public static final native long NLERenderSetting_getPreviewBackgroundColor(long j, NLERenderSetting nLERenderSetting);

    public static final native int NLERenderSetting_getPreviewFillMode(long j, NLERenderSetting nLERenderSetting);

    public static final native boolean NLERenderSetting_hasCanvasHeight(long j, NLERenderSetting nLERenderSetting);

    public static final native boolean NLERenderSetting_hasCanvasWidth(long j, NLERenderSetting nLERenderSetting);

    public static final native boolean NLERenderSetting_hasEnableEffect(long j, NLERenderSetting nLERenderSetting);

    public static final native boolean NLERenderSetting_hasMaxHeight(long j, NLERenderSetting nLERenderSetting);

    public static final native boolean NLERenderSetting_hasMaxWidth(long j, NLERenderSetting nLERenderSetting);

    public static final native boolean NLERenderSetting_hasPreviewBackgroundColor(long j, NLERenderSetting nLERenderSetting);

    public static final native boolean NLERenderSetting_hasPreviewFillMode(long j, NLERenderSetting nLERenderSetting);

    public static final native void NLERenderSetting_setCanvasHeight(long j, NLERenderSetting nLERenderSetting, int i);

    public static final native void NLERenderSetting_setCanvasWidth(long j, NLERenderSetting nLERenderSetting, int i);

    public static final native void NLERenderSetting_setEnableEffect(long j, NLERenderSetting nLERenderSetting, boolean z);

    public static final native void NLERenderSetting_setImageResizeInfo(long j, NLERenderSetting nLERenderSetting, long j2, NLERenderImageResizeInfo nLERenderImageResizeInfo);

    public static final native void NLERenderSetting_setMaxHeight(long j, NLERenderSetting nLERenderSetting, int i);

    public static final native void NLERenderSetting_setMaxWidth(long j, NLERenderSetting nLERenderSetting, int i);

    public static final native void NLERenderSetting_setPreviewBackgroundColor(long j, NLERenderSetting nLERenderSetting, long j2);

    public static final native void NLERenderSetting_setPreviewFillMode(long j, NLERenderSetting nLERenderSetting, int i);

    public static final native String NLEResTypeToString(int i);

    public static final native long NLEResourceAV_SWIGSmartPtrUpcast(long j);

    public static final native long NLEResourceAV_clone(long j, NLEResourceAV nLEResourceAV);

    public static final native long NLEResourceAV_dynamicCast(long j, NLENode nLENode);

    public static final native String NLEResourceAV_getFileInfo(long j, NLEResourceAV nLEResourceAV);

    public static final native boolean NLEResourceAV_getHasAudio(long j, NLEResourceAV nLEResourceAV);

    public static final native long NLEResourceAV_getHeight(long j, NLEResourceAV nLEResourceAV);

    public static final native String NLEResourceAV_getReverseResourceFile(long j, NLEResourceAV nLEResourceAV);

    public static final native long NLEResourceAV_getWidth(long j, NLEResourceAV nLEResourceAV);

    public static final native boolean NLEResourceAV_hasFileInfo(long j, NLEResourceAV nLEResourceAV);

    public static final native boolean NLEResourceAV_hasHasAudio(long j, NLEResourceAV nLEResourceAV);

    public static final native boolean NLEResourceAV_hasReverseResourceFile(long j, NLEResourceAV nLEResourceAV);

    public static final native void NLEResourceAV_setFileInfo(long j, NLEResourceAV nLEResourceAV, String str);

    public static final native void NLEResourceAV_setHasAudio(long j, NLEResourceAV nLEResourceAV, boolean z);

    public static final native void NLEResourceAV_setReverseResourceFile(long j, NLEResourceAV nLEResourceAV, String str);

    public static final native long NLEResourceComposite_SWIGSmartPtrUpcast(long j);

    public static final native long NLEResourceComposite_clone(long j, NLEResourceComposite nLEResourceComposite);

    public static final native long NLEResourceComposite_dynamicCast(long j, NLENode nLENode);

    public static final native long NLEResourceComposite_getCompositeNode(long j, NLEResourceComposite nLEResourceComposite);

    public static final native void NLEResourceComposite_setCompositeNode(long j, NLEResourceComposite nLEResourceComposite, long j2, NLENode nLENode);

    public static final native void NLEResourceFetchCallback_change_ownership(NLEResourceFetchCallback nLEResourceFetchCallback, long j, boolean z);

    public static final native void NLEResourceFetchCallback_director_connect(NLEResourceFetchCallback nLEResourceFetchCallback, long j, boolean z, boolean z2);

    public static final native void NLEResourceFetchCallback_onError(long j, NLEResourceFetchCallback nLEResourceFetchCallback, int i);

    public static final native void NLEResourceFetchCallback_onProgress(long j, NLEResourceFetchCallback nLEResourceFetchCallback, int i);

    public static final native void NLEResourceFetchCallback_onSuccess(long j, NLEResourceFetchCallback nLEResourceFetchCallback, String str, String str2);

    public static final native long NLEResourceGIF_SWIGSmartPtrUpcast(long j);

    public static final native long NLEResourceGIF_clone(long j, NLEResourceGIF nLEResourceGIF);

    public static final native long NLEResourceGIF_dynamicCast(long j, NLENode nLENode);

    public static final native long NLEResourceGIF_getResourceFiles(long j, NLEResourceGIF nLEResourceGIF);

    public static final native boolean NLEResourceGIF_hasResourceFiles(long j, NLEResourceGIF nLEResourceGIF);

    public static final native void NLEResourceGIF_setResourceFiles(long j, NLEResourceGIF nLEResourceGIF, long j2, VecString vecString);

    public static final native String NLEResourceIdConverter_convertAlgorithmResourceWithModelName(String str);

    public static final native String NLEResourceIdConverter_convertAlgorithmResourceWithRequirements(long j, VecString vecString, String str);

    public static final native String NLEResourceIdConverter_convertLokiResourceWithEffectId(String str);

    public static final native String NLEResourceIdConverter_convertLokiResourceWithResourceId(String str, String str2);

    public static final native String NLEResourceIdConverter_convertMusicIdResource(String str);

    public static final native String NLEResourceIdConverter_convertUrlResource(String str);

    public static final native String NLEResourceIdConverter_convertVidResource(String str);

    public static final native String NLEResourceIdParser_host_get(long j, NLEResourceIdParser nLEResourceIdParser);

    public static final native void NLEResourceIdParser_host_set(long j, NLEResourceIdParser nLEResourceIdParser, String str);

    public static final native String NLEResourceIdParser_protocol_get(long j, NLEResourceIdParser nLEResourceIdParser);

    public static final native void NLEResourceIdParser_protocol_set(long j, NLEResourceIdParser nLEResourceIdParser, String str);

    public static final native long NLEResourceIdParser_queryParams_get(long j, NLEResourceIdParser nLEResourceIdParser);

    public static final native void NLEResourceIdParser_queryParams_set(long j, NLEResourceIdParser nLEResourceIdParser, long j2, UnorderedMapStrStr unorderedMapStrStr);

    public static final native String NLEResourceIdParser_query_get(long j, NLEResourceIdParser nLEResourceIdParser);

    public static final native void NLEResourceIdParser_query_set(long j, NLEResourceIdParser nLEResourceIdParser, String str);

    public static final native long NLEResourceNode_SWIGSmartPtrUpcast(long j);

    public static final native long NLEResourceNode_clone(long j, NLEResourceNode nLEResourceNode);

    public static final native long NLEResourceNode_dynamicCast(long j, NLENode nLENode);

    public static final native int NLEResourceNode_getAlphaSplitType(long j, NLEResourceNode nLEResourceNode);

    public static final native long NLEResourceNode_getDuration(long j, NLEResourceNode nLEResourceNode);

    public static final native long NLEResourceNode_getHeight(long j, NLEResourceNode nLEResourceNode);

    public static final native boolean NLEResourceNode_getNecessary(long j, NLEResourceNode nLEResourceNode);

    public static final native String NLEResourceNode_getResourceFile(long j, NLEResourceNode nLEResourceNode);

    public static final native String NLEResourceNode_getResourceId(long j, NLEResourceNode nLEResourceNode);

    public static final native String NLEResourceNode_getResourceMD5(long j, NLEResourceNode nLEResourceNode);

    public static final native String NLEResourceNode_getResourceName(long j, NLEResourceNode nLEResourceNode);

    public static final native int NLEResourceNode_getResourceTag(long j, NLEResourceNode nLEResourceNode);

    public static final native int NLEResourceNode_getResourceType(long j, NLEResourceNode nLEResourceNode);

    public static final native long NLEResourceNode_getWidth(long j, NLEResourceNode nLEResourceNode);

    public static final native boolean NLEResourceNode_hasAlphaSplitType(long j, NLEResourceNode nLEResourceNode);

    public static final native boolean NLEResourceNode_hasDuration(long j, NLEResourceNode nLEResourceNode);

    public static final native boolean NLEResourceNode_hasHeight(long j, NLEResourceNode nLEResourceNode);

    public static final native boolean NLEResourceNode_hasNecessary(long j, NLEResourceNode nLEResourceNode);

    public static final native boolean NLEResourceNode_hasResourceFile(long j, NLEResourceNode nLEResourceNode);

    public static final native boolean NLEResourceNode_hasResourceId(long j, NLEResourceNode nLEResourceNode);

    public static final native boolean NLEResourceNode_hasResourceMD5(long j, NLEResourceNode nLEResourceNode);

    public static final native boolean NLEResourceNode_hasResourceName(long j, NLEResourceNode nLEResourceNode);

    public static final native boolean NLEResourceNode_hasResourceTag(long j, NLEResourceNode nLEResourceNode);

    public static final native boolean NLEResourceNode_hasResourceType(long j, NLEResourceNode nLEResourceNode);

    public static final native boolean NLEResourceNode_hasWidth(long j, NLEResourceNode nLEResourceNode);

    public static final native boolean NLEResourceNode_isLocal(long j, NLEResourceNode nLEResourceNode);

    public static final native void NLEResourceNode_setAlphaSplitType(long j, NLEResourceNode nLEResourceNode, int i);

    public static final native void NLEResourceNode_setDuration(long j, NLEResourceNode nLEResourceNode, long j2);

    public static final native void NLEResourceNode_setHeight(long j, NLEResourceNode nLEResourceNode, long j2);

    public static final native void NLEResourceNode_setNecessary(long j, NLEResourceNode nLEResourceNode, boolean z);

    public static final native void NLEResourceNode_setResourceFile(long j, NLEResourceNode nLEResourceNode, String str);

    public static final native void NLEResourceNode_setResourceId(long j, NLEResourceNode nLEResourceNode, String str);

    public static final native void NLEResourceNode_setResourceMD5(long j, NLEResourceNode nLEResourceNode, String str);

    public static final native void NLEResourceNode_setResourceName(long j, NLEResourceNode nLEResourceNode, String str);

    public static final native void NLEResourceNode_setResourceTag(long j, NLEResourceNode nLEResourceNode, int i);

    public static final native void NLEResourceNode_setResourceType(long j, NLEResourceNode nLEResourceNode, int i);

    public static final native void NLEResourceNode_setWidth(long j, NLEResourceNode nLEResourceNode, long j2);

    public static final native long NLEResourceProtocol_getParameters(long j, NLEResourceProtocol nLEResourceProtocol);

    public static final native String NLEResourceProtocol_getSourceFrom(long j, NLEResourceProtocol nLEResourceProtocol);

    public static final native String NLEResourceProtocol_toResourceId(long j, NLEResourceProtocol nLEResourceProtocol);

    public static final native long NLERichTextStyle_SWIGSmartPtrUpcast(long j);

    public static final native long NLERichTextStyle_clone(long j, NLERichTextStyle nLERichTextStyle);

    public static final native long NLERichTextStyle_dynamicCast(long j, NLENode nLENode);

    public static final native boolean NLERichTextStyle_getAutoAdaptCanvas(long j, NLERichTextStyle nLERichTextStyle);

    public static final native boolean NLERichTextStyle_getAutoAdaptDpi(long j, NLERichTextStyle nLERichTextStyle);

    public static final native long NLERichTextStyle_getCanvasWHFixedRatio(long j, NLERichTextStyle nLERichTextStyle);

    public static final native boolean NLERichTextStyle_getFixedFontSize(long j, NLERichTextStyle nLERichTextStyle);

    public static final native void NLERichTextStyle_setAutoAdaptCanvas(long j, NLERichTextStyle nLERichTextStyle, boolean z);

    public static final native void NLERichTextStyle_setAutoAdaptDpi(long j, NLERichTextStyle nLERichTextStyle, boolean z);

    public static final native void NLERichTextStyle_setCanvasWHFixedRatio(long j, NLERichTextStyle nLERichTextStyle, long j2, NLEPoint nLEPoint);

    public static final native void NLERichTextStyle_setFixedFontSize(long j, NLERichTextStyle nLERichTextStyle, boolean z);

    public static final native long NLESegmentAIMatting_SWIGSmartPtrUpcast(long j);

    public static final native void NLESegmentAIMatting_addStroke(long j, NLESegmentAIMatting nLESegmentAIMatting, long j2, NLEMattingStroke nLEMattingStroke);

    public static final native void NLESegmentAIMatting_clearStroke(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native long NLESegmentAIMatting_clone(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native long NLESegmentAIMatting_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentAIMatting_getAiMattingCilpEnd(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native long NLESegmentAIMatting_getAiMattingCilpStart(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native int NLESegmentAIMatting_getArcherStrategy(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native long NLESegmentAIMatting_getBlend(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native int NLESegmentAIMatting_getBlendColor(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native long NLESegmentAIMatting_getBlendCutout(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native long NLESegmentAIMatting_getBlendMask(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native int NLESegmentAIMatting_getBlendMode(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native long NLESegmentAIMatting_getCustomMattingParam(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_getDisableDownSampleForBach(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_getDisableSaveCacheInCompile(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_getExportMonoCutoutRes(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native long NLESegmentAIMatting_getInteractiveTime(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native String NLESegmentAIMatting_getMattingTag(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native int NLESegmentAIMatting_getMattingType(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_getNeedRunningMattingTask(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native long NLESegmentAIMatting_getPenParam(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native long NLESegmentAIMatting_getResource(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native long NLESegmentAIMatting_getResourceAiMatting(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native long NLESegmentAIMatting_getResourceAlgorithm(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native long NLESegmentAIMatting_getStrokes(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native String NLESegmentAIMatting_getWorkSpace(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_hasAiMattingCilpEnd(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_hasAiMattingCilpStart(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_hasArcherStrategy(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_hasBlendColor(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_hasBlendMode(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_hasDisableDownSampleForBach(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_hasDisableSaveCacheInCompile(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_hasExportMonoCutoutRes(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_hasInteractiveTime(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_hasMattingTag(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_hasMattingType(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_hasNeedRunningMattingTask(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_hasWorkSpace(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native boolean NLESegmentAIMatting_removeStroke(long j, NLESegmentAIMatting nLESegmentAIMatting, long j2, NLEMattingStroke nLEMattingStroke);

    public static final native void NLESegmentAIMatting_setAiMattingCilpEnd(long j, NLESegmentAIMatting nLESegmentAIMatting, long j2);

    public static final native void NLESegmentAIMatting_setAiMattingCilpStart(long j, NLESegmentAIMatting nLESegmentAIMatting, long j2);

    public static final native void NLESegmentAIMatting_setArcherStrategy(long j, NLESegmentAIMatting nLESegmentAIMatting, int i);

    public static final native void NLESegmentAIMatting_setBlend(long j, NLESegmentAIMatting nLESegmentAIMatting, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentAIMatting_setBlendColor(long j, NLESegmentAIMatting nLESegmentAIMatting, int i);

    public static final native void NLESegmentAIMatting_setBlendCutout(long j, NLESegmentAIMatting nLESegmentAIMatting, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentAIMatting_setBlendMask(long j, NLESegmentAIMatting nLESegmentAIMatting, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentAIMatting_setBlendMode(long j, NLESegmentAIMatting nLESegmentAIMatting, int i);

    public static final native void NLESegmentAIMatting_setCustomMattingParam(long j, NLESegmentAIMatting nLESegmentAIMatting, long j2, NLECustomMattingParam nLECustomMattingParam);

    public static final native void NLESegmentAIMatting_setDisableDownSampleForBach(long j, NLESegmentAIMatting nLESegmentAIMatting, boolean z);

    public static final native void NLESegmentAIMatting_setDisableSaveCacheInCompile(long j, NLESegmentAIMatting nLESegmentAIMatting, boolean z);

    public static final native void NLESegmentAIMatting_setExportMonoCutoutRes(long j, NLESegmentAIMatting nLESegmentAIMatting, boolean z);

    public static final native void NLESegmentAIMatting_setInteractiveTime(long j, NLESegmentAIMatting nLESegmentAIMatting, long j2, VecLongLong vecLongLong);

    public static final native void NLESegmentAIMatting_setMattingTag(long j, NLESegmentAIMatting nLESegmentAIMatting, String str);

    public static final native void NLESegmentAIMatting_setMattingType(long j, NLESegmentAIMatting nLESegmentAIMatting, int i);

    public static final native void NLESegmentAIMatting_setNeedRunningMattingTask(long j, NLESegmentAIMatting nLESegmentAIMatting, boolean z);

    public static final native void NLESegmentAIMatting_setPenParam(long j, NLESegmentAIMatting nLESegmentAIMatting, long j2, NLEInteractivePenParam nLEInteractivePenParam);

    public static final native void NLESegmentAIMatting_setResourceAiMatting(long j, NLESegmentAIMatting nLESegmentAIMatting, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentAIMatting_setResourceAlgorithm(long j, NLESegmentAIMatting nLESegmentAIMatting, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentAIMatting_setWorkSpace(long j, NLESegmentAIMatting nLESegmentAIMatting, String str);

    public static final native String NLESegmentAIMatting_toStrokeParamJson(long j, NLESegmentAIMatting nLESegmentAIMatting);

    public static final native long NLESegmentAudioFadeFilter_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentAudioFadeFilter_clone(long j, NLESegmentAudioFadeFilter nLESegmentAudioFadeFilter);

    public static final native long NLESegmentAudioFadeFilter_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentAudioFadeFilter_getFadeInLength(long j, NLESegmentAudioFadeFilter nLESegmentAudioFadeFilter);

    public static final native long NLESegmentAudioFadeFilter_getFadeOutLength(long j, NLESegmentAudioFadeFilter nLESegmentAudioFadeFilter);

    public static final native int NLESegmentAudioFadeFilter_getFadeType(long j, NLESegmentAudioFadeFilter nLESegmentAudioFadeFilter);

    public static final native boolean NLESegmentAudioFadeFilter_hasFadeInLength(long j, NLESegmentAudioFadeFilter nLESegmentAudioFadeFilter);

    public static final native boolean NLESegmentAudioFadeFilter_hasFadeOutLength(long j, NLESegmentAudioFadeFilter nLESegmentAudioFadeFilter);

    public static final native boolean NLESegmentAudioFadeFilter_hasFadeType(long j, NLESegmentAudioFadeFilter nLESegmentAudioFadeFilter);

    public static final native void NLESegmentAudioFadeFilter_setFadeInLength(long j, NLESegmentAudioFadeFilter nLESegmentAudioFadeFilter, long j2);

    public static final native void NLESegmentAudioFadeFilter_setFadeOutLength(long j, NLESegmentAudioFadeFilter nLESegmentAudioFadeFilter, long j2);

    public static final native void NLESegmentAudioFadeFilter_setFadeType(long j, NLESegmentAudioFadeFilter nLESegmentAudioFadeFilter, int i);

    public static final native long NLESegmentAudioLoudnessBalanceFilter_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentAudioLoudnessBalanceFilter_clone(long j, NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter);

    public static final native long NLESegmentAudioLoudnessBalanceFilter_dynamicCast(long j, NLENode nLENode);

    public static final native double NLESegmentAudioLoudnessBalanceFilter_getAvgLoudness(long j, NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter);

    public static final native double NLESegmentAudioLoudnessBalanceFilter_getPeakLoudness(long j, NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter);

    public static final native double NLESegmentAudioLoudnessBalanceFilter_getTargetLoudness(long j, NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter);

    public static final native boolean NLESegmentAudioLoudnessBalanceFilter_hasAvgLoudness(long j, NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter);

    public static final native boolean NLESegmentAudioLoudnessBalanceFilter_hasPeakLoudness(long j, NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter);

    public static final native boolean NLESegmentAudioLoudnessBalanceFilter_hasTargetLoudness(long j, NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter);

    public static final native void NLESegmentAudioLoudnessBalanceFilter_setAvgLoudness(long j, NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter, double d);

    public static final native void NLESegmentAudioLoudnessBalanceFilter_setPeakLoudness(long j, NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter, double d);

    public static final native void NLESegmentAudioLoudnessBalanceFilter_setTargetLoudness(long j, NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter, double d);

    public static final native long NLESegmentAudioMatrixFilter_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentAudioMatrixFilter_clone(long j, NLESegmentAudioMatrixFilter nLESegmentAudioMatrixFilter);

    public static final native long NLESegmentAudioMatrixFilter_dynamicCast(long j, NLENode nLENode);

    public static final native String NLESegmentAudioMatrixFilter_getSamiParam(long j, NLESegmentAudioMatrixFilter nLESegmentAudioMatrixFilter);

    public static final native boolean NLESegmentAudioMatrixFilter_hasSamiParam(long j, NLESegmentAudioMatrixFilter nLESegmentAudioMatrixFilter);

    public static final native void NLESegmentAudioMatrixFilter_setSamiParam(long j, NLESegmentAudioMatrixFilter nLESegmentAudioMatrixFilter, String str);

    public static final native long NLESegmentAudioSamiFilter_SWIGSmartPtrUpcast(long j);

    public static final native int NLESegmentAudioSamiFilter_TYPE_CE_DENOISE_get();

    public static final native int NLESegmentAudioSamiFilter_TYPE_DENOISE_V2_SPEECH44k_get();

    public static final native int NLESegmentAudioSamiFilter_TYPE_DENOISE_V2_get();

    public static final native int NLESegmentAudioSamiFilter_TYPE_DENOISE_V3_get();

    public static final native int NLESegmentAudioSamiFilter_TYPE_FTGRUE_NOISE_get();

    public static final native int NLESegmentAudioSamiFilter_TYPE_TCNDE_NOISE_get();

    public static final native long NLESegmentAudioSamiFilter_clone(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter);

    public static final native long NLESegmentAudioSamiFilter_dynamicCast(long j, NLENode nLENode);

    public static final native boolean NLESegmentAudioSamiFilter_getEnableSNR(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter);

    public static final native String NLESegmentAudioSamiFilter_getSamiCreateConfigInfo(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter);

    public static final native String NLESegmentAudioSamiFilter_getSamiDenoiseLevel(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter);

    public static final native String NLESegmentAudioSamiFilter_getSamiParam(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter);

    public static final native String NLESegmentAudioSamiFilter_getSamiSnrFilePath(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter);

    public static final native String NLESegmentAudioSamiFilter_getSamiSnrThreshold(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter);

    public static final native int NLESegmentAudioSamiFilter_getSamiType(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter);

    public static final native boolean NLESegmentAudioSamiFilter_hasEnableSNR(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter);

    public static final native boolean NLESegmentAudioSamiFilter_hasSamiCreateConfigInfo(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter);

    public static final native boolean NLESegmentAudioSamiFilter_hasSamiDenoiseLevel(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter);

    public static final native boolean NLESegmentAudioSamiFilter_hasSamiParam(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter);

    public static final native boolean NLESegmentAudioSamiFilter_hasSamiSnrFilePath(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter);

    public static final native boolean NLESegmentAudioSamiFilter_hasSamiSnrThreshold(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter);

    public static final native boolean NLESegmentAudioSamiFilter_hasSamiType(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter);

    public static final native void NLESegmentAudioSamiFilter_setEnableSNR(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter, boolean z);

    public static final native void NLESegmentAudioSamiFilter_setSamiCreateConfigInfo(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter, String str);

    public static final native void NLESegmentAudioSamiFilter_setSamiDenoiseLevel(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter, String str);

    public static final native void NLESegmentAudioSamiFilter_setSamiParam(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter, String str);

    public static final native void NLESegmentAudioSamiFilter_setSamiSnrFilePath(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter, String str);

    public static final native void NLESegmentAudioSamiFilter_setSamiSnrThreshold(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter, String str);

    public static final native void NLESegmentAudioSamiFilter_setSamiType(long j, NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter, int i);

    public static final native long NLESegmentAudioVoiceBeautifyFilter_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentAudioVoiceBeautifyFilter_clone(long j, NLESegmentAudioVoiceBeautifyFilter nLESegmentAudioVoiceBeautifyFilter);

    public static final native long NLESegmentAudioVoiceBeautifyFilter_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentAudioVolumeFilter_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentAudioVolumeFilter_clone(long j, NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter);

    public static final native long NLESegmentAudioVolumeFilter_dynamicCast(long j, NLENode nLENode);

    public static final native double NLESegmentAudioVolumeFilter_getBalancedGain(long j, NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter);

    public static final native double NLESegmentAudioVolumeFilter_getDbRange(long j, NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter);

    public static final native float NLESegmentAudioVolumeFilter_getVolume(long j, NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter);

    public static final native boolean NLESegmentAudioVolumeFilter_hasBalancedGain(long j, NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter);

    public static final native boolean NLESegmentAudioVolumeFilter_hasDbRange(long j, NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter);

    public static final native boolean NLESegmentAudioVolumeFilter_hasVolume(long j, NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter);

    public static final native void NLESegmentAudioVolumeFilter_setBalancedGain(long j, NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter, double d);

    public static final native void NLESegmentAudioVolumeFilter_setDbRange(long j, NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter, double d);

    public static final native void NLESegmentAudioVolumeFilter_setVolume(long j, NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter, float f);

    public static final native int NLESegmentAudio_REPEAT_INFINITE_get();

    public static final native int NLESegmentAudio_REPEAT_NORMAL_get();

    public static final native long NLESegmentAudio_SWIGSmartPtrUpcast(long j);

    public static final native void NLESegmentAudio_addCurveSpeedPoint(long j, NLESegmentAudio nLESegmentAudio, long j2, NLEPoint nLEPoint);

    public static final native void NLESegmentAudio_addSegCurveSpeedPoint(long j, NLESegmentAudio nLESegmentAudio, long j2, NLEPoint nLEPoint);

    public static final native String NLESegmentAudio_changerToEffectJson(long j, NLESegmentAudio nLESegmentAudio);

    public static final native void NLESegmentAudio_clearCurveSpeedPoint(long j, NLESegmentAudio nLESegmentAudio);

    public static final native void NLESegmentAudio_clearSegCurveSpeedPoint(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_clone(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentAudio_getAVFile(long j, NLESegmentAudio nLESegmentAudio);

    public static final native float NLESegmentAudio_getAbsSpeed(long j, NLESegmentAudio nLESegmentAudio);

    public static final native double NLESegmentAudio_getBalancedGain(long j, NLESegmentAudio nLESegmentAudio);

    public static final native int NLESegmentAudio_getChanger(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_getCurveActionBeam(long j, NLESegmentAudio nLESegmentAudio);

    public static final native double NLESegmentAudio_getCurveAveSpeed(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_getCurveSpeedPoints(long j, NLESegmentAudio nLESegmentAudio);

    public static final native int NLESegmentAudio_getCurveSpeedType(long j, NLESegmentAudio nLESegmentAudio);

    public static final native double NLESegmentAudio_getDbRange(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_getDuration(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_getDurationWithoutCurveSpeed(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_getFadeInLength(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_getFadeOutLength(long j, NLESegmentAudio nLESegmentAudio);

    public static final native boolean NLESegmentAudio_getKeepTone(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_getPlayResource(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_getRawDuration(long j, NLESegmentAudio nLESegmentAudio);

    public static final native int NLESegmentAudio_getRepeatCount(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_getResource(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_getReversedAVFile(long j, NLESegmentAudio nLESegmentAudio);

    public static final native boolean NLESegmentAudio_getRewind(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_getSegCurveSpeedPoints(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_getSeqCurveSpeedPoints(long j, NLESegmentAudio nLESegmentAudio);

    public static final native float NLESegmentAudio_getSpeed(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_getTimeClipEnd(long j, NLESegmentAudio nLESegmentAudio);

    public static final native long NLESegmentAudio_getTimeClipStart(long j, NLESegmentAudio nLESegmentAudio);

    public static final native float NLESegmentAudio_getVolume(long j, NLESegmentAudio nLESegmentAudio);

    public static final native boolean NLESegmentAudio_hasBalancedGain(long j, NLESegmentAudio nLESegmentAudio);

    public static final native boolean NLESegmentAudio_hasChanger(long j, NLESegmentAudio nLESegmentAudio);

    public static final native boolean NLESegmentAudio_hasCurveSpeedType(long j, NLESegmentAudio nLESegmentAudio);

    public static final native boolean NLESegmentAudio_hasDbRange(long j, NLESegmentAudio nLESegmentAudio);

    public static final native boolean NLESegmentAudio_hasFadeInLength(long j, NLESegmentAudio nLESegmentAudio);

    public static final native boolean NLESegmentAudio_hasFadeOutLength(long j, NLESegmentAudio nLESegmentAudio);

    public static final native boolean NLESegmentAudio_hasKeepTone(long j, NLESegmentAudio nLESegmentAudio);

    public static final native boolean NLESegmentAudio_hasRepeatCount(long j, NLESegmentAudio nLESegmentAudio);

    public static final native boolean NLESegmentAudio_hasSpeed(long j, NLESegmentAudio nLESegmentAudio);

    public static final native boolean NLESegmentAudio_hasTimeClipEnd(long j, NLESegmentAudio nLESegmentAudio);

    public static final native boolean NLESegmentAudio_hasTimeClipStart(long j, NLESegmentAudio nLESegmentAudio);

    public static final native boolean NLESegmentAudio_hasVolume(long j, NLESegmentAudio nLESegmentAudio);

    public static final native boolean NLESegmentAudio_removeCurveSpeedPoint(long j, NLESegmentAudio nLESegmentAudio, long j2, NLEPoint nLEPoint);

    public static final native boolean NLESegmentAudio_removeSegCurveSpeedPoint(long j, NLESegmentAudio nLESegmentAudio, long j2, NLEPoint nLEPoint);

    public static final native void NLESegmentAudio_setAVFile(long j, NLESegmentAudio nLESegmentAudio, long j2, NLEResourceAV nLEResourceAV);

    public static final native void NLESegmentAudio_setAbsSpeed(long j, NLESegmentAudio nLESegmentAudio, float f);

    public static final native void NLESegmentAudio_setBalancedGain(long j, NLESegmentAudio nLESegmentAudio, double d);

    public static final native void NLESegmentAudio_setChanger(long j, NLESegmentAudio nLESegmentAudio, int i);

    public static final native void NLESegmentAudio_setCurveActionBeam(long j, NLESegmentAudio nLESegmentAudio, long j2, NLECurveActionBeam nLECurveActionBeam);

    public static final native void NLESegmentAudio_setCurveSpeedPoints(long j, NLESegmentAudio nLESegmentAudio, long j2, VecNLEPointSPtr vecNLEPointSPtr);

    public static final native void NLESegmentAudio_setCurveSpeedType(long j, NLESegmentAudio nLESegmentAudio, int i);

    public static final native void NLESegmentAudio_setDbRange(long j, NLESegmentAudio nLESegmentAudio, double d);

    public static final native void NLESegmentAudio_setFadeInLength(long j, NLESegmentAudio nLESegmentAudio, long j2);

    public static final native void NLESegmentAudio_setFadeOutLength(long j, NLESegmentAudio nLESegmentAudio, long j2);

    public static final native void NLESegmentAudio_setKeepTone(long j, NLESegmentAudio nLESegmentAudio, boolean z);

    public static final native void NLESegmentAudio_setRepeatCount(long j, NLESegmentAudio nLESegmentAudio, int i);

    public static final native void NLESegmentAudio_setReversedAVFile(long j, NLESegmentAudio nLESegmentAudio, long j2, NLEResourceAV nLEResourceAV);

    public static final native void NLESegmentAudio_setRewind(long j, NLESegmentAudio nLESegmentAudio, boolean z);

    public static final native void NLESegmentAudio_setSegCurveSpeedPoints(long j, NLESegmentAudio nLESegmentAudio, long j2, VecNLEPointSPtr vecNLEPointSPtr);

    public static final native void NLESegmentAudio_setSpeed(long j, NLESegmentAudio nLESegmentAudio, float f);

    public static final native void NLESegmentAudio_setTimeClipEnd(long j, NLESegmentAudio nLESegmentAudio, long j2);

    public static final native void NLESegmentAudio_setTimeClipStart(long j, NLESegmentAudio nLESegmentAudio, long j2);

    public static final native void NLESegmentAudio_setVolume(long j, NLESegmentAudio nLESegmentAudio, float f);

    public static final native long NLESegmentAutoFillFrame_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentAutoFillFrame_clone(long j, NLESegmentAutoFillFrame nLESegmentAutoFillFrame);

    public static final native long NLESegmentAutoFillFrame_dynamicCast(long j, NLENode nLENode);

    public static final native float NLESegmentAutoFillFrame_getAlgScale(long j, NLESegmentAutoFillFrame nLESegmentAutoFillFrame);

    public static final native int NLESegmentAutoFillFrame_getAutoFillAlgType(long j, NLESegmentAutoFillFrame nLESegmentAutoFillFrame);

    public static final native long NLESegmentAutoFillFrame_getEffectSDKAutoFillFrame(long j, NLESegmentAutoFillFrame nLESegmentAutoFillFrame);

    public static final native long NLESegmentAutoFillFrame_getResource(long j, NLESegmentAutoFillFrame nLESegmentAutoFillFrame);

    public static final native boolean NLESegmentAutoFillFrame_hasAlgScale(long j, NLESegmentAutoFillFrame nLESegmentAutoFillFrame);

    public static final native boolean NLESegmentAutoFillFrame_hasAutoFillAlgType(long j, NLESegmentAutoFillFrame nLESegmentAutoFillFrame);

    public static final native void NLESegmentAutoFillFrame_setAlgScale(long j, NLESegmentAutoFillFrame nLESegmentAutoFillFrame, float f);

    public static final native void NLESegmentAutoFillFrame_setAutoFillAlgType(long j, NLESegmentAutoFillFrame nLESegmentAutoFillFrame, int i);

    public static final native void NLESegmentAutoFillFrame_setEffectSDKAutoFillFrame(long j, NLESegmentAutoFillFrame nLESegmentAutoFillFrame, long j2, NLEResourceNode nLEResourceNode);

    public static final native long NLESegmentBorderSticker_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentBorderSticker_clone(long j, NLESegmentBorderSticker nLESegmentBorderSticker);

    public static final native long NLESegmentBorderSticker_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentBorderSticker_getEffectSDKFile(long j, NLESegmentBorderSticker nLESegmentBorderSticker);

    public static final native long NLESegmentBorderSticker_getImageFile(long j, NLESegmentBorderSticker nLESegmentBorderSticker);

    public static final native long NLESegmentBorderSticker_getResource(long j, NLESegmentBorderSticker nLESegmentBorderSticker);

    public static final native int NLESegmentBorderSticker_getType(long j, NLESegmentBorderSticker nLESegmentBorderSticker);

    public static final native void NLESegmentBorderSticker_setEffectSDKFile(long j, NLESegmentBorderSticker nLESegmentBorderSticker, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentBorderSticker_setImageFile(long j, NLESegmentBorderSticker nLESegmentBorderSticker, long j2, NLEResourceNode nLEResourceNode);

    public static final native long NLESegmentBrushSticker_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentBrushSticker_clone(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native long NLESegmentBrushSticker_dynamicCast(long j, NLENode nLENode);

    public static final native String NLESegmentBrushSticker_getBrushCachePath(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native String NLESegmentBrushSticker_getBrushInitParam(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native int NLESegmentBrushSticker_getBrushMultiUndo(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native int NLESegmentBrushSticker_getBrushOption(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native String NLESegmentBrushSticker_getBrushParam(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native String NLESegmentBrushSticker_getBrushPath(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native long NLESegmentBrushSticker_getBrushTouchPoint(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native int NLESegmentBrushSticker_getBrushUndoCount(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native int NLESegmentBrushSticker_getUpdateMode(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native boolean NLESegmentBrushSticker_hasBrushCachePath(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native boolean NLESegmentBrushSticker_hasBrushInitParam(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native boolean NLESegmentBrushSticker_hasBrushMultiUndo(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native boolean NLESegmentBrushSticker_hasBrushOption(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native boolean NLESegmentBrushSticker_hasBrushParam(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native boolean NLESegmentBrushSticker_hasBrushPath(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native boolean NLESegmentBrushSticker_hasBrushUndoCount(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native boolean NLESegmentBrushSticker_hasUpdateMode(long j, NLESegmentBrushSticker nLESegmentBrushSticker);

    public static final native void NLESegmentBrushSticker_setBrushCachePath(long j, NLESegmentBrushSticker nLESegmentBrushSticker, String str);

    public static final native void NLESegmentBrushSticker_setBrushInitParam(long j, NLESegmentBrushSticker nLESegmentBrushSticker, String str);

    public static final native void NLESegmentBrushSticker_setBrushMultiUndo(long j, NLESegmentBrushSticker nLESegmentBrushSticker, int i);

    public static final native void NLESegmentBrushSticker_setBrushOption(long j, NLESegmentBrushSticker nLESegmentBrushSticker, int i);

    public static final native void NLESegmentBrushSticker_setBrushParam(long j, NLESegmentBrushSticker nLESegmentBrushSticker, String str);

    public static final native void NLESegmentBrushSticker_setBrushPath(long j, NLESegmentBrushSticker nLESegmentBrushSticker, String str);

    public static final native void NLESegmentBrushSticker_setBrushTouchPoint(long j, NLESegmentBrushSticker nLESegmentBrushSticker, long j2, NLEPoint nLEPoint);

    public static final native void NLESegmentBrushSticker_setBrushUndoCount(long j, NLESegmentBrushSticker nLESegmentBrushSticker, int i);

    public static final native void NLESegmentBrushSticker_setUpdateMode(long j, NLESegmentBrushSticker nLESegmentBrushSticker, int i);

    public static final native long NLESegmentChromaChannel_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentChromaChannel_clone(long j, NLESegmentChromaChannel nLESegmentChromaChannel);

    public static final native long NLESegmentChromaChannel_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentChromaChannel_getColor(long j, NLESegmentChromaChannel nLESegmentChromaChannel);

    public static final native float NLESegmentChromaChannel_getEdgeSmooth(long j, NLESegmentChromaChannel nLESegmentChromaChannel);

    public static final native long NLESegmentChromaChannel_getEffectSDKChroma(long j, NLESegmentChromaChannel nLESegmentChromaChannel);

    public static final native float NLESegmentChromaChannel_getIntensity(long j, NLESegmentChromaChannel nLESegmentChromaChannel);

    public static final native long NLESegmentChromaChannel_getResource(long j, NLESegmentChromaChannel nLESegmentChromaChannel);

    public static final native float NLESegmentChromaChannel_getShadow(long j, NLESegmentChromaChannel nLESegmentChromaChannel);

    public static final native float NLESegmentChromaChannel_getSpill(long j, NLESegmentChromaChannel nLESegmentChromaChannel);

    public static final native boolean NLESegmentChromaChannel_hasColor(long j, NLESegmentChromaChannel nLESegmentChromaChannel);

    public static final native boolean NLESegmentChromaChannel_hasEdgeSmooth(long j, NLESegmentChromaChannel nLESegmentChromaChannel);

    public static final native boolean NLESegmentChromaChannel_hasIntensity(long j, NLESegmentChromaChannel nLESegmentChromaChannel);

    public static final native boolean NLESegmentChromaChannel_hasShadow(long j, NLESegmentChromaChannel nLESegmentChromaChannel);

    public static final native boolean NLESegmentChromaChannel_hasSpill(long j, NLESegmentChromaChannel nLESegmentChromaChannel);

    public static final native void NLESegmentChromaChannel_setColor(long j, NLESegmentChromaChannel nLESegmentChromaChannel, long j2);

    public static final native void NLESegmentChromaChannel_setEdgeSmooth(long j, NLESegmentChromaChannel nLESegmentChromaChannel, float f);

    public static final native void NLESegmentChromaChannel_setEffectSDKChroma(long j, NLESegmentChromaChannel nLESegmentChromaChannel, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentChromaChannel_setIntensity(long j, NLESegmentChromaChannel nLESegmentChromaChannel, float f);

    public static final native void NLESegmentChromaChannel_setShadow(long j, NLESegmentChromaChannel nLESegmentChromaChannel, float f);

    public static final native void NLESegmentChromaChannel_setSpill(long j, NLESegmentChromaChannel nLESegmentChromaChannel, float f);

    public static final native long NLESegmentComposerFilter_SWIGSmartPtrUpcast(long j);

    public static final native void NLESegmentComposerFilter_addEffectNodeKeyValuePair(long j, NLESegmentComposerFilter nLESegmentComposerFilter, long j2, NLEStringFloatPair nLEStringFloatPair);

    public static final native void NLESegmentComposerFilter_addRenderCacheStrings(long j, NLESegmentComposerFilter nLESegmentComposerFilter, long j2, NLEStringStringPair nLEStringStringPair);

    public static final native void NLESegmentComposerFilter_addRenderCacheTextures(long j, NLESegmentComposerFilter nLESegmentComposerFilter, long j2, NLEStringStringPair nLEStringStringPair);

    public static final native void NLESegmentComposerFilter_clearEffectNodeKeyValuePair(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native void NLESegmentComposerFilter_clearRenderCacheStrings(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native void NLESegmentComposerFilter_clearRenderCacheTextures(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native long NLESegmentComposerFilter_clone(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native long NLESegmentComposerFilter_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentComposerFilter_getEffectNodeKeyValuePairs(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native long NLESegmentComposerFilter_getEffectTags(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native boolean NLESegmentComposerFilter_getEnableMultipleFilters(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native boolean NLESegmentComposerFilter_getEnableRefactor(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native long NLESegmentComposerFilter_getNodePaths(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native long NLESegmentComposerFilter_getRenderCacheStringss(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native long NLESegmentComposerFilter_getRenderCacheTexturess(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native int NLESegmentComposerFilter_getStatus(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native boolean NLESegmentComposerFilter_hasEffectTags(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native boolean NLESegmentComposerFilter_hasEnableMultipleFilters(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native boolean NLESegmentComposerFilter_hasEnableRefactor(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native boolean NLESegmentComposerFilter_hasNodePaths(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native boolean NLESegmentComposerFilter_hasStatus(long j, NLESegmentComposerFilter nLESegmentComposerFilter);

    public static final native boolean NLESegmentComposerFilter_removeEffectNodeKeyValuePair(long j, NLESegmentComposerFilter nLESegmentComposerFilter, long j2, NLEStringFloatPair nLEStringFloatPair);

    public static final native boolean NLESegmentComposerFilter_removeRenderCacheStrings(long j, NLESegmentComposerFilter nLESegmentComposerFilter, long j2, NLEStringStringPair nLEStringStringPair);

    public static final native boolean NLESegmentComposerFilter_removeRenderCacheTextures(long j, NLESegmentComposerFilter nLESegmentComposerFilter, long j2, NLEStringStringPair nLEStringStringPair);

    public static final native void NLESegmentComposerFilter_setEffectTags(long j, NLESegmentComposerFilter nLESegmentComposerFilter, long j2, VecString vecString);

    public static final native void NLESegmentComposerFilter_setEnableMultipleFilters(long j, NLESegmentComposerFilter nLESegmentComposerFilter, boolean z);

    public static final native void NLESegmentComposerFilter_setEnableRefactor(long j, NLESegmentComposerFilter nLESegmentComposerFilter, boolean z);

    public static final native void NLESegmentComposerFilter_setNodePaths(long j, NLESegmentComposerFilter nLESegmentComposerFilter, long j2, VecString vecString);

    public static final native void NLESegmentComposerFilter_setStatus(long j, NLESegmentComposerFilter nLESegmentComposerFilter, int i);

    public static final native long NLESegmentComposite_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentComposite_clone(long j, NLESegmentComposite nLESegmentComposite);

    public static final native long NLESegmentComposite_dynamicCast(long j, NLENode nLENode);

    public static final native float NLESegmentComposite_getAlpha(long j, NLESegmentComposite nLESegmentComposite);

    public static final native long NLESegmentComposite_getCompositeResource(long j, NLESegmentComposite nLESegmentComposite);

    public static final native long NLESegmentComposite_getTimeClipEnd(long j, NLESegmentComposite nLESegmentComposite);

    public static final native long NLESegmentComposite_getTimeClipStart(long j, NLESegmentComposite nLESegmentComposite);

    public static final native boolean NLESegmentComposite_hasAlpha(long j, NLESegmentComposite nLESegmentComposite);

    public static final native boolean NLESegmentComposite_hasTimeClipEnd(long j, NLESegmentComposite nLESegmentComposite);

    public static final native boolean NLESegmentComposite_hasTimeClipStart(long j, NLESegmentComposite nLESegmentComposite);

    public static final native void NLESegmentComposite_setAlpha(long j, NLESegmentComposite nLESegmentComposite, float f);

    public static final native void NLESegmentComposite_setCompositeResource(long j, NLESegmentComposite nLESegmentComposite, long j2, NLEResourceComposite nLEResourceComposite);

    public static final native void NLESegmentComposite_setTimeClipEnd(long j, NLESegmentComposite nLESegmentComposite, long j2);

    public static final native void NLESegmentComposite_setTimeClipStart(long j, NLESegmentComposite nLESegmentComposite, long j2);

    public static final native long NLESegmentEffect_SWIGSmartPtrUpcast(long j);

    public static final native void NLESegmentEffect_addAdjustParams(long j, NLESegmentEffect nLESegmentEffect, long j2, NLEStringFloatPair nLEStringFloatPair);

    public static final native void NLESegmentEffect_clearAdjustParams(long j, NLESegmentEffect nLESegmentEffect);

    public static final native long NLESegmentEffect_clone(long j, NLESegmentEffect nLESegmentEffect);

    public static final native long NLESegmentEffect_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentEffect_getAdjustParamss(long j, NLESegmentEffect nLESegmentEffect);

    public static final native int NLESegmentEffect_getApplyTargetType(long j, NLESegmentEffect nLESegmentEffect);

    public static final native String NLESegmentEffect_getCachePath(long j, NLESegmentEffect nLESegmentEffect);

    public static final native String NLESegmentEffect_getEffectName(long j, NLESegmentEffect nLESegmentEffect);

    public static final native long NLESegmentEffect_getEffectSDKEffect(long j, NLESegmentEffect nLESegmentEffect);

    public static final native String NLESegmentEffect_getEffectTag(long j, NLESegmentEffect nLESegmentEffect);

    public static final native String NLESegmentEffect_getJsonParam(long j, NLESegmentEffect nLESegmentEffect);

    public static final native boolean NLESegmentEffect_getNeedReload(long j, NLESegmentEffect nLESegmentEffect);

    public static final native long NLESegmentEffect_getResource(long j, NLESegmentEffect nLESegmentEffect);

    public static final native boolean NLESegmentEffect_hasApplyTargetType(long j, NLESegmentEffect nLESegmentEffect);

    public static final native boolean NLESegmentEffect_hasCachePath(long j, NLESegmentEffect nLESegmentEffect);

    public static final native boolean NLESegmentEffect_hasEffectName(long j, NLESegmentEffect nLESegmentEffect);

    public static final native boolean NLESegmentEffect_hasEffectTag(long j, NLESegmentEffect nLESegmentEffect);

    public static final native boolean NLESegmentEffect_hasJsonParam(long j, NLESegmentEffect nLESegmentEffect);

    public static final native boolean NLESegmentEffect_hasNeedReload(long j, NLESegmentEffect nLESegmentEffect);

    public static final native boolean NLESegmentEffect_removeAdjustParams(long j, NLESegmentEffect nLESegmentEffect, long j2, NLEStringFloatPair nLEStringFloatPair);

    public static final native void NLESegmentEffect_setApplyTargetType(long j, NLESegmentEffect nLESegmentEffect, int i);

    public static final native void NLESegmentEffect_setCachePath(long j, NLESegmentEffect nLESegmentEffect, String str);

    public static final native void NLESegmentEffect_setEffectName(long j, NLESegmentEffect nLESegmentEffect, String str);

    public static final native void NLESegmentEffect_setEffectSDKEffect(long j, NLESegmentEffect nLESegmentEffect, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentEffect_setEffectTag(long j, NLESegmentEffect nLESegmentEffect, String str);

    public static final native void NLESegmentEffect_setJsonParam(long j, NLESegmentEffect nLESegmentEffect, String str);

    public static final native void NLESegmentEffect_setNeedReload(long j, NLESegmentEffect nLESegmentEffect, boolean z);

    public static final native long NLESegmentEmojiSticker_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentEmojiSticker_clone(long j, NLESegmentEmojiSticker nLESegmentEmojiSticker);

    public static final native long NLESegmentEmojiSticker_dynamicCast(long j, NLENode nLENode);

    public static final native int NLESegmentEmojiSticker_getType(long j, NLESegmentEmojiSticker nLESegmentEmojiSticker);

    public static final native String NLESegmentEmojiSticker_getutf8Code(long j, NLESegmentEmojiSticker nLESegmentEmojiSticker);

    public static final native boolean NLESegmentEmojiSticker_hasutf8Code(long j, NLESegmentEmojiSticker nLESegmentEmojiSticker);

    public static final native void NLESegmentEmojiSticker_setutf8Code(long j, NLESegmentEmojiSticker nLESegmentEmojiSticker, String str);

    public static final native long NLESegmentFilter_SWIGSmartPtrUpcast(long j);

    public static final native void NLESegmentFilter_addAdjustParams(long j, NLESegmentFilter nLESegmentFilter, long j2, NLEStringFloatPair nLEStringFloatPair);

    public static final native void NLESegmentFilter_clearAdjustParams(long j, NLESegmentFilter nLESegmentFilter);

    public static final native long NLESegmentFilter_clone(long j, NLESegmentFilter nLESegmentFilter);

    public static final native long NLESegmentFilter_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentFilter_getAdjustParamss(long j, NLESegmentFilter nLESegmentFilter);

    public static final native int NLESegmentFilter_getApplyTargetType(long j, NLESegmentFilter nLESegmentFilter);

    public static final native long NLESegmentFilter_getEffectSDKFilter(long j, NLESegmentFilter nLESegmentFilter);

    public static final native String NLESegmentFilter_getFilterName(long j, NLESegmentFilter nLESegmentFilter);

    public static final native float NLESegmentFilter_getFilterPosition(long j, NLESegmentFilter nLESegmentFilter);

    public static final native float NLESegmentFilter_getIntensity(long j, NLESegmentFilter nLESegmentFilter);

    public static final native long NLESegmentFilter_getResource(long j, NLESegmentFilter nLESegmentFilter);

    public static final native long NLESegmentFilter_getRightFilter(long j, NLESegmentFilter nLESegmentFilter);

    public static final native float NLESegmentFilter_getRightIntensity(long j, NLESegmentFilter nLESegmentFilter);

    public static final native boolean NLESegmentFilter_getUseFilterV3(long j, NLESegmentFilter nLESegmentFilter);

    public static final native boolean NLESegmentFilter_hasApplyTargetType(long j, NLESegmentFilter nLESegmentFilter);

    public static final native boolean NLESegmentFilter_hasFilterName(long j, NLESegmentFilter nLESegmentFilter);

    public static final native boolean NLESegmentFilter_hasFilterPosition(long j, NLESegmentFilter nLESegmentFilter);

    public static final native boolean NLESegmentFilter_hasIntensity(long j, NLESegmentFilter nLESegmentFilter);

    public static final native boolean NLESegmentFilter_hasRightIntensity(long j, NLESegmentFilter nLESegmentFilter);

    public static final native boolean NLESegmentFilter_hasUseFilterV3(long j, NLESegmentFilter nLESegmentFilter);

    public static final native boolean NLESegmentFilter_removeAdjustParams(long j, NLESegmentFilter nLESegmentFilter, long j2, NLEStringFloatPair nLEStringFloatPair);

    public static final native void NLESegmentFilter_setApplyTargetType(long j, NLESegmentFilter nLESegmentFilter, int i);

    public static final native void NLESegmentFilter_setEffectSDKFilter(long j, NLESegmentFilter nLESegmentFilter, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentFilter_setFilterName(long j, NLESegmentFilter nLESegmentFilter, String str);

    public static final native void NLESegmentFilter_setFilterPosition(long j, NLESegmentFilter nLESegmentFilter, float f);

    public static final native void NLESegmentFilter_setIntensity(long j, NLESegmentFilter nLESegmentFilter, float f);

    public static final native void NLESegmentFilter_setRightFilter(long j, NLESegmentFilter nLESegmentFilter, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentFilter_setRightIntensity(long j, NLESegmentFilter nLESegmentFilter, float f);

    public static final native void NLESegmentFilter_setUseFilterV3(long j, NLESegmentFilter nLESegmentFilter, boolean z);

    public static final native long NLESegmentGIF_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentGIF_clone(long j, NLESegmentGIF nLESegmentGIF);

    public static final native long NLESegmentGIF_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentGIF_getGifResource(long j, NLESegmentGIF nLESegmentGIF);

    public static final native long NLESegmentGIF_getResource(long j, NLESegmentGIF nLESegmentGIF);

    public static final native void NLESegmentGIF_setGifResource(long j, NLESegmentGIF nLESegmentGIF, long j2, NLEResourceGIF nLEResourceGIF);

    public static final native long NLESegmentHDRFilter_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentHDRFilter_clone(long j, NLESegmentHDRFilter nLESegmentHDRFilter);

    public static final native long NLESegmentHDRFilter_dynamicCast(long j, NLENode nLENode);

    public static final native int NLESegmentHDRFilter_getAsfMode(long j, NLESegmentHDRFilter nLESegmentHDRFilter);

    public static final native boolean NLESegmentHDRFilter_getDenoise(long j, NLESegmentHDRFilter nLESegmentHDRFilter);

    public static final native String NLESegmentHDRFilter_getFilePath(long j, NLESegmentHDRFilter nLESegmentHDRFilter);

    public static final native int NLESegmentHDRFilter_getFrameType(long j, NLESegmentHDRFilter nLESegmentHDRFilter);

    public static final native int NLESegmentHDRFilter_getHdrMode(long j, NLESegmentHDRFilter nLESegmentHDRFilter);

    public static final native boolean NLESegmentHDRFilter_hasAsfMode(long j, NLESegmentHDRFilter nLESegmentHDRFilter);

    public static final native boolean NLESegmentHDRFilter_hasDenoise(long j, NLESegmentHDRFilter nLESegmentHDRFilter);

    public static final native boolean NLESegmentHDRFilter_hasFilePath(long j, NLESegmentHDRFilter nLESegmentHDRFilter);

    public static final native boolean NLESegmentHDRFilter_hasFrameType(long j, NLESegmentHDRFilter nLESegmentHDRFilter);

    public static final native boolean NLESegmentHDRFilter_hasHdrMode(long j, NLESegmentHDRFilter nLESegmentHDRFilter);

    public static final native void NLESegmentHDRFilter_setAsfMode(long j, NLESegmentHDRFilter nLESegmentHDRFilter, int i);

    public static final native void NLESegmentHDRFilter_setDenoise(long j, NLESegmentHDRFilter nLESegmentHDRFilter, boolean z);

    public static final native void NLESegmentHDRFilter_setFilePath(long j, NLESegmentHDRFilter nLESegmentHDRFilter, String str);

    public static final native void NLESegmentHDRFilter_setFrameType(long j, NLESegmentHDRFilter nLESegmentHDRFilter, int i);

    public static final native void NLESegmentHDRFilter_setHdrMode(long j, NLESegmentHDRFilter nLESegmentHDRFilter, int i);

    public static final native long NLESegmentHSLFilter_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentHSLFilter_clone(long j, NLESegmentHSLFilter nLESegmentHSLFilter);

    public static final native long NLESegmentHSLFilter_dynamicCast(long j, NLENode nLENode);

    public static final native int NLESegmentHSLFilter_getColorType(long j, NLESegmentHSLFilter nLESegmentHSLFilter);

    public static final native double NLESegmentHSLFilter_getHue(long j, NLESegmentHSLFilter nLESegmentHSLFilter);

    public static final native double NLESegmentHSLFilter_getLightness(long j, NLESegmentHSLFilter nLESegmentHSLFilter);

    public static final native double NLESegmentHSLFilter_getSaturation(long j, NLESegmentHSLFilter nLESegmentHSLFilter);

    public static final native boolean NLESegmentHSLFilter_hasColorType(long j, NLESegmentHSLFilter nLESegmentHSLFilter);

    public static final native boolean NLESegmentHSLFilter_hasHue(long j, NLESegmentHSLFilter nLESegmentHSLFilter);

    public static final native boolean NLESegmentHSLFilter_hasLightness(long j, NLESegmentHSLFilter nLESegmentHSLFilter);

    public static final native boolean NLESegmentHSLFilter_hasSaturation(long j, NLESegmentHSLFilter nLESegmentHSLFilter);

    public static final native void NLESegmentHSLFilter_setColorType(long j, NLESegmentHSLFilter nLESegmentHSLFilter, int i);

    public static final native void NLESegmentHSLFilter_setHue(long j, NLESegmentHSLFilter nLESegmentHSLFilter, double d);

    public static final native void NLESegmentHSLFilter_setLightness(long j, NLESegmentHSLFilter nLESegmentHSLFilter, double d);

    public static final native void NLESegmentHSLFilter_setSaturation(long j, NLESegmentHSLFilter nLESegmentHSLFilter, double d);

    public static final native long NLESegmentImageSticker_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentImageSticker_clone(long j, NLESegmentImageSticker nLESegmentImageSticker);

    public static final native long NLESegmentImageSticker_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentImageSticker_getClip(long j, NLESegmentImageSticker nLESegmentImageSticker);

    public static final native long NLESegmentImageSticker_getCrop(long j, NLESegmentImageSticker nLESegmentImageSticker);

    public static final native long NLESegmentImageSticker_getImageFile(long j, NLESegmentImageSticker nLESegmentImageSticker);

    public static final native long NLESegmentImageSticker_getResource(long j, NLESegmentImageSticker nLESegmentImageSticker);

    public static final native int NLESegmentImageSticker_getType(long j, NLESegmentImageSticker nLESegmentImageSticker);

    public static final native void NLESegmentImageSticker_setClip(long j, NLESegmentImageSticker nLESegmentImageSticker, long j2, NLEStyClip nLEStyClip);

    public static final native void NLESegmentImageSticker_setCrop(long j, NLESegmentImageSticker nLESegmentImageSticker, long j2, NLEStyCrop nLEStyCrop);

    public static final native void NLESegmentImageSticker_setImageFile(long j, NLESegmentImageSticker nLESegmentImageSticker, long j2, NLEResourceNode nLEResourceNode);

    public static final native long NLESegmentImageVideoAnimation_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentImageVideoAnimation_clone(long j, NLESegmentImageVideoAnimation nLESegmentImageVideoAnimation);

    public static final native long NLESegmentImageVideoAnimation_dynamicCast(long j, NLENode nLENode);

    public static final native float NLESegmentImageVideoAnimation_getBeginScale(long j, NLESegmentImageVideoAnimation nLESegmentImageVideoAnimation);

    public static final native float NLESegmentImageVideoAnimation_getEndScale(long j, NLESegmentImageVideoAnimation nLESegmentImageVideoAnimation);

    public static final native boolean NLESegmentImageVideoAnimation_hasBeginScale(long j, NLESegmentImageVideoAnimation nLESegmentImageVideoAnimation);

    public static final native boolean NLESegmentImageVideoAnimation_hasEndScale(long j, NLESegmentImageVideoAnimation nLESegmentImageVideoAnimation);

    public static final native void NLESegmentImageVideoAnimation_setBeginScale(long j, NLESegmentImageVideoAnimation nLESegmentImageVideoAnimation, float f);

    public static final native void NLESegmentImageVideoAnimation_setEndScale(long j, NLESegmentImageVideoAnimation nLESegmentImageVideoAnimation, float f);

    public static final native long NLESegmentImage_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentImage_clone(long j, NLESegmentImage nLESegmentImage);

    public static final native void NLESegmentImage_copyValueNotMappedToStage(long j, NLESegmentImage nLESegmentImage);

    public static final native long NLESegmentImage_dynamicCast(long j, NLENode nLENode);

    public static final native float NLESegmentImage_getAlpha(long j, NLESegmentImage nLESegmentImage);

    public static final native long NLESegmentImage_getCanvasStyle(long j, NLESegmentImage nLESegmentImage);

    public static final native long NLESegmentImage_getClip(long j, NLESegmentImage nLESegmentImage);

    public static final native long NLESegmentImage_getCrop(long j, NLESegmentImage nLESegmentImage);

    public static final native long NLESegmentImage_getImageFile(long j, NLESegmentImage nLESegmentImage);

    public static final native long NLESegmentImage_getResource(long j, NLESegmentImage nLESegmentImage);

    public static final native boolean NLESegmentImage_hasAlpha(long j, NLESegmentImage nLESegmentImage);

    public static final native void NLESegmentImage_setAlpha(long j, NLESegmentImage nLESegmentImage, float f);

    public static final native void NLESegmentImage_setCanvasStyle(long j, NLESegmentImage nLESegmentImage, long j2, NLEStyCanvas nLEStyCanvas);

    public static final native void NLESegmentImage_setClip(long j, NLESegmentImage nLESegmentImage, long j2, NLEStyClip nLEStyClip);

    public static final native void NLESegmentImage_setCrop(long j, NLESegmentImage nLESegmentImage, long j2, NLEStyCrop nLEStyCrop);

    public static final native void NLESegmentImage_setImageFile(long j, NLESegmentImage nLESegmentImage, long j2, NLEResourceNode nLEResourceNode);

    public static final native long NLESegmentInfoSticker_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentInfoSticker_clone(long j, NLESegmentInfoSticker nLESegmentInfoSticker);

    public static final native void NLESegmentInfoSticker_copyValueNotMappedToStage(long j, NLESegmentInfoSticker nLESegmentInfoSticker);

    public static final native long NLESegmentInfoSticker_dynamicCast(long j, NLENode nLENode);

    public static final native boolean NLESegmentInfoSticker_getAddWithBuffer(long j, NLESegmentInfoSticker nLESegmentInfoSticker);

    public static final native long NLESegmentInfoSticker_getEffectSDKFile(long j, NLESegmentInfoSticker nLESegmentInfoSticker);

    public static final native long NLESegmentInfoSticker_getResource(long j, NLESegmentInfoSticker nLESegmentInfoSticker);

    public static final native boolean NLESegmentInfoSticker_hasAddWithBuffer(long j, NLESegmentInfoSticker nLESegmentInfoSticker);

    public static final native void NLESegmentInfoSticker_setAddWithBuffer(long j, NLESegmentInfoSticker nLESegmentInfoSticker, boolean z);

    public static final native void NLESegmentInfoSticker_setEffectSDKFile(long j, NLESegmentInfoSticker nLESegmentInfoSticker, long j2, NLEResourceNode nLEResourceNode);

    public static final native long NLESegmentIntegrationFilter_SWIGSmartPtrUpcast(long j);

    public static final native void NLESegmentIntegrationFilter_addEffectKeyValuePair(long j, NLESegmentIntegrationFilter nLESegmentIntegrationFilter, long j2, NLEStringFloatPair nLEStringFloatPair);

    public static final native void NLESegmentIntegrationFilter_clearEffectKeyValuePair(long j, NLESegmentIntegrationFilter nLESegmentIntegrationFilter);

    public static final native long NLESegmentIntegrationFilter_clone(long j, NLESegmentIntegrationFilter nLESegmentIntegrationFilter);

    public static final native long NLESegmentIntegrationFilter_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentIntegrationFilter_getEffectKeyValuePairs(long j, NLESegmentIntegrationFilter nLESegmentIntegrationFilter);

    public static final native boolean NLESegmentIntegrationFilter_removeEffectKeyValuePair(long j, NLESegmentIntegrationFilter nLESegmentIntegrationFilter, long j2, NLEStringFloatPair nLEStringFloatPair);

    public static final native String NLESegmentIntegrationFilter_toEffectJsonString(long j, NLESegmentIntegrationFilter nLESegmentIntegrationFilter);

    public static final native long NLESegmentLogColorWheelsFilter_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentLogColorWheelsFilter_clone(long j, NLESegmentLogColorWheelsFilter nLESegmentLogColorWheelsFilter);

    public static final native long NLESegmentLogColorWheelsFilter_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentLogColorWheelsFilter_getHighlight(long j, NLESegmentLogColorWheelsFilter nLESegmentLogColorWheelsFilter);

    public static final native long NLESegmentLogColorWheelsFilter_getMidtone(long j, NLESegmentLogColorWheelsFilter nLESegmentLogColorWheelsFilter);

    public static final native long NLESegmentLogColorWheelsFilter_getOffset(long j, NLESegmentLogColorWheelsFilter nLESegmentLogColorWheelsFilter);

    public static final native long NLESegmentLogColorWheelsFilter_getShadow(long j, NLESegmentLogColorWheelsFilter nLESegmentLogColorWheelsFilter);

    public static final native void NLESegmentLogColorWheelsFilter_setHighlight(long j, NLESegmentLogColorWheelsFilter nLESegmentLogColorWheelsFilter, long j2, NLEStyColor nLEStyColor);

    public static final native void NLESegmentLogColorWheelsFilter_setMidtone(long j, NLESegmentLogColorWheelsFilter nLESegmentLogColorWheelsFilter, long j2, NLEStyColor nLEStyColor);

    public static final native void NLESegmentLogColorWheelsFilter_setOffset(long j, NLESegmentLogColorWheelsFilter nLESegmentLogColorWheelsFilter, long j2, NLEStyColor nLEStyColor);

    public static final native void NLESegmentLogColorWheelsFilter_setShadow(long j, NLESegmentLogColorWheelsFilter nLESegmentLogColorWheelsFilter, long j2, NLEStyColor nLEStyColor);

    public static final native String NLESegmentLogColorWheelsFilter_toEffectJsonString(long j, NLESegmentLogColorWheelsFilter nLESegmentLogColorWheelsFilter);

    public static final native long NLESegmentMV_SWIGSmartPtrUpcast(long j);

    public static final native String NLESegmentMV_TYPE_AUDIO_get();

    public static final native String NLESegmentMV_TYPE_BGIMG_get();

    public static final native String NLESegmentMV_TYPE_GIF_get();

    public static final native String NLESegmentMV_TYPE_IMAGE_get();

    public static final native String NLESegmentMV_TYPE_RGBA_get();

    public static final native String NLESegmentMV_TYPE_TEXT_get();

    public static final native String NLESegmentMV_TYPE_VIDEO_get();

    public static final native long NLESegmentMV_clone(long j, NLESegmentMV nLESegmentMV);

    public static final native long NLESegmentMV_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentMV_getClip(long j, NLESegmentMV nLESegmentMV);

    public static final native long NLESegmentMV_getCrop(long j, NLESegmentMV nLESegmentMV);

    public static final native long NLESegmentMV_getHeight(long j, NLESegmentMV nLESegmentMV);

    public static final native long NLESegmentMV_getResource(long j, NLESegmentMV nLESegmentMV);

    public static final native long NLESegmentMV_getSourceFile(long j, NLESegmentMV nLESegmentMV);

    public static final native String NLESegmentMV_getSourceFileType(long j, NLESegmentMV nLESegmentMV);

    public static final native long NLESegmentMV_getTimeClipEnd(long j, NLESegmentMV nLESegmentMV);

    public static final native long NLESegmentMV_getTimeClipStart(long j, NLESegmentMV nLESegmentMV);

    public static final native float NLESegmentMV_getVolume(long j, NLESegmentMV nLESegmentMV);

    public static final native long NLESegmentMV_getWidth(long j, NLESegmentMV nLESegmentMV);

    public static final native boolean NLESegmentMV_hasHeight(long j, NLESegmentMV nLESegmentMV);

    public static final native boolean NLESegmentMV_hasSourceFileType(long j, NLESegmentMV nLESegmentMV);

    public static final native boolean NLESegmentMV_hasTimeClipEnd(long j, NLESegmentMV nLESegmentMV);

    public static final native boolean NLESegmentMV_hasTimeClipStart(long j, NLESegmentMV nLESegmentMV);

    public static final native boolean NLESegmentMV_hasVolume(long j, NLESegmentMV nLESegmentMV);

    public static final native boolean NLESegmentMV_hasWidth(long j, NLESegmentMV nLESegmentMV);

    public static final native void NLESegmentMV_setClip(long j, NLESegmentMV nLESegmentMV, long j2, NLEStyClip nLEStyClip);

    public static final native void NLESegmentMV_setCrop(long j, NLESegmentMV nLESegmentMV, long j2, NLEStyCrop nLEStyCrop);

    public static final native void NLESegmentMV_setHeight(long j, NLESegmentMV nLESegmentMV, long j2);

    public static final native void NLESegmentMV_setSourceFile(long j, NLESegmentMV nLESegmentMV, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentMV_setSourceFileType(long j, NLESegmentMV nLESegmentMV, String str);

    public static final native void NLESegmentMV_setTimeClipEnd(long j, NLESegmentMV nLESegmentMV, long j2);

    public static final native void NLESegmentMV_setTimeClipStart(long j, NLESegmentMV nLESegmentMV, long j2);

    public static final native void NLESegmentMV_setVolume(long j, NLESegmentMV nLESegmentMV, float f);

    public static final native void NLESegmentMV_setWidth(long j, NLESegmentMV nLESegmentMV, long j2);

    public static final native long NLESegmentMask_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentMask_clone(long j, NLESegmentMask nLESegmentMask);

    public static final native long NLESegmentMask_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentMask_getActualSize__SWIG_0(long j, NLESegmentMask nLESegmentMask, long j2, NLETrackSlot nLETrackSlot, boolean z);

    public static final native long NLESegmentMask_getActualSize__SWIG_1(long j, NLESegmentMask nLESegmentMask, long j2, NLETrackSlot nLETrackSlot);

    public static final native float NLESegmentMask_getAspectRatio(long j, NLESegmentMask nLESegmentMask);

    public static final native float NLESegmentMask_getCenterX(long j, NLESegmentMask nLESegmentMask);

    public static final native float NLESegmentMask_getCenterY(long j, NLESegmentMask nLESegmentMask);

    public static final native long NLESegmentMask_getEffectSDKMask(long j, NLESegmentMask nLESegmentMask);

    public static final native float NLESegmentMask_getFeather(long j, NLESegmentMask nLESegmentMask);

    public static final native float NLESegmentMask_getHeight(long j, NLESegmentMask nLESegmentMask);

    public static final native boolean NLESegmentMask_getInvert(long j, NLESegmentMask nLESegmentMask);

    public static final native String NLESegmentMask_getMaskType(long j, NLESegmentMask nLESegmentMask);

    public static final native long NLESegmentMask_getResource(long j, NLESegmentMask nLESegmentMask);

    public static final native float NLESegmentMask_getRotation(long j, NLESegmentMask nLESegmentMask);

    public static final native float NLESegmentMask_getRoundCorner(long j, NLESegmentMask nLESegmentMask);

    public static final native float NLESegmentMask_getScaleX(long j, NLESegmentMask nLESegmentMask);

    public static final native float NLESegmentMask_getScaleY(long j, NLESegmentMask nLESegmentMask);

    public static final native String NLESegmentMask_getText(long j, NLESegmentMask nLESegmentMask);

    public static final native float NLESegmentMask_getWidth(long j, NLESegmentMask nLESegmentMask);

    public static final native boolean NLESegmentMask_hasAspectRatio(long j, NLESegmentMask nLESegmentMask);

    public static final native boolean NLESegmentMask_hasCenterX(long j, NLESegmentMask nLESegmentMask);

    public static final native boolean NLESegmentMask_hasCenterY(long j, NLESegmentMask nLESegmentMask);

    public static final native boolean NLESegmentMask_hasFeather(long j, NLESegmentMask nLESegmentMask);

    public static final native boolean NLESegmentMask_hasHeight(long j, NLESegmentMask nLESegmentMask);

    public static final native boolean NLESegmentMask_hasInvert(long j, NLESegmentMask nLESegmentMask);

    public static final native boolean NLESegmentMask_hasMaskType(long j, NLESegmentMask nLESegmentMask);

    public static final native boolean NLESegmentMask_hasRotation(long j, NLESegmentMask nLESegmentMask);

    public static final native boolean NLESegmentMask_hasRoundCorner(long j, NLESegmentMask nLESegmentMask);

    public static final native boolean NLESegmentMask_hasScaleX(long j, NLESegmentMask nLESegmentMask);

    public static final native boolean NLESegmentMask_hasScaleY(long j, NLESegmentMask nLESegmentMask);

    public static final native boolean NLESegmentMask_hasText(long j, NLESegmentMask nLESegmentMask);

    public static final native boolean NLESegmentMask_hasWidth(long j, NLESegmentMask nLESegmentMask);

    public static final native void NLESegmentMask_setAspectRatio(long j, NLESegmentMask nLESegmentMask, float f);

    public static final native void NLESegmentMask_setCenterX(long j, NLESegmentMask nLESegmentMask, float f);

    public static final native void NLESegmentMask_setCenterY(long j, NLESegmentMask nLESegmentMask, float f);

    public static final native void NLESegmentMask_setEffectSDKMask(long j, NLESegmentMask nLESegmentMask, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentMask_setFeather(long j, NLESegmentMask nLESegmentMask, float f);

    public static final native void NLESegmentMask_setHeight(long j, NLESegmentMask nLESegmentMask, float f);

    public static final native void NLESegmentMask_setInvert(long j, NLESegmentMask nLESegmentMask, boolean z);

    public static final native void NLESegmentMask_setMaskType(long j, NLESegmentMask nLESegmentMask, String str);

    public static final native void NLESegmentMask_setRotation(long j, NLESegmentMask nLESegmentMask, float f);

    public static final native void NLESegmentMask_setRoundCorner(long j, NLESegmentMask nLESegmentMask, float f);

    public static final native void NLESegmentMask_setScaleX(long j, NLESegmentMask nLESegmentMask, float f);

    public static final native void NLESegmentMask_setScaleY(long j, NLESegmentMask nLESegmentMask, float f);

    public static final native void NLESegmentMask_setText(long j, NLESegmentMask nLESegmentMask, String str);

    public static final native void NLESegmentMask_setWidth(long j, NLESegmentMask nLESegmentMask, float f);

    public static final native String NLESegmentMask_toEffectJson(long j, NLESegmentMask nLESegmentMask, long j2, NLETrackSlot nLETrackSlot);

    public static final native long NLESegmentPrimaryColorWheelsFilter_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentPrimaryColorWheelsFilter_clone(long j, NLESegmentPrimaryColorWheelsFilter nLESegmentPrimaryColorWheelsFilter);

    public static final native long NLESegmentPrimaryColorWheelsFilter_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentPrimaryColorWheelsFilter_getGain(long j, NLESegmentPrimaryColorWheelsFilter nLESegmentPrimaryColorWheelsFilter);

    public static final native long NLESegmentPrimaryColorWheelsFilter_getGamma(long j, NLESegmentPrimaryColorWheelsFilter nLESegmentPrimaryColorWheelsFilter);

    public static final native long NLESegmentPrimaryColorWheelsFilter_getLift(long j, NLESegmentPrimaryColorWheelsFilter nLESegmentPrimaryColorWheelsFilter);

    public static final native long NLESegmentPrimaryColorWheelsFilter_getOffset(long j, NLESegmentPrimaryColorWheelsFilter nLESegmentPrimaryColorWheelsFilter);

    public static final native void NLESegmentPrimaryColorWheelsFilter_setGain(long j, NLESegmentPrimaryColorWheelsFilter nLESegmentPrimaryColorWheelsFilter, long j2, NLEStyColor nLEStyColor);

    public static final native void NLESegmentPrimaryColorWheelsFilter_setGamma(long j, NLESegmentPrimaryColorWheelsFilter nLESegmentPrimaryColorWheelsFilter, long j2, NLEStyColor nLEStyColor);

    public static final native void NLESegmentPrimaryColorWheelsFilter_setLift(long j, NLESegmentPrimaryColorWheelsFilter nLESegmentPrimaryColorWheelsFilter, long j2, NLEStyColor nLEStyColor);

    public static final native void NLESegmentPrimaryColorWheelsFilter_setOffset(long j, NLESegmentPrimaryColorWheelsFilter nLESegmentPrimaryColorWheelsFilter, long j2, NLEStyColor nLEStyColor);

    public static final native String NLESegmentPrimaryColorWheelsFilter_toEffectJsonString(long j, NLESegmentPrimaryColorWheelsFilter nLESegmentPrimaryColorWheelsFilter);

    public static final native long NLESegmentSticker_SWIGSmartPtrUpcast(long j);

    public static final native void NLESegmentSticker_addStickerAnimation(long j, NLESegmentSticker nLESegmentSticker, long j2, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native void NLESegmentSticker_clearStickerAnimation(long j, NLESegmentSticker nLESegmentSticker);

    public static final native long NLESegmentSticker_clone(long j, NLESegmentSticker nLESegmentSticker);

    public static final native long NLESegmentSticker_dynamicCast(long j, NLENode nLENode);

    public static final native float NLESegmentSticker_getAlpha(long j, NLESegmentSticker nLESegmentSticker);

    public static final native long NLESegmentSticker_getAnimation(long j, NLESegmentSticker nLESegmentSticker);

    public static final native int NLESegmentSticker_getCompositeTimeAdjustType(long j, NLESegmentSticker nLESegmentSticker);

    public static final native String NLESegmentSticker_getEffectInfo(long j, NLESegmentSticker nLESegmentSticker);

    public static final native long NLESegmentSticker_getInfoStringList(long j, NLESegmentSticker nLESegmentSticker);

    public static final native long NLESegmentSticker_getStickerAnimations(long j, NLESegmentSticker nLESegmentSticker);

    public static final native boolean NLESegmentSticker_hasAlpha(long j, NLESegmentSticker nLESegmentSticker);

    public static final native boolean NLESegmentSticker_hasCompositeTimeAdjustType(long j, NLESegmentSticker nLESegmentSticker);

    public static final native boolean NLESegmentSticker_hasEffectInfo(long j, NLESegmentSticker nLESegmentSticker);

    public static final native boolean NLESegmentSticker_removeStickerAnimation(long j, NLESegmentSticker nLESegmentSticker, long j2, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native void NLESegmentSticker_setAlpha(long j, NLESegmentSticker nLESegmentSticker, float f);

    public static final native void NLESegmentSticker_setAnimation(long j, NLESegmentSticker nLESegmentSticker, long j2, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native void NLESegmentSticker_setCompositeTimeAdjustType(long j, NLESegmentSticker nLESegmentSticker, int i);

    public static final native void NLESegmentSticker_setEffectInfo(long j, NLESegmentSticker nLESegmentSticker, String str);

    public static final native void NLESegmentSticker_setInfoStringList(long j, NLESegmentSticker nLESegmentSticker, long j2, VecString vecString);

    public static final native long NLESegmentSubtitleSticker_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentSubtitleSticker_clone(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker);

    public static final native long NLESegmentSubtitleSticker_dynamicCast(long j, NLENode nLENode);

    public static final native String NLESegmentSubtitleSticker_getConnectedAudioSlotUUID(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker);

    public static final native long NLESegmentSubtitleSticker_getEffectSDKFile(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker);

    public static final native long NLESegmentSubtitleSticker_getResource(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker);

    public static final native long NLESegmentSubtitleSticker_getSRTFile(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker);

    public static final native long NLESegmentSubtitleSticker_getStyle(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker);

    public static final native long NLESegmentSubtitleSticker_getTimeClipEnd(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker);

    public static final native long NLESegmentSubtitleSticker_getTimeClipStart(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker);

    public static final native boolean NLESegmentSubtitleSticker_hasConnectedAudioSlotUUID(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker);

    public static final native boolean NLESegmentSubtitleSticker_hasTimeClipEnd(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker);

    public static final native boolean NLESegmentSubtitleSticker_hasTimeClipStart(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker);

    public static final native void NLESegmentSubtitleSticker_setConnectedAudioSlotUUID(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker, String str);

    public static final native void NLESegmentSubtitleSticker_setEffectSDKFile(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentSubtitleSticker_setSRTFile(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentSubtitleSticker_setStyle(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker, long j2, NLEStyText nLEStyText);

    public static final native void NLESegmentSubtitleSticker_setTimeClipEnd(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker, long j2);

    public static final native void NLESegmentSubtitleSticker_setTimeClipStart(long j, NLESegmentSubtitleSticker nLESegmentSubtitleSticker, long j2);

    public static final native long NLESegmentTemplate_SWIGSmartPtrUpcast(long j);

    public static final native void NLESegmentTemplate_addChildElementList(long j, NLESegmentTemplate nLESegmentTemplate, long j2, NLETrackSlot nLETrackSlot);

    public static final native void NLESegmentTemplate_clearChildElementList(long j, NLESegmentTemplate nLESegmentTemplate);

    public static final native long NLESegmentTemplate_clone(long j, NLESegmentTemplate nLESegmentTemplate);

    public static final native long NLESegmentTemplate_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentTemplate_getChildElementLists(long j, NLESegmentTemplate nLESegmentTemplate);

    public static final native String NLESegmentTemplate_getDependResourceJson(long j, NLESegmentTemplate nLESegmentTemplate);

    public static final native long NLESegmentTemplate_getNLESegmentTemplateProperty();

    public static final native String NLESegmentTemplate_getResourceFolder(long j, NLESegmentTemplate nLESegmentTemplate);

    public static final native boolean NLESegmentTemplate_hasDependResourceJson(long j, NLESegmentTemplate nLESegmentTemplate);

    public static final native boolean NLESegmentTemplate_hasResourceFolder(long j, NLESegmentTemplate nLESegmentTemplate);

    public static final native boolean NLESegmentTemplate_removeChildElementList(long j, NLESegmentTemplate nLESegmentTemplate, long j2, NLETrackSlot nLETrackSlot);

    public static final native void NLESegmentTemplate_setDependResourceJson(long j, NLESegmentTemplate nLESegmentTemplate, String str);

    public static final native void NLESegmentTemplate_setResourceFolder(long j, NLESegmentTemplate nLESegmentTemplate, String str);

    public static final native long NLESegmentTextSticker_SWIGSmartPtrUpcast(long j);

    public static final native void NLESegmentTextSticker_addRichContentResource(long j, NLESegmentTextSticker nLESegmentTextSticker, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentTextSticker_clearRichContentResource(long j, NLESegmentTextSticker nLESegmentTextSticker);

    public static final native long NLESegmentTextSticker_clone(long j, NLESegmentTextSticker nLESegmentTextSticker);

    public static final native long NLESegmentTextSticker_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentTextSticker_getCommonRecognizedWord(long j, NLESegmentTextSticker nLESegmentTextSticker);

    public static final native String NLESegmentTextSticker_getContent(long j, NLESegmentTextSticker nLESegmentTextSticker);

    public static final native boolean NLESegmentTextSticker_getIsRichtext(long j, NLESegmentTextSticker nLESegmentTextSticker);

    public static final native String NLESegmentTextSticker_getRichContent(long j, NLESegmentTextSticker nLESegmentTextSticker);

    public static final native long NLESegmentTextSticker_getRichContentResources(long j, NLESegmentTextSticker nLESegmentTextSticker);

    public static final native long NLESegmentTextSticker_getStyle(long j, NLESegmentTextSticker nLESegmentTextSticker);

    public static final native int NLESegmentTextSticker_getType(long j, NLESegmentTextSticker nLESegmentTextSticker);

    public static final native boolean NLESegmentTextSticker_hasContent(long j, NLESegmentTextSticker nLESegmentTextSticker);

    public static final native boolean NLESegmentTextSticker_hasIsRichtext(long j, NLESegmentTextSticker nLESegmentTextSticker);

    public static final native boolean NLESegmentTextSticker_hasRichContent(long j, NLESegmentTextSticker nLESegmentTextSticker);

    public static final native boolean NLESegmentTextSticker_removeRichContentResource(long j, NLESegmentTextSticker nLESegmentTextSticker, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentTextSticker_setCommonRecognizedWord(long j, NLESegmentTextSticker nLESegmentTextSticker, long j2, NLEStyRecognizedWord nLEStyRecognizedWord);

    public static final native void NLESegmentTextSticker_setContent(long j, NLESegmentTextSticker nLESegmentTextSticker, String str);

    public static final native void NLESegmentTextSticker_setEffectSDKJsonString(long j, NLESegmentTextSticker nLESegmentTextSticker, String str);

    public static final native void NLESegmentTextSticker_setIsRichtext(long j, NLESegmentTextSticker nLESegmentTextSticker, boolean z);

    public static final native void NLESegmentTextSticker_setRichContent(long j, NLESegmentTextSticker nLESegmentTextSticker, String str);

    public static final native void NLESegmentTextSticker_setStyle(long j, NLESegmentTextSticker nLESegmentTextSticker, long j2, NLEStyText nLEStyText);

    public static final native String NLESegmentTextSticker_toEffectJson(long j, NLESegmentTextSticker nLESegmentTextSticker);

    public static final native long NLESegmentTextTemplate_SWIGSmartPtrUpcast(long j);

    public static final native void NLESegmentTextTemplate_addFont(long j, NLESegmentTextTemplate nLESegmentTextTemplate, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentTextTemplate_addTextClip(long j, NLESegmentTextTemplate nLESegmentTextTemplate, long j2, NLETextTemplateClip nLETextTemplateClip);

    public static final native void NLESegmentTextTemplate_clearFont(long j, NLESegmentTextTemplate nLESegmentTextTemplate);

    public static final native void NLESegmentTextTemplate_clearTextClip(long j, NLESegmentTextTemplate nLESegmentTextTemplate);

    public static final native long NLESegmentTextTemplate_clone(long j, NLESegmentTextTemplate nLESegmentTextTemplate);

    public static final native long NLESegmentTextTemplate_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentTextTemplate_getEffectSDKFile(long j, NLESegmentTextTemplate nLESegmentTextTemplate);

    public static final native long NLESegmentTextTemplate_getFonts(long j, NLESegmentTextTemplate nLESegmentTextTemplate);

    public static final native long NLESegmentTextTemplate_getResource(long j, NLESegmentTextTemplate nLESegmentTextTemplate);

    public static final native long NLESegmentTextTemplate_getTextClips(long j, NLESegmentTextTemplate nLESegmentTextTemplate);

    public static final native int NLESegmentTextTemplate_getType(long j, NLESegmentTextTemplate nLESegmentTextTemplate);

    public static final native boolean NLESegmentTextTemplate_removeFont(long j, NLESegmentTextTemplate nLESegmentTextTemplate, long j2, NLEResourceNode nLEResourceNode);

    public static final native boolean NLESegmentTextTemplate_removeTextClip(long j, NLESegmentTextTemplate nLESegmentTextTemplate, long j2, NLETextTemplateClip nLETextTemplateClip);

    public static final native void NLESegmentTextTemplate_setEffectSDKFile(long j, NLESegmentTextTemplate nLESegmentTextTemplate, long j2, NLEResourceNode nLEResourceNode);

    public static final native long NLESegmentTimeEffect_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentTimeEffect_clone(long j, NLESegmentTimeEffect nLESegmentTimeEffect);

    public static final native long NLESegmentTimeEffect_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentTimeEffect_getTimeEffectType(long j, NLESegmentTimeEffect nLESegmentTimeEffect);

    public static final native int NLESegmentTimeEffect_getType(long j, NLESegmentTimeEffect nLESegmentTimeEffect);

    public static final native boolean NLESegmentTimeEffect_hasTimeEffectType(long j, NLESegmentTimeEffect nLESegmentTimeEffect);

    public static final native void NLESegmentTimeEffect_setTimeEffectType(long j, NLESegmentTimeEffect nLESegmentTimeEffect, long j2);

    public static final native long NLESegmentTransition_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentTransition_clone(long j, NLESegmentTransition nLESegmentTransition);

    public static final native long NLESegmentTransition_dynamicCast(long j, NLENode nLENode);

    public static final native long NLESegmentTransition_getDuration(long j, NLESegmentTransition nLESegmentTransition);

    public static final native long NLESegmentTransition_getEffectSDKTransition(long j, NLESegmentTransition nLESegmentTransition);

    public static final native int NLESegmentTransition_getMediaTransType(long j, NLESegmentTransition nLESegmentTransition);

    public static final native boolean NLESegmentTransition_getOverlap(long j, NLESegmentTransition nLESegmentTransition);

    public static final native long NLESegmentTransition_getResource(long j, NLESegmentTransition nLESegmentTransition);

    public static final native boolean NLESegmentTransition_getTimeChange(long j, NLESegmentTransition nLESegmentTransition);

    public static final native long NLESegmentTransition_getTransitionDuration(long j, NLESegmentTransition nLESegmentTransition);

    public static final native boolean NLESegmentTransition_hasMediaTransType(long j, NLESegmentTransition nLESegmentTransition);

    public static final native boolean NLESegmentTransition_hasOverlap(long j, NLESegmentTransition nLESegmentTransition);

    public static final native boolean NLESegmentTransition_hasTimeChange(long j, NLESegmentTransition nLESegmentTransition);

    public static final native boolean NLESegmentTransition_hasTransitionDuration(long j, NLESegmentTransition nLESegmentTransition);

    public static final native void NLESegmentTransition_setEffectSDKTransition(long j, NLESegmentTransition nLESegmentTransition, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentTransition_setMediaTransType(long j, NLESegmentTransition nLESegmentTransition, int i);

    public static final native void NLESegmentTransition_setOverlap(long j, NLESegmentTransition nLESegmentTransition, boolean z);

    public static final native void NLESegmentTransition_setTimeChange(long j, NLESegmentTransition nLESegmentTransition, boolean z);

    public static final native void NLESegmentTransition_setTransitionDuration(long j, NLESegmentTransition nLESegmentTransition, long j2);

    public static final native long NLESegmentVideoAnimation_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentVideoAnimation_clone(long j, NLESegmentVideoAnimation nLESegmentVideoAnimation);

    public static final native long NLESegmentVideoAnimation_dynamicCast(long j, NLENode nLENode);

    public static final native String NLESegmentVideoAnimation_getAnimJsonParam(long j, NLESegmentVideoAnimation nLESegmentVideoAnimation);

    public static final native long NLESegmentVideoAnimation_getAnimationDuration(long j, NLESegmentVideoAnimation nLESegmentVideoAnimation);

    public static final native long NLESegmentVideoAnimation_getDuration(long j, NLESegmentVideoAnimation nLESegmentVideoAnimation);

    public static final native long NLESegmentVideoAnimation_getEffectSDKVideoAnimation(long j, NLESegmentVideoAnimation nLESegmentVideoAnimation);

    public static final native long NLESegmentVideoAnimation_getResource(long j, NLESegmentVideoAnimation nLESegmentVideoAnimation);

    public static final native boolean NLESegmentVideoAnimation_hasAnimJsonParam(long j, NLESegmentVideoAnimation nLESegmentVideoAnimation);

    public static final native boolean NLESegmentVideoAnimation_hasAnimationDuration(long j, NLESegmentVideoAnimation nLESegmentVideoAnimation);

    public static final native void NLESegmentVideoAnimation_setAnimJsonParam(long j, NLESegmentVideoAnimation nLESegmentVideoAnimation, String str);

    public static final native void NLESegmentVideoAnimation_setAnimationDuration(long j, NLESegmentVideoAnimation nLESegmentVideoAnimation, long j2);

    public static final native void NLESegmentVideoAnimation_setEffectSDKVideoAnimation(long j, NLESegmentVideoAnimation nLESegmentVideoAnimation, long j2, NLEResourceNode nLEResourceNode);

    public static final native long NLESegmentVideo_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegmentVideo_clone(long j, NLESegmentVideo nLESegmentVideo);

    public static final native long NLESegmentVideo_dynamicCast(long j, NLENode nLENode);

    public static final native float NLESegmentVideo_getAlpha(long j, NLESegmentVideo nLESegmentVideo);

    public static final native long NLESegmentVideo_getBlendFile(long j, NLESegmentVideo nLESegmentVideo);

    public static final native long NLESegmentVideo_getCanvasStyle(long j, NLESegmentVideo nLESegmentVideo);

    public static final native long NLESegmentVideo_getClip(long j, NLESegmentVideo nLESegmentVideo);

    public static final native long NLESegmentVideo_getCrop(long j, NLESegmentVideo nLESegmentVideo);

    public static final native boolean NLESegmentVideo_getEnableAudio(long j, NLESegmentVideo nLESegmentVideo);

    public static final native boolean NLESegmentVideo_getIgnoreUserSetTimeClipEnd(long j, NLESegmentVideo nLESegmentVideo);

    public static final native boolean NLESegmentVideo_getIsWithEffect(long j, NLESegmentVideo nLESegmentVideo);

    public static final native boolean NLESegmentVideo_hasAlpha(long j, NLESegmentVideo nLESegmentVideo);

    public static final native boolean NLESegmentVideo_hasEnableAudio(long j, NLESegmentVideo nLESegmentVideo);

    public static final native boolean NLESegmentVideo_hasIgnoreUserSetTimeClipEnd(long j, NLESegmentVideo nLESegmentVideo);

    public static final native boolean NLESegmentVideo_hasIsWithEffect(long j, NLESegmentVideo nLESegmentVideo);

    public static final native void NLESegmentVideo_setAlpha(long j, NLESegmentVideo nLESegmentVideo, float f);

    public static final native void NLESegmentVideo_setBlendFile(long j, NLESegmentVideo nLESegmentVideo, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLESegmentVideo_setCanvasStyle(long j, NLESegmentVideo nLESegmentVideo, long j2, NLEStyCanvas nLEStyCanvas);

    public static final native void NLESegmentVideo_setClip(long j, NLESegmentVideo nLESegmentVideo, long j2, NLEStyClip nLEStyClip);

    public static final native void NLESegmentVideo_setCrop(long j, NLESegmentVideo nLESegmentVideo, long j2, NLEStyCrop nLEStyCrop);

    public static final native void NLESegmentVideo_setEnableAudio(long j, NLESegmentVideo nLESegmentVideo, boolean z);

    public static final native void NLESegmentVideo_setIgnoreUserSetTimeClipEnd(long j, NLESegmentVideo nLESegmentVideo, boolean z);

    public static final native void NLESegmentVideo_setIsWithEffect(long j, NLESegmentVideo nLESegmentVideo, boolean z);

    public static final native long NLESegment_SWIGSmartPtrUpcast(long j);

    public static final native long NLESegment_getDuration(long j, NLESegment nLESegment);

    public static final native long NLESegment_getResource(long j, NLESegment nLESegment);

    public static final native int NLESegment_getType(long j, NLESegment nLESegment);

    public static final native long NLESetting_SWIGSmartPtrUpcast(long j);

    public static final native long NLESetting_clone(long j, NLESetting nLESetting);

    public static final native long NLESetting_dynamicCast(long j, NLENode nLENode);

    public static final native boolean NLESetting_getCartesion(long j, NLESetting nLESetting);

    public static final native boolean NLESetting_getEffectSegmentUpper(long j, NLESetting nLESetting);

    public static final native boolean NLESetting_getFreeRenderLayer(long j, NLESetting nLESetting);

    public static final native boolean NLESetting_getUseRelativeTime(long j, NLESetting nLESetting);

    public static final native boolean NLESetting_hasCartesion(long j, NLESetting nLESetting);

    public static final native boolean NLESetting_hasEffectSegmentUpper(long j, NLESetting nLESetting);

    public static final native boolean NLESetting_hasFreeRenderLayer(long j, NLESetting nLESetting);

    public static final native boolean NLESetting_hasUseRelativeTime(long j, NLESetting nLESetting);

    public static final native void NLESetting_setCartesion(long j, NLESetting nLESetting, boolean z);

    public static final native void NLESetting_setEffectSegmentUpper(long j, NLESetting nLESetting, boolean z);

    public static final native void NLESetting_setFreeRenderLayer(long j, NLESetting nLESetting, boolean z);

    public static final native void NLESetting_setUseRelativeTime(long j, NLESetting nLESetting, boolean z);

    public static final native long NLESizeUtils_NLESizeMake(float f, float f2);

    public static final native String NLESize_debug(long j, NLESize nLESize);

    public static final native float NLESize_height_get(long j, NLESize nLESize);

    public static final native void NLESize_height_set(long j, NLESize nLESize, float f);

    public static final native boolean NLESize_valid(long j, NLESize nLESize);

    public static final native float NLESize_width_get(long j, NLESize nLESize);

    public static final native void NLESize_width_set(long j, NLESize nLESize, float f);

    public static final native long NLEStringFloatPair_SWIGSmartPtrUpcast(long j);

    public static final native long NLEStringFloatPair_clone(long j, NLEStringFloatPair nLEStringFloatPair);

    public static final native long NLEStringFloatPair_dynamicCast(long j, NLENode nLENode);

    public static final native String NLEStringFloatPair_getFirst(long j, NLEStringFloatPair nLEStringFloatPair);

    public static final native float NLEStringFloatPair_getSecond(long j, NLEStringFloatPair nLEStringFloatPair);

    public static final native boolean NLEStringFloatPair_hasFirst(long j, NLEStringFloatPair nLEStringFloatPair);

    public static final native boolean NLEStringFloatPair_hasSecond(long j, NLEStringFloatPair nLEStringFloatPair);

    public static final native void NLEStringFloatPair_setFirst(long j, NLEStringFloatPair nLEStringFloatPair, String str);

    public static final native void NLEStringFloatPair_setSecond(long j, NLEStringFloatPair nLEStringFloatPair, float f);

    public static final native long NLEStringStringPair_SWIGSmartPtrUpcast(long j);

    public static final native long NLEStringStringPair_clone(long j, NLEStringStringPair nLEStringStringPair);

    public static final native long NLEStringStringPair_dynamicCast(long j, NLENode nLENode);

    public static final native String NLEStringStringPair_getFirst(long j, NLEStringStringPair nLEStringStringPair);

    public static final native String NLEStringStringPair_getSecond(long j, NLEStringStringPair nLEStringStringPair);

    public static final native boolean NLEStringStringPair_hasFirst(long j, NLEStringStringPair nLEStringStringPair);

    public static final native boolean NLEStringStringPair_hasSecond(long j, NLEStringStringPair nLEStringStringPair);

    public static final native void NLEStringStringPair_setFirst(long j, NLEStringStringPair nLEStringStringPair, String str);

    public static final native void NLEStringStringPair_setSecond(long j, NLEStringStringPair nLEStringStringPair, String str);

    public static final native long NLEStyCanvas_SWIGSmartPtrUpcast(long j);

    public static final native long NLEStyCanvas_clone(long j, NLEStyCanvas nLEStyCanvas);

    public static final native long NLEStyCanvas_dynamicCast(long j, NLENode nLENode);

    public static final native boolean NLEStyCanvas_getAntialiasing(long j, NLEStyCanvas nLEStyCanvas);

    public static final native float NLEStyCanvas_getBlurRadius(long j, NLEStyCanvas nLEStyCanvas);

    public static final native long NLEStyCanvas_getBorderColor(long j, NLEStyCanvas nLEStyCanvas);

    public static final native long NLEStyCanvas_getBorderWidth(long j, NLEStyCanvas nLEStyCanvas);

    public static final native long NLEStyCanvas_getColor(long j, NLEStyCanvas nLEStyCanvas);

    public static final native long NLEStyCanvas_getEndColor(long j, NLEStyCanvas nLEStyCanvas);

    public static final native boolean NLEStyCanvas_getGradientColorDither(long j, NLEStyCanvas nLEStyCanvas);

    public static final native long NLEStyCanvas_getImage(long j, NLEStyCanvas nLEStyCanvas);

    public static final native long NLEStyCanvas_getStartColor(long j, NLEStyCanvas nLEStyCanvas);

    public static final native int NLEStyCanvas_getType(long j, NLEStyCanvas nLEStyCanvas);

    public static final native boolean NLEStyCanvas_hasAntialiasing(long j, NLEStyCanvas nLEStyCanvas);

    public static final native boolean NLEStyCanvas_hasBlurRadius(long j, NLEStyCanvas nLEStyCanvas);

    public static final native boolean NLEStyCanvas_hasBorderColor(long j, NLEStyCanvas nLEStyCanvas);

    public static final native boolean NLEStyCanvas_hasBorderWidth(long j, NLEStyCanvas nLEStyCanvas);

    public static final native boolean NLEStyCanvas_hasColor(long j, NLEStyCanvas nLEStyCanvas);

    public static final native boolean NLEStyCanvas_hasEndColor(long j, NLEStyCanvas nLEStyCanvas);

    public static final native boolean NLEStyCanvas_hasGradientColorDither(long j, NLEStyCanvas nLEStyCanvas);

    public static final native boolean NLEStyCanvas_hasStartColor(long j, NLEStyCanvas nLEStyCanvas);

    public static final native boolean NLEStyCanvas_hasType(long j, NLEStyCanvas nLEStyCanvas);

    public static final native void NLEStyCanvas_setAntialiasing(long j, NLEStyCanvas nLEStyCanvas, boolean z);

    public static final native void NLEStyCanvas_setBlurRadius(long j, NLEStyCanvas nLEStyCanvas, float f);

    public static final native void NLEStyCanvas_setBorderColor(long j, NLEStyCanvas nLEStyCanvas, long j2);

    public static final native void NLEStyCanvas_setBorderWidth(long j, NLEStyCanvas nLEStyCanvas, long j2);

    public static final native void NLEStyCanvas_setColor(long j, NLEStyCanvas nLEStyCanvas, long j2);

    public static final native void NLEStyCanvas_setEndColor(long j, NLEStyCanvas nLEStyCanvas, long j2);

    public static final native void NLEStyCanvas_setGradientColorDither(long j, NLEStyCanvas nLEStyCanvas, boolean z);

    public static final native void NLEStyCanvas_setImage(long j, NLEStyCanvas nLEStyCanvas, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLEStyCanvas_setStartColor(long j, NLEStyCanvas nLEStyCanvas, long j2);

    public static final native void NLEStyCanvas_setType(long j, NLEStyCanvas nLEStyCanvas, int i);

    public static final native long NLEStyClip_SWIGSmartPtrUpcast(long j);

    public static final native long NLEStyClip_clone(long j, NLEStyClip nLEStyClip);

    public static final native long NLEStyClip_dynamicCast(long j, NLENode nLENode);

    public static final native long NLEStyClip_getLeftLower(long j, NLEStyClip nLEStyClip);

    public static final native long NLEStyClip_getLeftUpper(long j, NLEStyClip nLEStyClip);

    public static final native long NLEStyClip_getRightLower(long j, NLEStyClip nLEStyClip);

    public static final native long NLEStyClip_getRightUpper(long j, NLEStyClip nLEStyClip);

    public static final native void NLEStyClip_setLeftLower(long j, NLEStyClip nLEStyClip, long j2, NLEPoint nLEPoint);

    public static final native void NLEStyClip_setLeftUpper(long j, NLEStyClip nLEStyClip, long j2, NLEPoint nLEPoint);

    public static final native void NLEStyClip_setRightLower(long j, NLEStyClip nLEStyClip, long j2, NLEPoint nLEPoint);

    public static final native void NLEStyClip_setRightUpper(long j, NLEStyClip nLEStyClip, long j2, NLEPoint nLEPoint);

    public static final native long NLEStyColorHSL_SWIGSmartPtrUpcast(long j);

    public static final native long NLEStyColorHSL_clone(long j, NLEStyColorHSL nLEStyColorHSL);

    public static final native long NLEStyColorHSL_dynamicCast(long j, NLENode nLENode);

    public static final native double NLEStyColorHSL_getHue(long j, NLEStyColorHSL nLEStyColorHSL);

    public static final native double NLEStyColorHSL_getLightness(long j, NLEStyColorHSL nLEStyColorHSL);

    public static final native double NLEStyColorHSL_getSaturation(long j, NLEStyColorHSL nLEStyColorHSL);

    public static final native boolean NLEStyColorHSL_hasHue(long j, NLEStyColorHSL nLEStyColorHSL);

    public static final native boolean NLEStyColorHSL_hasLightness(long j, NLEStyColorHSL nLEStyColorHSL);

    public static final native boolean NLEStyColorHSL_hasSaturation(long j, NLEStyColorHSL nLEStyColorHSL);

    public static final native void NLEStyColorHSL_setHue(long j, NLEStyColorHSL nLEStyColorHSL, double d);

    public static final native void NLEStyColorHSL_setLightness(long j, NLEStyColorHSL nLEStyColorHSL, double d);

    public static final native void NLEStyColorHSL_setSaturation(long j, NLEStyColorHSL nLEStyColorHSL, double d);

    public static final native long NLEStyColorRGB_SWIGSmartPtrUpcast(long j);

    public static final native long NLEStyColorRGB_clone(long j, NLEStyColorRGB nLEStyColorRGB);

    public static final native long NLEStyColorRGB_dynamicCast(long j, NLENode nLENode);

    public static final native double NLEStyColorRGB_getBlue(long j, NLEStyColorRGB nLEStyColorRGB);

    public static final native double NLEStyColorRGB_getGreen(long j, NLEStyColorRGB nLEStyColorRGB);

    public static final native double NLEStyColorRGB_getRed(long j, NLEStyColorRGB nLEStyColorRGB);

    public static final native boolean NLEStyColorRGB_hasBlue(long j, NLEStyColorRGB nLEStyColorRGB);

    public static final native boolean NLEStyColorRGB_hasGreen(long j, NLEStyColorRGB nLEStyColorRGB);

    public static final native boolean NLEStyColorRGB_hasRed(long j, NLEStyColorRGB nLEStyColorRGB);

    public static final native void NLEStyColorRGB_setBlue(long j, NLEStyColorRGB nLEStyColorRGB, double d);

    public static final native void NLEStyColorRGB_setGreen(long j, NLEStyColorRGB nLEStyColorRGB, double d);

    public static final native void NLEStyColorRGB_setRed(long j, NLEStyColorRGB nLEStyColorRGB, double d);

    public static final native long NLEStyColor_SWIGSmartPtrUpcast(long j);

    public static final native long NLEStyColor_clone(long j, NLEStyColor nLEStyColor);

    public static final native long NLEStyColor_dynamicCast(long j, NLENode nLENode);

    public static final native long NLEStyColor_getHSL(long j, NLEStyColor nLEStyColor);

    public static final native long NLEStyColor_getRGB(long j, NLEStyColor nLEStyColor);

    public static final native double NLEStyColor_getStandardValue__SWIG_0(double d, double d2, double d3);

    public static final native double NLEStyColor_getStandardValue__SWIG_1(double d, double d2);

    public static final native double NLEStyColor_getStandardValue__SWIG_2(double d);

    public static final native void NLEStyColor_setHSL(long j, NLEStyColor nLEStyColor, long j2, NLEStyColorHSL nLEStyColorHSL);

    public static final native void NLEStyColor_setRGB(long j, NLEStyColor nLEStyColor, long j2, NLEStyColorRGB nLEStyColorRGB);

    public static final native long NLEStyCrop_SWIGSmartPtrUpcast(long j);

    public static final native long NLEStyCrop_clone(long j, NLEStyCrop nLEStyCrop);

    public static final native long NLEStyCrop_dynamicCast(long j, NLENode nLENode);

    public static final native float NLEStyCrop_getXLeft(long j, NLEStyCrop nLEStyCrop);

    public static final native float NLEStyCrop_getXLeftLower(long j, NLEStyCrop nLEStyCrop);

    public static final native float NLEStyCrop_getXLeftUpper(long j, NLEStyCrop nLEStyCrop);

    public static final native float NLEStyCrop_getXRight(long j, NLEStyCrop nLEStyCrop);

    public static final native float NLEStyCrop_getXRightLower(long j, NLEStyCrop nLEStyCrop);

    public static final native float NLEStyCrop_getXRightUpper(long j, NLEStyCrop nLEStyCrop);

    public static final native float NLEStyCrop_getYLeftLower(long j, NLEStyCrop nLEStyCrop);

    public static final native float NLEStyCrop_getYLeftUpper(long j, NLEStyCrop nLEStyCrop);

    public static final native float NLEStyCrop_getYLower(long j, NLEStyCrop nLEStyCrop);

    public static final native float NLEStyCrop_getYRightLower(long j, NLEStyCrop nLEStyCrop);

    public static final native float NLEStyCrop_getYRightUpper(long j, NLEStyCrop nLEStyCrop);

    public static final native float NLEStyCrop_getYUpper(long j, NLEStyCrop nLEStyCrop);

    public static final native boolean NLEStyCrop_hasXLeft(long j, NLEStyCrop nLEStyCrop);

    public static final native boolean NLEStyCrop_hasXLeftLower(long j, NLEStyCrop nLEStyCrop);

    public static final native boolean NLEStyCrop_hasXRight(long j, NLEStyCrop nLEStyCrop);

    public static final native boolean NLEStyCrop_hasXRightUpper(long j, NLEStyCrop nLEStyCrop);

    public static final native boolean NLEStyCrop_hasYLeftLower(long j, NLEStyCrop nLEStyCrop);

    public static final native boolean NLEStyCrop_hasYLower(long j, NLEStyCrop nLEStyCrop);

    public static final native boolean NLEStyCrop_hasYRightUpper(long j, NLEStyCrop nLEStyCrop);

    public static final native boolean NLEStyCrop_hasYUpper(long j, NLEStyCrop nLEStyCrop);

    public static final native void NLEStyCrop_setXLeft(long j, NLEStyCrop nLEStyCrop, float f);

    public static final native void NLEStyCrop_setXLeftLower(long j, NLEStyCrop nLEStyCrop, float f);

    public static final native void NLEStyCrop_setXLeftUpper(long j, NLEStyCrop nLEStyCrop, float f);

    public static final native void NLEStyCrop_setXRight(long j, NLEStyCrop nLEStyCrop, float f);

    public static final native void NLEStyCrop_setXRightLower(long j, NLEStyCrop nLEStyCrop, float f);

    public static final native void NLEStyCrop_setXRightUpper(long j, NLEStyCrop nLEStyCrop, float f);

    public static final native void NLEStyCrop_setYLeftLower(long j, NLEStyCrop nLEStyCrop, float f);

    public static final native void NLEStyCrop_setYLeftUpper(long j, NLEStyCrop nLEStyCrop, float f);

    public static final native void NLEStyCrop_setYLower(long j, NLEStyCrop nLEStyCrop, float f);

    public static final native void NLEStyCrop_setYRightLower(long j, NLEStyCrop nLEStyCrop, float f);

    public static final native void NLEStyCrop_setYRightUpper(long j, NLEStyCrop nLEStyCrop, float f);

    public static final native void NLEStyCrop_setYUpper(long j, NLEStyCrop nLEStyCrop, float f);

    public static final native long NLEStyRecognizedWord_SWIGSmartPtrUpcast(long j);

    public static final native long NLEStyRecognizedWord_clone(long j, NLEStyRecognizedWord nLEStyRecognizedWord);

    public static final native long NLEStyRecognizedWord_dynamicCast(long j, NLENode nLENode);

    public static final native long NLEStyRecognizedWord_getEndTime(long j, NLEStyRecognizedWord nLEStyRecognizedWord);

    public static final native long NLEStyRecognizedWord_getIsKey(long j, NLEStyRecognizedWord nLEStyRecognizedWord);

    public static final native long NLEStyRecognizedWord_getStartTime(long j, NLEStyRecognizedWord nLEStyRecognizedWord);

    public static final native long NLEStyRecognizedWord_getText(long j, NLEStyRecognizedWord nLEStyRecognizedWord);

    public static final native boolean NLEStyRecognizedWord_hasEndTime(long j, NLEStyRecognizedWord nLEStyRecognizedWord);

    public static final native boolean NLEStyRecognizedWord_hasIsKey(long j, NLEStyRecognizedWord nLEStyRecognizedWord);

    public static final native boolean NLEStyRecognizedWord_hasStartTime(long j, NLEStyRecognizedWord nLEStyRecognizedWord);

    public static final native boolean NLEStyRecognizedWord_hasText(long j, NLEStyRecognizedWord nLEStyRecognizedWord);

    public static final native void NLEStyRecognizedWord_setEndTime(long j, NLEStyRecognizedWord nLEStyRecognizedWord, long j2, VecInt vecInt);

    public static final native void NLEStyRecognizedWord_setIsKey(long j, NLEStyRecognizedWord nLEStyRecognizedWord, long j2, VecInt vecInt);

    public static final native void NLEStyRecognizedWord_setStartTime(long j, NLEStyRecognizedWord nLEStyRecognizedWord, long j2, VecInt vecInt);

    public static final native void NLEStyRecognizedWord_setText(long j, NLEStyRecognizedWord nLEStyRecognizedWord, long j2, VecString vecString);

    public static final native long NLEStyStickerAnim_SWIGSmartPtrUpcast(long j);

    public static final native long NLEStyStickerAnim_clone(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native long NLEStyStickerAnim_dynamicCast(long j, NLENode nLENode);

    public static final native String NLEStyStickerAnim_getAnimParams(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native int NLEStyStickerAnim_getAnimType(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native long NLEStyStickerAnim_getAtomAnim(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native int NLEStyStickerAnim_getAtomAnimEndTime(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native int NLEStyStickerAnim_getAtomAnimStartTime(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native long NLEStyStickerAnim_getInAnim(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native int NLEStyStickerAnim_getInDuration(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native boolean NLEStyStickerAnim_getLoop(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native long NLEStyStickerAnim_getOutAnim(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native int NLEStyStickerAnim_getOutDuration(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native long NLEStyStickerAnim_getRecognizedWord(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native boolean NLEStyStickerAnim_hasAnimParams(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native boolean NLEStyStickerAnim_hasAnimType(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native boolean NLEStyStickerAnim_hasAtomAnimEndTime(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native boolean NLEStyStickerAnim_hasAtomAnimStartTime(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native boolean NLEStyStickerAnim_hasInDuration(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native boolean NLEStyStickerAnim_hasLoop(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native boolean NLEStyStickerAnim_hasOutDuration(long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native void NLEStyStickerAnim_setAnimParams(long j, NLEStyStickerAnim nLEStyStickerAnim, String str);

    public static final native void NLEStyStickerAnim_setAnimType(long j, NLEStyStickerAnim nLEStyStickerAnim, int i);

    public static final native void NLEStyStickerAnim_setAtomAnim(long j, NLEStyStickerAnim nLEStyStickerAnim, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLEStyStickerAnim_setAtomAnimEndTime(long j, NLEStyStickerAnim nLEStyStickerAnim, int i);

    public static final native void NLEStyStickerAnim_setAtomAnimStartTime(long j, NLEStyStickerAnim nLEStyStickerAnim, int i);

    public static final native void NLEStyStickerAnim_setInAnim(long j, NLEStyStickerAnim nLEStyStickerAnim, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLEStyStickerAnim_setInDuration(long j, NLEStyStickerAnim nLEStyStickerAnim, int i);

    public static final native void NLEStyStickerAnim_setLoop(long j, NLEStyStickerAnim nLEStyStickerAnim, boolean z);

    public static final native void NLEStyStickerAnim_setOutAnim(long j, NLEStyStickerAnim nLEStyStickerAnim, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLEStyStickerAnim_setOutDuration(long j, NLEStyStickerAnim nLEStyStickerAnim, int i);

    public static final native void NLEStyStickerAnim_setRecognizedWord(long j, NLEStyStickerAnim nLEStyStickerAnim, long j2, NLEStyRecognizedWord nLEStyRecognizedWord);

    public static final native long NLEStyText_ARGB2RGBA(long j);

    public static final native int NLEStyText_ARGB2RGBInt(long j);

    public static final native long NLEStyText_RGBA2ARGB(long j, VecFloat vecFloat);

    public static final native long NLEStyText_SWIGSmartPtrUpcast(long j);

    public static final native void NLEStyText_addAnimInfo(long j, NLEStyText nLEStyText, long j2, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native void NLEStyText_addFallbackFontList(long j, NLEStyText nLEStyText, long j2, NLEResourceNode nLEResourceNode);

    public static final native String NLEStyText_argb2hex(long j);

    public static final native void NLEStyText_clearAnimInfo(long j, NLEStyText nLEStyText);

    public static final native void NLEStyText_clearFallbackFontList(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_clone(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_dynamicCast(long j, NLENode nLENode);

    public static final native int NLEStyText_getAlignType(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getAnimInfos(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_getBackground(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getBackgroundColor(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getBackgroundColorVector(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getBackgroundHeight(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getBackgroundHorizontalOffset(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_getBackgroundRoundCorner(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getBackgroundRoundRadius(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getBackgroundRoundRadiusScale(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getBackgroundVerticalOffset(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getBackgroundWidth(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_getBold(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getBoldWidth(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getCharSpacing(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getFallbackFont(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getFallbackFontLists(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getFloatFontSize(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getFlower(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getFont(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getFontSize(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getInnerPadding(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getItalicDegree(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getKTVColor(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getKTVColorVector(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getKTVOutlineColor(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getKTVOutlineColorVector(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getKTVShadowColor(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getKTVShadowColorVector(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getLineGap(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getLineMaxWidth(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_getOneLineTruncated(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_getOutline(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getOutlineColor(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getOutlineColorVector(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getOutlineWidth(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_getShadow(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getShadowColor(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getShadowColorVector(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getShadowOffsetX(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getShadowOffsetY(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getShadowSmoothing(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getShape(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_getShapeFlipX(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_getShapeFlipY(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getTextColor(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getTextColorVector(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_getTextLocale(long j, NLEStyText nLEStyText);

    public static final native String NLEStyText_getTruncatedPostfix(long j, NLEStyText nLEStyText);

    public static final native int NLEStyText_getTypeSettingKind(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_getUnderline(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getUnderlineOffset(long j, NLEStyText nLEStyText);

    public static final native float NLEStyText_getUnderlineWidth(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_getUseFlowerDefaultColor(long j, NLEStyText nLEStyText);

    public static final native long NLEStyText_getUseFlowerDefaultColorVector(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasAlignType(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasBackground(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasBackgroundColor(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasBackgroundHeight(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasBackgroundHorizontalOffset(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasBackgroundRoundCorner(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasBackgroundRoundRadius(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasBackgroundRoundRadiusScale(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasBackgroundVerticalOffset(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasBackgroundWidth(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasBold(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasBoldWidth(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasCharSpacing(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasFloatFontSize(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasFontSize(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasInnerPadding(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasItalicDegree(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasKTVColor(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasKTVOutlineColor(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasKTVShadowColor(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasLineGap(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasLineMaxWidth(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasOneLineTruncated(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasOutline(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasOutlineColor(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasOutlineWidth(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasShadow(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasShadowColor(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasShadowOffsetX(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasShadowOffsetY(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasShadowSmoothing(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasShapeFlipX(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasShapeFlipY(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasTextColor(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasTextLocale(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasTruncatedPostfix(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasTypeSettingKind(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasUnderline(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasUnderlineOffset(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasUnderlineWidth(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_hasUseFlowerDefaultColor(long j, NLEStyText nLEStyText);

    public static final native boolean NLEStyText_removeAnimInfo(long j, NLEStyText nLEStyText, long j2, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native boolean NLEStyText_removeFallbackFontList(long j, NLEStyText nLEStyText, long j2, NLEResourceNode nLEResourceNode);

    public static final native String NLEStyText_rgbaArray2RgbHex(long j, VecFloat vecFloat);

    public static final native String NLEStyText_rgbaArray2hex(long j, VecFloat vecFloat);

    public static final native void NLEStyText_setAlignType(long j, NLEStyText nLEStyText, int i);

    public static final native void NLEStyText_setBackground(long j, NLEStyText nLEStyText, boolean z);

    public static final native void NLEStyText_setBackgroundColor(long j, NLEStyText nLEStyText, long j2);

    public static final native void NLEStyText_setBackgroundColorVector(long j, NLEStyText nLEStyText, long j2, VecFloat vecFloat);

    public static final native void NLEStyText_setBackgroundHeight(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setBackgroundHorizontalOffset(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setBackgroundRoundCorner(long j, NLEStyText nLEStyText, boolean z);

    public static final native void NLEStyText_setBackgroundRoundRadius(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setBackgroundRoundRadiusScale(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setBackgroundVerticalOffset(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setBackgroundWidth(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setBold(long j, NLEStyText nLEStyText, boolean z);

    public static final native void NLEStyText_setBoldWidth(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setCharSpacing(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setFallbackFont(long j, NLEStyText nLEStyText, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLEStyText_setFloatFontSize(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setFlower(long j, NLEStyText nLEStyText, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLEStyText_setFont(long j, NLEStyText nLEStyText, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLEStyText_setFontSize(long j, NLEStyText nLEStyText, long j2);

    public static final native void NLEStyText_setInnerPadding(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setItalicDegree(long j, NLEStyText nLEStyText, long j2);

    public static final native void NLEStyText_setKTVColor(long j, NLEStyText nLEStyText, long j2);

    public static final native void NLEStyText_setKTVColorVector(long j, NLEStyText nLEStyText, long j2, VecFloat vecFloat);

    public static final native void NLEStyText_setKTVOutlineColor(long j, NLEStyText nLEStyText, long j2);

    public static final native void NLEStyText_setKTVOutlineColorVector(long j, NLEStyText nLEStyText, long j2, VecFloat vecFloat);

    public static final native void NLEStyText_setKTVShadowColor(long j, NLEStyText nLEStyText, long j2);

    public static final native void NLEStyText_setKTVShadowColorVector(long j, NLEStyText nLEStyText, long j2, VecFloat vecFloat);

    public static final native void NLEStyText_setLineGap(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setLineMaxWidth(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setOneLineTruncated(long j, NLEStyText nLEStyText, boolean z);

    public static final native void NLEStyText_setOutline(long j, NLEStyText nLEStyText, boolean z);

    public static final native void NLEStyText_setOutlineColor(long j, NLEStyText nLEStyText, long j2);

    public static final native void NLEStyText_setOutlineColorVector(long j, NLEStyText nLEStyText, long j2, VecFloat vecFloat);

    public static final native void NLEStyText_setOutlineWidth(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setShadow(long j, NLEStyText nLEStyText, boolean z);

    public static final native void NLEStyText_setShadowColor(long j, NLEStyText nLEStyText, long j2);

    public static final native void NLEStyText_setShadowColorVector(long j, NLEStyText nLEStyText, long j2, VecFloat vecFloat);

    public static final native void NLEStyText_setShadowOffsetX(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setShadowOffsetY(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setShadowSmoothing(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setShape(long j, NLEStyText nLEStyText, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLEStyText_setShapeFlipX(long j, NLEStyText nLEStyText, boolean z);

    public static final native void NLEStyText_setShapeFlipY(long j, NLEStyText nLEStyText, boolean z);

    public static final native void NLEStyText_setTextColor(long j, NLEStyText nLEStyText, long j2);

    public static final native void NLEStyText_setTextColorVector(long j, NLEStyText nLEStyText, long j2, VecFloat vecFloat);

    public static final native void NLEStyText_setTextLocale(long j, NLEStyText nLEStyText, boolean z);

    public static final native void NLEStyText_setTruncatedPostfix(long j, NLEStyText nLEStyText, String str);

    public static final native void NLEStyText_setTypeSettingKind(long j, NLEStyText nLEStyText, int i);

    public static final native void NLEStyText_setUnderline(long j, NLEStyText nLEStyText, boolean z);

    public static final native void NLEStyText_setUnderlineOffset(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setUnderlineWidth(long j, NLEStyText nLEStyText, float f);

    public static final native void NLEStyText_setUseFlowerDefaultColor(long j, NLEStyText nLEStyText, boolean z);

    public static final native void NLEStyText_setUseFlowerDefaultColorVector(long j, NLEStyText nLEStyText, long j2, VecFloat vecFloat);

    public static final native long NLEStyText_strToRGB(String str);

    public static final native void NLEStyText_supportMoreColor(long j, NLEStyText nLEStyText, boolean z);

    public static final native String NLEStyText_toEffectJsonString(long j, NLEStyText nLEStyText);

    public static final native String NLESwingKeyframeUtil_keyframePropertyNameForType(int i);

    public static final native long NLETextTemplateClip_SWIGSmartPtrUpcast(long j);

    public static final native long NLETextTemplateClip_clone(long j, NLETextTemplateClip nLETextTemplateClip);

    public static final native long NLETextTemplateClip_dynamicCast(long j, NLENode nLENode);

    public static final native int NLETextTemplateClip_getAlignTypeWithoutLimitSize(long j, NLETextTemplateClip nLETextTemplateClip);

    public static final native String NLETextTemplateClip_getContent(long j, NLETextTemplateClip nLETextTemplateClip);

    public static final native long NLETextTemplateClip_getContentStyle(long j, NLETextTemplateClip nLETextTemplateClip);

    public static final native int NLETextTemplateClip_getIndex(long j, NLETextTemplateClip nLETextTemplateClip);

    public static final native boolean NLETextTemplateClip_hasAlignTypeWithoutLimitSize(long j, NLETextTemplateClip nLETextTemplateClip);

    public static final native boolean NLETextTemplateClip_hasContent(long j, NLETextTemplateClip nLETextTemplateClip);

    public static final native boolean NLETextTemplateClip_hasIndex(long j, NLETextTemplateClip nLETextTemplateClip);

    public static final native void NLETextTemplateClip_setAlignTypeWithoutLimitSize(long j, NLETextTemplateClip nLETextTemplateClip, int i);

    public static final native void NLETextTemplateClip_setContent(long j, NLETextTemplateClip nLETextTemplateClip, String str);

    public static final native void NLETextTemplateClip_setContentStyle(long j, NLETextTemplateClip nLETextTemplateClip, long j2, NLEStyText nLEStyText);

    public static final native void NLETextTemplateClip_setIndex(long j, NLETextTemplateClip nLETextTemplateClip, int i);

    public static final native long NLETimeEffect_SWIGSmartPtrUpcast(long j);

    public static final native long NLETimeEffect_clone(long j, NLETimeEffect nLETimeEffect);

    public static final native long NLETimeEffect_dynamicCast(long j, NLENode nLENode);

    public static final native long NLETimeEffect_getSegment(long j, NLETimeEffect nLETimeEffect);

    public static final native void NLETimeEffect_setSegment(long j, NLETimeEffect nLETimeEffect, long j2, NLESegmentTimeEffect nLESegmentTimeEffect);

    public static final native long NLETimeMax_get();

    public static final native long NLETimePointPair_SWIGSmartPtrUpcast(long j);

    public static final native long NLETimePointPair_clone(long j, NLETimePointPair nLETimePointPair);

    public static final native long NLETimePointPair_dynamicCast(long j, NLENode nLENode);

    public static final native long NLETimePointPair_getTime(long j, NLETimePointPair nLETimePointPair);

    public static final native long NLETimePointPair_getValue(long j, NLETimePointPair nLETimePointPair);

    public static final native boolean NLETimePointPair_hasTime(long j, NLETimePointPair nLETimePointPair);

    public static final native boolean NLETimePointPair_hasValue(long j, NLETimePointPair nLETimePointPair);

    public static final native void NLETimePointPair_setTime(long j, NLETimePointPair nLETimePointPair, long j2);

    public static final native void NLETimePointPair_setValue(long j, NLETimePointPair nLETimePointPair, long j2, VecDouble vecDouble);

    public static final native long NLETimeSpaceNode_SWIGSmartPtrUpcast(long j);

    public static final native long NLETimeSpaceNode_clone(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native void NLETimeSpaceNode_copyValueNotMappedToStage(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native long NLETimeSpaceNode_dynamicCast(long j, NLENode nLENode);

    public static final native float NLETimeSpaceNode_getAbsSpeed(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native float NLETimeSpaceNode_getAnchorX(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native float NLETimeSpaceNode_getAnchorY(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native long NLETimeSpaceNode_getDuration(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native long NLETimeSpaceNode_getEndTime(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native int NLETimeSpaceNode_getLayer(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native long NLETimeSpaceNode_getMeasuredEndTime(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native long NLETimeSpaceNode_getMeasuredStartTime(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_getMirror_X(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_getMirror_Y(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native long NLETimeSpaceNode_getProcessor(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native float NLETimeSpaceNode_getRelativeHeight(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native float NLETimeSpaceNode_getRelativeWidth(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_getRewind(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native float NLETimeSpaceNode_getRotation(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native float NLETimeSpaceNode_getScale(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native float NLETimeSpaceNode_getScaleX(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native float NLETimeSpaceNode_getScaleY(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native float NLETimeSpaceNode_getSpeed(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native long NLETimeSpaceNode_getStartTime(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native float NLETimeSpaceNode_getTransformX(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native float NLETimeSpaceNode_getTransformY(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native int NLETimeSpaceNode_getTransformZ(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native long NLETimeSpaceNode_getoriginScale(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasAnchorX(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasAnchorY(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasEndTime(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasMirror_X(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasMirror_Y(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasProcessor(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasRelativeHeight(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasRelativeWidth(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasRotation(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasScale(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasScaleX(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasScaleY(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasSpeed(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasStartTime(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasTransformX(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasTransformY(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasTransformZ(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native boolean NLETimeSpaceNode_hasoriginScale(long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native void NLETimeSpaceNode_setAbsSpeed(long j, NLETimeSpaceNode nLETimeSpaceNode, float f);

    public static final native void NLETimeSpaceNode_setAnchorX(long j, NLETimeSpaceNode nLETimeSpaceNode, float f);

    public static final native void NLETimeSpaceNode_setAnchorY(long j, NLETimeSpaceNode nLETimeSpaceNode, float f);

    public static final native void NLETimeSpaceNode_setDuration(long j, NLETimeSpaceNode nLETimeSpaceNode, long j2);

    public static final native void NLETimeSpaceNode_setEndTime(long j, NLETimeSpaceNode nLETimeSpaceNode, long j2);

    public static final native void NLETimeSpaceNode_setLayer(long j, NLETimeSpaceNode nLETimeSpaceNode, int i);

    public static final native void NLETimeSpaceNode_setMeasuredEndTime(long j, NLETimeSpaceNode nLETimeSpaceNode, long j2);

    public static final native void NLETimeSpaceNode_setMeasuredStartTime(long j, NLETimeSpaceNode nLETimeSpaceNode, long j2);

    public static final native void NLETimeSpaceNode_setMirror_X(long j, NLETimeSpaceNode nLETimeSpaceNode, boolean z);

    public static final native void NLETimeSpaceNode_setMirror_Y(long j, NLETimeSpaceNode nLETimeSpaceNode, boolean z);

    public static final native void NLETimeSpaceNode_setProcessor(long j, NLETimeSpaceNode nLETimeSpaceNode, long j2, VecString vecString);

    public static final native void NLETimeSpaceNode_setRelativeHeight(long j, NLETimeSpaceNode nLETimeSpaceNode, float f);

    public static final native void NLETimeSpaceNode_setRelativeWidth(long j, NLETimeSpaceNode nLETimeSpaceNode, float f);

    public static final native void NLETimeSpaceNode_setRewind(long j, NLETimeSpaceNode nLETimeSpaceNode, boolean z);

    public static final native void NLETimeSpaceNode_setRotation(long j, NLETimeSpaceNode nLETimeSpaceNode, float f);

    public static final native void NLETimeSpaceNode_setScale(long j, NLETimeSpaceNode nLETimeSpaceNode, float f);

    public static final native void NLETimeSpaceNode_setScaleX(long j, NLETimeSpaceNode nLETimeSpaceNode, float f);

    public static final native void NLETimeSpaceNode_setScaleY(long j, NLETimeSpaceNode nLETimeSpaceNode, float f);

    public static final native void NLETimeSpaceNode_setSpeed(long j, NLETimeSpaceNode nLETimeSpaceNode, float f);

    public static final native void NLETimeSpaceNode_setStartTime(long j, NLETimeSpaceNode nLETimeSpaceNode, long j2);

    public static final native void NLETimeSpaceNode_setTransformX(long j, NLETimeSpaceNode nLETimeSpaceNode, float f);

    public static final native void NLETimeSpaceNode_setTransformY(long j, NLETimeSpaceNode nLETimeSpaceNode, float f);

    public static final native void NLETimeSpaceNode_setTransformZ(long j, NLETimeSpaceNode nLETimeSpaceNode, int i);

    public static final native void NLETimeSpaceNode_setoriginScale(long j, NLETimeSpaceNode nLETimeSpaceNode, long j2, VecFloat vecFloat);

    public static final native long NLETrackAlgorithm_SWIGSmartPtrUpcast(long j);

    public static final native long NLETrackAlgorithm_clone(long j, NLETrackAlgorithm nLETrackAlgorithm);

    public static final native long NLETrackAlgorithm_dynamicCast(long j, NLENode nLENode);

    public static final native float NLETrackAlgorithm_getVideoRatio(long j, NLETrackAlgorithm nLETrackAlgorithm);

    public static final native boolean NLETrackAlgorithm_hasVideoRatio(long j, NLETrackAlgorithm nLETrackAlgorithm);

    public static final native void NLETrackAlgorithm_setVideoRatio(long j, NLETrackAlgorithm nLETrackAlgorithm, float f);

    public static final native long NLETrackMV_SWIGSmartPtrUpcast(long j);

    public static final native void NLETrackMV_addMask(long j, NLETrackMV nLETrackMV, long j2, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native void NLETrackMV_clearMask(long j, NLETrackMV nLETrackMV);

    public static final native long NLETrackMV_clone(long j, NLETrackMV nLETrackMV);

    public static final native long NLETrackMV_dynamicCast(long j, NLENode nLENode);

    public static final native long NLETrackMV_getAlgorithm(long j, NLETrackMV nLETrackMV);

    public static final native String NLETrackMV_getAlgorithmConnectedAudioSlotName(long j, NLETrackMV nLETrackMV);

    public static final native int NLETrackMV_getCustomHeight(long j, NLETrackMV nLETrackMV);

    public static final native int NLETrackMV_getCustomWidth(long j, NLETrackMV nLETrackMV);

    public static final native String NLETrackMV_getExtraParams(long j, NLETrackMV nLETrackMV);

    public static final native long NLETrackMV_getMV(long j, NLETrackMV nLETrackMV);

    public static final native int NLETrackMV_getMVResolution(long j, NLETrackMV nLETrackMV);

    public static final native long NLETrackMV_getMasks(long j, NLETrackMV nLETrackMV);

    public static final native boolean NLETrackMV_getSingleVideo(long j, NLETrackMV nLETrackMV);

    public static final native boolean NLETrackMV_hasAlgorithmConnectedAudioSlotName(long j, NLETrackMV nLETrackMV);

    public static final native boolean NLETrackMV_hasCustomHeight(long j, NLETrackMV nLETrackMV);

    public static final native boolean NLETrackMV_hasCustomWidth(long j, NLETrackMV nLETrackMV);

    public static final native boolean NLETrackMV_hasExtraParams(long j, NLETrackMV nLETrackMV);

    public static final native boolean NLETrackMV_hasMVResolution(long j, NLETrackMV nLETrackMV);

    public static final native boolean NLETrackMV_hasSingleVideo(long j, NLETrackMV nLETrackMV);

    public static final native boolean NLETrackMV_removeMask(long j, NLETrackMV nLETrackMV, long j2, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native void NLETrackMV_setAlgorithm(long j, NLETrackMV nLETrackMV, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLETrackMV_setAlgorithmConnectedAudioSlotName(long j, NLETrackMV nLETrackMV, String str);

    public static final native void NLETrackMV_setCustomHeight(long j, NLETrackMV nLETrackMV, int i);

    public static final native void NLETrackMV_setCustomWidth(long j, NLETrackMV nLETrackMV, int i);

    public static final native void NLETrackMV_setExtraParams(long j, NLETrackMV nLETrackMV, String str);

    public static final native void NLETrackMV_setMV(long j, NLETrackMV nLETrackMV, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLETrackMV_setMVResolution(long j, NLETrackMV nLETrackMV, int i);

    public static final native void NLETrackMV_setSingleVideo(long j, NLETrackMV nLETrackMV, boolean z);

    public static final native String NLETrackSlot_KEYFRAME_TIMERANGE_KEY_get();

    public static final native long NLETrackSlot_SWIGSmartPtrUpcast(long j);

    public static final native void NLETrackSlot_addChromaChannel(long j, NLETrackSlot nLETrackSlot, long j2, NLEChromaChannel nLEChromaChannel);

    public static final native void NLETrackSlot_addFilter(long j, NLETrackSlot nLETrackSlot, long j2, NLEFilter nLEFilter);

    public static final native void NLETrackSlot_addKeyframe(long j, NLETrackSlot nLETrackSlot, long j2, NLETrackSlot nLETrackSlot2);

    public static final native void NLETrackSlot_addKeyframeValue(long j, NLETrackSlot nLETrackSlot, long j2, NLEKeyframeGraphValue nLEKeyframeGraphValue);

    public static final native void NLETrackSlot_addMask(long j, NLETrackSlot nLETrackSlot, long j2, NLEMask nLEMask);

    public static final native void NLETrackSlot_addNoiceReduction(long j, NLETrackSlot nLETrackSlot, long j2, NLENoiseReduction nLENoiseReduction);

    public static final native String NLETrackSlot_addOrUpdateKeyframe(long j, NLETrackSlot nLETrackSlot, long j2, long j3, boolean z);

    public static final native void NLETrackSlot_addOrUpdateSwingKeyframeForAllTypes__SWIG_0(long j, NLETrackSlot nLETrackSlot, long j2, long j3, boolean z);

    public static final native void NLETrackSlot_addOrUpdateSwingKeyframeForAllTypes__SWIG_1(long j, NLETrackSlot nLETrackSlot, long j2, long j3);

    public static final native void NLETrackSlot_addOrUpdateSwingKeyframeOfType__SWIG_0(long j, NLETrackSlot nLETrackSlot, int i, long j2, long j3, boolean z);

    public static final native void NLETrackSlot_addOrUpdateSwingKeyframeOfType__SWIG_1(long j, NLETrackSlot nLETrackSlot, int i, long j2, long j3);

    public static final native void NLETrackSlot_addOrUpdateSwingKeyframeOfTypes__SWIG_0(long j, NLETrackSlot nLETrackSlot, long j2, long j3, long j4, boolean z);

    public static final native void NLETrackSlot_addOrUpdateSwingKeyframeOfTypes__SWIG_1(long j, NLETrackSlot nLETrackSlot, long j2, long j3, long j4);

    public static final native void NLETrackSlot_addSwingKeyframe(long j, NLETrackSlot nLETrackSlot, long j2, NLEKeyframe nLEKeyframe);

    public static final native void NLETrackSlot_addVideoAnim(long j, NLETrackSlot nLETrackSlot, long j2, NLEVideoAnimation nLEVideoAnimation);

    public static final native void NLETrackSlot_addVideoEffect(long j, NLETrackSlot nLETrackSlot, long j2, NLEVideoEffect nLEVideoEffect);

    public static final native void NLETrackSlot_adjustKeyFrame__SWIG_0(long j, NLETrackSlot nLETrackSlot, long j2, long j3, NLETrackSlot nLETrackSlot2);

    public static final native void NLETrackSlot_adjustKeyFrame__SWIG_1(long j, NLETrackSlot nLETrackSlot, long j2);

    public static final native void NLETrackSlot_adjustKeyFrame__SWIG_2(long j, NLETrackSlot nLETrackSlot);

    public static final native void NLETrackSlot_adjustSwingKeyframeForAllType__SWIG_0(long j, NLETrackSlot nLETrackSlot, long j2, long j3, NLETrackSlot nLETrackSlot2);

    public static final native void NLETrackSlot_adjustSwingKeyframeForAllType__SWIG_1(long j, NLETrackSlot nLETrackSlot, long j2);

    public static final native void NLETrackSlot_adjustSwingKeyframeForAllType__SWIG_2(long j, NLETrackSlot nLETrackSlot);

    public static final native void NLETrackSlot_adjustSwingKeyframeForType__SWIG_0(long j, NLETrackSlot nLETrackSlot, int i, long j2, long j3, NLETrackSlot nLETrackSlot2);

    public static final native void NLETrackSlot_adjustSwingKeyframeForType__SWIG_1(long j, NLETrackSlot nLETrackSlot, int i, long j2);

    public static final native void NLETrackSlot_adjustSwingKeyframeForType__SWIG_2(long j, NLETrackSlot nLETrackSlot, int i);

    public static final native boolean NLETrackSlot_canKeyFrameAddedForTextSticker(long j, NLETrackSlot nLETrackSlot);

    public static final native void NLETrackSlot_clearChromaChannel(long j, NLETrackSlot nLETrackSlot);

    public static final native void NLETrackSlot_clearFilter(long j, NLETrackSlot nLETrackSlot);

    public static final native void NLETrackSlot_clearKeyframe(long j, NLETrackSlot nLETrackSlot);

    public static final native void NLETrackSlot_clearKeyframeValue(long j, NLETrackSlot nLETrackSlot);

    public static final native void NLETrackSlot_clearMask(long j, NLETrackSlot nLETrackSlot);

    public static final native void NLETrackSlot_clearNoiceReduction(long j, NLETrackSlot nLETrackSlot);

    public static final native void NLETrackSlot_clearSwingKeyframe(long j, NLETrackSlot nLETrackSlot);

    public static final native void NLETrackSlot_clearVideoAnim(long j, NLETrackSlot nLETrackSlot);

    public static final native void NLETrackSlot_clearVideoEffect(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_clone(long j, NLETrackSlot nLETrackSlot);

    public static final native boolean NLETrackSlot_convertSlotKeyframe2SwingKeyframe(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_createKeyframe(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_createSwingKeyframesForAllTypesAtTime__SWIG_0(long j, NLETrackSlot nLETrackSlot, long j2, long j3, long j4, boolean z);

    public static final native long NLETrackSlot_createSwingKeyframesForAllTypesAtTime__SWIG_1(long j, NLETrackSlot nLETrackSlot, long j2, long j3, long j4);

    public static final native long NLETrackSlot_createSwingKeyframesForTypeAtTime__SWIG_0(long j, NLETrackSlot nLETrackSlot, int i, long j2, long j3, long j4, boolean z);

    public static final native long NLETrackSlot_createSwingKeyframesForTypeAtTime__SWIG_1(long j, NLETrackSlot nLETrackSlot, int i, long j2, long j3, long j4);

    public static final native long NLETrackSlot_deepClone__SWIG_0(long j, NLETrackSlot nLETrackSlot, boolean z);

    public static final native long NLETrackSlot_deepClone__SWIG_1(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_dynamicCast(long j, NLENode nLENode);

    public static final native long NLETrackSlot_getAIMatting(long j, NLETrackSlot nLETrackSlot);

    public static final native int NLETrackSlot_getAlphaSplitType(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getAudioFilter(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getAutoFillFrame(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getChromaChannels(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getEndTransition(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getFilterByName(long j, NLETrackSlot nLETrackSlot, String str);

    public static final native long NLETrackSlot_getFilters(long j, NLETrackSlot nLETrackSlot);

    public static final native boolean NLETrackSlot_getIgnoreUserSetEndTime(long j, NLETrackSlot nLETrackSlot);

    public static final native int NLETrackSlot_getKeyframeGraphType(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getKeyframeValues(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getKeyframes(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getKeyframesUUIDList(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getMainSegment(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getMasks(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getNearestTimeOfAllSwingKeyframes(long j, NLETrackSlot nLETrackSlot, long j2, long j3);

    public static final native long NLETrackSlot_getNoiceReductions(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getPinAlgorithmFile(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getPinMappingAlgorithmFile(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getRenderProxy(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getSlotRealStartTime(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getSortKeyframe(long j, NLETrackSlot nLETrackSlot);

    public static final native String NLETrackSlot_getStaticMaskParamsForTime(long j, NLETrackSlot nLETrackSlot, long j2);

    public static final native long NLETrackSlot_getStencilMask(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getSwingKeyframes(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getVideoAnims(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_getVideoEffects(long j, NLETrackSlot nLETrackSlot);

    public static final native boolean NLETrackSlot_hasIgnoreUserSetEndTime(long j, NLETrackSlot nLETrackSlot);

    public static final native boolean NLETrackSlot_hasKeyframeGraphType(long j, NLETrackSlot nLETrackSlot);

    public static final native boolean NLETrackSlot_hasKeyframesUUIDList(long j, NLETrackSlot nLETrackSlot);

    public static final native long NLETrackSlot_keyframeAtTime(long j, NLETrackSlot nLETrackSlot, long j2, long j3);

    public static final native void NLETrackSlot_refreshAllSwingKeyframePropertyToSlotAtTime(long j, NLETrackSlot nLETrackSlot, long j2);

    public static final native void NLETrackSlot_refreshSwingKeyframePropertyToSlotAtTime(long j, NLETrackSlot nLETrackSlot, int i, long j2);

    public static final native boolean NLETrackSlot_removeAllSlotKeyframes(long j, NLETrackSlot nLETrackSlot);

    public static final native boolean NLETrackSlot_removeAllSwingKeyframes(long j, NLETrackSlot nLETrackSlot);

    public static final native boolean NLETrackSlot_removeAllSwingKeyframesAtTime(long j, NLETrackSlot nLETrackSlot, long j2, long j3);

    public static final native boolean NLETrackSlot_removeChromaChannel(long j, NLETrackSlot nLETrackSlot, long j2, NLEChromaChannel nLEChromaChannel);

    public static final native boolean NLETrackSlot_removeFilter(long j, NLETrackSlot nLETrackSlot, long j2, NLEFilter nLEFilter);

    public static final native long NLETrackSlot_removeFilterByName(long j, NLETrackSlot nLETrackSlot, String str);

    public static final native boolean NLETrackSlot_removeKeyframeValue(long j, NLETrackSlot nLETrackSlot, long j2, NLEKeyframeGraphValue nLEKeyframeGraphValue);

    public static final native boolean NLETrackSlot_removeKeyframe__SWIG_0(long j, NLETrackSlot nLETrackSlot, long j2, NLETrackSlot nLETrackSlot2);

    public static final native boolean NLETrackSlot_removeKeyframe__SWIG_1(long j, NLETrackSlot nLETrackSlot, long j2, long j3);

    public static final native boolean NLETrackSlot_removeMask(long j, NLETrackSlot nLETrackSlot, long j2, NLEMask nLEMask);

    public static final native boolean NLETrackSlot_removeNoiceReduction(long j, NLETrackSlot nLETrackSlot, long j2, NLENoiseReduction nLENoiseReduction);

    public static final native boolean NLETrackSlot_removeSwingKeyframe(long j, NLETrackSlot nLETrackSlot, long j2, NLEKeyframe nLEKeyframe);

    public static final native boolean NLETrackSlot_removeSwingKeyframeOfType__SWIG_0(long j, NLETrackSlot nLETrackSlot, int i, long j2, long j3);

    public static final native boolean NLETrackSlot_removeSwingKeyframeOfType__SWIG_1(long j, NLETrackSlot nLETrackSlot, int i);

    public static final native boolean NLETrackSlot_removeVideoAnim(long j, NLETrackSlot nLETrackSlot, long j2, NLEVideoAnimation nLEVideoAnimation);

    public static final native boolean NLETrackSlot_removeVideoEffect(long j, NLETrackSlot nLETrackSlot, long j2, NLEVideoEffect nLEVideoEffect);

    public static final native void NLETrackSlot_setAIMatting(long j, NLETrackSlot nLETrackSlot, long j2, NLEAIMatting nLEAIMatting);

    public static final native void NLETrackSlot_setAudioFilter(long j, NLETrackSlot nLETrackSlot, long j2, NLEFilter nLEFilter);

    public static final native void NLETrackSlot_setAutoFillFrame(long j, NLETrackSlot nLETrackSlot, long j2, NLEAutoFillFrame nLEAutoFillFrame);

    public static final native void NLETrackSlot_setEndTransition(long j, NLETrackSlot nLETrackSlot, long j2, NLESegmentTransition nLESegmentTransition);

    public static final native void NLETrackSlot_setIgnoreUserSetEndTime(long j, NLETrackSlot nLETrackSlot, boolean z);

    public static final native void NLETrackSlot_setKeyframeGraphType(long j, NLETrackSlot nLETrackSlot, int i);

    public static final native void NLETrackSlot_setKeyframesUUIDList(long j, NLETrackSlot nLETrackSlot, long j2, VecString vecString);

    public static final native void NLETrackSlot_setMainSegment(long j, NLETrackSlot nLETrackSlot, long j2, NLESegment nLESegment);

    public static final native void NLETrackSlot_setPinAlgorithmFile(long j, NLETrackSlot nLETrackSlot, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLETrackSlot_setPinMappingAlgorithmFile(long j, NLETrackSlot nLETrackSlot, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLETrackSlot_setRenderProxy(long j, NLETrackSlot nLETrackSlot, long j2, NLETrackSlot nLETrackSlot2);

    public static final native void NLETrackSlot_setStencilMask(long j, NLETrackSlot nLETrackSlot, long j2, NLESegmentMask nLESegmentMask);

    public static final native void NLETrackSlot_setWorkingObject(long j, NLETrackSlot nLETrackSlot, long j2, NLETrackSlot nLETrackSlot2);

    public static final native long NLETrackSlot_swingKeyframeOfTypeAtTime(long j, NLETrackSlot nLETrackSlot, int i, String str, long j2, long j3);

    public static final native long NLETrackSlot_swingKeyframesAtTime(long j, NLETrackSlot nLETrackSlot, long j2, long j3);

    public static final native long NLETrackSlot_swingKeyframesOfType(long j, NLETrackSlot nLETrackSlot, int i);

    public static final native long NLETrackSlot_swingKeyframesOfTypeAndName(long j, NLETrackSlot nLETrackSlot, int i, String str);

    public static final native long NLETrackSlot_swingKeyframesOfTypeAtTime(long j, NLETrackSlot nLETrackSlot, int i, long j2, long j3);

    public static final native long NLETrackSlot_syncEffectResource(long j, NLETrackSlot nLETrackSlot, long j2, NLETrackSlot nLETrackSlot2);

    public static final native long NLETrackSlot_updateKeyframe(long j, NLETrackSlot nLETrackSlot, long j2, NLETrackSlot nLETrackSlot2);

    public static final native String NLETrackTypeToString(int i);

    public static final native long NLETrack_SWIGSmartPtrUpcast(long j);

    public static final native void NLETrack_addFilter(long j, NLETrack nLETrack, long j2, NLEFilter nLEFilter);

    public static final native void NLETrack_addKeyframeSlot(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot);

    public static final native void NLETrack_addSlot(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot);

    public static final native void NLETrack_addSlotAfterSlot(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot, long j3, NLETrackSlot nLETrackSlot2);

    public static final native void NLETrack_addSlotAtEnd(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot);

    public static final native void NLETrack_addSlotAtIndex__SWIG_0(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot, int i);

    public static final native void NLETrack_addSlotAtIndex__SWIG_1(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot, int i, boolean z);

    public static final native void NLETrack_addSlotAtStart(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot);

    public static final native void NLETrack_addVideoEffect(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot);

    public static final native void NLETrack_clearFilter(long j, NLETrack nLETrack);

    public static final native void NLETrack_clearKeyframeSlot(long j, NLETrack nLETrack);

    public static final native void NLETrack_clearSlot(long j, NLETrack nLETrack);

    public static final native void NLETrack_clearVideoEffect(long j, NLETrack nLETrack);

    public static final native long NLETrack_clone(long j, NLETrack nLETrack);

    public static final native long NLETrack_dynamicCast(long j, NLENode nLENode);

    public static final native boolean NLETrack_getAffectedByTimeEffect(long j, NLETrack nLETrack);

    public static final native float NLETrack_getEffectScale(long j, NLETrack nLETrack, float f, float f2);

    public static final native int NLETrack_getExtraTrackType(long j, NLETrack nLETrack);

    public static final native long NLETrack_getFilterByName(long j, NLETrack nLETrack, String str);

    public static final native long NLETrack_getFilters(long j, NLETrack nLETrack);

    public static final native long NLETrack_getKeyframeSlots(long j, NLETrack nLETrack);

    public static final native boolean NLETrack_getMainTrack(long j, NLETrack nLETrack);

    public static final native long NLETrack_getMaxEnd(long j, NLETrack nLETrack);

    public static final native long NLETrack_getMaxEndExcludeDisabledNode(long j, NLETrack nLETrack, boolean z);

    public static final native long NLETrack_getMeasuredEndTime(long j, NLETrack nLETrack);

    public static final native long NLETrack_getMinStart(long j, NLETrack nLETrack);

    public static final native float NLETrack_getOriginalCanvasRatio(long j, NLETrack nLETrack, float f);

    public static final native int NLETrack_getResourceType(long j, NLETrack nLETrack);

    public static final native long NLETrack_getSlotByIndex(long j, NLETrack nLETrack, int i);

    public static final native long NLETrack_getSlotByTime(long j, NLETrack nLETrack, long j2);

    public static final native int NLETrack_getSlotIndex(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot);

    public static final native long NLETrack_getSlots(long j, NLETrack nLETrack);

    public static final native long NLETrack_getSortedSlots(long j, NLETrack nLETrack);

    public static final native long NLETrack_getTimeEffect(long j, NLETrack nLETrack);

    public static final native int NLETrack_getTrackIndex(long j, NLETrack nLETrack);

    public static final native int NLETrack_getTrackType(long j, NLETrack nLETrack);

    public static final native long NLETrack_getVideoEffects(long j, NLETrack nLETrack);

    public static final native float NLETrack_getVideoScaleAfterFixCenter(long j, NLETrack nLETrack, float f, float f2);

    public static final native float NLETrack_getVolume(long j, NLETrack nLETrack);

    public static final native boolean NLETrack_hasMainTrack(long j, NLETrack nLETrack);

    public static final native boolean NLETrack_hasVolume(long j, NLETrack nLETrack);

    public static final native boolean NLETrack_isAudioEnable(long j, NLETrack nLETrack);

    public static final native boolean NLETrack_isTimelineChange(long j, NLETrack nLETrack, long j2, NLETrack nLETrack2);

    public static final native boolean NLETrack_moveSlotToIndex__SWIG_0(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot, int i);

    public static final native boolean NLETrack_moveSlotToIndex__SWIG_1(long j, NLETrack nLETrack, int i, int i2);

    public static final native boolean NLETrack_removeFilter(long j, NLETrack nLETrack, long j2, NLEFilter nLEFilter);

    public static final native long NLETrack_removeFilterByName(long j, NLETrack nLETrack, String str);

    public static final native boolean NLETrack_removeKeyframeSlot(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot);

    public static final native boolean NLETrack_removeSlot(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot);

    public static final native boolean NLETrack_removeVideoEffect(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot);

    public static final native void NLETrack_setAudioEnable(long j, NLETrack nLETrack, boolean z);

    public static final native void NLETrack_setExtraTrackType(long j, NLETrack nLETrack, int i);

    public static final native void NLETrack_setMainTrack(long j, NLETrack nLETrack, boolean z);

    public static final native void NLETrack_setTimeEffect(long j, NLETrack nLETrack, long j2, NLETimeEffect nLETimeEffect);

    public static final native void NLETrack_setTrackIndex(long j, NLETrack nLETrack, int i);

    public static final native void NLETrack_setVolume(long j, NLETrack nLETrack, float f);

    public static final native long NLETrack_split(long j, NLETrack nLETrack, long j2);

    public static final native long NLETrack_splitGetBackSlotPair(long j, NLETrack nLETrack, long j2);

    public static final native long NLETrack_splitInSpecificSlot(long j, NLETrack nLETrack, long j2, long j3, NLETrackSlot nLETrackSlot);

    public static final native long NLETrack_splitSegCurvePointInSlot(long j, NLETrack nLETrack, long j2, long j3, NLETrackSlot nLETrackSlot);

    public static final native long NLETrack_splitSeqCurvePointInSlot(long j, NLETrack nLETrack, long j2, long j3, NLETrackSlot nLETrackSlot);

    public static final native void NLETrack_timeSort(long j, NLETrack nLETrack);

    public static final native void NLETrack_updateRelativeSizeWhileGlobalCanvasChanged(long j, NLETrack nLETrack, float f, float f2);

    public static final native String NLEUrlResourceProtocol_EXTRA_PARAM_MD5();

    public static final native String NLEUrlResourceProtocol_EXTRA_PARAM_SAVE_PATH();

    public static final native String NLEUrlResourceProtocol_KEY_URL();

    public static final native String NLEUrlResourceProtocol_PLATFORM_STRING();

    public static final native long NLEUrlResourceProtocol_SWIGSmartPtrUpcast(long j);

    public static final native long NLEUrlResourceProtocol_getParameters(long j, NLEUrlResourceProtocol nLEUrlResourceProtocol);

    public static final native String NLEUrlResourceProtocol_getSourceFrom(long j, NLEUrlResourceProtocol nLEUrlResourceProtocol);

    public static final native boolean NLEUrlResourceProtocol_isUrlResource(String str);

    public static final native String NLEVidResourceProtocol_KEY_VID();

    public static final native String NLEVidResourceProtocol_PLATFORM_STRING();

    public static final native long NLEVidResourceProtocol_SWIGSmartPtrUpcast(long j);

    public static final native long NLEVidResourceProtocol_constructFromResourceId(String str);

    public static final native long NLEVidResourceProtocol_getParameters(long j, NLEVidResourceProtocol nLEVidResourceProtocol);

    public static final native String NLEVidResourceProtocol_getSourceFrom(long j, NLEVidResourceProtocol nLEVidResourceProtocol);

    public static final native String NLEVidResourceProtocol_getVid(long j, NLEVidResourceProtocol nLEVidResourceProtocol);

    public static final native boolean NLEVidResourceProtocol_isVidResource(String str);

    public static final native long NLEVideoAnimation_SWIGSmartPtrUpcast(long j);

    public static final native long NLEVideoAnimation_clone(long j, NLEVideoAnimation nLEVideoAnimation);

    public static final native long NLEVideoAnimation_dynamicCast(long j, NLENode nLENode);

    public static final native boolean NLEVideoAnimation_getIsNewAnim(long j, NLEVideoAnimation nLEVideoAnimation);

    public static final native long NLEVideoAnimation_getSegment(long j, NLEVideoAnimation nLEVideoAnimation);

    public static final native boolean NLEVideoAnimation_hasIsNewAnim(long j, NLEVideoAnimation nLEVideoAnimation);

    public static final native void NLEVideoAnimation_setIsNewAnim(long j, NLEVideoAnimation nLEVideoAnimation, boolean z);

    public static final native void NLEVideoAnimation_setSegment(long j, NLEVideoAnimation nLEVideoAnimation, long j2, NLESegmentVideoAnimation nLESegmentVideoAnimation);

    public static final native long NLEVideoEffect_SWIGSmartPtrUpcast(long j);

    public static final native long NLEVideoEffect_clone(long j, NLEVideoEffect nLEVideoEffect);

    public static final native long NLEVideoEffect_dynamicCast(long j, NLENode nLENode);

    public static final native long NLEVideoEffect_getSegment(long j, NLEVideoEffect nLEVideoEffect);

    public static final native void NLEVideoEffect_setSegment(long j, NLEVideoEffect nLEVideoEffect, long j2, NLESegmentEffect nLESegmentEffect);

    public static final native long NLEVideoFrameModel_SWIGSmartPtrUpcast(long j);

    public static final native void NLEVideoFrameModel_addTrack(long j, NLEVideoFrameModel nLEVideoFrameModel, long j2, NLETrack nLETrack);

    public static final native void NLEVideoFrameModel_clearTrack(long j, NLEVideoFrameModel nLEVideoFrameModel);

    public static final native long NLEVideoFrameModel_clone(long j, NLEVideoFrameModel nLEVideoFrameModel);

    public static final native long NLEVideoFrameModel_dynamicCast(long j, NLENode nLENode);

    public static final native float NLEVideoFrameModel_getCanvasRatio(long j, NLEVideoFrameModel nLEVideoFrameModel);

    public static final native long NLEVideoFrameModel_getCoverMaterial(long j, NLEVideoFrameModel nLEVideoFrameModel);

    public static final native long NLEVideoFrameModel_getSnapshot(long j, NLEVideoFrameModel nLEVideoFrameModel);

    public static final native long NLEVideoFrameModel_getTracks(long j, NLEVideoFrameModel nLEVideoFrameModel);

    public static final native long NLEVideoFrameModel_getVideoFrameTime(long j, NLEVideoFrameModel nLEVideoFrameModel);

    public static final native boolean NLEVideoFrameModel_hasCanvasRatio(long j, NLEVideoFrameModel nLEVideoFrameModel);

    public static final native boolean NLEVideoFrameModel_hasVideoFrameTime(long j, NLEVideoFrameModel nLEVideoFrameModel);

    public static final native boolean NLEVideoFrameModel_removeTrack(long j, NLEVideoFrameModel nLEVideoFrameModel, long j2, NLETrack nLETrack);

    public static final native void NLEVideoFrameModel_setCanvasRatio(long j, NLEVideoFrameModel nLEVideoFrameModel, float f);

    public static final native void NLEVideoFrameModel_setCoverMaterial(long j, NLEVideoFrameModel nLEVideoFrameModel, long j2, NLEStyCanvas nLEStyCanvas);

    public static final native void NLEVideoFrameModel_setSnapshot(long j, NLEVideoFrameModel nLEVideoFrameModel, long j2, NLEResourceNode nLEResourceNode);

    public static final native void NLEVideoFrameModel_setVideoFrameTime(long j, NLEVideoFrameModel nLEVideoFrameModel, long j2);

    public static final native float PairFloatFloat_first_get(long j, PairFloatFloat pairFloatFloat);

    public static final native void PairFloatFloat_first_set(long j, PairFloatFloat pairFloatFloat, float f);

    public static final native float PairFloatFloat_second_get(long j, PairFloatFloat pairFloatFloat);

    public static final native void PairFloatFloat_second_set(long j, PairFloatFloat pairFloatFloat, float f);

    public static final native int PairIntInt_first_get(long j, PairIntInt pairIntInt);

    public static final native void PairIntInt_first_set(long j, PairIntInt pairIntInt, int i);

    public static final native int PairIntInt_second_get(long j, PairIntInt pairIntInt);

    public static final native void PairIntInt_second_set(long j, PairIntInt pairIntInt, int i);

    public static final native long PairNLEPoint2NLEPoint_first_get(long j, PairNLEPoint2NLEPoint pairNLEPoint2NLEPoint);

    public static final native void PairNLEPoint2NLEPoint_first_set(long j, PairNLEPoint2NLEPoint pairNLEPoint2NLEPoint, long j2, VecNLEPointSPtr vecNLEPointSPtr);

    public static final native long PairNLEPoint2NLEPoint_second_get(long j, PairNLEPoint2NLEPoint pairNLEPoint2NLEPoint);

    public static final native void PairNLEPoint2NLEPoint_second_set(long j, PairNLEPoint2NLEPoint pairNLEPoint2NLEPoint, long j2, VecNLEPointSPtr vecNLEPointSPtr);

    public static final native long PairSlotSlot_first_get(long j, PairSlotSlot pairSlotSlot);

    public static final native void PairSlotSlot_first_set(long j, PairSlotSlot pairSlotSlot, long j2, NLETrackSlot nLETrackSlot);

    public static final native long PairSlotSlot_second_get(long j, PairSlotSlot pairSlotSlot);

    public static final native void PairSlotSlot_second_set(long j, PairSlotSlot pairSlotSlot, long j2, NLETrackSlot nLETrackSlot);

    public static final native long PairUIntUInt_first_get(long j, PairUIntUInt pairUIntUInt);

    public static final native void PairUIntUInt_first_set(long j, PairUIntUInt pairUIntUInt, long j2);

    public static final native long PairUIntUInt_second_get(long j, PairUIntUInt pairUIntUInt);

    public static final native void PairUIntUInt_second_set(long j, PairUIntUInt pairUIntUInt, long j2);

    public static final native String UnorderedMapStrStr_Iterator_getKey(long j, UnorderedMapStrStr.Iterator iterator);

    public static final native long UnorderedMapStrStr_Iterator_getNextUnchecked(long j, UnorderedMapStrStr.Iterator iterator);

    public static final native String UnorderedMapStrStr_Iterator_getValue(long j, UnorderedMapStrStr.Iterator iterator);

    public static final native boolean UnorderedMapStrStr_Iterator_isNot(long j, UnorderedMapStrStr.Iterator iterator, long j2, UnorderedMapStrStr.Iterator iterator2);

    public static final native void UnorderedMapStrStr_Iterator_setValue(long j, UnorderedMapStrStr.Iterator iterator, String str);

    public static final native long UnorderedMapStrStr_begin(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native void UnorderedMapStrStr_clear(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native boolean UnorderedMapStrStr_containsImpl(long j, UnorderedMapStrStr unorderedMapStrStr, String str);

    public static final native long UnorderedMapStrStr_end(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native long UnorderedMapStrStr_find(long j, UnorderedMapStrStr unorderedMapStrStr, String str);

    public static final native boolean UnorderedMapStrStr_isEmpty(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native void UnorderedMapStrStr_putUnchecked(long j, UnorderedMapStrStr unorderedMapStrStr, String str, String str2);

    public static final native void UnorderedMapStrStr_removeUnchecked(long j, UnorderedMapStrStr unorderedMapStrStr, long j2, UnorderedMapStrStr.Iterator iterator);

    public static final native int UnorderedMapStrStr_sizeImpl(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native long VecDouble_capacity(long j, VecDouble vecDouble);

    public static final native void VecDouble_clear(long j, VecDouble vecDouble);

    public static final native void VecDouble_doAdd__SWIG_0(long j, VecDouble vecDouble, double d);

    public static final native void VecDouble_doAdd__SWIG_1(long j, VecDouble vecDouble, int i, double d);

    public static final native double VecDouble_doGet(long j, VecDouble vecDouble, int i);

    public static final native double VecDouble_doRemove(long j, VecDouble vecDouble, int i);

    public static final native void VecDouble_doRemoveRange(long j, VecDouble vecDouble, int i, int i2);

    public static final native double VecDouble_doSet(long j, VecDouble vecDouble, int i, double d);

    public static final native int VecDouble_doSize(long j, VecDouble vecDouble);

    public static final native boolean VecDouble_isEmpty(long j, VecDouble vecDouble);

    public static final native void VecDouble_reserve(long j, VecDouble vecDouble, long j2);

    public static final native long VecFloat_capacity(long j, VecFloat vecFloat);

    public static final native void VecFloat_clear(long j, VecFloat vecFloat);

    public static final native void VecFloat_doAdd__SWIG_0(long j, VecFloat vecFloat, float f);

    public static final native void VecFloat_doAdd__SWIG_1(long j, VecFloat vecFloat, int i, float f);

    public static final native float VecFloat_doGet(long j, VecFloat vecFloat, int i);

    public static final native float VecFloat_doRemove(long j, VecFloat vecFloat, int i);

    public static final native void VecFloat_doRemoveRange(long j, VecFloat vecFloat, int i, int i2);

    public static final native float VecFloat_doSet(long j, VecFloat vecFloat, int i, float f);

    public static final native int VecFloat_doSize(long j, VecFloat vecFloat);

    public static final native boolean VecFloat_isEmpty(long j, VecFloat vecFloat);

    public static final native void VecFloat_reserve(long j, VecFloat vecFloat, long j2);

    public static final native long VecInt_capacity(long j, VecInt vecInt);

    public static final native void VecInt_clear(long j, VecInt vecInt);

    public static final native void VecInt_doAdd__SWIG_0(long j, VecInt vecInt, int i);

    public static final native void VecInt_doAdd__SWIG_1(long j, VecInt vecInt, int i, int i2);

    public static final native int VecInt_doGet(long j, VecInt vecInt, int i);

    public static final native int VecInt_doRemove(long j, VecInt vecInt, int i);

    public static final native void VecInt_doRemoveRange(long j, VecInt vecInt, int i, int i2);

    public static final native int VecInt_doSet(long j, VecInt vecInt, int i, int i2);

    public static final native int VecInt_doSize(long j, VecInt vecInt);

    public static final native boolean VecInt_isEmpty(long j, VecInt vecInt);

    public static final native void VecInt_reserve(long j, VecInt vecInt, long j2);

    public static final native long VecLongLong_capacity(long j, VecLongLong vecLongLong);

    public static final native void VecLongLong_clear(long j, VecLongLong vecLongLong);

    public static final native void VecLongLong_doAdd__SWIG_0(long j, VecLongLong vecLongLong, long j2);

    public static final native void VecLongLong_doAdd__SWIG_1(long j, VecLongLong vecLongLong, int i, long j2);

    public static final native long VecLongLong_doGet(long j, VecLongLong vecLongLong, int i);

    public static final native long VecLongLong_doRemove(long j, VecLongLong vecLongLong, int i);

    public static final native void VecLongLong_doRemoveRange(long j, VecLongLong vecLongLong, int i, int i2);

    public static final native long VecLongLong_doSet(long j, VecLongLong vecLongLong, int i, long j2);

    public static final native int VecLongLong_doSize(long j, VecLongLong vecLongLong);

    public static final native boolean VecLongLong_isEmpty(long j, VecLongLong vecLongLong);

    public static final native void VecLongLong_reserve(long j, VecLongLong vecLongLong, long j2);

    public static final native long VecNLEBezierCurvesPoint_capacity(long j, VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint);

    public static final native void VecNLEBezierCurvesPoint_clear(long j, VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint);

    public static final native void VecNLEBezierCurvesPoint_doAdd__SWIG_0(long j, VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint, long j2, NLEBezierCurvesPoint nLEBezierCurvesPoint);

    public static final native void VecNLEBezierCurvesPoint_doAdd__SWIG_1(long j, VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint, int i, long j2, NLEBezierCurvesPoint nLEBezierCurvesPoint);

    public static final native long VecNLEBezierCurvesPoint_doGet(long j, VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint, int i);

    public static final native long VecNLEBezierCurvesPoint_doRemove(long j, VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint, int i);

    public static final native void VecNLEBezierCurvesPoint_doRemoveRange(long j, VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint, int i, int i2);

    public static final native long VecNLEBezierCurvesPoint_doSet(long j, VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint, int i, long j2, NLEBezierCurvesPoint nLEBezierCurvesPoint);

    public static final native int VecNLEBezierCurvesPoint_doSize(long j, VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint);

    public static final native boolean VecNLEBezierCurvesPoint_isEmpty(long j, VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint);

    public static final native void VecNLEBezierCurvesPoint_reserve(long j, VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint, long j2);

    public static final native long VecNLEChromaChannelSPtrConst_capacity(long j, VecNLEChromaChannelSPtrConst vecNLEChromaChannelSPtrConst);

    public static final native void VecNLEChromaChannelSPtrConst_clear(long j, VecNLEChromaChannelSPtrConst vecNLEChromaChannelSPtrConst);

    public static final native void VecNLEChromaChannelSPtrConst_doAdd__SWIG_0(long j, VecNLEChromaChannelSPtrConst vecNLEChromaChannelSPtrConst, long j2, NLEChromaChannel nLEChromaChannel);

    public static final native void VecNLEChromaChannelSPtrConst_doAdd__SWIG_1(long j, VecNLEChromaChannelSPtrConst vecNLEChromaChannelSPtrConst, int i, long j2, NLEChromaChannel nLEChromaChannel);

    public static final native long VecNLEChromaChannelSPtrConst_doGet(long j, VecNLEChromaChannelSPtrConst vecNLEChromaChannelSPtrConst, int i);

    public static final native long VecNLEChromaChannelSPtrConst_doRemove(long j, VecNLEChromaChannelSPtrConst vecNLEChromaChannelSPtrConst, int i);

    public static final native void VecNLEChromaChannelSPtrConst_doRemoveRange(long j, VecNLEChromaChannelSPtrConst vecNLEChromaChannelSPtrConst, int i, int i2);

    public static final native long VecNLEChromaChannelSPtrConst_doSet(long j, VecNLEChromaChannelSPtrConst vecNLEChromaChannelSPtrConst, int i, long j2, NLEChromaChannel nLEChromaChannel);

    public static final native int VecNLEChromaChannelSPtrConst_doSize(long j, VecNLEChromaChannelSPtrConst vecNLEChromaChannelSPtrConst);

    public static final native boolean VecNLEChromaChannelSPtrConst_isEmpty(long j, VecNLEChromaChannelSPtrConst vecNLEChromaChannelSPtrConst);

    public static final native void VecNLEChromaChannelSPtrConst_reserve(long j, VecNLEChromaChannelSPtrConst vecNLEChromaChannelSPtrConst, long j2);

    public static final native long VecNLEChromaChannelSPtr_capacity(long j, VecNLEChromaChannelSPtr vecNLEChromaChannelSPtr);

    public static final native void VecNLEChromaChannelSPtr_clear(long j, VecNLEChromaChannelSPtr vecNLEChromaChannelSPtr);

    public static final native void VecNLEChromaChannelSPtr_doAdd__SWIG_0(long j, VecNLEChromaChannelSPtr vecNLEChromaChannelSPtr, long j2, NLEChromaChannel nLEChromaChannel);

    public static final native void VecNLEChromaChannelSPtr_doAdd__SWIG_1(long j, VecNLEChromaChannelSPtr vecNLEChromaChannelSPtr, int i, long j2, NLEChromaChannel nLEChromaChannel);

    public static final native long VecNLEChromaChannelSPtr_doGet(long j, VecNLEChromaChannelSPtr vecNLEChromaChannelSPtr, int i);

    public static final native long VecNLEChromaChannelSPtr_doRemove(long j, VecNLEChromaChannelSPtr vecNLEChromaChannelSPtr, int i);

    public static final native void VecNLEChromaChannelSPtr_doRemoveRange(long j, VecNLEChromaChannelSPtr vecNLEChromaChannelSPtr, int i, int i2);

    public static final native long VecNLEChromaChannelSPtr_doSet(long j, VecNLEChromaChannelSPtr vecNLEChromaChannelSPtr, int i, long j2, NLEChromaChannel nLEChromaChannel);

    public static final native int VecNLEChromaChannelSPtr_doSize(long j, VecNLEChromaChannelSPtr vecNLEChromaChannelSPtr);

    public static final native boolean VecNLEChromaChannelSPtr_isEmpty(long j, VecNLEChromaChannelSPtr vecNLEChromaChannelSPtr);

    public static final native void VecNLEChromaChannelSPtr_reserve(long j, VecNLEChromaChannelSPtr vecNLEChromaChannelSPtr, long j2);

    public static final native void VecNLECommitSPtrConst_assign(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst, long j2, long j3, NLECommit nLECommit);

    public static final native long VecNLECommitSPtrConst_back(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst);

    public static final native void VecNLECommitSPtrConst_clear(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst);

    public static final native void VecNLECommitSPtrConst_delitem(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst, int i);

    public static final native void VecNLECommitSPtrConst_delslice(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst, int i, int i2);

    public static final native boolean VecNLECommitSPtrConst_empty(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst);

    public static final native long VecNLECommitSPtrConst_front(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst);

    public static final native long VecNLECommitSPtrConst_getitem(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst, int i);

    public static final native long VecNLECommitSPtrConst_getslice(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst, int i, int i2);

    public static final native long VecNLECommitSPtrConst_max_size(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst);

    public static final native void VecNLECommitSPtrConst_pop_back(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst);

    public static final native void VecNLECommitSPtrConst_pop_front(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst);

    public static final native void VecNLECommitSPtrConst_push_back(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst, long j2, NLECommit nLECommit);

    public static final native void VecNLECommitSPtrConst_push_front(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst, long j2, NLECommit nLECommit);

    public static final native void VecNLECommitSPtrConst_resize__SWIG_0(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst, long j2, long j3, NLECommit nLECommit);

    public static final native void VecNLECommitSPtrConst_resize__SWIG_1(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst, long j2);

    public static final native void VecNLECommitSPtrConst_setitem(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst, int i, long j2, NLECommit nLECommit);

    public static final native void VecNLECommitSPtrConst_setslice(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst, int i, int i2, long j2, VecNLECommitSPtrConst vecNLECommitSPtrConst2);

    public static final native long VecNLECommitSPtrConst_size(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst);

    public static final native void VecNLECommitSPtrConst_swap(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst, long j2, VecNLECommitSPtrConst vecNLECommitSPtrConst2);

    public static final native void VecNLECommitSPtr_assign(long j, VecNLECommitSPtr vecNLECommitSPtr, long j2, long j3, NLECommit nLECommit);

    public static final native long VecNLECommitSPtr_back(long j, VecNLECommitSPtr vecNLECommitSPtr);

    public static final native void VecNLECommitSPtr_clear(long j, VecNLECommitSPtr vecNLECommitSPtr);

    public static final native void VecNLECommitSPtr_delitem(long j, VecNLECommitSPtr vecNLECommitSPtr, int i);

    public static final native void VecNLECommitSPtr_delslice(long j, VecNLECommitSPtr vecNLECommitSPtr, int i, int i2);

    public static final native boolean VecNLECommitSPtr_empty(long j, VecNLECommitSPtr vecNLECommitSPtr);

    public static final native long VecNLECommitSPtr_front(long j, VecNLECommitSPtr vecNLECommitSPtr);

    public static final native long VecNLECommitSPtr_getitem(long j, VecNLECommitSPtr vecNLECommitSPtr, int i);

    public static final native long VecNLECommitSPtr_getslice(long j, VecNLECommitSPtr vecNLECommitSPtr, int i, int i2);

    public static final native long VecNLECommitSPtr_max_size(long j, VecNLECommitSPtr vecNLECommitSPtr);

    public static final native void VecNLECommitSPtr_pop_back(long j, VecNLECommitSPtr vecNLECommitSPtr);

    public static final native void VecNLECommitSPtr_pop_front(long j, VecNLECommitSPtr vecNLECommitSPtr);

    public static final native void VecNLECommitSPtr_push_back(long j, VecNLECommitSPtr vecNLECommitSPtr, long j2, NLECommit nLECommit);

    public static final native void VecNLECommitSPtr_push_front(long j, VecNLECommitSPtr vecNLECommitSPtr, long j2, NLECommit nLECommit);

    public static final native void VecNLECommitSPtr_resize__SWIG_0(long j, VecNLECommitSPtr vecNLECommitSPtr, long j2, long j3, NLECommit nLECommit);

    public static final native void VecNLECommitSPtr_resize__SWIG_1(long j, VecNLECommitSPtr vecNLECommitSPtr, long j2);

    public static final native void VecNLECommitSPtr_setitem(long j, VecNLECommitSPtr vecNLECommitSPtr, int i, long j2, NLECommit nLECommit);

    public static final native void VecNLECommitSPtr_setslice(long j, VecNLECommitSPtr vecNLECommitSPtr, int i, int i2, long j2, VecNLECommitSPtr vecNLECommitSPtr2);

    public static final native long VecNLECommitSPtr_size(long j, VecNLECommitSPtr vecNLECommitSPtr);

    public static final native void VecNLECommitSPtr_swap(long j, VecNLECommitSPtr vecNLECommitSPtr, long j2, VecNLECommitSPtr vecNLECommitSPtr2);

    public static final native long VecNLECommonKeyframe_capacity(long j, VecNLECommonKeyframe vecNLECommonKeyframe);

    public static final native void VecNLECommonKeyframe_clear(long j, VecNLECommonKeyframe vecNLECommonKeyframe);

    public static final native void VecNLECommonKeyframe_doAdd__SWIG_0(long j, VecNLECommonKeyframe vecNLECommonKeyframe, long j2, NLECommonKeyframe nLECommonKeyframe);

    public static final native void VecNLECommonKeyframe_doAdd__SWIG_1(long j, VecNLECommonKeyframe vecNLECommonKeyframe, int i, long j2, NLECommonKeyframe nLECommonKeyframe);

    public static final native long VecNLECommonKeyframe_doGet(long j, VecNLECommonKeyframe vecNLECommonKeyframe, int i);

    public static final native long VecNLECommonKeyframe_doRemove(long j, VecNLECommonKeyframe vecNLECommonKeyframe, int i);

    public static final native void VecNLECommonKeyframe_doRemoveRange(long j, VecNLECommonKeyframe vecNLECommonKeyframe, int i, int i2);

    public static final native long VecNLECommonKeyframe_doSet(long j, VecNLECommonKeyframe vecNLECommonKeyframe, int i, long j2, NLECommonKeyframe nLECommonKeyframe);

    public static final native int VecNLECommonKeyframe_doSize(long j, VecNLECommonKeyframe vecNLECommonKeyframe);

    public static final native boolean VecNLECommonKeyframe_isEmpty(long j, VecNLECommonKeyframe vecNLECommonKeyframe);

    public static final native void VecNLECommonKeyframe_reserve(long j, VecNLECommonKeyframe vecNLECommonKeyframe, long j2);

    public static final native long VecNLEEditorListener_capacity(long j, VecNLEEditorListener vecNLEEditorListener);

    public static final native void VecNLEEditorListener_clear(long j, VecNLEEditorListener vecNLEEditorListener);

    public static final native void VecNLEEditorListener_doAdd__SWIG_0(long j, VecNLEEditorListener vecNLEEditorListener, long j2, NLEEditorListener nLEEditorListener);

    public static final native void VecNLEEditorListener_doAdd__SWIG_1(long j, VecNLEEditorListener vecNLEEditorListener, int i, long j2, NLEEditorListener nLEEditorListener);

    public static final native long VecNLEEditorListener_doGet(long j, VecNLEEditorListener vecNLEEditorListener, int i);

    public static final native long VecNLEEditorListener_doRemove(long j, VecNLEEditorListener vecNLEEditorListener, int i);

    public static final native void VecNLEEditorListener_doRemoveRange(long j, VecNLEEditorListener vecNLEEditorListener, int i, int i2);

    public static final native long VecNLEEditorListener_doSet(long j, VecNLEEditorListener vecNLEEditorListener, int i, long j2, NLEEditorListener nLEEditorListener);

    public static final native int VecNLEEditorListener_doSize(long j, VecNLEEditorListener vecNLEEditorListener);

    public static final native boolean VecNLEEditorListener_isEmpty(long j, VecNLEEditorListener vecNLEEditorListener);

    public static final native void VecNLEEditorListener_reserve(long j, VecNLEEditorListener vecNLEEditorListener, long j2);

    public static final native long VecNLEFilterSPtrConst_capacity(long j, VecNLEFilterSPtrConst vecNLEFilterSPtrConst);

    public static final native void VecNLEFilterSPtrConst_clear(long j, VecNLEFilterSPtrConst vecNLEFilterSPtrConst);

    public static final native void VecNLEFilterSPtrConst_doAdd__SWIG_0(long j, VecNLEFilterSPtrConst vecNLEFilterSPtrConst, long j2, NLEFilter nLEFilter);

    public static final native void VecNLEFilterSPtrConst_doAdd__SWIG_1(long j, VecNLEFilterSPtrConst vecNLEFilterSPtrConst, int i, long j2, NLEFilter nLEFilter);

    public static final native long VecNLEFilterSPtrConst_doGet(long j, VecNLEFilterSPtrConst vecNLEFilterSPtrConst, int i);

    public static final native long VecNLEFilterSPtrConst_doRemove(long j, VecNLEFilterSPtrConst vecNLEFilterSPtrConst, int i);

    public static final native void VecNLEFilterSPtrConst_doRemoveRange(long j, VecNLEFilterSPtrConst vecNLEFilterSPtrConst, int i, int i2);

    public static final native long VecNLEFilterSPtrConst_doSet(long j, VecNLEFilterSPtrConst vecNLEFilterSPtrConst, int i, long j2, NLEFilter nLEFilter);

    public static final native int VecNLEFilterSPtrConst_doSize(long j, VecNLEFilterSPtrConst vecNLEFilterSPtrConst);

    public static final native boolean VecNLEFilterSPtrConst_isEmpty(long j, VecNLEFilterSPtrConst vecNLEFilterSPtrConst);

    public static final native void VecNLEFilterSPtrConst_reserve(long j, VecNLEFilterSPtrConst vecNLEFilterSPtrConst, long j2);

    public static final native long VecNLEFilterSPtr_capacity(long j, VecNLEFilterSPtr vecNLEFilterSPtr);

    public static final native void VecNLEFilterSPtr_clear(long j, VecNLEFilterSPtr vecNLEFilterSPtr);

    public static final native void VecNLEFilterSPtr_doAdd__SWIG_0(long j, VecNLEFilterSPtr vecNLEFilterSPtr, long j2, NLEFilter nLEFilter);

    public static final native void VecNLEFilterSPtr_doAdd__SWIG_1(long j, VecNLEFilterSPtr vecNLEFilterSPtr, int i, long j2, NLEFilter nLEFilter);

    public static final native long VecNLEFilterSPtr_doGet(long j, VecNLEFilterSPtr vecNLEFilterSPtr, int i);

    public static final native long VecNLEFilterSPtr_doRemove(long j, VecNLEFilterSPtr vecNLEFilterSPtr, int i);

    public static final native void VecNLEFilterSPtr_doRemoveRange(long j, VecNLEFilterSPtr vecNLEFilterSPtr, int i, int i2);

    public static final native long VecNLEFilterSPtr_doSet(long j, VecNLEFilterSPtr vecNLEFilterSPtr, int i, long j2, NLEFilter nLEFilter);

    public static final native int VecNLEFilterSPtr_doSize(long j, VecNLEFilterSPtr vecNLEFilterSPtr);

    public static final native boolean VecNLEFilterSPtr_isEmpty(long j, VecNLEFilterSPtr vecNLEFilterSPtr);

    public static final native void VecNLEFilterSPtr_reserve(long j, VecNLEFilterSPtr vecNLEFilterSPtr, long j2);

    public static final native long VecNLEKeyframeGraphValue_capacity(long j, VecNLEKeyframeGraphValue vecNLEKeyframeGraphValue);

    public static final native void VecNLEKeyframeGraphValue_clear(long j, VecNLEKeyframeGraphValue vecNLEKeyframeGraphValue);

    public static final native void VecNLEKeyframeGraphValue_doAdd__SWIG_0(long j, VecNLEKeyframeGraphValue vecNLEKeyframeGraphValue, long j2, NLEKeyframeGraphValue nLEKeyframeGraphValue);

    public static final native void VecNLEKeyframeGraphValue_doAdd__SWIG_1(long j, VecNLEKeyframeGraphValue vecNLEKeyframeGraphValue, int i, long j2, NLEKeyframeGraphValue nLEKeyframeGraphValue);

    public static final native long VecNLEKeyframeGraphValue_doGet(long j, VecNLEKeyframeGraphValue vecNLEKeyframeGraphValue, int i);

    public static final native long VecNLEKeyframeGraphValue_doRemove(long j, VecNLEKeyframeGraphValue vecNLEKeyframeGraphValue, int i);

    public static final native void VecNLEKeyframeGraphValue_doRemoveRange(long j, VecNLEKeyframeGraphValue vecNLEKeyframeGraphValue, int i, int i2);

    public static final native long VecNLEKeyframeGraphValue_doSet(long j, VecNLEKeyframeGraphValue vecNLEKeyframeGraphValue, int i, long j2, NLEKeyframeGraphValue nLEKeyframeGraphValue);

    public static final native int VecNLEKeyframeGraphValue_doSize(long j, VecNLEKeyframeGraphValue vecNLEKeyframeGraphValue);

    public static final native boolean VecNLEKeyframeGraphValue_isEmpty(long j, VecNLEKeyframeGraphValue vecNLEKeyframeGraphValue);

    public static final native void VecNLEKeyframeGraphValue_reserve(long j, VecNLEKeyframeGraphValue vecNLEKeyframeGraphValue, long j2);

    public static final native long VecNLEKeyframe_capacity(long j, VecNLEKeyframe vecNLEKeyframe);

    public static final native void VecNLEKeyframe_clear(long j, VecNLEKeyframe vecNLEKeyframe);

    public static final native void VecNLEKeyframe_doAdd__SWIG_0(long j, VecNLEKeyframe vecNLEKeyframe, long j2, NLEKeyframe nLEKeyframe);

    public static final native void VecNLEKeyframe_doAdd__SWIG_1(long j, VecNLEKeyframe vecNLEKeyframe, int i, long j2, NLEKeyframe nLEKeyframe);

    public static final native long VecNLEKeyframe_doGet(long j, VecNLEKeyframe vecNLEKeyframe, int i);

    public static final native long VecNLEKeyframe_doRemove(long j, VecNLEKeyframe vecNLEKeyframe, int i);

    public static final native void VecNLEKeyframe_doRemoveRange(long j, VecNLEKeyframe vecNLEKeyframe, int i, int i2);

    public static final native long VecNLEKeyframe_doSet(long j, VecNLEKeyframe vecNLEKeyframe, int i, long j2, NLEKeyframe nLEKeyframe);

    public static final native int VecNLEKeyframe_doSize(long j, VecNLEKeyframe vecNLEKeyframe);

    public static final native boolean VecNLEKeyframe_isEmpty(long j, VecNLEKeyframe vecNLEKeyframe);

    public static final native void VecNLEKeyframe_reserve(long j, VecNLEKeyframe vecNLEKeyframe, long j2);

    public static final native long VecNLEMVExternalAlgorithmResultSPtrConst_capacity(long j, VecNLEMVExternalAlgorithmResultSPtrConst vecNLEMVExternalAlgorithmResultSPtrConst);

    public static final native void VecNLEMVExternalAlgorithmResultSPtrConst_clear(long j, VecNLEMVExternalAlgorithmResultSPtrConst vecNLEMVExternalAlgorithmResultSPtrConst);

    public static final native void VecNLEMVExternalAlgorithmResultSPtrConst_doAdd__SWIG_0(long j, VecNLEMVExternalAlgorithmResultSPtrConst vecNLEMVExternalAlgorithmResultSPtrConst, long j2, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native void VecNLEMVExternalAlgorithmResultSPtrConst_doAdd__SWIG_1(long j, VecNLEMVExternalAlgorithmResultSPtrConst vecNLEMVExternalAlgorithmResultSPtrConst, int i, long j2, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native long VecNLEMVExternalAlgorithmResultSPtrConst_doGet(long j, VecNLEMVExternalAlgorithmResultSPtrConst vecNLEMVExternalAlgorithmResultSPtrConst, int i);

    public static final native long VecNLEMVExternalAlgorithmResultSPtrConst_doRemove(long j, VecNLEMVExternalAlgorithmResultSPtrConst vecNLEMVExternalAlgorithmResultSPtrConst, int i);

    public static final native void VecNLEMVExternalAlgorithmResultSPtrConst_doRemoveRange(long j, VecNLEMVExternalAlgorithmResultSPtrConst vecNLEMVExternalAlgorithmResultSPtrConst, int i, int i2);

    public static final native long VecNLEMVExternalAlgorithmResultSPtrConst_doSet(long j, VecNLEMVExternalAlgorithmResultSPtrConst vecNLEMVExternalAlgorithmResultSPtrConst, int i, long j2, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native int VecNLEMVExternalAlgorithmResultSPtrConst_doSize(long j, VecNLEMVExternalAlgorithmResultSPtrConst vecNLEMVExternalAlgorithmResultSPtrConst);

    public static final native boolean VecNLEMVExternalAlgorithmResultSPtrConst_isEmpty(long j, VecNLEMVExternalAlgorithmResultSPtrConst vecNLEMVExternalAlgorithmResultSPtrConst);

    public static final native void VecNLEMVExternalAlgorithmResultSPtrConst_reserve(long j, VecNLEMVExternalAlgorithmResultSPtrConst vecNLEMVExternalAlgorithmResultSPtrConst, long j2);

    public static final native long VecNLEMVExternalAlgorithmResultSPtr_capacity(long j, VecNLEMVExternalAlgorithmResultSPtr vecNLEMVExternalAlgorithmResultSPtr);

    public static final native void VecNLEMVExternalAlgorithmResultSPtr_clear(long j, VecNLEMVExternalAlgorithmResultSPtr vecNLEMVExternalAlgorithmResultSPtr);

    public static final native void VecNLEMVExternalAlgorithmResultSPtr_doAdd__SWIG_0(long j, VecNLEMVExternalAlgorithmResultSPtr vecNLEMVExternalAlgorithmResultSPtr, long j2, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native void VecNLEMVExternalAlgorithmResultSPtr_doAdd__SWIG_1(long j, VecNLEMVExternalAlgorithmResultSPtr vecNLEMVExternalAlgorithmResultSPtr, int i, long j2, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native long VecNLEMVExternalAlgorithmResultSPtr_doGet(long j, VecNLEMVExternalAlgorithmResultSPtr vecNLEMVExternalAlgorithmResultSPtr, int i);

    public static final native long VecNLEMVExternalAlgorithmResultSPtr_doRemove(long j, VecNLEMVExternalAlgorithmResultSPtr vecNLEMVExternalAlgorithmResultSPtr, int i);

    public static final native void VecNLEMVExternalAlgorithmResultSPtr_doRemoveRange(long j, VecNLEMVExternalAlgorithmResultSPtr vecNLEMVExternalAlgorithmResultSPtr, int i, int i2);

    public static final native long VecNLEMVExternalAlgorithmResultSPtr_doSet(long j, VecNLEMVExternalAlgorithmResultSPtr vecNLEMVExternalAlgorithmResultSPtr, int i, long j2, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native int VecNLEMVExternalAlgorithmResultSPtr_doSize(long j, VecNLEMVExternalAlgorithmResultSPtr vecNLEMVExternalAlgorithmResultSPtr);

    public static final native boolean VecNLEMVExternalAlgorithmResultSPtr_isEmpty(long j, VecNLEMVExternalAlgorithmResultSPtr vecNLEMVExternalAlgorithmResultSPtr);

    public static final native void VecNLEMVExternalAlgorithmResultSPtr_reserve(long j, VecNLEMVExternalAlgorithmResultSPtr vecNLEMVExternalAlgorithmResultSPtr, long j2);

    public static final native long VecNLEMaskSPtrConst_capacity(long j, VecNLEMaskSPtrConst vecNLEMaskSPtrConst);

    public static final native void VecNLEMaskSPtrConst_clear(long j, VecNLEMaskSPtrConst vecNLEMaskSPtrConst);

    public static final native void VecNLEMaskSPtrConst_doAdd__SWIG_0(long j, VecNLEMaskSPtrConst vecNLEMaskSPtrConst, long j2, NLEMask nLEMask);

    public static final native void VecNLEMaskSPtrConst_doAdd__SWIG_1(long j, VecNLEMaskSPtrConst vecNLEMaskSPtrConst, int i, long j2, NLEMask nLEMask);

    public static final native long VecNLEMaskSPtrConst_doGet(long j, VecNLEMaskSPtrConst vecNLEMaskSPtrConst, int i);

    public static final native long VecNLEMaskSPtrConst_doRemove(long j, VecNLEMaskSPtrConst vecNLEMaskSPtrConst, int i);

    public static final native void VecNLEMaskSPtrConst_doRemoveRange(long j, VecNLEMaskSPtrConst vecNLEMaskSPtrConst, int i, int i2);

    public static final native long VecNLEMaskSPtrConst_doSet(long j, VecNLEMaskSPtrConst vecNLEMaskSPtrConst, int i, long j2, NLEMask nLEMask);

    public static final native int VecNLEMaskSPtrConst_doSize(long j, VecNLEMaskSPtrConst vecNLEMaskSPtrConst);

    public static final native boolean VecNLEMaskSPtrConst_isEmpty(long j, VecNLEMaskSPtrConst vecNLEMaskSPtrConst);

    public static final native void VecNLEMaskSPtrConst_reserve(long j, VecNLEMaskSPtrConst vecNLEMaskSPtrConst, long j2);

    public static final native long VecNLEMaskSPtr_capacity(long j, VecNLEMaskSPtr vecNLEMaskSPtr);

    public static final native void VecNLEMaskSPtr_clear(long j, VecNLEMaskSPtr vecNLEMaskSPtr);

    public static final native void VecNLEMaskSPtr_doAdd__SWIG_0(long j, VecNLEMaskSPtr vecNLEMaskSPtr, long j2, NLEMask nLEMask);

    public static final native void VecNLEMaskSPtr_doAdd__SWIG_1(long j, VecNLEMaskSPtr vecNLEMaskSPtr, int i, long j2, NLEMask nLEMask);

    public static final native long VecNLEMaskSPtr_doGet(long j, VecNLEMaskSPtr vecNLEMaskSPtr, int i);

    public static final native long VecNLEMaskSPtr_doRemove(long j, VecNLEMaskSPtr vecNLEMaskSPtr, int i);

    public static final native void VecNLEMaskSPtr_doRemoveRange(long j, VecNLEMaskSPtr vecNLEMaskSPtr, int i, int i2);

    public static final native long VecNLEMaskSPtr_doSet(long j, VecNLEMaskSPtr vecNLEMaskSPtr, int i, long j2, NLEMask nLEMask);

    public static final native int VecNLEMaskSPtr_doSize(long j, VecNLEMaskSPtr vecNLEMaskSPtr);

    public static final native boolean VecNLEMaskSPtr_isEmpty(long j, VecNLEMaskSPtr vecNLEMaskSPtr);

    public static final native void VecNLEMaskSPtr_reserve(long j, VecNLEMaskSPtr vecNLEMaskSPtr, long j2);

    public static final native long VecNLEMattingStroke_capacity(long j, VecNLEMattingStroke vecNLEMattingStroke);

    public static final native void VecNLEMattingStroke_clear(long j, VecNLEMattingStroke vecNLEMattingStroke);

    public static final native void VecNLEMattingStroke_doAdd__SWIG_0(long j, VecNLEMattingStroke vecNLEMattingStroke, long j2, NLEMattingStroke nLEMattingStroke);

    public static final native void VecNLEMattingStroke_doAdd__SWIG_1(long j, VecNLEMattingStroke vecNLEMattingStroke, int i, long j2, NLEMattingStroke nLEMattingStroke);

    public static final native long VecNLEMattingStroke_doGet(long j, VecNLEMattingStroke vecNLEMattingStroke, int i);

    public static final native long VecNLEMattingStroke_doRemove(long j, VecNLEMattingStroke vecNLEMattingStroke, int i);

    public static final native void VecNLEMattingStroke_doRemoveRange(long j, VecNLEMattingStroke vecNLEMattingStroke, int i, int i2);

    public static final native long VecNLEMattingStroke_doSet(long j, VecNLEMattingStroke vecNLEMattingStroke, int i, long j2, NLEMattingStroke nLEMattingStroke);

    public static final native int VecNLEMattingStroke_doSize(long j, VecNLEMattingStroke vecNLEMattingStroke);

    public static final native boolean VecNLEMattingStroke_isEmpty(long j, VecNLEMattingStroke vecNLEMattingStroke);

    public static final native void VecNLEMattingStroke_reserve(long j, VecNLEMattingStroke vecNLEMattingStroke, long j2);

    public static final native long VecNLENoiseReductionSPtrConst_capacity(long j, VecNLENoiseReductionSPtrConst vecNLENoiseReductionSPtrConst);

    public static final native void VecNLENoiseReductionSPtrConst_clear(long j, VecNLENoiseReductionSPtrConst vecNLENoiseReductionSPtrConst);

    public static final native void VecNLENoiseReductionSPtrConst_doAdd__SWIG_0(long j, VecNLENoiseReductionSPtrConst vecNLENoiseReductionSPtrConst, long j2, NLENoiseReduction nLENoiseReduction);

    public static final native void VecNLENoiseReductionSPtrConst_doAdd__SWIG_1(long j, VecNLENoiseReductionSPtrConst vecNLENoiseReductionSPtrConst, int i, long j2, NLENoiseReduction nLENoiseReduction);

    public static final native long VecNLENoiseReductionSPtrConst_doGet(long j, VecNLENoiseReductionSPtrConst vecNLENoiseReductionSPtrConst, int i);

    public static final native long VecNLENoiseReductionSPtrConst_doRemove(long j, VecNLENoiseReductionSPtrConst vecNLENoiseReductionSPtrConst, int i);

    public static final native void VecNLENoiseReductionSPtrConst_doRemoveRange(long j, VecNLENoiseReductionSPtrConst vecNLENoiseReductionSPtrConst, int i, int i2);

    public static final native long VecNLENoiseReductionSPtrConst_doSet(long j, VecNLENoiseReductionSPtrConst vecNLENoiseReductionSPtrConst, int i, long j2, NLENoiseReduction nLENoiseReduction);

    public static final native int VecNLENoiseReductionSPtrConst_doSize(long j, VecNLENoiseReductionSPtrConst vecNLENoiseReductionSPtrConst);

    public static final native boolean VecNLENoiseReductionSPtrConst_isEmpty(long j, VecNLENoiseReductionSPtrConst vecNLENoiseReductionSPtrConst);

    public static final native void VecNLENoiseReductionSPtrConst_reserve(long j, VecNLENoiseReductionSPtrConst vecNLENoiseReductionSPtrConst, long j2);

    public static final native long VecNLENoiseReductionSPtr_capacity(long j, VecNLENoiseReductionSPtr vecNLENoiseReductionSPtr);

    public static final native void VecNLENoiseReductionSPtr_clear(long j, VecNLENoiseReductionSPtr vecNLENoiseReductionSPtr);

    public static final native void VecNLENoiseReductionSPtr_doAdd__SWIG_0(long j, VecNLENoiseReductionSPtr vecNLENoiseReductionSPtr, long j2, NLENoiseReduction nLENoiseReduction);

    public static final native void VecNLENoiseReductionSPtr_doAdd__SWIG_1(long j, VecNLENoiseReductionSPtr vecNLENoiseReductionSPtr, int i, long j2, NLENoiseReduction nLENoiseReduction);

    public static final native long VecNLENoiseReductionSPtr_doGet(long j, VecNLENoiseReductionSPtr vecNLENoiseReductionSPtr, int i);

    public static final native long VecNLENoiseReductionSPtr_doRemove(long j, VecNLENoiseReductionSPtr vecNLENoiseReductionSPtr, int i);

    public static final native void VecNLENoiseReductionSPtr_doRemoveRange(long j, VecNLENoiseReductionSPtr vecNLENoiseReductionSPtr, int i, int i2);

    public static final native long VecNLENoiseReductionSPtr_doSet(long j, VecNLENoiseReductionSPtr vecNLENoiseReductionSPtr, int i, long j2, NLENoiseReduction nLENoiseReduction);

    public static final native int VecNLENoiseReductionSPtr_doSize(long j, VecNLENoiseReductionSPtr vecNLENoiseReductionSPtr);

    public static final native boolean VecNLENoiseReductionSPtr_isEmpty(long j, VecNLENoiseReductionSPtr vecNLENoiseReductionSPtr);

    public static final native void VecNLENoiseReductionSPtr_reserve(long j, VecNLENoiseReductionSPtr vecNLENoiseReductionSPtr, long j2);

    public static final native long VecNLEPointSPtrConst_capacity(long j, VecNLEPointSPtrConst vecNLEPointSPtrConst);

    public static final native void VecNLEPointSPtrConst_clear(long j, VecNLEPointSPtrConst vecNLEPointSPtrConst);

    public static final native void VecNLEPointSPtrConst_doAdd__SWIG_0(long j, VecNLEPointSPtrConst vecNLEPointSPtrConst, long j2, NLEPoint nLEPoint);

    public static final native void VecNLEPointSPtrConst_doAdd__SWIG_1(long j, VecNLEPointSPtrConst vecNLEPointSPtrConst, int i, long j2, NLEPoint nLEPoint);

    public static final native long VecNLEPointSPtrConst_doGet(long j, VecNLEPointSPtrConst vecNLEPointSPtrConst, int i);

    public static final native long VecNLEPointSPtrConst_doRemove(long j, VecNLEPointSPtrConst vecNLEPointSPtrConst, int i);

    public static final native void VecNLEPointSPtrConst_doRemoveRange(long j, VecNLEPointSPtrConst vecNLEPointSPtrConst, int i, int i2);

    public static final native long VecNLEPointSPtrConst_doSet(long j, VecNLEPointSPtrConst vecNLEPointSPtrConst, int i, long j2, NLEPoint nLEPoint);

    public static final native int VecNLEPointSPtrConst_doSize(long j, VecNLEPointSPtrConst vecNLEPointSPtrConst);

    public static final native boolean VecNLEPointSPtrConst_isEmpty(long j, VecNLEPointSPtrConst vecNLEPointSPtrConst);

    public static final native void VecNLEPointSPtrConst_reserve(long j, VecNLEPointSPtrConst vecNLEPointSPtrConst, long j2);

    public static final native long VecNLEPointSPtr_capacity(long j, VecNLEPointSPtr vecNLEPointSPtr);

    public static final native void VecNLEPointSPtr_clear(long j, VecNLEPointSPtr vecNLEPointSPtr);

    public static final native void VecNLEPointSPtr_doAdd__SWIG_0(long j, VecNLEPointSPtr vecNLEPointSPtr, long j2, NLEPoint nLEPoint);

    public static final native void VecNLEPointSPtr_doAdd__SWIG_1(long j, VecNLEPointSPtr vecNLEPointSPtr, int i, long j2, NLEPoint nLEPoint);

    public static final native long VecNLEPointSPtr_doGet(long j, VecNLEPointSPtr vecNLEPointSPtr, int i);

    public static final native long VecNLEPointSPtr_doRemove(long j, VecNLEPointSPtr vecNLEPointSPtr, int i);

    public static final native void VecNLEPointSPtr_doRemoveRange(long j, VecNLEPointSPtr vecNLEPointSPtr, int i, int i2);

    public static final native long VecNLEPointSPtr_doSet(long j, VecNLEPointSPtr vecNLEPointSPtr, int i, long j2, NLEPoint nLEPoint);

    public static final native int VecNLEPointSPtr_doSize(long j, VecNLEPointSPtr vecNLEPointSPtr);

    public static final native boolean VecNLEPointSPtr_isEmpty(long j, VecNLEPointSPtr vecNLEPointSPtr);

    public static final native void VecNLEPointSPtr_reserve(long j, VecNLEPointSPtr vecNLEPointSPtr, long j2);

    public static final native long VecNLEResourceNodeSPtrConst_capacity(long j, VecNLEResourceNodeSPtrConst vecNLEResourceNodeSPtrConst);

    public static final native void VecNLEResourceNodeSPtrConst_clear(long j, VecNLEResourceNodeSPtrConst vecNLEResourceNodeSPtrConst);

    public static final native void VecNLEResourceNodeSPtrConst_doAdd__SWIG_0(long j, VecNLEResourceNodeSPtrConst vecNLEResourceNodeSPtrConst, long j2, NLEResourceNode nLEResourceNode);

    public static final native void VecNLEResourceNodeSPtrConst_doAdd__SWIG_1(long j, VecNLEResourceNodeSPtrConst vecNLEResourceNodeSPtrConst, int i, long j2, NLEResourceNode nLEResourceNode);

    public static final native long VecNLEResourceNodeSPtrConst_doGet(long j, VecNLEResourceNodeSPtrConst vecNLEResourceNodeSPtrConst, int i);

    public static final native long VecNLEResourceNodeSPtrConst_doRemove(long j, VecNLEResourceNodeSPtrConst vecNLEResourceNodeSPtrConst, int i);

    public static final native void VecNLEResourceNodeSPtrConst_doRemoveRange(long j, VecNLEResourceNodeSPtrConst vecNLEResourceNodeSPtrConst, int i, int i2);

    public static final native long VecNLEResourceNodeSPtrConst_doSet(long j, VecNLEResourceNodeSPtrConst vecNLEResourceNodeSPtrConst, int i, long j2, NLEResourceNode nLEResourceNode);

    public static final native int VecNLEResourceNodeSPtrConst_doSize(long j, VecNLEResourceNodeSPtrConst vecNLEResourceNodeSPtrConst);

    public static final native boolean VecNLEResourceNodeSPtrConst_isEmpty(long j, VecNLEResourceNodeSPtrConst vecNLEResourceNodeSPtrConst);

    public static final native void VecNLEResourceNodeSPtrConst_reserve(long j, VecNLEResourceNodeSPtrConst vecNLEResourceNodeSPtrConst, long j2);

    public static final native long VecNLEResourceNodeSPtr_capacity(long j, VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr);

    public static final native void VecNLEResourceNodeSPtr_clear(long j, VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr);

    public static final native void VecNLEResourceNodeSPtr_doAdd__SWIG_0(long j, VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr, long j2, NLEResourceNode nLEResourceNode);

    public static final native void VecNLEResourceNodeSPtr_doAdd__SWIG_1(long j, VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr, int i, long j2, NLEResourceNode nLEResourceNode);

    public static final native long VecNLEResourceNodeSPtr_doGet(long j, VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr, int i);

    public static final native long VecNLEResourceNodeSPtr_doRemove(long j, VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr, int i);

    public static final native void VecNLEResourceNodeSPtr_doRemoveRange(long j, VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr, int i, int i2);

    public static final native long VecNLEResourceNodeSPtr_doSet(long j, VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr, int i, long j2, NLEResourceNode nLEResourceNode);

    public static final native int VecNLEResourceNodeSPtr_doSize(long j, VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr);

    public static final native boolean VecNLEResourceNodeSPtr_isEmpty(long j, VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr);

    public static final native void VecNLEResourceNodeSPtr_reserve(long j, VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr, long j2);

    public static final native long VecNLESegmentSPtrConst_capacity(long j, VecNLESegmentSPtrConst vecNLESegmentSPtrConst);

    public static final native void VecNLESegmentSPtrConst_clear(long j, VecNLESegmentSPtrConst vecNLESegmentSPtrConst);

    public static final native void VecNLESegmentSPtrConst_doAdd__SWIG_0(long j, VecNLESegmentSPtrConst vecNLESegmentSPtrConst, long j2, NLESegment nLESegment);

    public static final native void VecNLESegmentSPtrConst_doAdd__SWIG_1(long j, VecNLESegmentSPtrConst vecNLESegmentSPtrConst, int i, long j2, NLESegment nLESegment);

    public static final native long VecNLESegmentSPtrConst_doGet(long j, VecNLESegmentSPtrConst vecNLESegmentSPtrConst, int i);

    public static final native long VecNLESegmentSPtrConst_doRemove(long j, VecNLESegmentSPtrConst vecNLESegmentSPtrConst, int i);

    public static final native void VecNLESegmentSPtrConst_doRemoveRange(long j, VecNLESegmentSPtrConst vecNLESegmentSPtrConst, int i, int i2);

    public static final native long VecNLESegmentSPtrConst_doSet(long j, VecNLESegmentSPtrConst vecNLESegmentSPtrConst, int i, long j2, NLESegment nLESegment);

    public static final native int VecNLESegmentSPtrConst_doSize(long j, VecNLESegmentSPtrConst vecNLESegmentSPtrConst);

    public static final native boolean VecNLESegmentSPtrConst_isEmpty(long j, VecNLESegmentSPtrConst vecNLESegmentSPtrConst);

    public static final native void VecNLESegmentSPtrConst_reserve(long j, VecNLESegmentSPtrConst vecNLESegmentSPtrConst, long j2);

    public static final native long VecNLESegmentSPtr_capacity(long j, VecNLESegmentSPtr vecNLESegmentSPtr);

    public static final native void VecNLESegmentSPtr_clear(long j, VecNLESegmentSPtr vecNLESegmentSPtr);

    public static final native void VecNLESegmentSPtr_doAdd__SWIG_0(long j, VecNLESegmentSPtr vecNLESegmentSPtr, long j2, NLESegment nLESegment);

    public static final native void VecNLESegmentSPtr_doAdd__SWIG_1(long j, VecNLESegmentSPtr vecNLESegmentSPtr, int i, long j2, NLESegment nLESegment);

    public static final native long VecNLESegmentSPtr_doGet(long j, VecNLESegmentSPtr vecNLESegmentSPtr, int i);

    public static final native long VecNLESegmentSPtr_doRemove(long j, VecNLESegmentSPtr vecNLESegmentSPtr, int i);

    public static final native void VecNLESegmentSPtr_doRemoveRange(long j, VecNLESegmentSPtr vecNLESegmentSPtr, int i, int i2);

    public static final native long VecNLESegmentSPtr_doSet(long j, VecNLESegmentSPtr vecNLESegmentSPtr, int i, long j2, NLESegment nLESegment);

    public static final native int VecNLESegmentSPtr_doSize(long j, VecNLESegmentSPtr vecNLESegmentSPtr);

    public static final native boolean VecNLESegmentSPtr_isEmpty(long j, VecNLESegmentSPtr vecNLESegmentSPtr);

    public static final native void VecNLESegmentSPtr_reserve(long j, VecNLESegmentSPtr vecNLESegmentSPtr, long j2);

    public static final native long VecNLEStringFloatPairSPtrConst_capacity(long j, VecNLEStringFloatPairSPtrConst vecNLEStringFloatPairSPtrConst);

    public static final native void VecNLEStringFloatPairSPtrConst_clear(long j, VecNLEStringFloatPairSPtrConst vecNLEStringFloatPairSPtrConst);

    public static final native void VecNLEStringFloatPairSPtrConst_doAdd__SWIG_0(long j, VecNLEStringFloatPairSPtrConst vecNLEStringFloatPairSPtrConst, long j2, NLEStringFloatPair nLEStringFloatPair);

    public static final native void VecNLEStringFloatPairSPtrConst_doAdd__SWIG_1(long j, VecNLEStringFloatPairSPtrConst vecNLEStringFloatPairSPtrConst, int i, long j2, NLEStringFloatPair nLEStringFloatPair);

    public static final native long VecNLEStringFloatPairSPtrConst_doGet(long j, VecNLEStringFloatPairSPtrConst vecNLEStringFloatPairSPtrConst, int i);

    public static final native long VecNLEStringFloatPairSPtrConst_doRemove(long j, VecNLEStringFloatPairSPtrConst vecNLEStringFloatPairSPtrConst, int i);

    public static final native void VecNLEStringFloatPairSPtrConst_doRemoveRange(long j, VecNLEStringFloatPairSPtrConst vecNLEStringFloatPairSPtrConst, int i, int i2);

    public static final native long VecNLEStringFloatPairSPtrConst_doSet(long j, VecNLEStringFloatPairSPtrConst vecNLEStringFloatPairSPtrConst, int i, long j2, NLEStringFloatPair nLEStringFloatPair);

    public static final native int VecNLEStringFloatPairSPtrConst_doSize(long j, VecNLEStringFloatPairSPtrConst vecNLEStringFloatPairSPtrConst);

    public static final native boolean VecNLEStringFloatPairSPtrConst_isEmpty(long j, VecNLEStringFloatPairSPtrConst vecNLEStringFloatPairSPtrConst);

    public static final native void VecNLEStringFloatPairSPtrConst_reserve(long j, VecNLEStringFloatPairSPtrConst vecNLEStringFloatPairSPtrConst, long j2);

    public static final native long VecNLEStringFloatPairSPtr_capacity(long j, VecNLEStringFloatPairSPtr vecNLEStringFloatPairSPtr);

    public static final native void VecNLEStringFloatPairSPtr_clear(long j, VecNLEStringFloatPairSPtr vecNLEStringFloatPairSPtr);

    public static final native void VecNLEStringFloatPairSPtr_doAdd__SWIG_0(long j, VecNLEStringFloatPairSPtr vecNLEStringFloatPairSPtr, long j2, NLEStringFloatPair nLEStringFloatPair);

    public static final native void VecNLEStringFloatPairSPtr_doAdd__SWIG_1(long j, VecNLEStringFloatPairSPtr vecNLEStringFloatPairSPtr, int i, long j2, NLEStringFloatPair nLEStringFloatPair);

    public static final native long VecNLEStringFloatPairSPtr_doGet(long j, VecNLEStringFloatPairSPtr vecNLEStringFloatPairSPtr, int i);

    public static final native long VecNLEStringFloatPairSPtr_doRemove(long j, VecNLEStringFloatPairSPtr vecNLEStringFloatPairSPtr, int i);

    public static final native void VecNLEStringFloatPairSPtr_doRemoveRange(long j, VecNLEStringFloatPairSPtr vecNLEStringFloatPairSPtr, int i, int i2);

    public static final native long VecNLEStringFloatPairSPtr_doSet(long j, VecNLEStringFloatPairSPtr vecNLEStringFloatPairSPtr, int i, long j2, NLEStringFloatPair nLEStringFloatPair);

    public static final native int VecNLEStringFloatPairSPtr_doSize(long j, VecNLEStringFloatPairSPtr vecNLEStringFloatPairSPtr);

    public static final native boolean VecNLEStringFloatPairSPtr_isEmpty(long j, VecNLEStringFloatPairSPtr vecNLEStringFloatPairSPtr);

    public static final native void VecNLEStringFloatPairSPtr_reserve(long j, VecNLEStringFloatPairSPtr vecNLEStringFloatPairSPtr, long j2);

    public static final native long VecNLEStringStringPairPairSPtr_capacity(long j, VecNLEStringStringPairPairSPtr vecNLEStringStringPairPairSPtr);

    public static final native void VecNLEStringStringPairPairSPtr_clear(long j, VecNLEStringStringPairPairSPtr vecNLEStringStringPairPairSPtr);

    public static final native void VecNLEStringStringPairPairSPtr_doAdd__SWIG_0(long j, VecNLEStringStringPairPairSPtr vecNLEStringStringPairPairSPtr, long j2, NLEStringStringPair nLEStringStringPair);

    public static final native void VecNLEStringStringPairPairSPtr_doAdd__SWIG_1(long j, VecNLEStringStringPairPairSPtr vecNLEStringStringPairPairSPtr, int i, long j2, NLEStringStringPair nLEStringStringPair);

    public static final native long VecNLEStringStringPairPairSPtr_doGet(long j, VecNLEStringStringPairPairSPtr vecNLEStringStringPairPairSPtr, int i);

    public static final native long VecNLEStringStringPairPairSPtr_doRemove(long j, VecNLEStringStringPairPairSPtr vecNLEStringStringPairPairSPtr, int i);

    public static final native void VecNLEStringStringPairPairSPtr_doRemoveRange(long j, VecNLEStringStringPairPairSPtr vecNLEStringStringPairPairSPtr, int i, int i2);

    public static final native long VecNLEStringStringPairPairSPtr_doSet(long j, VecNLEStringStringPairPairSPtr vecNLEStringStringPairPairSPtr, int i, long j2, NLEStringStringPair nLEStringStringPair);

    public static final native int VecNLEStringStringPairPairSPtr_doSize(long j, VecNLEStringStringPairPairSPtr vecNLEStringStringPairPairSPtr);

    public static final native boolean VecNLEStringStringPairPairSPtr_isEmpty(long j, VecNLEStringStringPairPairSPtr vecNLEStringStringPairPairSPtr);

    public static final native void VecNLEStringStringPairPairSPtr_reserve(long j, VecNLEStringStringPairPairSPtr vecNLEStringStringPairPairSPtr, long j2);

    public static final native long VecNLEStringStringPairSPtrConst_capacity(long j, VecNLEStringStringPairSPtrConst vecNLEStringStringPairSPtrConst);

    public static final native void VecNLEStringStringPairSPtrConst_clear(long j, VecNLEStringStringPairSPtrConst vecNLEStringStringPairSPtrConst);

    public static final native void VecNLEStringStringPairSPtrConst_doAdd__SWIG_0(long j, VecNLEStringStringPairSPtrConst vecNLEStringStringPairSPtrConst, long j2, NLEStringStringPair nLEStringStringPair);

    public static final native void VecNLEStringStringPairSPtrConst_doAdd__SWIG_1(long j, VecNLEStringStringPairSPtrConst vecNLEStringStringPairSPtrConst, int i, long j2, NLEStringStringPair nLEStringStringPair);

    public static final native long VecNLEStringStringPairSPtrConst_doGet(long j, VecNLEStringStringPairSPtrConst vecNLEStringStringPairSPtrConst, int i);

    public static final native long VecNLEStringStringPairSPtrConst_doRemove(long j, VecNLEStringStringPairSPtrConst vecNLEStringStringPairSPtrConst, int i);

    public static final native void VecNLEStringStringPairSPtrConst_doRemoveRange(long j, VecNLEStringStringPairSPtrConst vecNLEStringStringPairSPtrConst, int i, int i2);

    public static final native long VecNLEStringStringPairSPtrConst_doSet(long j, VecNLEStringStringPairSPtrConst vecNLEStringStringPairSPtrConst, int i, long j2, NLEStringStringPair nLEStringStringPair);

    public static final native int VecNLEStringStringPairSPtrConst_doSize(long j, VecNLEStringStringPairSPtrConst vecNLEStringStringPairSPtrConst);

    public static final native boolean VecNLEStringStringPairSPtrConst_isEmpty(long j, VecNLEStringStringPairSPtrConst vecNLEStringStringPairSPtrConst);

    public static final native void VecNLEStringStringPairSPtrConst_reserve(long j, VecNLEStringStringPairSPtrConst vecNLEStringStringPairSPtrConst, long j2);

    public static final native long VecNLEStyStickerAnim_capacity(long j, VecNLEStyStickerAnim vecNLEStyStickerAnim);

    public static final native void VecNLEStyStickerAnim_clear(long j, VecNLEStyStickerAnim vecNLEStyStickerAnim);

    public static final native void VecNLEStyStickerAnim_doAdd__SWIG_0(long j, VecNLEStyStickerAnim vecNLEStyStickerAnim, long j2, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native void VecNLEStyStickerAnim_doAdd__SWIG_1(long j, VecNLEStyStickerAnim vecNLEStyStickerAnim, int i, long j2, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native long VecNLEStyStickerAnim_doGet(long j, VecNLEStyStickerAnim vecNLEStyStickerAnim, int i);

    public static final native long VecNLEStyStickerAnim_doRemove(long j, VecNLEStyStickerAnim vecNLEStyStickerAnim, int i);

    public static final native void VecNLEStyStickerAnim_doRemoveRange(long j, VecNLEStyStickerAnim vecNLEStyStickerAnim, int i, int i2);

    public static final native long VecNLEStyStickerAnim_doSet(long j, VecNLEStyStickerAnim vecNLEStyStickerAnim, int i, long j2, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native int VecNLEStyStickerAnim_doSize(long j, VecNLEStyStickerAnim vecNLEStyStickerAnim);

    public static final native boolean VecNLEStyStickerAnim_isEmpty(long j, VecNLEStyStickerAnim vecNLEStyStickerAnim);

    public static final native void VecNLEStyStickerAnim_reserve(long j, VecNLEStyStickerAnim vecNLEStyStickerAnim, long j2);

    public static final native long VecNLETextTemplateClipSPtrConst_capacity(long j, VecNLETextTemplateClipSPtrConst vecNLETextTemplateClipSPtrConst);

    public static final native void VecNLETextTemplateClipSPtrConst_clear(long j, VecNLETextTemplateClipSPtrConst vecNLETextTemplateClipSPtrConst);

    public static final native void VecNLETextTemplateClipSPtrConst_doAdd__SWIG_0(long j, VecNLETextTemplateClipSPtrConst vecNLETextTemplateClipSPtrConst, long j2, NLETextTemplateClip nLETextTemplateClip);

    public static final native void VecNLETextTemplateClipSPtrConst_doAdd__SWIG_1(long j, VecNLETextTemplateClipSPtrConst vecNLETextTemplateClipSPtrConst, int i, long j2, NLETextTemplateClip nLETextTemplateClip);

    public static final native long VecNLETextTemplateClipSPtrConst_doGet(long j, VecNLETextTemplateClipSPtrConst vecNLETextTemplateClipSPtrConst, int i);

    public static final native long VecNLETextTemplateClipSPtrConst_doRemove(long j, VecNLETextTemplateClipSPtrConst vecNLETextTemplateClipSPtrConst, int i);

    public static final native void VecNLETextTemplateClipSPtrConst_doRemoveRange(long j, VecNLETextTemplateClipSPtrConst vecNLETextTemplateClipSPtrConst, int i, int i2);

    public static final native long VecNLETextTemplateClipSPtrConst_doSet(long j, VecNLETextTemplateClipSPtrConst vecNLETextTemplateClipSPtrConst, int i, long j2, NLETextTemplateClip nLETextTemplateClip);

    public static final native int VecNLETextTemplateClipSPtrConst_doSize(long j, VecNLETextTemplateClipSPtrConst vecNLETextTemplateClipSPtrConst);

    public static final native boolean VecNLETextTemplateClipSPtrConst_isEmpty(long j, VecNLETextTemplateClipSPtrConst vecNLETextTemplateClipSPtrConst);

    public static final native void VecNLETextTemplateClipSPtrConst_reserve(long j, VecNLETextTemplateClipSPtrConst vecNLETextTemplateClipSPtrConst, long j2);

    public static final native long VecNLETextTemplateClipSPtr_capacity(long j, VecNLETextTemplateClipSPtr vecNLETextTemplateClipSPtr);

    public static final native void VecNLETextTemplateClipSPtr_clear(long j, VecNLETextTemplateClipSPtr vecNLETextTemplateClipSPtr);

    public static final native void VecNLETextTemplateClipSPtr_doAdd__SWIG_0(long j, VecNLETextTemplateClipSPtr vecNLETextTemplateClipSPtr, long j2, NLETextTemplateClip nLETextTemplateClip);

    public static final native void VecNLETextTemplateClipSPtr_doAdd__SWIG_1(long j, VecNLETextTemplateClipSPtr vecNLETextTemplateClipSPtr, int i, long j2, NLETextTemplateClip nLETextTemplateClip);

    public static final native long VecNLETextTemplateClipSPtr_doGet(long j, VecNLETextTemplateClipSPtr vecNLETextTemplateClipSPtr, int i);

    public static final native long VecNLETextTemplateClipSPtr_doRemove(long j, VecNLETextTemplateClipSPtr vecNLETextTemplateClipSPtr, int i);

    public static final native void VecNLETextTemplateClipSPtr_doRemoveRange(long j, VecNLETextTemplateClipSPtr vecNLETextTemplateClipSPtr, int i, int i2);

    public static final native long VecNLETextTemplateClipSPtr_doSet(long j, VecNLETextTemplateClipSPtr vecNLETextTemplateClipSPtr, int i, long j2, NLETextTemplateClip nLETextTemplateClip);

    public static final native int VecNLETextTemplateClipSPtr_doSize(long j, VecNLETextTemplateClipSPtr vecNLETextTemplateClipSPtr);

    public static final native boolean VecNLETextTemplateClipSPtr_isEmpty(long j, VecNLETextTemplateClipSPtr vecNLETextTemplateClipSPtr);

    public static final native void VecNLETextTemplateClipSPtr_reserve(long j, VecNLETextTemplateClipSPtr vecNLETextTemplateClipSPtr, long j2);

    public static final native long VecNLETimeEffectSPtrConst_capacity(long j, VecNLETimeEffectSPtrConst vecNLETimeEffectSPtrConst);

    public static final native void VecNLETimeEffectSPtrConst_clear(long j, VecNLETimeEffectSPtrConst vecNLETimeEffectSPtrConst);

    public static final native void VecNLETimeEffectSPtrConst_doAdd__SWIG_0(long j, VecNLETimeEffectSPtrConst vecNLETimeEffectSPtrConst, long j2, NLETimeEffect nLETimeEffect);

    public static final native void VecNLETimeEffectSPtrConst_doAdd__SWIG_1(long j, VecNLETimeEffectSPtrConst vecNLETimeEffectSPtrConst, int i, long j2, NLETimeEffect nLETimeEffect);

    public static final native long VecNLETimeEffectSPtrConst_doGet(long j, VecNLETimeEffectSPtrConst vecNLETimeEffectSPtrConst, int i);

    public static final native long VecNLETimeEffectSPtrConst_doRemove(long j, VecNLETimeEffectSPtrConst vecNLETimeEffectSPtrConst, int i);

    public static final native void VecNLETimeEffectSPtrConst_doRemoveRange(long j, VecNLETimeEffectSPtrConst vecNLETimeEffectSPtrConst, int i, int i2);

    public static final native long VecNLETimeEffectSPtrConst_doSet(long j, VecNLETimeEffectSPtrConst vecNLETimeEffectSPtrConst, int i, long j2, NLETimeEffect nLETimeEffect);

    public static final native int VecNLETimeEffectSPtrConst_doSize(long j, VecNLETimeEffectSPtrConst vecNLETimeEffectSPtrConst);

    public static final native boolean VecNLETimeEffectSPtrConst_isEmpty(long j, VecNLETimeEffectSPtrConst vecNLETimeEffectSPtrConst);

    public static final native void VecNLETimeEffectSPtrConst_reserve(long j, VecNLETimeEffectSPtrConst vecNLETimeEffectSPtrConst, long j2);

    public static final native long VecNLETimeEffectSPtr_capacity(long j, VecNLETimeEffectSPtr vecNLETimeEffectSPtr);

    public static final native void VecNLETimeEffectSPtr_clear(long j, VecNLETimeEffectSPtr vecNLETimeEffectSPtr);

    public static final native void VecNLETimeEffectSPtr_doAdd__SWIG_0(long j, VecNLETimeEffectSPtr vecNLETimeEffectSPtr, long j2, NLETimeEffect nLETimeEffect);

    public static final native void VecNLETimeEffectSPtr_doAdd__SWIG_1(long j, VecNLETimeEffectSPtr vecNLETimeEffectSPtr, int i, long j2, NLETimeEffect nLETimeEffect);

    public static final native long VecNLETimeEffectSPtr_doGet(long j, VecNLETimeEffectSPtr vecNLETimeEffectSPtr, int i);

    public static final native long VecNLETimeEffectSPtr_doRemove(long j, VecNLETimeEffectSPtr vecNLETimeEffectSPtr, int i);

    public static final native void VecNLETimeEffectSPtr_doRemoveRange(long j, VecNLETimeEffectSPtr vecNLETimeEffectSPtr, int i, int i2);

    public static final native long VecNLETimeEffectSPtr_doSet(long j, VecNLETimeEffectSPtr vecNLETimeEffectSPtr, int i, long j2, NLETimeEffect nLETimeEffect);

    public static final native int VecNLETimeEffectSPtr_doSize(long j, VecNLETimeEffectSPtr vecNLETimeEffectSPtr);

    public static final native boolean VecNLETimeEffectSPtr_isEmpty(long j, VecNLETimeEffectSPtr vecNLETimeEffectSPtr);

    public static final native void VecNLETimeEffectSPtr_reserve(long j, VecNLETimeEffectSPtr vecNLETimeEffectSPtr, long j2);

    public static final native long VecNLETimeSpaceNodeSPtrConst_capacity(long j, VecNLETimeSpaceNodeSPtrConst vecNLETimeSpaceNodeSPtrConst);

    public static final native void VecNLETimeSpaceNodeSPtrConst_clear(long j, VecNLETimeSpaceNodeSPtrConst vecNLETimeSpaceNodeSPtrConst);

    public static final native void VecNLETimeSpaceNodeSPtrConst_doAdd__SWIG_0(long j, VecNLETimeSpaceNodeSPtrConst vecNLETimeSpaceNodeSPtrConst, long j2, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native void VecNLETimeSpaceNodeSPtrConst_doAdd__SWIG_1(long j, VecNLETimeSpaceNodeSPtrConst vecNLETimeSpaceNodeSPtrConst, int i, long j2, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native long VecNLETimeSpaceNodeSPtrConst_doGet(long j, VecNLETimeSpaceNodeSPtrConst vecNLETimeSpaceNodeSPtrConst, int i);

    public static final native long VecNLETimeSpaceNodeSPtrConst_doRemove(long j, VecNLETimeSpaceNodeSPtrConst vecNLETimeSpaceNodeSPtrConst, int i);

    public static final native void VecNLETimeSpaceNodeSPtrConst_doRemoveRange(long j, VecNLETimeSpaceNodeSPtrConst vecNLETimeSpaceNodeSPtrConst, int i, int i2);

    public static final native long VecNLETimeSpaceNodeSPtrConst_doSet(long j, VecNLETimeSpaceNodeSPtrConst vecNLETimeSpaceNodeSPtrConst, int i, long j2, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native int VecNLETimeSpaceNodeSPtrConst_doSize(long j, VecNLETimeSpaceNodeSPtrConst vecNLETimeSpaceNodeSPtrConst);

    public static final native boolean VecNLETimeSpaceNodeSPtrConst_isEmpty(long j, VecNLETimeSpaceNodeSPtrConst vecNLETimeSpaceNodeSPtrConst);

    public static final native void VecNLETimeSpaceNodeSPtrConst_reserve(long j, VecNLETimeSpaceNodeSPtrConst vecNLETimeSpaceNodeSPtrConst, long j2);

    public static final native long VecNLETimeSpaceNodeSPtr_capacity(long j, VecNLETimeSpaceNodeSPtr vecNLETimeSpaceNodeSPtr);

    public static final native void VecNLETimeSpaceNodeSPtr_clear(long j, VecNLETimeSpaceNodeSPtr vecNLETimeSpaceNodeSPtr);

    public static final native void VecNLETimeSpaceNodeSPtr_doAdd__SWIG_0(long j, VecNLETimeSpaceNodeSPtr vecNLETimeSpaceNodeSPtr, long j2, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native void VecNLETimeSpaceNodeSPtr_doAdd__SWIG_1(long j, VecNLETimeSpaceNodeSPtr vecNLETimeSpaceNodeSPtr, int i, long j2, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native long VecNLETimeSpaceNodeSPtr_doGet(long j, VecNLETimeSpaceNodeSPtr vecNLETimeSpaceNodeSPtr, int i);

    public static final native long VecNLETimeSpaceNodeSPtr_doRemove(long j, VecNLETimeSpaceNodeSPtr vecNLETimeSpaceNodeSPtr, int i);

    public static final native void VecNLETimeSpaceNodeSPtr_doRemoveRange(long j, VecNLETimeSpaceNodeSPtr vecNLETimeSpaceNodeSPtr, int i, int i2);

    public static final native long VecNLETimeSpaceNodeSPtr_doSet(long j, VecNLETimeSpaceNodeSPtr vecNLETimeSpaceNodeSPtr, int i, long j2, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native int VecNLETimeSpaceNodeSPtr_doSize(long j, VecNLETimeSpaceNodeSPtr vecNLETimeSpaceNodeSPtr);

    public static final native boolean VecNLETimeSpaceNodeSPtr_isEmpty(long j, VecNLETimeSpaceNodeSPtr vecNLETimeSpaceNodeSPtr);

    public static final native void VecNLETimeSpaceNodeSPtr_reserve(long j, VecNLETimeSpaceNodeSPtr vecNLETimeSpaceNodeSPtr, long j2);

    public static final native long VecNLETrackSPtrConst_capacity(long j, VecNLETrackSPtrConst vecNLETrackSPtrConst);

    public static final native void VecNLETrackSPtrConst_clear(long j, VecNLETrackSPtrConst vecNLETrackSPtrConst);

    public static final native void VecNLETrackSPtrConst_doAdd__SWIG_0(long j, VecNLETrackSPtrConst vecNLETrackSPtrConst, long j2, NLETrack nLETrack);

    public static final native void VecNLETrackSPtrConst_doAdd__SWIG_1(long j, VecNLETrackSPtrConst vecNLETrackSPtrConst, int i, long j2, NLETrack nLETrack);

    public static final native long VecNLETrackSPtrConst_doGet(long j, VecNLETrackSPtrConst vecNLETrackSPtrConst, int i);

    public static final native long VecNLETrackSPtrConst_doRemove(long j, VecNLETrackSPtrConst vecNLETrackSPtrConst, int i);

    public static final native void VecNLETrackSPtrConst_doRemoveRange(long j, VecNLETrackSPtrConst vecNLETrackSPtrConst, int i, int i2);

    public static final native long VecNLETrackSPtrConst_doSet(long j, VecNLETrackSPtrConst vecNLETrackSPtrConst, int i, long j2, NLETrack nLETrack);

    public static final native int VecNLETrackSPtrConst_doSize(long j, VecNLETrackSPtrConst vecNLETrackSPtrConst);

    public static final native boolean VecNLETrackSPtrConst_isEmpty(long j, VecNLETrackSPtrConst vecNLETrackSPtrConst);

    public static final native void VecNLETrackSPtrConst_reserve(long j, VecNLETrackSPtrConst vecNLETrackSPtrConst, long j2);

    public static final native long VecNLETrackSPtr_capacity(long j, VecNLETrackSPtr vecNLETrackSPtr);

    public static final native void VecNLETrackSPtr_clear(long j, VecNLETrackSPtr vecNLETrackSPtr);

    public static final native void VecNLETrackSPtr_doAdd__SWIG_0(long j, VecNLETrackSPtr vecNLETrackSPtr, long j2, NLETrack nLETrack);

    public static final native void VecNLETrackSPtr_doAdd__SWIG_1(long j, VecNLETrackSPtr vecNLETrackSPtr, int i, long j2, NLETrack nLETrack);

    public static final native long VecNLETrackSPtr_doGet(long j, VecNLETrackSPtr vecNLETrackSPtr, int i);

    public static final native long VecNLETrackSPtr_doRemove(long j, VecNLETrackSPtr vecNLETrackSPtr, int i);

    public static final native void VecNLETrackSPtr_doRemoveRange(long j, VecNLETrackSPtr vecNLETrackSPtr, int i, int i2);

    public static final native long VecNLETrackSPtr_doSet(long j, VecNLETrackSPtr vecNLETrackSPtr, int i, long j2, NLETrack nLETrack);

    public static final native int VecNLETrackSPtr_doSize(long j, VecNLETrackSPtr vecNLETrackSPtr);

    public static final native boolean VecNLETrackSPtr_isEmpty(long j, VecNLETrackSPtr vecNLETrackSPtr);

    public static final native void VecNLETrackSPtr_reserve(long j, VecNLETrackSPtr vecNLETrackSPtr, long j2);

    public static final native long VecNLETrackSlotSPtrConst_capacity(long j, VecNLETrackSlotSPtrConst vecNLETrackSlotSPtrConst);

    public static final native void VecNLETrackSlotSPtrConst_clear(long j, VecNLETrackSlotSPtrConst vecNLETrackSlotSPtrConst);

    public static final native void VecNLETrackSlotSPtrConst_doAdd__SWIG_0(long j, VecNLETrackSlotSPtrConst vecNLETrackSlotSPtrConst, long j2, NLETrackSlot nLETrackSlot);

    public static final native void VecNLETrackSlotSPtrConst_doAdd__SWIG_1(long j, VecNLETrackSlotSPtrConst vecNLETrackSlotSPtrConst, int i, long j2, NLETrackSlot nLETrackSlot);

    public static final native long VecNLETrackSlotSPtrConst_doGet(long j, VecNLETrackSlotSPtrConst vecNLETrackSlotSPtrConst, int i);

    public static final native long VecNLETrackSlotSPtrConst_doRemove(long j, VecNLETrackSlotSPtrConst vecNLETrackSlotSPtrConst, int i);

    public static final native void VecNLETrackSlotSPtrConst_doRemoveRange(long j, VecNLETrackSlotSPtrConst vecNLETrackSlotSPtrConst, int i, int i2);

    public static final native long VecNLETrackSlotSPtrConst_doSet(long j, VecNLETrackSlotSPtrConst vecNLETrackSlotSPtrConst, int i, long j2, NLETrackSlot nLETrackSlot);

    public static final native int VecNLETrackSlotSPtrConst_doSize(long j, VecNLETrackSlotSPtrConst vecNLETrackSlotSPtrConst);

    public static final native boolean VecNLETrackSlotSPtrConst_isEmpty(long j, VecNLETrackSlotSPtrConst vecNLETrackSlotSPtrConst);

    public static final native void VecNLETrackSlotSPtrConst_reserve(long j, VecNLETrackSlotSPtrConst vecNLETrackSlotSPtrConst, long j2);

    public static final native long VecNLETrackSlotSPtr_capacity(long j, VecNLETrackSlotSPtr vecNLETrackSlotSPtr);

    public static final native void VecNLETrackSlotSPtr_clear(long j, VecNLETrackSlotSPtr vecNLETrackSlotSPtr);

    public static final native void VecNLETrackSlotSPtr_doAdd__SWIG_0(long j, VecNLETrackSlotSPtr vecNLETrackSlotSPtr, long j2, NLETrackSlot nLETrackSlot);

    public static final native void VecNLETrackSlotSPtr_doAdd__SWIG_1(long j, VecNLETrackSlotSPtr vecNLETrackSlotSPtr, int i, long j2, NLETrackSlot nLETrackSlot);

    public static final native long VecNLETrackSlotSPtr_doGet(long j, VecNLETrackSlotSPtr vecNLETrackSlotSPtr, int i);

    public static final native long VecNLETrackSlotSPtr_doRemove(long j, VecNLETrackSlotSPtr vecNLETrackSlotSPtr, int i);

    public static final native void VecNLETrackSlotSPtr_doRemoveRange(long j, VecNLETrackSlotSPtr vecNLETrackSlotSPtr, int i, int i2);

    public static final native long VecNLETrackSlotSPtr_doSet(long j, VecNLETrackSlotSPtr vecNLETrackSlotSPtr, int i, long j2, NLETrackSlot nLETrackSlot);

    public static final native int VecNLETrackSlotSPtr_doSize(long j, VecNLETrackSlotSPtr vecNLETrackSlotSPtr);

    public static final native boolean VecNLETrackSlotSPtr_isEmpty(long j, VecNLETrackSlotSPtr vecNLETrackSlotSPtr);

    public static final native void VecNLETrackSlotSPtr_reserve(long j, VecNLETrackSlotSPtr vecNLETrackSlotSPtr, long j2);

    public static final native long VecNLETrackType_capacity(long j, VecNLETrackType vecNLETrackType);

    public static final native void VecNLETrackType_clear(long j, VecNLETrackType vecNLETrackType);

    public static final native void VecNLETrackType_doAdd__SWIG_0(long j, VecNLETrackType vecNLETrackType, int i);

    public static final native void VecNLETrackType_doAdd__SWIG_1(long j, VecNLETrackType vecNLETrackType, int i, int i2);

    public static final native int VecNLETrackType_doGet(long j, VecNLETrackType vecNLETrackType, int i);

    public static final native int VecNLETrackType_doRemove(long j, VecNLETrackType vecNLETrackType, int i);

    public static final native void VecNLETrackType_doRemoveRange(long j, VecNLETrackType vecNLETrackType, int i, int i2);

    public static final native int VecNLETrackType_doSet(long j, VecNLETrackType vecNLETrackType, int i, int i2);

    public static final native int VecNLETrackType_doSize(long j, VecNLETrackType vecNLETrackType);

    public static final native boolean VecNLETrackType_isEmpty(long j, VecNLETrackType vecNLETrackType);

    public static final native void VecNLETrackType_reserve(long j, VecNLETrackType vecNLETrackType, long j2);

    public static final native long VecNLEVideoAnimationSPtrConst_capacity(long j, VecNLEVideoAnimationSPtrConst vecNLEVideoAnimationSPtrConst);

    public static final native void VecNLEVideoAnimationSPtrConst_clear(long j, VecNLEVideoAnimationSPtrConst vecNLEVideoAnimationSPtrConst);

    public static final native void VecNLEVideoAnimationSPtrConst_doAdd__SWIG_0(long j, VecNLEVideoAnimationSPtrConst vecNLEVideoAnimationSPtrConst, long j2, NLEVideoAnimation nLEVideoAnimation);

    public static final native void VecNLEVideoAnimationSPtrConst_doAdd__SWIG_1(long j, VecNLEVideoAnimationSPtrConst vecNLEVideoAnimationSPtrConst, int i, long j2, NLEVideoAnimation nLEVideoAnimation);

    public static final native long VecNLEVideoAnimationSPtrConst_doGet(long j, VecNLEVideoAnimationSPtrConst vecNLEVideoAnimationSPtrConst, int i);

    public static final native long VecNLEVideoAnimationSPtrConst_doRemove(long j, VecNLEVideoAnimationSPtrConst vecNLEVideoAnimationSPtrConst, int i);

    public static final native void VecNLEVideoAnimationSPtrConst_doRemoveRange(long j, VecNLEVideoAnimationSPtrConst vecNLEVideoAnimationSPtrConst, int i, int i2);

    public static final native long VecNLEVideoAnimationSPtrConst_doSet(long j, VecNLEVideoAnimationSPtrConst vecNLEVideoAnimationSPtrConst, int i, long j2, NLEVideoAnimation nLEVideoAnimation);

    public static final native int VecNLEVideoAnimationSPtrConst_doSize(long j, VecNLEVideoAnimationSPtrConst vecNLEVideoAnimationSPtrConst);

    public static final native boolean VecNLEVideoAnimationSPtrConst_isEmpty(long j, VecNLEVideoAnimationSPtrConst vecNLEVideoAnimationSPtrConst);

    public static final native void VecNLEVideoAnimationSPtrConst_reserve(long j, VecNLEVideoAnimationSPtrConst vecNLEVideoAnimationSPtrConst, long j2);

    public static final native long VecNLEVideoAnimationSPtr_capacity(long j, VecNLEVideoAnimationSPtr vecNLEVideoAnimationSPtr);

    public static final native void VecNLEVideoAnimationSPtr_clear(long j, VecNLEVideoAnimationSPtr vecNLEVideoAnimationSPtr);

    public static final native void VecNLEVideoAnimationSPtr_doAdd__SWIG_0(long j, VecNLEVideoAnimationSPtr vecNLEVideoAnimationSPtr, long j2, NLEVideoAnimation nLEVideoAnimation);

    public static final native void VecNLEVideoAnimationSPtr_doAdd__SWIG_1(long j, VecNLEVideoAnimationSPtr vecNLEVideoAnimationSPtr, int i, long j2, NLEVideoAnimation nLEVideoAnimation);

    public static final native long VecNLEVideoAnimationSPtr_doGet(long j, VecNLEVideoAnimationSPtr vecNLEVideoAnimationSPtr, int i);

    public static final native long VecNLEVideoAnimationSPtr_doRemove(long j, VecNLEVideoAnimationSPtr vecNLEVideoAnimationSPtr, int i);

    public static final native void VecNLEVideoAnimationSPtr_doRemoveRange(long j, VecNLEVideoAnimationSPtr vecNLEVideoAnimationSPtr, int i, int i2);

    public static final native long VecNLEVideoAnimationSPtr_doSet(long j, VecNLEVideoAnimationSPtr vecNLEVideoAnimationSPtr, int i, long j2, NLEVideoAnimation nLEVideoAnimation);

    public static final native int VecNLEVideoAnimationSPtr_doSize(long j, VecNLEVideoAnimationSPtr vecNLEVideoAnimationSPtr);

    public static final native boolean VecNLEVideoAnimationSPtr_isEmpty(long j, VecNLEVideoAnimationSPtr vecNLEVideoAnimationSPtr);

    public static final native void VecNLEVideoAnimationSPtr_reserve(long j, VecNLEVideoAnimationSPtr vecNLEVideoAnimationSPtr, long j2);

    public static final native long VecNLEVideoEffectSPtrConst_capacity(long j, VecNLEVideoEffectSPtrConst vecNLEVideoEffectSPtrConst);

    public static final native void VecNLEVideoEffectSPtrConst_clear(long j, VecNLEVideoEffectSPtrConst vecNLEVideoEffectSPtrConst);

    public static final native void VecNLEVideoEffectSPtrConst_doAdd__SWIG_0(long j, VecNLEVideoEffectSPtrConst vecNLEVideoEffectSPtrConst, long j2, NLEVideoEffect nLEVideoEffect);

    public static final native void VecNLEVideoEffectSPtrConst_doAdd__SWIG_1(long j, VecNLEVideoEffectSPtrConst vecNLEVideoEffectSPtrConst, int i, long j2, NLEVideoEffect nLEVideoEffect);

    public static final native long VecNLEVideoEffectSPtrConst_doGet(long j, VecNLEVideoEffectSPtrConst vecNLEVideoEffectSPtrConst, int i);

    public static final native long VecNLEVideoEffectSPtrConst_doRemove(long j, VecNLEVideoEffectSPtrConst vecNLEVideoEffectSPtrConst, int i);

    public static final native void VecNLEVideoEffectSPtrConst_doRemoveRange(long j, VecNLEVideoEffectSPtrConst vecNLEVideoEffectSPtrConst, int i, int i2);

    public static final native long VecNLEVideoEffectSPtrConst_doSet(long j, VecNLEVideoEffectSPtrConst vecNLEVideoEffectSPtrConst, int i, long j2, NLEVideoEffect nLEVideoEffect);

    public static final native int VecNLEVideoEffectSPtrConst_doSize(long j, VecNLEVideoEffectSPtrConst vecNLEVideoEffectSPtrConst);

    public static final native boolean VecNLEVideoEffectSPtrConst_isEmpty(long j, VecNLEVideoEffectSPtrConst vecNLEVideoEffectSPtrConst);

    public static final native void VecNLEVideoEffectSPtrConst_reserve(long j, VecNLEVideoEffectSPtrConst vecNLEVideoEffectSPtrConst, long j2);

    public static final native long VecNLEVideoEffectSPtr_capacity(long j, VecNLEVideoEffectSPtr vecNLEVideoEffectSPtr);

    public static final native void VecNLEVideoEffectSPtr_clear(long j, VecNLEVideoEffectSPtr vecNLEVideoEffectSPtr);

    public static final native void VecNLEVideoEffectSPtr_doAdd__SWIG_0(long j, VecNLEVideoEffectSPtr vecNLEVideoEffectSPtr, long j2, NLEVideoEffect nLEVideoEffect);

    public static final native void VecNLEVideoEffectSPtr_doAdd__SWIG_1(long j, VecNLEVideoEffectSPtr vecNLEVideoEffectSPtr, int i, long j2, NLEVideoEffect nLEVideoEffect);

    public static final native long VecNLEVideoEffectSPtr_doGet(long j, VecNLEVideoEffectSPtr vecNLEVideoEffectSPtr, int i);

    public static final native long VecNLEVideoEffectSPtr_doRemove(long j, VecNLEVideoEffectSPtr vecNLEVideoEffectSPtr, int i);

    public static final native void VecNLEVideoEffectSPtr_doRemoveRange(long j, VecNLEVideoEffectSPtr vecNLEVideoEffectSPtr, int i, int i2);

    public static final native long VecNLEVideoEffectSPtr_doSet(long j, VecNLEVideoEffectSPtr vecNLEVideoEffectSPtr, int i, long j2, NLEVideoEffect nLEVideoEffect);

    public static final native int VecNLEVideoEffectSPtr_doSize(long j, VecNLEVideoEffectSPtr vecNLEVideoEffectSPtr);

    public static final native boolean VecNLEVideoEffectSPtr_isEmpty(long j, VecNLEVideoEffectSPtr vecNLEVideoEffectSPtr);

    public static final native void VecNLEVideoEffectSPtr_reserve(long j, VecNLEVideoEffectSPtr vecNLEVideoEffectSPtr, long j2);

    public static final native long VecString_capacity(long j, VecString vecString);

    public static final native void VecString_clear(long j, VecString vecString);

    public static final native void VecString_doAdd__SWIG_0(long j, VecString vecString, String str);

    public static final native void VecString_doAdd__SWIG_1(long j, VecString vecString, int i, String str);

    public static final native String VecString_doGet(long j, VecString vecString, int i);

    public static final native String VecString_doRemove(long j, VecString vecString, int i);

    public static final native void VecString_doRemoveRange(long j, VecString vecString, int i, int i2);

    public static final native String VecString_doSet(long j, VecString vecString, int i, String str);

    public static final native int VecString_doSize(long j, VecString vecString);

    public static final native boolean VecString_isEmpty(long j, VecString vecString);

    public static final native void VecString_reserve(long j, VecString vecString, long j2);

    public static final native void delete_INLEMonitor(long j);

    public static final native void delete_MapStrNLENodeSPtr(long j);

    public static final native void delete_MapStrNLENodeSPtrConst(long j);

    public static final native void delete_MapStrNLENodeSPtrConst_Iterator(long j);

    public static final native void delete_MapStrNLENodeSPtr_Iterator(long j);

    public static final native void delete_MapStrStr(long j);

    public static final native void delete_MapStrStr_Iterator(long j);

    public static final native void delete_MapStrSwingKeyFramesPtr(long j);

    public static final native void delete_MapStrSwingKeyFramesPtrConst(long j);

    public static final native void delete_MapStrSwingKeyFramesPtrConst_Iterator(long j);

    public static final native void delete_MapStrSwingKeyFramesPtr_Iterator(long j);

    public static final native void delete_NLEAIMatting(long j);

    public static final native void delete_NLEAutoFillFrame(long j);

    public static final native void delete_NLEBase64ResourceProtocol(long j);

    public static final native void delete_NLEBezierCurvesPoint(long j);

    public static final native void delete_NLEBranch(long j);

    public static final native void delete_NLEBranchListener(long j);

    public static final native void delete_NLEChangeListener(long j);

    public static final native void delete_NLEChromaChannel(long j);

    public static final native void delete_NLECommit(long j);

    public static final native void delete_NLECommonKeyframe(long j);

    public static final native void delete_NLECurveActionBeam(long j);

    public static final native void delete_NLECurveSpeedCalculator(long j);

    public static final native void delete_NLECustomMattingParam(long j);

    public static final native void delete_NLEEditor(long j);

    public static final native void delete_NLEEditorListener(long j);

    public static final native void delete_NLEEverPhotoResourceProtocol(long j);

    public static final native void delete_NLEFilter(long j);

    public static final native void delete_NLEFilterName(long j);

    public static final native void delete_NLEInstantMode(long j);

    public static final native void delete_NLEInteractivePenParam(long j);

    public static final native void delete_NLEKeyFrameTransientExtrakey(long j);

    public static final native void delete_NLEKeyframe(long j);

    public static final native void delete_NLEKeyframeGraphValue(long j);

    public static final native void delete_NLELogger(long j);

    public static final native void delete_NLELoggerFunc(long j);

    public static final native void delete_NLELoggerListener(long j);

    public static final native void delete_NLELokiResourceProtocol(long j);

    public static final native void delete_NLEMVExternalAlgorithmResult(long j);

    public static final native void delete_NLEManifest(long j);

    public static final native void delete_NLEMask(long j);

    public static final native void delete_NLEMatrix(long j);

    public static final native void delete_NLEMattingStroke(long j);

    public static final native void delete_NLEMeasure(long j);

    public static final native void delete_NLEMediaResourceProtocol(long j);

    public static final native void delete_NLEModel(long j);

    public static final native void delete_NLEMonitor(long j);

    public static final native void delete_NLEMonitorParamBuilder(long j);

    public static final native void delete_NLEMusicResourceProtocol(long j);

    public static final native void delete_NLENode(long j);

    public static final native void delete_NLENodeGroup(long j);

    public static final native void delete_NLENoiseReduction(long j);

    public static final native void delete_NLEPoint(long j);

    public static final native void delete_NLERenderImageResizeInfo(long j);

    public static final native void delete_NLERenderProxySegment(long j);

    public static final native void delete_NLERenderSetting(long j);

    public static final native void delete_NLEResourceAV(long j);

    public static final native void delete_NLEResourceComposite(long j);

    public static final native void delete_NLEResourceFetchCallback(long j);

    public static final native void delete_NLEResourceGIF(long j);

    public static final native void delete_NLEResourceIdConverter(long j);

    public static final native void delete_NLEResourceIdParser(long j);

    public static final native void delete_NLEResourceNode(long j);

    public static final native void delete_NLEResourceProtocol(long j);

    public static final native void delete_NLERichTextStyle(long j);

    public static final native void delete_NLESegment(long j);

    public static final native void delete_NLESegmentAIMatting(long j);

    public static final native void delete_NLESegmentAudio(long j);

    public static final native void delete_NLESegmentAudioFadeFilter(long j);

    public static final native void delete_NLESegmentAudioLoudnessBalanceFilter(long j);

    public static final native void delete_NLESegmentAudioMatrixFilter(long j);

    public static final native void delete_NLESegmentAudioSamiFilter(long j);

    public static final native void delete_NLESegmentAudioVoiceBeautifyFilter(long j);

    public static final native void delete_NLESegmentAudioVolumeFilter(long j);

    public static final native void delete_NLESegmentAutoFillFrame(long j);

    public static final native void delete_NLESegmentBorderSticker(long j);

    public static final native void delete_NLESegmentBrushSticker(long j);

    public static final native void delete_NLESegmentChromaChannel(long j);

    public static final native void delete_NLESegmentComposerFilter(long j);

    public static final native void delete_NLESegmentComposite(long j);

    public static final native void delete_NLESegmentEffect(long j);

    public static final native void delete_NLESegmentEmojiSticker(long j);

    public static final native void delete_NLESegmentFilter(long j);

    public static final native void delete_NLESegmentGIF(long j);

    public static final native void delete_NLESegmentHDRFilter(long j);

    public static final native void delete_NLESegmentHSLFilter(long j);

    public static final native void delete_NLESegmentImage(long j);

    public static final native void delete_NLESegmentImageSticker(long j);

    public static final native void delete_NLESegmentImageVideoAnimation(long j);

    public static final native void delete_NLESegmentInfoSticker(long j);

    public static final native void delete_NLESegmentIntegrationFilter(long j);

    public static final native void delete_NLESegmentLogColorWheelsFilter(long j);

    public static final native void delete_NLESegmentMV(long j);

    public static final native void delete_NLESegmentMask(long j);

    public static final native void delete_NLESegmentPrimaryColorWheelsFilter(long j);

    public static final native void delete_NLESegmentSticker(long j);

    public static final native void delete_NLESegmentSubtitleSticker(long j);

    public static final native void delete_NLESegmentTemplate(long j);

    public static final native void delete_NLESegmentTextSticker(long j);

    public static final native void delete_NLESegmentTextTemplate(long j);

    public static final native void delete_NLESegmentTimeEffect(long j);

    public static final native void delete_NLESegmentTransition(long j);

    public static final native void delete_NLESegmentVideo(long j);

    public static final native void delete_NLESegmentVideoAnimation(long j);

    public static final native void delete_NLESetting(long j);

    public static final native void delete_NLESize(long j);

    public static final native void delete_NLESizeUtils(long j);

    public static final native void delete_NLEStringFloatPair(long j);

    public static final native void delete_NLEStringStringPair(long j);

    public static final native void delete_NLEStyCanvas(long j);

    public static final native void delete_NLEStyClip(long j);

    public static final native void delete_NLEStyColor(long j);

    public static final native void delete_NLEStyColorHSL(long j);

    public static final native void delete_NLEStyColorRGB(long j);

    public static final native void delete_NLEStyCrop(long j);

    public static final native void delete_NLEStyRecognizedWord(long j);

    public static final native void delete_NLEStyStickerAnim(long j);

    public static final native void delete_NLEStyText(long j);

    public static final native void delete_NLESwingKeyframeUtil(long j);

    public static final native void delete_NLETextTemplateClip(long j);

    public static final native void delete_NLETimeEffect(long j);

    public static final native void delete_NLETimePointPair(long j);

    public static final native void delete_NLETimeSpaceNode(long j);

    public static final native void delete_NLETrack(long j);

    public static final native void delete_NLETrackAlgorithm(long j);

    public static final native void delete_NLETrackMV(long j);

    public static final native void delete_NLETrackSlot(long j);

    public static final native void delete_NLEUrlResourceProtocol(long j);

    public static final native void delete_NLEVidResourceProtocol(long j);

    public static final native void delete_NLEVideoAnimation(long j);

    public static final native void delete_NLEVideoEffect(long j);

    public static final native void delete_NLEVideoFrameModel(long j);

    public static final native void delete_PairFloatFloat(long j);

    public static final native void delete_PairIntInt(long j);

    public static final native void delete_PairNLEPoint2NLEPoint(long j);

    public static final native void delete_PairSlotSlot(long j);

    public static final native void delete_PairUIntUInt(long j);

    public static final native void delete_UnorderedMapStrStr(long j);

    public static final native void delete_UnorderedMapStrStr_Iterator(long j);

    public static final native void delete_VecDouble(long j);

    public static final native void delete_VecFloat(long j);

    public static final native void delete_VecInt(long j);

    public static final native void delete_VecLongLong(long j);

    public static final native void delete_VecNLEBezierCurvesPoint(long j);

    public static final native void delete_VecNLEChromaChannelSPtr(long j);

    public static final native void delete_VecNLEChromaChannelSPtrConst(long j);

    public static final native void delete_VecNLECommitSPtr(long j);

    public static final native void delete_VecNLECommitSPtrConst(long j);

    public static final native void delete_VecNLECommonKeyframe(long j);

    public static final native void delete_VecNLEEditorListener(long j);

    public static final native void delete_VecNLEFilterSPtr(long j);

    public static final native void delete_VecNLEFilterSPtrConst(long j);

    public static final native void delete_VecNLEKeyframe(long j);

    public static final native void delete_VecNLEKeyframeGraphValue(long j);

    public static final native void delete_VecNLEMVExternalAlgorithmResultSPtr(long j);

    public static final native void delete_VecNLEMVExternalAlgorithmResultSPtrConst(long j);

    public static final native void delete_VecNLEMaskSPtr(long j);

    public static final native void delete_VecNLEMaskSPtrConst(long j);

    public static final native void delete_VecNLEMattingStroke(long j);

    public static final native void delete_VecNLENoiseReductionSPtr(long j);

    public static final native void delete_VecNLENoiseReductionSPtrConst(long j);

    public static final native void delete_VecNLEPointSPtr(long j);

    public static final native void delete_VecNLEPointSPtrConst(long j);

    public static final native void delete_VecNLEResourceNodeSPtr(long j);

    public static final native void delete_VecNLEResourceNodeSPtrConst(long j);

    public static final native void delete_VecNLESegmentSPtr(long j);

    public static final native void delete_VecNLESegmentSPtrConst(long j);

    public static final native void delete_VecNLEStringFloatPairSPtr(long j);

    public static final native void delete_VecNLEStringFloatPairSPtrConst(long j);

    public static final native void delete_VecNLEStringStringPairPairSPtr(long j);

    public static final native void delete_VecNLEStringStringPairSPtrConst(long j);

    public static final native void delete_VecNLEStyStickerAnim(long j);

    public static final native void delete_VecNLETextTemplateClipSPtr(long j);

    public static final native void delete_VecNLETextTemplateClipSPtrConst(long j);

    public static final native void delete_VecNLETimeEffectSPtr(long j);

    public static final native void delete_VecNLETimeEffectSPtrConst(long j);

    public static final native void delete_VecNLETimeSpaceNodeSPtr(long j);

    public static final native void delete_VecNLETimeSpaceNodeSPtrConst(long j);

    public static final native void delete_VecNLETrackSPtr(long j);

    public static final native void delete_VecNLETrackSPtrConst(long j);

    public static final native void delete_VecNLETrackSlotSPtr(long j);

    public static final native void delete_VecNLETrackSlotSPtrConst(long j);

    public static final native void delete_VecNLETrackType(long j);

    public static final native void delete_VecNLEVideoAnimationSPtr(long j);

    public static final native void delete_VecNLEVideoAnimationSPtrConst(long j);

    public static final native void delete_VecNLEVideoEffectSPtr(long j);

    public static final native void delete_VecNLEVideoEffectSPtrConst(long j);

    public static final native void delete_VecString(long j);

    public static final native long new_INLEMonitor();

    public static final native long new_MapStrNLENodeSPtrConst__SWIG_0();

    public static final native long new_MapStrNLENodeSPtrConst__SWIG_1(long j, MapStrNLENodeSPtrConst mapStrNLENodeSPtrConst);

    public static final native long new_MapStrNLENodeSPtr__SWIG_0();

    public static final native long new_MapStrNLENodeSPtr__SWIG_1(long j, MapStrNLENodeSPtr mapStrNLENodeSPtr);

    public static final native long new_MapStrStr__SWIG_0();

    public static final native long new_MapStrStr__SWIG_1(long j, MapStrStr mapStrStr);

    public static final native long new_MapStrSwingKeyFramesPtrConst__SWIG_0();

    public static final native long new_MapStrSwingKeyFramesPtrConst__SWIG_1(long j, MapStrSwingKeyFramesPtrConst mapStrSwingKeyFramesPtrConst);

    public static final native long new_MapStrSwingKeyFramesPtr__SWIG_0();

    public static final native long new_MapStrSwingKeyFramesPtr__SWIG_1(long j, MapStrSwingKeyFramesPtr mapStrSwingKeyFramesPtr);

    public static final native long new_NLEAIMatting();

    public static final native long new_NLEAutoFillFrame();

    public static final native long new_NLEBase64ResourceProtocol(String str);

    public static final native long new_NLEBezierCurvesPoint();

    public static final native long new_NLEBranch();

    public static final native long new_NLEBranchListener();

    public static final native long new_NLEChangeListener();

    public static final native long new_NLEChromaChannel();

    public static final native long new_NLECommit();

    public static final native long new_NLECommonKeyframe();

    public static final native long new_NLECurveActionBeam();

    public static final native long new_NLECurveSpeedCalculator__SWIG_0(long j, VecNLEPointSPtr vecNLEPointSPtr, boolean z);

    public static final native long new_NLECurveSpeedCalculator__SWIG_1(long j, VecNLEPointSPtr vecNLEPointSPtr);

    public static final native long new_NLECustomMattingParam();

    public static final native long new_NLEEditor();

    public static final native long new_NLEEditorListener();

    public static final native long new_NLEEverPhotoResourceProtocol(String str, long j, String str2);

    public static final native long new_NLEFilter();

    public static final native long new_NLEFilterName();

    public static final native long new_NLEInstantMode();

    public static final native long new_NLEInteractivePenParam();

    public static final native long new_NLEKeyFrameTransientExtrakey();

    public static final native long new_NLEKeyframe();

    public static final native long new_NLEKeyframeGraphValue();

    public static final native long new_NLELogger();

    public static final native long new_NLELoggerListener();

    public static final native long new_NLELokiResourceProtocol__SWIG_0(String str);

    public static final native long new_NLELokiResourceProtocol__SWIG_1(String str, String str2);

    public static final native long new_NLEMVExternalAlgorithmResult();

    public static final native long new_NLEManifest();

    public static final native long new_NLEMask();

    public static final native long new_NLEMatrix();

    public static final native long new_NLEMattingStroke();

    public static final native long new_NLEMeasure();

    public static final native long new_NLEMediaResourceProtocol__SWIG_0(String str);

    public static final native long new_NLEMediaResourceProtocol__SWIG_1(String str, String str2);

    public static final native long new_NLEModel();

    public static final native long new_NLEMonitor();

    public static final native long new_NLEMonitorParamBuilder();

    public static final native long new_NLEMusicResourceProtocol(String str);

    public static final native long new_NLENodeGroup();

    public static final native long new_NLENoiseReduction();

    public static final native long new_NLEPoint();

    public static final native long new_NLERenderImageResizeInfo();

    public static final native long new_NLERenderProxySegment();

    public static final native long new_NLERenderSetting();

    public static final native long new_NLEResourceAV();

    public static final native long new_NLEResourceComposite();

    public static final native long new_NLEResourceFetchCallback();

    public static final native long new_NLEResourceGIF();

    public static final native long new_NLEResourceIdParser(String str);

    public static final native long new_NLEResourceNode();

    public static final native long new_NLERichTextStyle();

    public static final native long new_NLESegmentAIMatting();

    public static final native long new_NLESegmentAudio();

    public static final native long new_NLESegmentAudioFadeFilter();

    public static final native long new_NLESegmentAudioLoudnessBalanceFilter();

    public static final native long new_NLESegmentAudioMatrixFilter();

    public static final native long new_NLESegmentAudioSamiFilter();

    public static final native long new_NLESegmentAudioVoiceBeautifyFilter();

    public static final native long new_NLESegmentAudioVolumeFilter();

    public static final native long new_NLESegmentAutoFillFrame();

    public static final native long new_NLESegmentBorderSticker();

    public static final native long new_NLESegmentBrushSticker();

    public static final native long new_NLESegmentChromaChannel();

    public static final native long new_NLESegmentComposerFilter();

    public static final native long new_NLESegmentComposite();

    public static final native long new_NLESegmentEffect();

    public static final native long new_NLESegmentEmojiSticker();

    public static final native long new_NLESegmentFilter();

    public static final native long new_NLESegmentGIF();

    public static final native long new_NLESegmentHDRFilter();

    public static final native long new_NLESegmentHSLFilter();

    public static final native long new_NLESegmentImage();

    public static final native long new_NLESegmentImageSticker();

    public static final native long new_NLESegmentImageVideoAnimation();

    public static final native long new_NLESegmentInfoSticker();

    public static final native long new_NLESegmentIntegrationFilter();

    public static final native long new_NLESegmentLogColorWheelsFilter();

    public static final native long new_NLESegmentMV();

    public static final native long new_NLESegmentMask();

    public static final native long new_NLESegmentPrimaryColorWheelsFilter();

    public static final native long new_NLESegmentSticker();

    public static final native long new_NLESegmentSubtitleSticker();

    public static final native long new_NLESegmentTemplate();

    public static final native long new_NLESegmentTextSticker__SWIG_0();

    public static final native long new_NLESegmentTextSticker__SWIG_1(String str);

    public static final native long new_NLESegmentTextTemplate();

    public static final native long new_NLESegmentTimeEffect();

    public static final native long new_NLESegmentTransition();

    public static final native long new_NLESegmentVideo();

    public static final native long new_NLESegmentVideoAnimation();

    public static final native long new_NLESetting();

    public static final native long new_NLESize(float f, float f2);

    public static final native long new_NLESizeUtils();

    public static final native long new_NLEStringFloatPair();

    public static final native long new_NLEStringStringPair();

    public static final native long new_NLEStyCanvas();

    public static final native long new_NLEStyClip();

    public static final native long new_NLEStyColor();

    public static final native long new_NLEStyColorHSL();

    public static final native long new_NLEStyColorRGB();

    public static final native long new_NLEStyCrop();

    public static final native long new_NLEStyRecognizedWord();

    public static final native long new_NLEStyStickerAnim();

    public static final native long new_NLEStyText__SWIG_0();

    public static final native long new_NLEStyText__SWIG_1(String str);

    public static final native long new_NLESwingKeyframeUtil();

    public static final native long new_NLETextTemplateClip();

    public static final native long new_NLETimeEffect();

    public static final native long new_NLETimePointPair();

    public static final native long new_NLETimeSpaceNode();

    public static final native long new_NLETrack();

    public static final native long new_NLETrackAlgorithm();

    public static final native long new_NLETrackMV();

    public static final native long new_NLETrackSlot();

    public static final native long new_NLEUrlResourceProtocol(String str);

    public static final native long new_NLEVidResourceProtocol(String str);

    public static final native long new_NLEVideoAnimation();

    public static final native long new_NLEVideoEffect();

    public static final native long new_NLEVideoFrameModel();

    public static final native long new_PairFloatFloat__SWIG_0();

    public static final native long new_PairFloatFloat__SWIG_1(float f, float f2);

    public static final native long new_PairFloatFloat__SWIG_2(long j, PairFloatFloat pairFloatFloat);

    public static final native long new_PairIntInt__SWIG_0();

    public static final native long new_PairIntInt__SWIG_1(int i, int i2);

    public static final native long new_PairIntInt__SWIG_2(long j, PairIntInt pairIntInt);

    public static final native long new_PairNLEPoint2NLEPoint__SWIG_0();

    public static final native long new_PairNLEPoint2NLEPoint__SWIG_1(long j, VecNLEPointSPtr vecNLEPointSPtr, long j2, VecNLEPointSPtr vecNLEPointSPtr2);

    public static final native long new_PairNLEPoint2NLEPoint__SWIG_2(long j, PairNLEPoint2NLEPoint pairNLEPoint2NLEPoint);

    public static final native long new_PairSlotSlot__SWIG_0();

    public static final native long new_PairSlotSlot__SWIG_1(long j, NLETrackSlot nLETrackSlot, long j2, NLETrackSlot nLETrackSlot2);

    public static final native long new_PairSlotSlot__SWIG_2(long j, PairSlotSlot pairSlotSlot);

    public static final native long new_PairUIntUInt__SWIG_0();

    public static final native long new_PairUIntUInt__SWIG_1(long j, long j2);

    public static final native long new_PairUIntUInt__SWIG_2(long j, PairUIntUInt pairUIntUInt);

    public static final native long new_UnorderedMapStrStr__SWIG_0();

    public static final native long new_UnorderedMapStrStr__SWIG_1(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native long new_VecDouble__SWIG_0();

    public static final native long new_VecDouble__SWIG_1(long j, VecDouble vecDouble);

    public static final native long new_VecDouble__SWIG_2(int i, double d);

    public static final native long new_VecFloat__SWIG_0();

    public static final native long new_VecFloat__SWIG_1(long j, VecFloat vecFloat);

    public static final native long new_VecFloat__SWIG_2(int i, float f);

    public static final native long new_VecInt__SWIG_0();

    public static final native long new_VecInt__SWIG_1(long j, VecInt vecInt);

    public static final native long new_VecInt__SWIG_2(int i, int i2);

    public static final native long new_VecLongLong__SWIG_0();

    public static final native long new_VecLongLong__SWIG_1(long j, VecLongLong vecLongLong);

    public static final native long new_VecLongLong__SWIG_2(int i, long j);

    public static final native long new_VecNLEBezierCurvesPoint__SWIG_0();

    public static final native long new_VecNLEBezierCurvesPoint__SWIG_1(long j, VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint);

    public static final native long new_VecNLEBezierCurvesPoint__SWIG_2(int i, long j, NLEBezierCurvesPoint nLEBezierCurvesPoint);

    public static final native long new_VecNLEChromaChannelSPtrConst__SWIG_0();

    public static final native long new_VecNLEChromaChannelSPtrConst__SWIG_1(long j, VecNLEChromaChannelSPtrConst vecNLEChromaChannelSPtrConst);

    public static final native long new_VecNLEChromaChannelSPtrConst__SWIG_2(int i, long j, NLEChromaChannel nLEChromaChannel);

    public static final native long new_VecNLEChromaChannelSPtr__SWIG_0();

    public static final native long new_VecNLEChromaChannelSPtr__SWIG_1(long j, VecNLEChromaChannelSPtr vecNLEChromaChannelSPtr);

    public static final native long new_VecNLEChromaChannelSPtr__SWIG_2(int i, long j, NLEChromaChannel nLEChromaChannel);

    public static final native long new_VecNLECommitSPtrConst__SWIG_0();

    public static final native long new_VecNLECommitSPtrConst__SWIG_1(long j, long j2, NLECommit nLECommit);

    public static final native long new_VecNLECommitSPtrConst__SWIG_2(long j);

    public static final native long new_VecNLECommitSPtrConst__SWIG_3(long j, VecNLECommitSPtrConst vecNLECommitSPtrConst);

    public static final native long new_VecNLECommitSPtr__SWIG_0();

    public static final native long new_VecNLECommitSPtr__SWIG_1(long j, long j2, NLECommit nLECommit);

    public static final native long new_VecNLECommitSPtr__SWIG_2(long j);

    public static final native long new_VecNLECommitSPtr__SWIG_3(long j, VecNLECommitSPtr vecNLECommitSPtr);

    public static final native long new_VecNLECommonKeyframe__SWIG_0();

    public static final native long new_VecNLECommonKeyframe__SWIG_1(long j, VecNLECommonKeyframe vecNLECommonKeyframe);

    public static final native long new_VecNLECommonKeyframe__SWIG_2(int i, long j, NLECommonKeyframe nLECommonKeyframe);

    public static final native long new_VecNLEEditorListener__SWIG_0();

    public static final native long new_VecNLEEditorListener__SWIG_1(long j, VecNLEEditorListener vecNLEEditorListener);

    public static final native long new_VecNLEEditorListener__SWIG_2(int i, long j, NLEEditorListener nLEEditorListener);

    public static final native long new_VecNLEFilterSPtrConst__SWIG_0();

    public static final native long new_VecNLEFilterSPtrConst__SWIG_1(long j, VecNLEFilterSPtrConst vecNLEFilterSPtrConst);

    public static final native long new_VecNLEFilterSPtrConst__SWIG_2(int i, long j, NLEFilter nLEFilter);

    public static final native long new_VecNLEFilterSPtr__SWIG_0();

    public static final native long new_VecNLEFilterSPtr__SWIG_1(long j, VecNLEFilterSPtr vecNLEFilterSPtr);

    public static final native long new_VecNLEFilterSPtr__SWIG_2(int i, long j, NLEFilter nLEFilter);

    public static final native long new_VecNLEKeyframeGraphValue__SWIG_0();

    public static final native long new_VecNLEKeyframeGraphValue__SWIG_1(long j, VecNLEKeyframeGraphValue vecNLEKeyframeGraphValue);

    public static final native long new_VecNLEKeyframeGraphValue__SWIG_2(int i, long j, NLEKeyframeGraphValue nLEKeyframeGraphValue);

    public static final native long new_VecNLEKeyframe__SWIG_0();

    public static final native long new_VecNLEKeyframe__SWIG_1(long j, VecNLEKeyframe vecNLEKeyframe);

    public static final native long new_VecNLEKeyframe__SWIG_2(int i, long j, NLEKeyframe nLEKeyframe);

    public static final native long new_VecNLEMVExternalAlgorithmResultSPtrConst__SWIG_0();

    public static final native long new_VecNLEMVExternalAlgorithmResultSPtrConst__SWIG_1(long j, VecNLEMVExternalAlgorithmResultSPtrConst vecNLEMVExternalAlgorithmResultSPtrConst);

    public static final native long new_VecNLEMVExternalAlgorithmResultSPtrConst__SWIG_2(int i, long j, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native long new_VecNLEMVExternalAlgorithmResultSPtr__SWIG_0();

    public static final native long new_VecNLEMVExternalAlgorithmResultSPtr__SWIG_1(long j, VecNLEMVExternalAlgorithmResultSPtr vecNLEMVExternalAlgorithmResultSPtr);

    public static final native long new_VecNLEMVExternalAlgorithmResultSPtr__SWIG_2(int i, long j, NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult);

    public static final native long new_VecNLEMaskSPtrConst__SWIG_0();

    public static final native long new_VecNLEMaskSPtrConst__SWIG_1(long j, VecNLEMaskSPtrConst vecNLEMaskSPtrConst);

    public static final native long new_VecNLEMaskSPtrConst__SWIG_2(int i, long j, NLEMask nLEMask);

    public static final native long new_VecNLEMaskSPtr__SWIG_0();

    public static final native long new_VecNLEMaskSPtr__SWIG_1(long j, VecNLEMaskSPtr vecNLEMaskSPtr);

    public static final native long new_VecNLEMaskSPtr__SWIG_2(int i, long j, NLEMask nLEMask);

    public static final native long new_VecNLEMattingStroke__SWIG_0();

    public static final native long new_VecNLEMattingStroke__SWIG_1(long j, VecNLEMattingStroke vecNLEMattingStroke);

    public static final native long new_VecNLEMattingStroke__SWIG_2(int i, long j, NLEMattingStroke nLEMattingStroke);

    public static final native long new_VecNLENoiseReductionSPtrConst__SWIG_0();

    public static final native long new_VecNLENoiseReductionSPtrConst__SWIG_1(long j, VecNLENoiseReductionSPtrConst vecNLENoiseReductionSPtrConst);

    public static final native long new_VecNLENoiseReductionSPtrConst__SWIG_2(int i, long j, NLENoiseReduction nLENoiseReduction);

    public static final native long new_VecNLENoiseReductionSPtr__SWIG_0();

    public static final native long new_VecNLENoiseReductionSPtr__SWIG_1(long j, VecNLENoiseReductionSPtr vecNLENoiseReductionSPtr);

    public static final native long new_VecNLENoiseReductionSPtr__SWIG_2(int i, long j, NLENoiseReduction nLENoiseReduction);

    public static final native long new_VecNLEPointSPtrConst__SWIG_0();

    public static final native long new_VecNLEPointSPtrConst__SWIG_1(long j, VecNLEPointSPtrConst vecNLEPointSPtrConst);

    public static final native long new_VecNLEPointSPtrConst__SWIG_2(int i, long j, NLEPoint nLEPoint);

    public static final native long new_VecNLEPointSPtr__SWIG_0();

    public static final native long new_VecNLEPointSPtr__SWIG_1(long j, VecNLEPointSPtr vecNLEPointSPtr);

    public static final native long new_VecNLEPointSPtr__SWIG_2(int i, long j, NLEPoint nLEPoint);

    public static final native long new_VecNLEResourceNodeSPtrConst__SWIG_0();

    public static final native long new_VecNLEResourceNodeSPtrConst__SWIG_1(long j, VecNLEResourceNodeSPtrConst vecNLEResourceNodeSPtrConst);

    public static final native long new_VecNLEResourceNodeSPtrConst__SWIG_2(int i, long j, NLEResourceNode nLEResourceNode);

    public static final native long new_VecNLEResourceNodeSPtr__SWIG_0();

    public static final native long new_VecNLEResourceNodeSPtr__SWIG_1(long j, VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr);

    public static final native long new_VecNLEResourceNodeSPtr__SWIG_2(int i, long j, NLEResourceNode nLEResourceNode);

    public static final native long new_VecNLESegmentSPtrConst__SWIG_0();

    public static final native long new_VecNLESegmentSPtrConst__SWIG_1(long j, VecNLESegmentSPtrConst vecNLESegmentSPtrConst);

    public static final native long new_VecNLESegmentSPtrConst__SWIG_2(int i, long j, NLESegment nLESegment);

    public static final native long new_VecNLESegmentSPtr__SWIG_0();

    public static final native long new_VecNLESegmentSPtr__SWIG_1(long j, VecNLESegmentSPtr vecNLESegmentSPtr);

    public static final native long new_VecNLESegmentSPtr__SWIG_2(int i, long j, NLESegment nLESegment);

    public static final native long new_VecNLEStringFloatPairSPtrConst__SWIG_0();

    public static final native long new_VecNLEStringFloatPairSPtrConst__SWIG_1(long j, VecNLEStringFloatPairSPtrConst vecNLEStringFloatPairSPtrConst);

    public static final native long new_VecNLEStringFloatPairSPtrConst__SWIG_2(int i, long j, NLEStringFloatPair nLEStringFloatPair);

    public static final native long new_VecNLEStringFloatPairSPtr__SWIG_0();

    public static final native long new_VecNLEStringFloatPairSPtr__SWIG_1(long j, VecNLEStringFloatPairSPtr vecNLEStringFloatPairSPtr);

    public static final native long new_VecNLEStringFloatPairSPtr__SWIG_2(int i, long j, NLEStringFloatPair nLEStringFloatPair);

    public static final native long new_VecNLEStringStringPairPairSPtr__SWIG_0();

    public static final native long new_VecNLEStringStringPairPairSPtr__SWIG_1(long j, VecNLEStringStringPairPairSPtr vecNLEStringStringPairPairSPtr);

    public static final native long new_VecNLEStringStringPairPairSPtr__SWIG_2(int i, long j, NLEStringStringPair nLEStringStringPair);

    public static final native long new_VecNLEStringStringPairSPtrConst__SWIG_0();

    public static final native long new_VecNLEStringStringPairSPtrConst__SWIG_1(long j, VecNLEStringStringPairSPtrConst vecNLEStringStringPairSPtrConst);

    public static final native long new_VecNLEStringStringPairSPtrConst__SWIG_2(int i, long j, NLEStringStringPair nLEStringStringPair);

    public static final native long new_VecNLEStyStickerAnim__SWIG_0();

    public static final native long new_VecNLEStyStickerAnim__SWIG_1(long j, VecNLEStyStickerAnim vecNLEStyStickerAnim);

    public static final native long new_VecNLEStyStickerAnim__SWIG_2(int i, long j, NLEStyStickerAnim nLEStyStickerAnim);

    public static final native long new_VecNLETextTemplateClipSPtrConst__SWIG_0();

    public static final native long new_VecNLETextTemplateClipSPtrConst__SWIG_1(long j, VecNLETextTemplateClipSPtrConst vecNLETextTemplateClipSPtrConst);

    public static final native long new_VecNLETextTemplateClipSPtrConst__SWIG_2(int i, long j, NLETextTemplateClip nLETextTemplateClip);

    public static final native long new_VecNLETextTemplateClipSPtr__SWIG_0();

    public static final native long new_VecNLETextTemplateClipSPtr__SWIG_1(long j, VecNLETextTemplateClipSPtr vecNLETextTemplateClipSPtr);

    public static final native long new_VecNLETextTemplateClipSPtr__SWIG_2(int i, long j, NLETextTemplateClip nLETextTemplateClip);

    public static final native long new_VecNLETimeEffectSPtrConst__SWIG_0();

    public static final native long new_VecNLETimeEffectSPtrConst__SWIG_1(long j, VecNLETimeEffectSPtrConst vecNLETimeEffectSPtrConst);

    public static final native long new_VecNLETimeEffectSPtrConst__SWIG_2(int i, long j, NLETimeEffect nLETimeEffect);

    public static final native long new_VecNLETimeEffectSPtr__SWIG_0();

    public static final native long new_VecNLETimeEffectSPtr__SWIG_1(long j, VecNLETimeEffectSPtr vecNLETimeEffectSPtr);

    public static final native long new_VecNLETimeEffectSPtr__SWIG_2(int i, long j, NLETimeEffect nLETimeEffect);

    public static final native long new_VecNLETimeSpaceNodeSPtrConst__SWIG_0();

    public static final native long new_VecNLETimeSpaceNodeSPtrConst__SWIG_1(long j, VecNLETimeSpaceNodeSPtrConst vecNLETimeSpaceNodeSPtrConst);

    public static final native long new_VecNLETimeSpaceNodeSPtrConst__SWIG_2(int i, long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native long new_VecNLETimeSpaceNodeSPtr__SWIG_0();

    public static final native long new_VecNLETimeSpaceNodeSPtr__SWIG_1(long j, VecNLETimeSpaceNodeSPtr vecNLETimeSpaceNodeSPtr);

    public static final native long new_VecNLETimeSpaceNodeSPtr__SWIG_2(int i, long j, NLETimeSpaceNode nLETimeSpaceNode);

    public static final native long new_VecNLETrackSPtrConst__SWIG_0();

    public static final native long new_VecNLETrackSPtrConst__SWIG_1(long j, VecNLETrackSPtrConst vecNLETrackSPtrConst);

    public static final native long new_VecNLETrackSPtrConst__SWIG_2(int i, long j, NLETrack nLETrack);

    public static final native long new_VecNLETrackSPtr__SWIG_0();

    public static final native long new_VecNLETrackSPtr__SWIG_1(long j, VecNLETrackSPtr vecNLETrackSPtr);

    public static final native long new_VecNLETrackSPtr__SWIG_2(int i, long j, NLETrack nLETrack);

    public static final native long new_VecNLETrackSlotSPtrConst__SWIG_0();

    public static final native long new_VecNLETrackSlotSPtrConst__SWIG_1(long j, VecNLETrackSlotSPtrConst vecNLETrackSlotSPtrConst);

    public static final native long new_VecNLETrackSlotSPtrConst__SWIG_2(int i, long j, NLETrackSlot nLETrackSlot);

    public static final native long new_VecNLETrackSlotSPtr__SWIG_0();

    public static final native long new_VecNLETrackSlotSPtr__SWIG_1(long j, VecNLETrackSlotSPtr vecNLETrackSlotSPtr);

    public static final native long new_VecNLETrackSlotSPtr__SWIG_2(int i, long j, NLETrackSlot nLETrackSlot);

    public static final native long new_VecNLETrackType__SWIG_0();

    public static final native long new_VecNLETrackType__SWIG_1(long j, VecNLETrackType vecNLETrackType);

    public static final native long new_VecNLETrackType__SWIG_2(int i, int i2);

    public static final native long new_VecNLEVideoAnimationSPtrConst__SWIG_0();

    public static final native long new_VecNLEVideoAnimationSPtrConst__SWIG_1(long j, VecNLEVideoAnimationSPtrConst vecNLEVideoAnimationSPtrConst);

    public static final native long new_VecNLEVideoAnimationSPtrConst__SWIG_2(int i, long j, NLEVideoAnimation nLEVideoAnimation);

    public static final native long new_VecNLEVideoAnimationSPtr__SWIG_0();

    public static final native long new_VecNLEVideoAnimationSPtr__SWIG_1(long j, VecNLEVideoAnimationSPtr vecNLEVideoAnimationSPtr);

    public static final native long new_VecNLEVideoAnimationSPtr__SWIG_2(int i, long j, NLEVideoAnimation nLEVideoAnimation);

    public static final native long new_VecNLEVideoEffectSPtrConst__SWIG_0();

    public static final native long new_VecNLEVideoEffectSPtrConst__SWIG_1(long j, VecNLEVideoEffectSPtrConst vecNLEVideoEffectSPtrConst);

    public static final native long new_VecNLEVideoEffectSPtrConst__SWIG_2(int i, long j, NLEVideoEffect nLEVideoEffect);

    public static final native long new_VecNLEVideoEffectSPtr__SWIG_0();

    public static final native long new_VecNLEVideoEffectSPtr__SWIG_1(long j, VecNLEVideoEffectSPtr vecNLEVideoEffectSPtr);

    public static final native long new_VecNLEVideoEffectSPtr__SWIG_2(int i, long j, NLEVideoEffect nLEVideoEffect);

    public static final native long new_VecString__SWIG_0();

    public static final native long new_VecString__SWIG_1(long j, VecString vecString);

    public static final native long new_VecString__SWIG_2(int i, String str);

    public static final native void swig_module_init();

    static {
        swig_module_init();
    }

    public static void SwigDirector_NLEBranchListener_onChanged(NLEBranchListener nLEBranchListener) {
        nLEBranchListener.onChanged();
    }

    public static void SwigDirector_NLEChangeListener_onChanged(NLEChangeListener nLEChangeListener) {
        nLEChangeListener.onChanged();
    }

    public static void SwigDirector_NLEEditorListener_onChanged(NLEEditorListener nLEEditorListener) {
        nLEEditorListener.onChanged();
    }

    public static void SwigDirector_NLEResourceFetchCallback_onError(NLEResourceFetchCallback nLEResourceFetchCallback, int i) {
        nLEResourceFetchCallback.onError(i);
    }

    public static void SwigDirector_NLEResourceFetchCallback_onProgress(NLEResourceFetchCallback nLEResourceFetchCallback, int i) {
        nLEResourceFetchCallback.onProgress(i);
    }

    public static void SwigDirector_NLELoggerListener_onLog__SWIG_1(NLELoggerListener nLELoggerListener, int i, String str) {
        nLELoggerListener.onLog(LogLevel.swigToEnum(i), str);
    }

    public static void SwigDirector_NLEResourceFetchCallback_onSuccess(NLEResourceFetchCallback nLEResourceFetchCallback, String str, String str2) {
        nLEResourceFetchCallback.onSuccess(str, str2);
    }

    public static void SwigDirector_NLELoggerListener_onLog__SWIG_0(NLELoggerListener nLELoggerListener, int i, String str, long j) {
        nLELoggerListener.onLog(LogLevel.swigToEnum(i), str, new SWIGTYPE_p_va_list(j, true));
    }

    public static void SwigDirector_INLEMonitor_onEvent(INLEMonitor iNLEMonitor, String str, int i, String str2, long j) {
        iNLEMonitor.onEvent(str, i, str2, j);
    }
}
