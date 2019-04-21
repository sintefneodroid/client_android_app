// automatically generated by the FlatBuffers compiler, do not modify

package Neodroid.FBS;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Struct;

import java.nio.ByteBuffer;

@SuppressWarnings("unused")
public final class FSimulatorConfiguration extends Struct {
  public static int createFSimulatorConfiguration(FlatBufferBuilder builder, int width, int height, boolean fullScreen, int qualityLevel, float timeScale, float targetFrameRate, int waitEvery, int frameSkips, int resetIterations, int numOfEnvironments, boolean doSerialiseIndidualObservables, boolean doSerialiseUnobservables) {
    builder.prep(4, 44);
    builder.pad(2);
    builder.putBoolean(doSerialiseUnobservables);
    builder.putBoolean(doSerialiseIndidualObservables);
    builder.putInt(numOfEnvironments);
    builder.putInt(resetIterations);
    builder.putInt(frameSkips);
    builder.putInt(waitEvery);
    builder.putFloat(targetFrameRate);
    builder.putFloat(timeScale);
    builder.putInt(qualityLevel);
    builder.pad(3);
    builder.putBoolean(fullScreen);
    builder.putInt(height);
    builder.putInt(width);
    return builder.offset();
  }

  public FSimulatorConfiguration __assign(int _i, ByteBuffer _bb) {
    __init(_i, _bb);
    return this;
  }

  public void __init(int _i, ByteBuffer _bb) {
    bb_pos = _i;
    bb = _bb;
  }

  public int width() {
    return bb.getInt(bb_pos + 0);
  }

  public int height() {
    return bb.getInt(bb_pos + 4);
  }

  public boolean fullScreen() {
    return 0 != bb.get(bb_pos + 8);
  }

  public int qualityLevel() {
    return bb.getInt(bb_pos + 12);
  }

  public float timeScale() {
    return bb.getFloat(bb_pos + 16);
  }

  public float targetFrameRate() {
    return bb.getFloat(bb_pos + 20);
  }

  public int waitEvery() {
    return bb.getInt(bb_pos + 24);
  }

  public int frameSkips() {
    return bb.getInt(bb_pos + 28);
  }

  public int resetIterations() {
    return bb.getInt(bb_pos + 32);
  }

  public int numOfEnvironments() {
    return bb.getInt(bb_pos + 36);
  }

  public boolean doSerialiseIndidualObservables() {
    return 0 != bb.get(bb_pos + 40);
  }

  public boolean doSerialiseUnobservables() {
    return 0 != bb.get(bb_pos + 41);
  }
}

