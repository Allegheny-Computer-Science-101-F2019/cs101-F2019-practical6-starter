package practicalsix.experiment;

import practicalsix.computation.ArithmeticComputation;
import practicalsix.data.ResultsTable;

/**
 * A Campaign interface used to run an experiment.
 *
 * @author Gregory M. Kapfhammer
 */

public interface Campaign {

  /** Require that any Campaign implementer can run an ArithmeticComputation in an experiment. */
  public ResultsTable run(ArithmeticComputation computation, int campaignLength);

}
